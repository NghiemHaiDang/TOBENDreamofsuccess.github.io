<%-- 
    Document   : employmentinformation
    Created on : Apr 28, 2022, 3:57:13 AM
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
                    <form action="employmentInsert">
                        <div class="span5">
                            <h4 class="title"><span class="text"><strong>Đăng ký</strong> tuyển dụng</span></h4>

                            <input type="hidden" name="next" value="/">
                            <fieldset>
                                <div class="control-group">
                                    <label class="control-label">Tên việc làm:</label>
                                    <div class="controls">
                                        <input type="text" placeholder="Tên việc làm" name="jobname"
                                               class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Mô tả công việc:</label>
                                    <div class="controls">
                                        <input type="text" placeholder="Mô tả công việc" name="description"
                                               class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Mức lương:</label>
                                    <div class="controls">
                                        <input type="text" placeholder="Mức lương" name="salary"
                                               class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Loại hình việc làm:</label>
                                    <div class="controls">
                                        <select name="category">
                                            <c:forEach items="${listCategory}" var="ct">
                                                <option value="${ct.ct_name}">${ct.ct_name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Tên doanh nghiệp:</label>
                                    <div class="controls">
                                        <select name="company">
                                            <c:forEach items="${listCompany}" var="cp">
                                                <option value="${cp.company_name}">${cp.company_name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                            </fieldset>
                        </div>
                        <div class="span7">
                            <h4 class="title"><span class="text"><strong>Dành cho</strong> tuyển dụng</span></h4>
                            <fieldset>
                               	<div class="control-group">
                                    <label class="control-label">Ngày tuyển dụng:</label>
                                    <div class="controls">
                                        <input type="date" placeholder="Ngày tuyển dụng" name="recruitmentdate" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Ngày hết hạn:</label>
                                    <div class="controls">
                                        <input type="date" placeholder="Ngày hết hạn" name="expirationdate" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Hình ảnh tuyển dụng:</label>
                                    <div class="controls">
                                        <input type="file" name="imageurl">
                                    </div>
                                </div>
                                <hr>
                                <div class="actions"><input tabindex="9" class="btn btn-inverse large" type="submit"
                                                            value="Đăng ký doanh nghiệp"></div>
                            </fieldset>
                    </form>
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
