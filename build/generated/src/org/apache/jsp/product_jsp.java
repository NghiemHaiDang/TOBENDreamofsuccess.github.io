package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                            <li><a href=\"register.html\">Login</a></li>\t\t\t\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"wrapper\" class=\"container\">\n");
      out.write("            <section class=\"navbar main-menu\">\n");
      out.write("                <div class=\"navbar-inner main-menu\">\t\t\t\t\n");
      out.write("                    <a href=\"index.html\" class=\"logo pull-left\"><img src=\"themes/images/logo.png\" class=\"site_logo\" alt=\"\"></a>\n");
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
      out.write("            </section>\t\n");
      out.write("            <section class=\"header_text sub\">\n");
      out.write("                <img class=\"pageBanner\" src=\"themes/images/pageBanner.png\" alt=\"New products\" >\n");
      out.write("                <h4><span>New products</span></h4>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"main-content\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\t\t\t\t\t\t\n");
      out.write("                    <div class=\"span9\">\t\t\t\t\t\t\t\t\n");
      out.write("                        <ul class=\"thumbnails listing-products\">\n");
      out.write("                            <li class=\"span3\">\n");
      out.write("                                <div class=\"product-box\">\n");
      out.write("                                    <span class=\"sale_tag\"></span>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <a href=\"product_detail.html\"><img alt=\"\" src=\"themes/images/ladies/9.jpg\"></a><br/>\n");
      out.write("                                    <a href=\"product_detail.html\" class=\"title\">Fusce id molestie massa</a><br/>\n");
      out.write("                                    <a href=\"#\" class=\"category\">Phasellus consequat</a>\n");
      out.write("                                    <p class=\"price\">$341</p>\n");
      out.write("                                </div>\n");
      out.write("                            </li>       \n");
      out.write("                            <li class=\"span3\">\n");
      out.write("                                <div class=\"product-box\">\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <a href=\"product_detail.html\"><img alt=\"\" src=\"themes/images/ladies/8.jpg\"></a><br/>\n");
      out.write("                                    <a href=\"product_detail.html\" class=\"title\">Praesent tempor sem</a><br/>\n");
      out.write("                                    <a href=\"#\" class=\"category\">Erat gravida</a>\n");
      out.write("                                    <p class=\"price\">$28</p>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"span3\">\n");
      out.write("                                <div class=\"product-box\">\n");
      out.write("                                    <span class=\"sale_tag\"></span>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <a href=\"product_detail.html\"><img alt=\"\" src=\"themes/images/ladies/7.jpg\"></a><br/>\n");
      out.write("                                    <a href=\"product_detail.html\" class=\"title\">Wuam ultrices rutrum</a><br/>\n");
      out.write("                                    <a href=\"#\" class=\"category\">Suspendisse aliquet</a>\n");
      out.write("                                    <p class=\"price\">$341</p>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"span3\">\n");
      out.write("                                <div class=\"product-box\">\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <span class=\"sale_tag\"></span>\n");
      out.write("                                    <a href=\"product_detail.html\"><img alt=\"\" src=\"themes/images/ladies/6.jpg\"></a><br/>\n");
      out.write("                                    <a href=\"product_detail.html\" class=\"title\">Praesent tempor sem sodales</a><br/>\n");
      out.write("                                    <a href=\"#\" class=\"category\">Nam imperdiet</a>\n");
      out.write("                                    <p class=\"price\">$49</p>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"span3\">\n");
      out.write("                                <div class=\"product-box\">                                        \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <a href=\"product_detail.html\"><img alt=\"\" src=\"themes/images/ladies/1.jpg\"></a><br/>\n");
      out.write("                                    <a href=\"product_detail.html\" class=\"title\">Fusce id molestie massa</a><br/>\n");
      out.write("                                    <a href=\"#\" class=\"category\">Congue diam congue</a>\n");
      out.write("                                    <p class=\"price\">$35</p>\n");
      out.write("                                </div>\n");
      out.write("                            </li>       \n");
      out.write("                            <li class=\"span3\">\n");
      out.write("                                <div class=\"product-box\">\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <a href=\"product_detail.html\"><img alt=\"\" src=\"themes/images/ladies/2.jpg\"></a><br/>\n");
      out.write("                                    <a href=\"product_detail.html\" class=\"title\">Tempor sem sodales</a><br/>\n");
      out.write("                                    <a href=\"#\" class=\"category\">Gravida placerat</a>\n");
      out.write("                                    <p class=\"price\">$61</p>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"span3\">\n");
      out.write("                                <div class=\"product-box\">\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <a href=\"product_detail.html\"><img alt=\"\" src=\"themes/images/ladies/3.jpg\"></a><br/>\n");
      out.write("                                    <a href=\"product_detail.html\" class=\"title\">Quam ultrices rutrum</a><br/>\n");
      out.write("                                    <a href=\"#\" class=\"category\">Orci et nisl iaculis</a>\n");
      out.write("                                    <p class=\"price\">$233</p>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"span3\">\n");
      out.write("                                <div class=\"product-box\">\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <a href=\"product_detail.html\"><img alt=\"\" src=\"themes/images/ladies/4.jpg\"></a><br/>\n");
      out.write("                                    <a href=\"product_detail.html\" class=\"title\">Tempor sem sodales</a><br/>\n");
      out.write("                                    <a href=\"#\" class=\"category\">Urna nec lectus mollis</a>\n");
      out.write("                                    <p class=\"price\">$134</p>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"span3\">\n");
      out.write("                                <div class=\"product-box\">\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <a href=\"product_detail.html\"><img alt=\"\" src=\"themes/images/ladies/5.jpg\"></a><br/>\n");
      out.write("                                    <a href=\"product_detail.html\" class=\"title\">Luctus quam ultrices</a><br/>\n");
      out.write("                                    <a href=\"#\" class=\"category\">Suspendisse aliquet</a>\n");
      out.write("                                    <p class=\"price\">$261</p>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\t\t\t\t\t\t\t\t\n");
      out.write("                        <hr>\n");
      out.write("                        <div class=\"pagination pagination-small pagination-centered\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Prev</a></li>\n");
      out.write("                                <li class=\"active\"><a href=\"#\">1</a></li>\n");
      out.write("                                <li><a href=\"#\">2</a></li>\n");
      out.write("                                <li><a href=\"#\">3</a></li>\n");
      out.write("                                <li><a href=\"#\">4</a></li>\n");
      out.write("                                <li><a href=\"#\">Next</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span3 col\">\n");
      out.write("                        <div class=\"block\">\t\n");
      out.write("                            <ul class=\"nav nav-list\">\n");
      out.write("                                <li class=\"nav-header\">SUB CATEGORIES</li>\n");
      out.write("                                <li><a href=\"products.html\">Nullam semper elementum</a></li>\n");
      out.write("                                <li class=\"active\"><a href=\"products.html\">Phasellus ultricies</a></li>\n");
      out.write("                                <li><a href=\"products.html\">Donec laoreet dui</a></li>\n");
      out.write("                                <li><a href=\"products.html\">Nullam semper elementum</a></li>\n");
      out.write("                                <li><a href=\"products.html\">Phasellus ultricies</a></li>\n");
      out.write("                                <li><a href=\"products.html\">Donec laoreet dui</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <br/>\n");
      out.write("                            <ul class=\"nav nav-list below\">\n");
      out.write("                                <li class=\"nav-header\">MANUFACTURES</li>\n");
      out.write("                                <li><a href=\"products.html\">Adidas</a></li>\n");
      out.write("                                <li><a href=\"products.html\">Nike</a></li>\n");
      out.write("                                <li><a href=\"products.html\">Dunlop</a></li>\n");
      out.write("                                <li><a href=\"products.html\">Yamaha</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"block\">\n");
      out.write("                            <h4 class=\"title\">\n");
      out.write("                                <span class=\"pull-left\"><span class=\"text\">Randomize</span></span>\n");
      out.write("                                <span class=\"pull-right\">\n");
      out.write("                                    <a class=\"left button\" href=\"#myCarousel\" data-slide=\"prev\"></a><a class=\"right button\" href=\"#myCarousel\" data-slide=\"next\"></a>\n");
      out.write("                                </span>\n");
      out.write("                            </h4>\n");
      out.write("                            <div id=\"myCarousel\" class=\"carousel slide\">\n");
      out.write("                                <div class=\"carousel-inner\">\n");
      out.write("                                    <div class=\"active item\">\n");
      out.write("                                        <ul class=\"thumbnails listing-products\">\n");
      out.write("                                            <li class=\"span3\">\n");
      out.write("                                                <div class=\"product-box\">\n");
      out.write("                                                    <span class=\"sale_tag\"></span>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                    <img alt=\"\" src=\"themes/images/ladies/1.jpg\"><br/>\n");
      out.write("                                                    <a href=\"product_detail.html\" class=\"title\">Fusce id molestie massa</a><br/>\n");
      out.write("                                                    <a href=\"#\" class=\"category\">Suspendisse aliquet</a>\n");
      out.write("                                                    <p class=\"price\">$261</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"item\">\n");
      out.write("                                        <ul class=\"thumbnails listing-products\">\n");
      out.write("                                            <li class=\"span3\">\n");
      out.write("                                                <div class=\"product-box\">\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                    <img alt=\"\" src=\"themes/images/ladies/2.jpg\"><br/>\n");
      out.write("                                                    <a href=\"product_detail.html\" class=\"title\">Tempor sem sodales</a><br/>\n");
      out.write("                                                    <a href=\"#\" class=\"category\">Urna nec lectus mollis</a>\n");
      out.write("                                                    <p class=\"price\">$134</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"block\">\t\t\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"title\"><strong>Best</strong> Seller</h4>\t\t\t\t\t\t\t\t\n");
      out.write("                            <ul class=\"small-product\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" title=\"Praesent tempor sem sodales\">\n");
      out.write("                                        <img src=\"themes/images/ladies/3.jpg\" alt=\"Praesent tempor sem sodales\">\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\">Praesent tempor sem</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" title=\"Luctus quam ultrices rutrum\">\n");
      out.write("                                        <img src=\"themes/images/ladies/4.jpg\" alt=\"Luctus quam ultrices rutrum\">\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\">Luctus quam ultrices rutrum</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" title=\"Fusce id molestie massa\">\n");
      out.write("                                        <img src=\"themes/images/ladies/5.jpg\" alt=\"Fusce id molestie massa\">\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\">Fusce id molestie massa</a>\n");
      out.write("                                </li>   \n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
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
      out.write("        <script src=\"themes/js/common.js\"></script>\t\n");
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
