<%-- 
    Document   : detailjob
    Created on : Apr 25, 2022, 10:38:31 AM
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
        <link href="themes/css/main.css" rel="stylesheet"/>
        <link href="themes/css/jquery.fancybox.css" rel="stylesheet"/>
        <script src="themes/js/jquery-1.7.2.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>				
        <script src="themes/js/superfish.js"></script>	
        <script src="themes/js/jquery.scrolltotop.js"></script>
        <script src="themes/js/jquery.fancybox.js"></script>
    </head>
    <body>
        <div id="top-bar" class="container">
            <div class="row">
                <div class="span4">
                </div>
                <div class="span8">
                    <div class="account pull-right">
                        <ul class="user-menu">				
                            <li><a href="#">Tài khoản của tôi</a></li>
                            <li><a href="cartServlet">Thông tin ứng tuyển</a></li>
                            <li><a href="checkoutServlet">Checkout</a></li>					
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
                    <a href="homeServlet" class="local logo pull-left">TOBEN - Dream Of Success</a>
                    <nav id="menu" class="pull-right">
                        <ul>
                            <li><a href="homeServlet">Trang chủ</a></li>	
                            <li><a href="productjobServlet">Tuyển dụng</a></li>															

                            <li><a href="businessregistrationServlet">Đăng ký tuyển dụng</a></li>						
                            <li><a href="listAccount">Danh sách tài khoản</a></li>
                            <li><a href="listCompany">Danh sách doanh nghiệp</a></li>
                            <li><a href="listJob">Danh sách việc làm</a></li>
                        </ul>
                    </nav>
                </div>
            </section>
            <section class="header_text sub">
                <img class="pageBanner" style="height: 300px;" src="Jobpictures/slide3.jpg" alt="New products" >
                <h4><span>Chi tiết tuyển dụng</span></h4>
            </section>
            <section class="main-content">				
                <div class="row">						
                    <div class="span9">
                        <div class="row">
                            <div class="span4">
                                <a href="" class="thumbnail" data-fancybox-group="group1" title="Description 1"><img alt="" src="${job.imageurl}"></a>												
                            </div>
                            <div class="span5">
                                <address>
                                    <strong>Tên công việc:</strong> <span>${job.job_name}</span><br>
                                    <strong>Tính chất công việc:</strong> <span>${job.job_name}</span><br>
                                    <strong>Tên doanh nghiệp:</strong> <span>${job.job_name}</span><br>
                                    <strong>Ngày tuyển dụng:</strong> <span>${job.recruitmentdate}</span><br>
                                    <strong>Ngày hết hạn:</strong> <span>${job.expirationdate}</span><br>	
                                </address>									
                                <h4><strong>Mức lương: ${job.salary}</strong></h4>
                            </div>
                            <div class="span5">
                                <form class="form-inline">
                                    <a href="addtocardServlet?jobId=${job.id}"><button class="btn btn-inverse" type="button">Thêm vào danh sách</button></a>
                                    <a><button class="btn btn-inverse" type="button">Ứng tuyển ngay</button></a>

                                </form>
                            </div>							
                        </div>
                        <div class="row">
                            <div class="span9">
                                <ul class="nav nav-tabs" id="myTab">
                                    <li class="active"><a href="#home">Mô tả công việc</a></li>
                                </ul>							 
                                <div class="tab-content">
                                    <div class="tab-pane active" id="home">${job.description}</div>
                                </div>							
                            </div>						
                        </div>
                    </div>
                    <div class="span3 col">
                        <div class="block">	
                            <ul class="nav nav-list">
                                <li class="nav-header">SUB CATEGORIES</li>
                                <li><a href="products.html">Nullam semper elementum</a></li>
                                <li class="active"><a href="products.html">Phasellus ultricies</a></li>
                                <li><a href="products.html">Donec laoreet dui</a></li>
                                <li><a href="products.html">Nullam semper elementum</a></li>
                                <li><a href="products.html">Phasellus ultricies</a></li>
                                <li><a href="products.html">Donec laoreet dui</a></li>
                            </ul>
                            <br/>
                            <ul class="nav nav-list below">
                                <li class="nav-header">MANUFACTURES</li>
                                <li><a href="products.html">Adidas</a></li>
                                <li><a href="products.html">Nike</a></li>
                                <li><a href="products.html">Dunlop</a></li>
                                <li><a href="products.html">Yamaha</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </section>			
            <section id="footer-bar">
                <div class="row">
                    <div class="span3">
                        <h4>Navigation</h4>
                        <ul class="nav">
                            <li><a href="./index.html">Trang chủ</a></li>  
                            <li><a href="./about.html">Về chúng tôi</a></li>
                            <li><a href="./contact.html">Liên hệ</a></li>
                            <li><a href="./cart.html">Thông tin ứng tuyển</a></li>
                            <li><a href="./register.html">Đăng nhập</a></li>							
                        </ul>					
                    </div>
                    <div class="span4">
                        <h4>My Account</h4>
                        <ul class="nav">
                            <li><a href="#">Tài khoản của bạn</a></li>
                            <li><a href="#">Order History</a></li>
                            <li><a href="#">Wish List</a></li>
                            <li><a href="#">Newsletter</a></li>
                        </ul>
                    </div>
                    <div class="span5">
                        <p class="logo"><img src="themes/images/logo.png" class="site_logo" alt=""></p>
                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. the  Lorem Ipsum has been the industry's standard dummy text ever since the you.</p>
                        <br/>
                        <span class="social_icons">
                            <a class="facebook" href="#">Facebook</a>
                            <a class="twitter" href="#">Twitter</a>
                            <a class="skype" href="#">Skype</a>
                            <a class="vimeo" href="#">Vimeo</a>
                        </span>
                    </div>					
                </div>	
            </section>
            <section id="copyright">
                <span>Copyright 2013 bootstrappage template  All right reserved.</span>
            </section>
        </div>
        <script src="themes/js/common.js"></script>
        <script>
            $(function () {
                $('#myTab a:first').tab('show');
                $('#myTab a').click(function (e) {
                    e.preventDefault();
                    $(this).tab('show');
                })
            })
            $(document).ready(function () {
                $('.thumbnail').fancybox({
                    openEffect: 'none',
                    closeEffect: 'none'
                });

                $('#myCarousel-2').carousel({
                    interval: 2500
                });
            });
        </script>
    </body>
</html>
