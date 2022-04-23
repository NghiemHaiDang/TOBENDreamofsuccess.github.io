<%-- 
    Document   : login
    Created on : Apr 23, 2022, 10:57:39 AM
    Author     : Admin
--%>

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
                            <li><a href="cart.html">Thông tin ứng tuyển</a></li>
                            <li><a href="checkout.html">Checkout</a></li>					
                            <li><a href="register.html">Đăng nhập</a></li>		
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
                            <li><a href="./products.html">Woman</a>					
                                <ul>
                                    <li><a href="./products.html">Lacinia nibh</a></li>									
                                    <li><a href="./products.html">Eget molestie</a></li>
                                    <li><a href="./products.html">Varius purus</a></li>									
                                </ul>
                            </li>															
                            <li><a href="./products.html">Man</a></li>			
                            <li><a href="./products.html">Sport</a>
                                <ul>									
                                    <li><a href="./products.html">Gifts and Tech</a></li>
                                    <li><a href="./products.html">Ties and Hats</a></li>
                                    <li><a href="./products.html">Cold Weather</a></li>
                                </ul>
                            </li>							
                            <li><a href="./products.html">Hangbag</a></li>
                            <li><a href="./products.html">Best Seller</a></li>
                            <li><a href="./products.html">Top Seller</a></li>
                        </ul>
                    </nav>
                </div>
            </section>			
            <section class="header_text sub">
                <img class="pageBanner" style="height: 300px;" src="Jobpictures/slide3.jpg" alt="New products" >
                <h4><span>Đăng nhập hoặc đăng ký</span></h4>
            </section>			
            <section class="main-content">				
                <div class="row">
                    <div class="span5">					
                        <h4 class="title"><span class="text"><strong>Đăng nhập</strong> </span></h4>
                        <form action="#" method="post">
                            <input type="hidden" name="next" value="/">
                            <fieldset>
                                <div class="control-group">
                                    <label class="control-label">Tên đăng nhập:</label>
                                    <div class="controls">
                                        <input type="text" placeholder="Tên đăng nhập của bạn" id="username" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Mật khẩu:</label>
                                    <div class="controls">
                                        <input type="password" placeholder="Mậu khẩu của bạn" id="password" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Ghi nhớ tài khoản của bạn : <input type="checkbox"></label>
                                </div>
                                <div class="control-group">
                                    <input tabindex="3" class="btn btn-inverse large" type="submit" value="Đăng nhập">
                                    <hr>
                                    <p class="reset">Recover your <a tabindex="4" href="#" title="Recover your username or password">username or password</a></p>
                                </div>
                            </fieldset>
                        </form>				
                    </div>
                    <div class="span7">					
                        <h4 class="title"><span class="text"><strong>Đăng ký</strong> </span></h4>
                        <form action="#" method="post" class="form-stacked">
                            <fieldset>
                                <div class="control-group">
                                    <label class="control-label">Tên đăng nhập:</label>
                                    <div class="controls">
                                        <input type="text" placeholder="Tên đăng nhập của bạn" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Địa chỉ email:</label>
                                    <div class="controls">
                                        <input type="password" placeholder="Email của bạn" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Mậu khẩu:</label>
                                    <div class="controls">
                                        <input type="password" placeholder="Nhập mật khẩu" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Nhập lại mật khẩu:</label>
                                    <div class="controls">
                                        <input type="password" placeholder="Nhập lại mật khẩu" class="input-xlarge">
                                    </div>
                                </div>	
                                <div class="control-group">
                                    <p>Đăng ký để trải nghiệm công việc phù hơn với bạn, chúc bạn một ngày vui vẻ !</p>
                                </div>
                                <hr>
                                <div class="actions"><input tabindex="9" class="btn btn-inverse large" type="submit" value="Tạo tài khoản"></div>
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
        <script>
            $(document).ready(function () {
                $('#checkout').click(function (e) {
                    document.location.href = "checkout.html";
                })
            });
        </script>		
    </body>
</html>
