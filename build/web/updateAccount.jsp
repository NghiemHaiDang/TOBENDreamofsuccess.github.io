<%-- 
    Document   : updateAccount
    Created on : Apr 27, 2022, 3:52:10 AM
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
                    <form method="POST" class="search_form">
                        <input type="text" class="input-block-level search-query" Placeholder="Search - Jobs">
                    </form>
                </div>
                <div class="span8">
                    <div class="account pull-right">
                        <ul class="user-menu">
                            <li><a href="homeServlet">Trang chủ</a></li>
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
                </div>
            </section>			
            <section class="header_text sub">
                <img class="pageBanner" style="height: 300px;" src="Jobpictures/slide3.jpg" alt="New products" >
                <h4><span>Cập nhật thông tin tài khoản</span></h4>
            </section>			
            <section class="main-content">				
                <div class="row">
                    <div class="span5">					
                        <h4 class="title"><span class="text"><strong>Cập nhật</strong> </span></h4>

                    </div>
                    <div class="span7">					
                        <h4 class="title"><span class="text"><strong>thông tin</strong> </span></h4>
                        <form action="updateAccount" method="POST" class="form-stacked">
                            <fieldset>
                                <div class="control-group">
                                    <label class="control-label">Tên đăng nhập:</label>
                                    <div class="controls">
                                        <input type="text" placeholder="Tên đăng nhập của bạn" value="${account.username}" name="usname" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Tên hiển thị:</label>
                                    <div class="controls">
                                        <input type="text" placeholder="Tên hiển thị" value="${account.displayname}" name="displayname" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Địa chỉ email:</label>
                                    <div class="controls">
                                        <input type="email" placeholder="Email của bạn" value="${account.email}"  name="email" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Mậu khẩu:</label>
                                    <div class="controls">
                                        <input type="password" placeholder="Nhập mật khẩu" value="${account.password}" name="pass" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Địa chỉ:</label>
                                    <div class="controls">
                                        <input type="text" placeholder="Địa chỉ" value="${account.address}" name="address" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Số điện thoại:</label>
                                    <div class="controls">
                                        <input type="text" placeholder="Số điện thoại" value="${account.phone}" name="phone" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Vai trò:</label>
                                    <div class="controls">
                                        <select name="role">
                                            <option value="${account.role}">${account.role}</option>
                                            <option value="admin">Admin</option>
                                            <option value="usercompany">Người tuyển dụng</option>
                                            <option value="user">Người ứng tuyển</option>
                                        </select>
                                    </div>
                                </div>
                                <hr>
                                <div class="actions"><input tabindex="9" class="btn btn-inverse large" type="submit" value="Cập nhật"></div>
                            </fieldset>
                        </form>					
                    </div>				
                </div>
            </section>			
            <section id="footer-bar">
                <div class="row">
                    <div class="span3">
                        <h4>Thông tin</h4>
                        <ul class="nav">
                            <li><a href="homeServlet">Trang chủ</a></li>  
                            <li><a href="loginServlet">Về chúng tôi</a></li>
                            <li><a href="loginServlet">Liên hệ</a></li>
                            <li><a href="loginServlet">Thông tin ứng tuyển</a></li>
                            <li><a href="loginServlet">Đăng nhập</a></li>							
                        </ul>					
                    </div>
                    <div class="span4">
                        <h4>Tài khoản của bạn</h4>
                        <ul class="nav">
                            <li><a href="loginServlet">Tài khoản của bạn</a></li>
                            <li><a href="loginServlet">Sự kiện</a></li>
                        </ul>
                    </div>
                    <div class="span5">
                        <p style="color:#eb4800;">TOBEN - Dream Of Success</p>
                        Càng khó khăn bao nhiêu thì thành quả bạn nhận được càng to lớn bấy nhiêu. Hãy coi những khó khăn là một cơ hội đi tới thành công lớn lao
                        <br/>TOBEN - Dream Of Success khám phá bản thân, tiến đến tương lai.
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
