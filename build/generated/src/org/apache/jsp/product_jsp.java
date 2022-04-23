package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("                            <li><a href=\"#\">Tài khoản của tôi</a></li>\n");
      out.write("                            <li><a href=\"cart.html\">Thông tin ứng tuyển</a></li>\n");
      out.write("                            <li><a href=\"checkout.html\">Checkout</a></li>\t\t\t\t\t\n");
      out.write("                            <li><a href=\"register.html\">Đăng nhập</a></li>\t\t\t\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"wrapper\" class=\"container\">\n");
      out.write("            <section class=\"navbar main-menu\">\n");
      out.write("                <div class=\"navbar-inner main-menu\">\t\t\t\t\n");
      out.write("                    <a href=\"index.html\" class=\"local logo pull-left\">TOBEN - Dream Of Success</a>\n");
      out.write("                    <nav id=\"menu\" class=\"pull-right\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"./products.html\">Tuyển dụng</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            <li><a href=\"./products.html\">Tính chất công việc</a>\n");
      out.write("                                <ul>\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <li><a href=\"./products.html\">Gifts and Tech</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\t\t\t\n");
      out.write("                            <li><a href=\"./products.html\">Về chúng tôi</a></li>\t\t\t\t\t\t\t\n");
      out.write("                            <li><a href=\"./products.html\">Sự kiện</a></li>\n");
      out.write("                            <li><a href=\"./products.html\">Liên hệ</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </section>\t\n");
      out.write("            <section class=\"header_text sub\">\n");
      out.write("                <img class=\"pageBanner\" style=\"height: 300px;\" src=\"Jobpictures/slide3.jpg\" alt=\"New products\" >\n");
      out.write("                <h4><span>Thông tin tuyển dụng</span></h4>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"main-content\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\t\t\t\t\t\t\n");
      out.write("                    <div class=\"span9\">\t\t\t\t\t\t\t\t\n");
      out.write("                        <ul class=\"thumbnails listing-products\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\t\t\t\t\t\t\t\t\n");
      out.write("                        <hr>\n");
      out.write("                        <div class=\"pagination pagination-small pagination-centered\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Prev</a></li>\n");
      out.write("                                <li><a href=\"productjobServlet?page=1\">1</a></li>\n");
      out.write("                                <li><a href=\"productjobServlet?page=2\">2</a></li>\n");
      out.write("                                <li><a href=\"productjobServlet?page=3\">3</a></li>\n");
      out.write("                                <li><a href=\"productjobServlet?page=4\">4</a></li>\n");
      out.write("                                <li><a href=\"#\">Next</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span3 col\">\n");
      out.write("                        <div class=\"block\">\t\n");
      out.write("                            <ul class=\"nav nav-list\">\n");
      out.write("                                <li class=\"nav-header\">Tính chất công việc</li>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                            <br/>\n");
      out.write("                            <ul class=\"nav nav-list below\">\n");
      out.write("                                <li class=\"nav-header\">Công ty</li>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listJob}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("job");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <li class=\"span3\">\n");
          out.write("                                <div style=\"height: 200px\" class=\"product-box border-job\">\n");
          out.write("                                    <span class=\"sale_tag\"></span>\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("                                    <a href=\"#\"><img alt=\"\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.imageurl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></a><br/>\n");
          out.write("                                    <a href=\"#\" class=\"title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.job_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a><br/>\n");
          out.write("                                    <a href=\"#\" class=\"category\">Expirationdate: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.expirationdate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                    <p class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.salary}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                </div>\n");
          out.write("                            </li>       \n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCategory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("ct");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li><a href=\"filterCategoryController?categoryId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.ct_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCompany}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("cp");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li><a href=\"products.html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cp.company_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
