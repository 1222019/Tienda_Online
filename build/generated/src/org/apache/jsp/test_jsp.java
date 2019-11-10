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
      out.write("            a:focus{outline:thin dotted;}\n");
      out.write("            a:active,a:hover{outline:0;}\n");
      out.write("            a,span{margin:auto;padding:0;border:0;font-weight:inherit;font-style:inherit;font-size:100%;font-family:inherit;vertical-align:baseline;}\n");
      out.write("            a{text-decoration:none;}\n");
      out.write("            :focus{outline:0;}\n");
      out.write("            /*! CSS Used from: https://www.plazavea.com.pe/files/footer--pwa.min.css */\n");
      out.write("            .Footer *{box-sizing:border-box;}\n");
      out.write("            .Footer__social a{margin:0 3px;}\n");
      out.write("            .Footer__social .pvaicon{font-size:34px;color:#ee3037;border-radius:100%;height:35px;width:35px;line-height:25px;display:block;text-align:center;padding:5px 0;}\n");
      out.write("            .Footer__social .pvaicon:before{vertical-align:middle;}\n");
      out.write("            .Footer__social span{font-size:0;}\n");
      out.write("            /*! CSS Used from: https://www.plazavea.com.pe/files/pvaicon--pwa.min.css */\n");
      out.write("            .pvaicon{line-height:1;}\n");
      out.write("            .pvaicon:before{font-family:pvaicon!important;font-style:normal;font-weight:400!important;vertical-align:top;}\n");
      out.write("            .pvaicon-34-facebook:before{content:\"\\f123\";}\n");
      out.write("            /*! CSS Used from: https://www.plazavea.com.pe/files/footer--pwa.min.css */\n");
      out.write("            .Footer *{box-sizing:border-box;}\n");
      out.write("            .Footer__social a{margin:0 3px;}\n");
      out.write("            .Footer__social .pvaicon{font-size:34px;color:#ee3037;border-radius:100%;height:35px;width:35px;line-height:25px;display:block;text-align:center;padding:5px 0;}\n");
      out.write("            .Footer__social .pvaicon:before{vertical-align:middle;}\n");
      out.write("            .Footer__social span{font-size:0;}\n");
      out.write("            /*! CSS Used from: https://www.plazavea.com.pe/files/main-home--pwa.min.css */\n");
      out.write("            .GeneralWrapper *{box-sizing:border-box;outline:0;}\n");
      out.write("            /*! CSS Used fontfaces */\n");
      out.write("            /*@font-face{font-family:pvaicon;format(\"svg\");}*/\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a class=\"Follow\" href=\"http://www.facebook.com/PlazaVeaOficial\" target=\"_blank\" title=\"Facebook\">\n");
      out.write("            <i class=\"pvaicon pvaicon-34-facebook\"></i>\n");
      out.write("            <span>Facebook</span>\n");
      out.write("        </a>\n");
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
