package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Bootstrap E-commerce Templates</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">      \n");
      out.write("        <link href=\"bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\t\t\n");
      out.write("        <link href=\"themes/css/bootstrappage.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"themes/css/flexslider.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"themes/css/main.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"themes/js/jquery-1.7.2.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\t\t\t\t\n");
      out.write("        <script src=\"themes/js/superfish.js\"></script>\t\n");
      out.write("        <script src=\"themes/js/jquery.scrolltotop.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"top-bar\" class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"span4\">\n");
      out.write("                    <form method=\"POST\" class=\"search_form\">\n");
      out.write("                        <input type=\"text\" class=\"input-block-level search-query\" Placeholder=\"eg. T-sirt\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"span8\">\n");
      out.write("                    <div class=\"account pull-right\">\n");
      out.write("                        <ul class=\"user-menu\">\t\t\t\t\n");
      out.write("                            <li><a href=\"#\">My Account</a></li>\n");
      out.write("                            <li><a href=\"cart.html\">Your Cart</a></li>\n");
      out.write("                            <li><a href=\"checkout.html\">Checkout</a></li>\t\t\t\t\t\n");
      out.write("                            <li><a href=\"register.html\">Login</a></li>\t\t\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"wrapper\" class=\"container\">\n");
      out.write("            <section class=\"navbar main-menu\">\n");
      out.write("                <div class=\"navbar-inner main-menu\">\t\t\t\t\n");
      out.write("                    <a href=\"index.html\" class=\"logo pull-left\"><img src=\"themes/images//logo.png\" class=\"site_logo\" alt=\"\"></a>\n");
      out.write("                    <nav id=\"menu\" class=\"pull-right\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"./products.html\">Woman</a>\t\t\t\t\t\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"./products.html\">Lacinia nibh</a></li>\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <li><a href=\"./products.html\">Eget molestie</a></li>\n");
      out.write("                                    <li><a href=\"./products.html\">Varius purus</a></li>\t\t\t\t\t\t\t\t\t\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            <li><a href=\"./products.html\">Man</a></li>\t\t\t\n");
      out.write("                            <li><a href=\"./products.html\">Sport</a>\n");
      out.write("                                <ul>\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <li><a href=\"./products.html\">Gifts and Tech</a></li>\n");
      out.write("                                    <li><a href=\"./products.html\">Ties and Hats</a></li>\n");
      out.write("                                    <li><a href=\"./products.html\">Cold Weather</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\t\t\t\t\t\t\t\n");
      out.write("                            <li><a href=\"./products.html\">Hangbag</a></li>\n");
      out.write("                            <li><a href=\"./products.html\">Best Seller</a></li>\n");
      out.write("                            <li><a href=\"./products.html\">Top Seller</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </section>\t\t\t\n");
      out.write("            <section class=\"header_text sub\">\n");
      out.write("                <img class=\"pageBanner\" src=\"themes/images/pageBanner.png\" alt=\"New products\" >\n");
      out.write("                <h4><span>Login or Regsiter</span></h4>\n");
      out.write("            </section>\t\t\t\n");
      out.write("            <section class=\"main-content\">\t\t\t\t\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"span5\">\t\t\t\t\t\n");
      out.write("                        <h4 class=\"title\"><span class=\"text\"><strong>Login</strong> Form</span></h4>\n");
      out.write("                        <form action=\"#\" method=\"post\">\n");
      out.write("                            <input type=\"hidden\" name=\"next\" value=\"/\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <label class=\"control-label\">Username</label>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Enter your username\" id=\"username\" class=\"input-xlarge\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <label class=\"control-label\">Username</label>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"password\" placeholder=\"Enter your password\" id=\"password\" class=\"input-xlarge\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <input tabindex=\"3\" class=\"btn btn-inverse large\" type=\"submit\" value=\"Sign into your account\">\n");
      out.write("                                    <hr>\n");
      out.write("                                    <p class=\"reset\">Recover your <a tabindex=\"4\" href=\"#\" title=\"Recover your username or password\">username or password</a></p>\n");
      out.write("                                </div>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span7\">\t\t\t\t\t\n");
      out.write("                        <h4 class=\"title\"><span class=\"text\"><strong>Register</strong> Form</span></h4>\n");
      out.write("                        <form action=\"#\" method=\"post\" class=\"form-stacked\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <label class=\"control-label\">Username</label>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Enter your username\" class=\"input-xlarge\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <label class=\"control-label\">Email address:</label>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"password\" placeholder=\"Enter your email\" class=\"input-xlarge\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <label class=\"control-label\">Password:</label>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"password\" placeholder=\"Enter your password\" class=\"input-xlarge\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\t\t\t\t\t\t\t                            \n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <p>Now that we know who you are. I'm not a mistake! In a comic, you know how you can tell who the arch-villain's going to be?</p>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"actions\"><input tabindex=\"9\" class=\"btn btn-inverse large\" type=\"submit\" value=\"Create your account\"></div>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\t\t\t\t\t\n");
      out.write("                    </div>\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("            </section>\t\t\t\n");
      out.write("            <section id=\"footer-bar\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"span3\">\n");
      out.write("                        <h4>Navigation</h4>\n");
      out.write("                        <ul class=\"nav\">\n");
      out.write("                            <li><a href=\"./index.html\">Homepage</a></li>  \n");
      out.write("                            <li><a href=\"./about.html\">About Us</a></li>\n");
      out.write("                            <li><a href=\"./contact.html\">Contac Us</a></li>\n");
      out.write("                            <li><a href=\"./cart.html\">Your Cart</a></li>\n");
      out.write("                            <li><a href=\"./register.html\">Login</a></li>\t\t\t\t\t\t\t\n");
      out.write("                        </ul>\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span4\">\n");
      out.write("                        <h4>My Account</h4>\n");
      out.write("                        <ul class=\"nav\">\n");
      out.write("                            <li><a href=\"#\">My Account</a></li>\n");
      out.write("                            <li><a href=\"#\">Order History</a></li>\n");
      out.write("                            <li><a href=\"#\">Wish List</a></li>\n");
      out.write("                            <li><a href=\"#\">Newsletter</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span5\">\n");
      out.write("                        <p class=\"logo\"><img src=\"themes/images/logo.png\" class=\"site_logo\" alt=\"\"></p>\n");
      out.write("                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. the  Lorem Ipsum has been the industry's standard dummy text ever since the you.</p>\n");
      out.write("                        <br/>\n");
      out.write("                        <span class=\"social_icons\">\n");
      out.write("                            <a class=\"facebook\" href=\"#\">Facebook</a>\n");
      out.write("                            <a class=\"twitter\" href=\"#\">Twitter</a>\n");
      out.write("                            <a class=\"skype\" href=\"#\">Skype</a>\n");
      out.write("                            <a class=\"vimeo\" href=\"#\">Vimeo</a>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\t\t\t\t\t\n");
      out.write("                </div>\t\n");
      out.write("            </section>\n");
      out.write("            <section id=\"copyright\">\n");
      out.write("                <span>Copyright 2013 bootstrappage template  All right reserved.</span>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"themes/js/common.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#checkout').click(function (e) {\n");
      out.write("                    document.location.href = \"checkout.html\";\n");
      out.write("                })\n");
      out.write("            });\n");
      out.write("        </script>\t\t\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
