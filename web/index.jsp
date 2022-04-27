<%-- 
    Document   : index
    Created on : Apr 21, 2022, 10:05:50 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Category"%>
<%@page import="Model.Company"%>
<%@page import="Model.Job"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TOBEN - Dream Of Success</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">      
        <link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link href="themes/css/bootstrappage.css" rel="stylesheet"/>
        <link href="themes/css/flexslider.css" rel="stylesheet"/>
        <link href="themes/css/main.css" rel="stylesheet"/>
        <script src="themes/js/jquery-1.7.2.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>				
        <script src="themes/js/superfish.js"></script>	
        <script src="themes/js/jquery.scrolltotop.js"></script>
        <%List<Category> listCategory = (List<Category>)request.getAttribute("listCategory");%>
    </head>
    <body>
        <div id="top-bar" class="container">
            <div class="row">
                <div class="span4">
                    <form method="POST" class="search_form">
                        <input type="text" class="input-block-level search-query" Placeholder="Search - Jobs">
                    </form>
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
                    <a href="homeServlet" class="local logo pull-left">TOBEN - Dream Of Success </a>
                    <nav id="menu" class="pull-right">
                        <ul>
                            <li><a href="homeServlet">Trang chủ</a></li>
                            <li><a href="productjobServlet">Tuyển dụng</a></li>																
                            <li><a href="#">Tính chất công việc</a>`
                                <ul>
                                    <% for (Category c : listCategory) {
                                    %>

                                    <li><a href="#"><%=c.getCt_name()%></a></li>

                                    <%}%>
                                </ul>
                            </li>							
                            <li><a href="businessregistrationServlet">Đăng ký tuyển dụng</a></li>
                            <li><a href="listAccount">Danh sách tài khoản</a></li>
                            <li><a href="#">Liên hệ</a></li>
                        </ul>
                    </nav>
                </div>
            </section>
            <section  class="homepage-slider" id="home-slider">
                <div class="flexslider">
                    <ul class="slides">
                        <li>
                            <img style="height: 450px" class="background-slide" src="./Jobpictures/slide1.png" alt="" />
                        </li>
                        <li>
                            <img style="height: 450px" class="background-slide" src="./Jobpictures/slide2.jpg" alt="" />
                            <div class="intro">
                                <h1>Mid season sale</h1>
                                <p><span>Up to 50% Off</span></p>
                                <p><span>On selected items online and in stores</span></p>
                            </div>
                        </li>
                    </ul>
                </div>			
            </section>
            <section class="header_text">
                Càng khó khăn bao nhiêu thì thành quả bạn nhận được càng to lớn bấy nhiêu. Hãy coi những khó khăn là một cơ hội đi tới thành công lớn lao
                <br/>TOBEN - Dream Of Success khám phá bản thân, tiến đến tương lai.
            </section>
            <section class="main-content">
                <div class="row">
                    <div class="span12">													
                        <div class="row">
                            <div class="span12">
                                <h4 class="title">
                                    <span class="pull-left"><span class="text"><span class="line">Tuyển dụng <strong>Nổi bật</strong></span></span></span>
                                    <span class="pull-right">
                                        <a class="left button" href="#myCarousel" data-slide="prev"></a><a class="right button" href="#myCarousel" data-slide="next"></a>
                                    </span>
                                </h4>
                                <div id="myCarousel" class="myCarousel carousel slide">
                                    <div class="carousel-inner">
                                        <div class="active item">
                                            <ul class="thumbnails">
                                                <c:forEach items="${listJob}" var="listjob">
                                                    <li class="span3">
                                                        <div class="product-box">
                                                            <span class="sale_tag"></span>
                                                            <p><a href="loginServlet"><img src="${listjob.imageurl}" alt="" /></a></p>
                                                            <a href="loginServlet" class="title">${listjob.job_name}</a><br/>
                                                            <a href="loginServlet" class="category"></a>
                                                            <p class="price">${listjob.salary}</p>
                                                        </div>
                                                    </li>
                                                </c:forEach>
                                            </ul>
                                        </div>
                                    </div>							
                                </div>
                            </div>						
                        </div>
                        <br/>
                        <div class="row feature_box">						
                            <div class="span4">
                                <div class="service">
                                    <div class="responsive">	
                                        <img src="themes/images/feature_img_2.png" alt="" />
                                        <h4>Về <strong>TOBEN</strong></h4>
                                        <p>Tìm kiếm việc làm, bức phá tương lai.</p>									
                                    </div>
                                </div>
                            </div>
                            <div class="span4">	
                                <div class="service">
                                    <div class="customize">			
                                        <img src="themes/images/feature_img_1.png" alt="" />
                                        <h4>Thông tin <strong>Ứng tuyển</strong></h4>
                                        <p>Truy cập thông tin ứng tuyển của bạn.</p>
                                    </div>
                                </div>
                            </div>
                            <div class="span4">
                                <div class="service">
                                    <div class="support">	
                                        <img src="themes/images/feature_img_3.png" alt="" />
                                        <h4>Dịch vụ <strong>HỖ TRỢ</strong></h4>
                                        <p>Liên hệ với chúng tôi để cập nhật những thông tin mới nhất.</p>
                                    </div>
                                </div>
                            </div>	
                        </div>		
                    </div>				
                </div>
            </section>
            <section class="our_client">
                <h4 class="title"><span class="text">Công ty nổi bật</span></h4>
                <div class="row">
                    <c:forEach items="${listCompany}" var="cp">
                        <div class="span2">
                            <a href="#"><img style="height: 100px;" alt="" src="${cp.imageurlcompany}"></a>
                        </div>
                    </c:forEach>
                </div>
            </section>
            <section id="footer-bar">
                <div class="row">
                    <div class="span3">
                        <h4>Navigation</h4>
                        <ul class="nav">
                            <li><a href="homeServlet">Trang chủ</a></li>  
                            <li><a href="loginServlet">Về chúng tôi</a></li>
                            <li><a href="loginServlet">Liên hệ</a></li>
                            <li><a href="loginServlet">Thông tin ứng tuyển</a></li>
                            <li><a href="loginServlet">Đăng nhập</a></li>							
                        </ul>					
                    </div>
                    <div class="span4">
                        <h4>My Account</h4>
                        <ul class="nav">
                            <li><a href="#">Tài khoản của bạn</a></li>
                            <li><a href="#">Sự kiện</a></li>
                        </ul>
                    </div>					
                </div>	
            </section>
        </div>
        <script src="themes/js/common.js"></script>
        <script src="themes/js/jquery.flexslider-min.js"></script>
        <script type="text/javascript">
            $(function () {
                $(document).ready(function () {
                    $('.flexslider').flexslider({
                        animation: "fade",
                        slideshowSpeed: 4000,
                        animationSpeed: 600,
                        controlNav: false,
                        directionNav: true,
                        controlsContainer: ".flex-container" // the container that holds the flexslider
                    });
                });
            });
        </script>
    </body>
</html>
