<%-- 
    Document   : listAccount
    Created on : Apr 27, 2022, 2:43:26 AM
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
                        <input type="text" class="input-block-level search-query" Placeholder="T??m ki???m vi???c l??m">
                    </form>
                </div>
                <div class="span8">
                    <div class="account pull-right">
                        <ul class="user-menu">
                            <li><a href="#">T??i kho???n c???a t??i</a></li>
                            <li><a href="cartServlet">Th??ng tin ???ng tuy???n</a></li>
                            <li><a href="checkoutServlet">Checkout</a></li>
                                <c:choose>
                                    <c:when test="${sessionScope.account != null}">
                                    <li>${sessionScope.account.displayname}</li>
                                    <li><a href="logoutServlet">????ng xu???t</a></li>
                                    </c:when>
                                    <c:otherwise>
                                    <li><a href="loginServlet">????ng nh???p</a></li>
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
                    <a href="homeServlet" class="local logo pull-left">TOBEN - Dream Of Success</a>
                    <nav id="menu" class="pull-right">
                        <ul>
                            <li><a href="homeServlet">Trang ch???</a></li>	
                            <li><a href="productjobServlet">Tuy???n d???ng</a></li>															
                       			
                            <li><a href="businessregistrationServlet">????ng k?? tuy???n d???ng</a></li>						
                            <li><a href="listAccount">Danh s??ch t??i kho???n</a></li>
                            <li><a href="listCompany">Danh s??ch doanh nghi???p</a></li>
                            <li><a href="listJob">Danh s??ch vi???c l??m</a></li>
                            
                        </ul>
                    </nav>
                </div>
            </section>	
            <section class="main-content">
                <div class="container px-3 my-5 clearfix">
                    <!-- Shopping cart table -->
                    <div class="card">
                        <div class="card-header">
                            <h2>Danh s??ch t??i kho???n</h2>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered m-0">
                                    <thead>
                                        <tr>
                                            <!-- Set columns width -->
                                            <th class="text-center py-3 px-4" style="width: 100px;">ID</th>
                                            <th class="text-right py-3 px-4" style="width: 100px;">T??n t??i kho???n</th>
                                            <th class="text-center py-3 px-4" style="width: 100px;">M???t kh???u</th>
                                            <th class="text-right py-3 px-4" style="width: 100px;">T??n hi???n th???</th>
                                            <th class="text-right py-3 px-4" style="width: 100px;">?????a ch???</th>
                                            <th class="text-right py-3 px-4" style="width: 100px;">Email</th>
                                            <th class="text-right py-3 px-4" style="width: 100px;">S??? ??i???n tho???i</th>
                                            <th class="text-right py-3 px-4" style="width: 100px;">Quy???n h???n</th>
                                            <th class="text-right py-3 px-4" style="width: 100px;">C???p nh???t th??ng tin</th>
                                            <th class="text-right py-3 px-4" style="width: 100px;">Xo?? t??i kho???n</th>
                                            <th class="text-center align-middle py-3 px-0" style="width: 40px;"><a href="#" class="shop-tooltip float-none text-light" title="" data-original-title="Clear cart"><i class="ino ion-md-trash"></i></a></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${listAccount}" var="C">
                                            <tr>
                                                <td class="text-right font-weight-semibold align-middle p-4">${C.id}</td>
                                                <td class="text-right font-weight-semibold align-middle p-4">${C.username}</td>
                                                <td class="text-right font-weight-semibold align-middle p-4">${C.password}</td>
                                                <td class="text-right font-weight-semibold align-middle p-4">${C.displayname}</td>
                                                <td class="text-right font-weight-semibold align-middle p-4">${C.address}</td>
                                                <td class="text-right font-weight-semibold align-middle p-4">${C.email}</td>
                                                <td class="text-right font-weight-semibold align-middle p-4">${C.phone}</td>
                                                <td class="text-right font-weight-semibold align-middle p-4">${C.role}</td>
                                                <td class="text-right font-weight-semibold align-middle p-4">
                                                    <button><a><a href="updateAccount?updateId=${C.id}">Update</a></button>
                                                </td>
                                                <td class="text-center align-middle px-0"><a href="deleteAccount?deleteId=${C.id}" class="shop-tooltip close float-none text-danger " onclick="return confirm('B???n c?? ?????ng ?? xo?? t??i kho???n n??y?') title="" data-original-title="Remove">??</a></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </body>
</html>
