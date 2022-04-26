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
                                            <th class="text-center py-3 px-4" style="width: 120px;">Quantity</th>
                                            <th class="text-right py-3 px-4" style="width: 100px;">Total</th>
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
                                                <td class="align-middle p-4"><input type="text" class="form-control text-center" value="2"></td>
                                                <td class="text-right font-weight-semibold align-middle p-4">${C.value.job.expirationdate}</td>
                                                <td class="text-center align-middle px-0"><a href="deleteCartServlet?jobId=${C.value.job.id}" class="shop-tooltip close float-none text-danger" title="" data-original-title="Remove">×</a></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <!-- / Shopping cart table -->
                            <section class="main-content">
                                <div class="row">
                                    <div class="span12">
                                        <div class="accordion" id="accordion2">
                                            <div class="accordion-group">
                                                <div class="accordion-heading">
                                                    <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">Checkout Options</a>
                                                </div>
                                                <div id="collapseOne" class="accordion-body in collapse">
                                                    <div class="accordion-inner">
                                                        <div class="row-fluid">
                                                            <div class="span6">
                                                                <h4>New Customer</h4>
                                                                <p>By creating an account you will be able to shop faster, be up to date on an order's status, and keep track of the orders you have previously made.</p>
                                                                <form action="#" method="post">
                                                                    <fieldset>
                                                                        <label class="radio" for="register">
                                                                            <input type="radio" name="account" value="register" id="register" checked="checked">Register Account
                                                                        </label>
                                                                        <label class="radio" for="guest">
                                                                            <input type="radio" name="account" value="guest" id="guest">Guest Checkout
                                                                        </label>
                                                                        <br>
                                                                        <button class="btn btn-inverse" data-toggle="collapse" data-parent="#collapse2">Continue</button>
                                                                    </fieldset>
                                                                </form>
                                                            </div>
                                                            <div class="span6">
                                                                <h4>Thông tin người ứng tuyển</h4>
                                                                <form action="checkoutServlet" method="POST">
                                                                    <fieldset>
                                                                        <div class="control-group">
                                                                            <label class="control-label">Họ và tên:</label>
                                                                            <div class="controls">
                                                                                <input type="text" placeholder="Nhập họ và tên" id="username" name="name" class="input-xlarge">
                                                                            </div>
                                                                        </div>
                                                                        <div class="control-group">
                                                                            <label class="control-label">Số điện thoại:</label>
                                                                            <div class="controls">
                                                                                <input type="text" placeholder="Nhập số điện thoại" name="phone" id="password" class="input-xlarge">
                                                                            </div>
                                                                        </div>
                                                                         <div class="control-group">
                                                                            <label class="control-label">Địa chỉ:</label>
                                                                            <div class="controls">
                                                                                <input type="text" placeholder="Địa chỉ" id="password" name="address" class="input-xlarge">
                                                                            </div>
                                                                        </div>
                                                                         <div class="control-group">
                                                                            <label class="control-label">Ghi chú:</label>
                                                                            <div class="controls">
                                                                                <input type="text" placeholder="Ghi chú" name="note" id="password" class="input-xlarge">
                                                                            </div>
                                                                        </div>
                                                                        <input type="submit">
                                                                    </fieldset>
                                                                </form>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="accordion-group">
                                                <div class="accordion-heading">
                                                    <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseTwo">Account &amp; Billing Details</a>
                                                </div>
                                                <div id="collapseTwo" class="accordion-body collapse">
                                                    <div class="accordion-inner">
                                                        <div class="row-fluid">
                                                            <div class="span6">
                                                                <h4>Your Personal Details</h4>
                                                                <div class="control-group">
                                                                    <label class="control-label">First Name</label>
                                                                    <div class="controls">
                                                                        <input type="text" placeholder="" class="input-xlarge">
                                                                    </div>
                                                                </div>
                                                                <div class="control-group">
                                                                    <label class="control-label">Last Name</label>
                                                                    <div class="controls">
                                                                        <input type="text" placeholder="" class="input-xlarge">
                                                                    </div>
                                                                </div>					  
                                                                <div class="control-group">
                                                                    <label class="control-label">Email Address</label>
                                                                    <div class="controls">
                                                                        <input type="text" placeholder="" class="input-xlarge">
                                                                    </div>
                                                                </div>
                                                                <div class="control-group">
                                                                    <label class="control-label">Telephone</label>
                                                                    <div class="controls">
                                                                        <input type="text" placeholder="" class="input-xlarge">
                                                                    </div>
                                                                </div>
                                                                <div class="control-group">
                                                                    <label class="control-label">Fax</label>
                                                                    <div class="controls">
                                                                        <input type="text" placeholder="" class="input-xlarge">
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="span6">
                                                                <h4>Your Address</h4>
                                                                <div class="control-group">
                                                                    <label class="control-label">Company</label>
                                                                    <div class="controls">
                                                                        <input type="text" placeholder="" class="input-xlarge">
                                                                    </div>
                                                                </div>
                                                                <div class="control-group">
                                                                    <label class="control-label">Company ID:</label>
                                                                    <div class="controls">
                                                                        <input type="text" placeholder="" class="input-xlarge">
                                                                    </div>
                                                                </div>					  
                                                                <div class="control-group">
                                                                    <label class="control-label"><span class="required">*</span> Address 1:</label>
                                                                    <div class="controls">
                                                                        <input type="text" placeholder="" class="input-xlarge">
                                                                    </div>
                                                                </div>
                                                                <div class="control-group">
                                                                    <label class="control-label">Address 2:</label>
                                                                    <div class="controls">
                                                                        <input type="text" placeholder="" class="input-xlarge">
                                                                    </div>
                                                                </div>
                                                                <div class="control-group">
                                                                    <label class="control-label"><span class="required">*</span> City:</label>
                                                                    <div class="controls">
                                                                        <input type="text" placeholder="" class="input-xlarge">
                                                                    </div>
                                                                </div>
                                                                <div class="control-group">
                                                                    <label class="control-label"><span class="required">*</span> Post Code:</label>
                                                                    <div class="controls">
                                                                        <input type="text" placeholder="" class="input-xlarge">
                                                                    </div>
                                                                </div>
                                                                <div class="control-group">
                                                                    <label class="control-label"><span class="required">*</span> Country:</label>
                                                                    <div class="controls">
                                                                        <select class="input-xlarge">
                                                                            <option value="1">Afghanistan</option>
                                                                            <option value="2">Albania</option>
                                                                            <option value="3">Algeria</option>
                                                                            <option value="4">American Samoa</option>
                                                                            <option value="5">Andorra</option>
                                                                            <option value="6">Angola</option>
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                                <div class="control-group">
                                                                    <label class="control-label"><span class="required">*</span> Region / State:</label>
                                                                    <div class="controls">
                                                                        <select name="zone_id" class="input-xlarge">
                                                                            <option value=""> --- Please Select --- </option>
                                                                            <option value="3513">Aberdeen</option>
                                                                            <option value="3514">Aberdeenshire</option>
                                                                            <option value="3515">Anglesey</option>
                                                                            <option value="3516">Angus</option>
                                                                            <option value="3517">Argyll and Bute</option>
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="accordion-group">
                                                <div class="accordion-heading">
                                                    <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseThree">Confirm Order</a>
                                                </div>
                                                <div id="collapseThree" class="accordion-body collapse">
                                                    <div class="accordion-inner">
                                                        <div class="row-fluid">
                                                            <div class="control-group">
                                                                <label for="textarea" class="control-label">Comments</label>
                                                                <div class="controls">
                                                                    <textarea rows="3" id="textarea" class="span12"></textarea>
                                                                </div>
                                                            </div>									
                                                            <button class="btn btn-inverse pull-right">Confirm order</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>				
                                    </div>
                                </div>
                            </section>
                            <div class="float-right">
                                <button type="button" class="btn btn-lg btn-default md-btn-flat mt-2 mr-3">Back to shopping</button>
                                <button type="button" class="btn btn-lg btn-primary mt-2">Checkout</button>
                            </div>

                        </div>
                    </div>
                </div>

            </section>



        </div>
    </body>
</html>
