package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class businessregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>TOBEN - Dream Of Success</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"themes/css/bootstrappage.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"themes/css/flexslider.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"themes/css/main.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"themes/js/jquery-1.7.2.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"themes/js/superfish.js\"></script>\n");
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
      out.write("                        <ul class=\"user-menu\">\n");
      out.write("                            <li><a href=\"#\">Tài khoản của tôi</a></li>\n");
      out.write("                            <li><a href=\"cart.html\">Thông tin ứng tuyển</a></li>\n");
      out.write("                            <li><a href=\"checkout.html\">Checkout</a></li>\n");
      out.write("                            <li><a href=\"register.html\">Đăng nhập</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"wrapper\" class=\"container\">\n");
      out.write("            <section class=\"navbar main-menu\">\n");
      out.write("                <div class=\"navbar-inner main-menu\">\n");
      out.write("                    <a href=\"index.html\" class=\"local logo pull-left\">TOBEN - Dream Of Success</a>\n");
      out.write("                    <nav id=\"menu\" class=\"pull-right\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"./products.html\">Tuyển dụng</a></li>\n");
      out.write("                            <li><a href=\"./products.html\">Tính chất công việc</a></li>\n");
      out.write("                            <li><a href=\"./products.html\">Về chúng tôi</a></li>\n");
      out.write("                            <li><a href=\"./products.html\">Sự kiện</a></li>\n");
      out.write("                            <li><a href=\"./products.html\">Liên hệ</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"header_text sub\">\n");
      out.write("                <img class=\"pageBanner\" src=\"themes/images/pageBanner.png\" alt=\"New products\">\n");
      out.write("                <h4><span>Đăng ký doanh nghiệp</span></h4>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"main-content\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <form action=\"#\" method=\"post\">\n");
      out.write("                        <div class=\"span5\">\n");
      out.write("                            <h4 class=\"title\"><span class=\"text\"><strong>Đăng ký</strong> doanh nghiệp</span></h4>\n");
      out.write("\n");
      out.write("                            <input type=\"hidden\" name=\"next\" value=\"/\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <label class=\"control-label\">Tên doanh nghiệp:</label>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"password\" placeholder=\"Tên doanh nghiệp\" name=\"company_name\"\n");
      out.write("                                               id=\"password\" class=\"input-xlarge\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <label class=\"control-label\">CEO doanh nghiệp:</label>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"password\" placeholder=\"CEO\" name=\"ceo\" id=\"password\"\n");
      out.write("                                               class=\"input-xlarge\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <label class=\"control-label\">Số điện thoại doanh nghiệp:</label>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"password\" placeholder=\"Số điện thoại\" name=\"phonecompany\" id=\"password\"\n");
      out.write("                                               class=\"input-xlarge\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"span7\">\n");
      out.write("                            <h4 class=\"title\"><span class=\"text\"><strong>Dành cho</strong> doanh nghiệp</span></h4>\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <label class=\"control-label\">Hình ảnh doanh nghiệp:</label>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"file\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"actions\"><input tabindex=\"9\" class=\"btn btn-inverse large\" type=\"submit\"\n");
      out.write("                                                            value=\"Đăng ký doanh nghiệp\"></div>\n");
      out.write("                            </fieldset>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <section id=\"footer-bar\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"span3\">\n");
      out.write("                <h4>Navigation</h4>\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li><a href=\"./index.html\">Trang chủ</a></li>\n");
      out.write("                    <li><a href=\"./about.html\">Về chúng tôi</a></li>\n");
      out.write("                    <li><a href=\"./contact.html\">Liên hệ</a></li>\n");
      out.write("                    <li><a href=\"./cart.html\">Thông tin ứng tuyển</a></li>\n");
      out.write("                    <li><a href=\"./register.html\">Đăng nhập</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"span4\">\n");
      out.write("                <h4>Tài khoản của bạn</h4>\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li><a href=\"#\">Tài khoản của bạn</a></li>\n");
      out.write("                    <li><a href=\"#\">Sự kiện</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"span5\">\n");
      out.write("                <p style=\"color:#eb4800;\">TOBEN - Dream Of Success</p>\n");
      out.write("                Càng khó khăn bao nhiêu thì thành quả bạn nhận được càng to lớn bấy nhiêu. Hãy coi những khó khăn là một\n");
      out.write("                cơ hội đi tới thành công lớn lao\n");
      out.write("                <br />TOBEN - Dream Of Success khám phá bản thân, tiến đến tương lai.\n");
      out.write("                <br />\n");
      out.write("                <span class=\"social_icons\">\n");
      out.write("                    <a class=\"facebook\" href=\"#\">Facebook</a>\n");
      out.write("                    <a class=\"twitter\" href=\"#\">Twitter</a>\n");
      out.write("                    <a class=\"skype\" href=\"#\">Skype</a>\n");
      out.write("                    <a class=\"vimeo\" href=\"#\">Vimeo</a>\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("</div>\n");
      out.write("<script src=\"themes/js/common.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $('#checkout').click(function (e) {\n");
      out.write("            document.location.href = \"checkout.html\";\n");
      out.write("        })\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
