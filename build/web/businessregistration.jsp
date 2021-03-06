<%-- 
    Document   : businessregistration
    Created on : Apr 25, 2022, 1:31:56 AM
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
        <link href="themes/css/bootstrappage.css" rel="stylesheet" />
        <link href="themes/css/flexslider.css" rel="stylesheet" />
        <link href="themes/css/main.css" rel="stylesheet" />
        <script src="themes/js/jquery-1.7.2.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="themes/js/superfish.js"></script>
        <script src="themes/js/jquery.scrolltotop.js"></script>
    </head>
    <body>
        <div id="top-bar" class="container">
            <div class="row">
                <div class="span4">
                    <form method="POST" class="search_form">
                        <input type="text" class="input-block-level search-query" Placeholder="eg. T-sirt">
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
                <img style="height: 300px;" class="pageBanner" src="Jobpictures/slide3.jpg" alt="New products">
                <h4><span>Đăng ký doanh nghiệp</span></h4>
            </section>
            <section class="main-content">
                <div class="row">
                    <form action="companyinformationServlet">
                        <div class="span5">
                            <h4 class="title"><span class="text"><strong>Đăng ký</strong> doanh nghiệp</span></h4>

                            <input type="hidden" name="next" value="/">
                            <fieldset>
                                <div class="control-group">
                                    <label class="control-label">Tên doanh nghiệp:</label>
                                    <div class="controls">
                                        <input type="text" placeholder="Tên doanh nghiệp" name="company_name"
                                               class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">CEO doanh nghiệp:</label>
                                    <div class="controls">
                                        <input type="text" placeholder="CEO" name="ceo"
                                               class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Số điện thoại doanh nghiệp:</label>
                                    <div class="controls">
                                        <input type="text" placeholder="Số điện thoại" name="phonecompany"
                                               class="input-xlarge">
                                    </div>
                                </div>
                            </fieldset>
                        </div>
                        <div class="span7">
                            <h4 class="title"><span class="text"><strong>Dành cho</strong> doanh nghiệp</span></h4>
                            <fieldset>
                               	<div class="control-group">
                                    <label class="control-label">Địa chỉ doanh nghiệp:</label>
                                    <div class="controls">
                                        <input type="text" placeholder="Địa chỉ" name="address" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Hình ảnh doanh nghiệp:</label>
                                    <div class="controls">
                                        <input type="file" name="imageurlcompany">
                                    </div>
                                </div>
                                <hr>
                                <div class="actions"><input tabindex="9" class="btn btn-inverse large" type="submit"
                                                            value="Đăng ký doanh nghiệp"></div>
                            </fieldset>
                    </form>
                    <button type="button" class="btn btn-lg btn-primary mt-2"><a href="employmentinformation">Đăng ký tuyển dụng</a></button>
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
                <h4>Tài khoản của bạn</h4>
                <ul class="nav">
                    <li><a href="#">Tài khoản của bạn</a></li>
                    <li><a href="#">Sự kiện</a></li>
                </ul>
            </div>
            <div class="span5">
                <p style="color:#eb4800;">TOBEN - Dream Of Success</p>
                Càng khó khăn bao nhiêu thì thành quả bạn nhận được càng to lớn bấy nhiêu. Hãy coi những khó khăn là một
                cơ hội đi tới thành công lớn lao
                <br />TOBEN - Dream Of Success khám phá bản thân, tiến đến tương lai.
                <br />
                <span class="social_icons">
                    <a class="facebook" href="#">Facebook</a>
                    <a class="twitter" href="#">Twitter</a>
                    <a class="skype" href="#">Skype</a>
                    <a class="vimeo" href="#">Vimeo</a>
                </span>
            </div>
        </div>
    </section>
</div>
<script src="themes/js/common.js"></script>
<script>
    $(document).ready(function () {
        $('#checkout').click(function (e) {
            document.location.href = "checkout.html";
        })
    });
</script>
</body>
</html>
