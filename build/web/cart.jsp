<%-- 
    Document   : cart
    Created on : Apr 25, 2022, 3:02:30 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Bootstrap E-commerce Templates</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">      
        <link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">		
        <link href="themes/css/bootstrappage.css" rel="stylesheet"/>
        <link href="themes/css/flexslider.css" rel="stylesheet"/>
        <link href="themes/css/main.css" rel="stylesheet"/>
        <script src="themes/js/jquery-1.7.2.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>				
        <script src="themes/js/superfish.js"></script>	
        <script src="themes/js/jquery.scrolltotop.js"></script>
        <style>
            body{
                margin-top:20px;
                background:#eee;
            }
            .ui-w-40 {
                width: 40px !important;
                height: auto;
            }

            .card{
                box-shadow: 0 1px 15px 1px rgba(52,40,104,.08);
            }

            .ui-product-color {
                display: inline-block;
                overflow: hidden;
                margin: .144em;
                width: .875rem;
                height: .875rem;
                border-radius: 10rem;
                -webkit-box-shadow: 0 0 0 1px rgba(0,0,0,0.15) inset;
                box-shadow: 0 0 0 1px rgba(0,0,0,0.15) inset;
                vertical-align: middle;
            }
        </style>
    </head>
    <body>
        <div id="top-bar" class="container">
            <div class="row">
                <div class="span4">
                    <form method="POST" class="search_form">
                        <input type="text" class="input-block-level search-query" Placeholder="Tìm kiếm việc làm">
                    </form>
                </div>
                <div class="span8">
                    <div class="account pull-right">
                        <ul class="user-menu">
                            <li><a href="#">Trang chủ</a></li>
                            <li><a href="#">Tài khoản của tôi</a></li>
                            <li><a href="cart.html">Thông tin ứng tuyển</a></li>
                            <li><a href="checkout.html">Checkout</a></li>
                                <c:choose>
                                    <c:when test="${sessionScope.account != null}">
                                    <li>${sessionScope.account.displayname}</li>
                                    <li><a href="logoutServlet">Đăng xuất</a></li>
                                    </c:when>
                                    <c:otherwise>
                                    <li><a href="loginServlet">Đăng nhập</a></li>
                                    </c:otherwise>
                                </c:choose>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div id="wrapper" class="container">
            <section class="navbar main-menu">
                <div class="navbar-inner main-menu">				
                    <a href="index.html" class="local logo pull-left">TOBEN - Dream Of Success</a>
                    <nav id="menu" class="pull-right">
                        <ul>
                            <li><a href="productjobServlet">Tuyển dụng</a></li>															
                            <li><a href="./products.html">Tính chất công việc</a></li>			
                            <li><a href="./products.html">Về chúng tôi</a></li>							
                            <li><a href="./products.html">Sự kiện</a></li>
                        </ul>
                    </nav>
                </div>
            </section>	
            <section class="main-content">
                <div class="container px-3 my-5 clearfix">
                    <!-- Shopping cart table -->
                    <div class="card">
                        <div class="card-header">
                            <h2>Thông tin ứng tuyển</h2>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered m-0">
                                    <thead>
                                        <tr>
                                            <!-- Set columns width -->
                                            <th class="text-center py-3 px-4" style="min-width: 400px;">Thông tin ứng tuyển</th>
                                            <th class="text-right py-3 px-4" style="width: 100px;">Mức lương</th>
                                            <th class="text-center py-3 px-4" style="width: 120px;">Ngày tuyển dụng</th>
                                            <th class="text-right py-3 px-4" style="width: 100px;">Ngày hết hạn</th>
                                            <th class="text-center align-middle py-3 px-0" style="width: 40px;"><a href="#" class="shop-tooltip float-none text-light" title="" data-original-title="Clear cart"><i class="ino ion-md-trash"></i></a></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${carts}" var="C">
                                            <tr>
                                                <td class="p-4">
                                                    <div class="media align-items-center">
                                                        <img src="${C.value.job.imageurl}" class="d-block ui-w-40 ui-bordered mr-4" alt="">
                                                        <div class="media-body">
                                                            <a href="#" class="d-block text-dark">${C.value.job.job_name}</a>
                                                        </div>
                                                    </div>
                                                </td>
                                                <td class="text-right font-weight-semibold align-middle p-4">${C.value.job.salary}</td>
                                                <td class="text-right font-weight-semibold align-middle p-4">${C.value.job.recruitmentdate}</td>
                                                <td class="text-right font-weight-semibold align-middle p-4">${C.value.job.expirationdate}</td>
                                                <td class="text-center align-middle px-0"><a href="deleteCartServlet?jobId=${C.value.job.id}" class="shop-tooltip close float-none text-danger" title="" data-original-title="Remove">×</a></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <div class="float-right">
                                <a href="productjobServlet"><button type="button" class="btn btn-lg btn-default md-btn-flat mt-2 mr-3">Back to shopping</button></a>
                                <a href="checkoutServlet"><button type="button" class="btn btn-lg btn-primary mt-2">Checkout</button></a>
                            </div>
                        </div>
                    </div>
                </div>

            </section>



        </div>
    </body>
</html>
