<%-- 
    Document   : product
    Created on : Apr 22, 2022, 11:12:00 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>TOBEN - Dream Of Success</title>
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
    </head>
    <body>
        <div id="top-bar" class="container">
            <div class="row">
                <div class="span4">
                    <form action="search" method="POST" class="search_form">
                        <input style="color: black;" type="search" class="search-query" name="keyword" Placeholder="Tìm kiếm">
                        <button style="	border-radius: 5px;
                                background-color: #eb4800;
                                color: #fff;
                                border-style: none;" type="submit">Tìm kiếm</button>
                    </form>
                </div>
                <div class="span8">
                    <div class="account pull-right">
                        <ul class="user-menu">				
                            <li><a href="#">Tài khoản của tôi</a></li>
                            <li><a href="cartServlet">Thông tin ứng tuyển</a></li>
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
                    <a href="homeServlet" class="local logo pull-left">TOBEN - Dream Of Success</a>
                    <nav id="menu" class="pull-right">
                        <ul>
                            <li><a href="productjobServlet">Tuyển dụng</a></li>															
                            <li><a href="#">Tính chất công việc</a></li>			
                            <li><a href="#">Về chúng tôi</a></li>							
                            <li><a href="#">Sự kiện</a></li>
                            <li><a href="#">Liên hệ</a></li>
                        </ul>
                    </nav>
                </div>
            </section>	
            <section class="header_text sub">
                <img class="pageBanner" style="height: 300px;" src="Jobpictures/slide3.jpg" alt="New products" >
                <h4><span>Thông tin tuyển dụng</span></h4>
            </section>
            <section class="main-content">

                <div class="row">						
                    <div class="span9">								
                        <ul class="thumbnails listing-products">
                            <c:forEach items="${listJob}" var="job">
                                <li class="span3">
                                    <div style="height: 200px" class="product-box border-job">
                                        <span class="sale_tag"></span>												
                                        <a href="detailjob?jobId=${job.id}"><img alt="" src="${job.imageurl}"></a><br/>
                                        <a href="#" class="title">${job.job_name}</a><br/>
                                        <a href="#" class="category">Expirationdate: ${job.expirationdate}</a>
                                        <p class="price">${job.salary}</p>
                                    </div>
                                </li>       
                            </c:forEach>
                        </ul>								
                        <hr>
                        <div class="pagination pagination-small pagination-centered">
                            <c:choose>
                                <c:when test="${listJob==null||listJob.size()==0}">
                                    Không tìm thấy
                                </c:when>
                                <c:otherwise>
                                    <ul>
                                        <li><a href="productjobServlet?page=${page-1}">Prev</a></li>
                                            <c:forEach begin="1" end="${totalPage}" var="i">
                                            <li><a id="${i==page?"pageStr":""}" href="productjobServlet?page=${i}">${i}</a></li>
                                            </c:forEach>
                                        <li><a href="productjobServlet?page=${page+1}">Next</a></li>
                                    </ul>
                                </c:otherwise>
                            </c:choose>
                        </div>
                    </div>
                    <div class="span3 col">
                        <div class="block">	
                            <ul class="nav nav-list">
                                <li class="nav-header">Tính chất công việc</li>
                                    <c:forEach items="${sessionScope.listCategory}" var="ct">
                                    <li><a href="filterCategoryController?categoryId=${ct.id}">${ct.ct_name}</a></li>
                                    </c:forEach>
                            </ul>
                            <br/>
                            <ul class="nav nav-list below">
                                <li class="nav-header">Công ty</li>
                                    <c:forEach items="${listCompany}" var="cp">
                                    <li><a href="products.html">${cp.company_name}</a></li>
                                    </c:forEach>
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
                            <li><a href="./index.html">Homepage</a></li>  
                            <li><a href="./about.html">About Us</a></li>
                            <li><a href="./contact.html">Contac Us</a></li>
                            <li><a href="./cart.html">Your Cart</a></li>
                            <li><a href="./register.html">Login</a></li>							
                        </ul>					
                    </div>
                    <div class="span4">
                        <h4>My Account</h4>
                        <ul class="nav">
                            <li><a href="#">My Account</a></li>
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
    </body>
</html>
