package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            /*! CSS Used from: https://plazavea.vteximg.com.br/arquivos/normalize.min.css?v=636934665287400000 */\n");
      out.write("h2,span{margin:auto;padding:0;border:0;font-weight:inherit;font-style:inherit;font-size:100%;font-family:inherit;vertical-align:baseline;}\n");
      out.write("h2{font-size:38px;font-weight:700;}\n");
      out.write("h2{margin:0 0 10px;line-height:1;}\n");
      out.write(":focus{outline:0;}\n");
      out.write("/*! CSS Used from: https://www.plazavea.com.pe/files/global--pwa.min.css */\n");
      out.write("h2{font-weight:400;margin:0;}\n");
      out.write("/*! CSS Used from: https://www.plazavea.com.pe/files/pvaicon--pwa.min.css */\n");
      out.write(".pvaicon{line-height:1;}\n");
      out.write(".pvaicon:before{font-family:pvaicon!important;font-style:normal;font-weight:400!important;vertical-align:top;}\n");
      out.write(".pvaicon-14-close:before{content:\"\\f10e\";}\n");
      out.write("/*! CSS Used from: https://www.plazavea.com.pe/files/header--pwa.min.css */\n");
      out.write(".Header *{box-sizing:border-box;outline:0;font-family:Rubik;}\n");
      out.write(".MainMenu *{font-family:Rubik;font-weight:400;color:#323232;}\n");
      out.write(".MainMenu__subcategory__contentTitle{display:none;position:relative;min-height:108px;}\n");
      out.write("@media (min-width:992px){\n");
      out.write(".MainMenu__subcategory__contentTitle{display:block;}\n");
      out.write("}\n");
      out.write(".MainMenu__subcategory__title{padding:20px 135px;background-color:#95cd69;}\n");
      out.write(".MainMenu__subcategory__title h2{font-family:gilroy-bold,arial;font-size:20px;color:#fff;}\n");
      out.write(".MainMenu__subcategory__image{position:absolute;width:120px;height:108px;background:url(https://plazavea.vteximg.com.br/arquivos/sprite-main-menu.png) no-repeat 0 -28px;left:0;}\n");
      out.write(".MainMenu__subcategory__image--mascotas{background-position:0 -1913px;}\n");
      out.write(".MainMenu__close{position:absolute;right:15px;top:22px;z-index:1;cursor:pointer;color:#fff;font-size:24px;}\n");
      out.write(".MainMenu-color10 .MainMenu__subcategory__title{background-color:#d1ba8e;}\n");
      out.write("/*! CSS Used from: https://www.plazavea.com.pe/files/similar--pwa.min.css */\n");
      out.write(".GeneralWrapper *{box-sizing:border-box;outline:0;}\n");
      out.write("/*! CSS Used fontfaces */\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"MainMenu__subcategory__contentTitle\">\n");
      out.write("            <span class=\"MainMenu__subcategory__image MainMenu__subcategory__image--mascotas\">\n");
      out.write("                \n");
      out.write("            </span>\n");
      out.write("            <div class=\"MainMenu__subcategory__title\">\n");
      out.write("                <span class=\"MainMenu__close pvaicon pvaicon-14-close\"></span>\n");
      out.write("                <h2>Mascotas</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
