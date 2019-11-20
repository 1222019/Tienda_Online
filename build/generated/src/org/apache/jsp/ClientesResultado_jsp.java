package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ClientesResultado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light \" >\n");
      out.write("\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"img/tienda-online-.png\" alt=\"70\" width=\"150\"/></a>\n");
      out.write("\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Productos.jsp\"  /><i class=\"fa fa-fw fa-folder-open\" ></i> Productos</a>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fa fa-fw fa-sitemap\" ></i>Categorias\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"Abarrotes.jsp\">Abarrotes</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Frutas y Verduras</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Lácteos y Huevos</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Clientes.jsp\" ><i class=\"fa fa-fw fa-user\" ></i> Clientes</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" ><i class=\"fa fa-fw fa-cubes\" ></i> Almacen</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" > <i class=\"fa fa-fw fa-clipboard\" ></i> Inventario</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" ><i class=\"fa fa-fw fa-archive\" ></i> Reporte</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"dropdown\"  style=\"margin-right: 10px;\" >\n");
      out.write("\n");
      out.write("                    <button class=\"btn btn-outline-light dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"color: #252850; margin-right: 20px;\">\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-fw fa-shopping-cart\" ></i> Carrito</a>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-menu text-center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!---->\n");
      out.write("                <!-- <form class=\"form-inline my-2 my-lg-0\" style=\"margin-right: 10px;\">\n");
      out.write("                  \n");
      out.write("                 <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"\" aria-label=\"Search\">\n");
      out.write("                 <button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\"style=\"color: #252850; border-width: 1px;\n");
      out.write("             border-style: solid;\n");
      out.write("             border-color: #252850;\">Buscar</button>\n");
      out.write("               </form>\n");
      out.write("                 \n");
      out.write("                <!---->\n");
      out.write("                <div class=\"dropdown\" style=\"margin-right: 40px;\">\n");
      out.write("\n");
      out.write("                    <button class=\"btn btn-outline-light dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"color: #252850\">\n");
      out.write("                        Usuario Ingresado\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-menu text-center\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                            <img src=\"img/user.png\" alt=\"60\" width=\"60\"/>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">usuario</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\"><i class=\"fa fa-fw fa-envelope\" ></i> usuario@gmail.com</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\"><i class=\"fa fa-fw fa-wrench\" ></i> Configuración</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"login.jsp\"><i class=\"fa fa-fw fa-times\" ></i> salir</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <h3 style=\"margin-left: 50px;\"><i class=\"fa fa-fw fa-vcard\" ></i> Listado Clientes</h2>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("             <table class=\"table table-bordered\"   style=\"font-size: 17px; text-align: center;\">\n");
      out.write("                <tr bgcolor=\"skyblue\">\n");
      out.write("                    <th colspan=\"5\"> Mantenimiento de Clientes</th>\n");
      out.write("                    <th>\n");
      out.write("                        <a href=\"Clientes.jsp\">\n");
      out.write("                            <img src=\"Iconos/agregar.png\"width=\"30\" height=\"30\"></a></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr >\n");
      out.write("                    <th>Còdigo</th>\n");
      out.write("                    <th>Cliente</th>\n");
      out.write("                    <th>Descripciòn</th>\n");
      out.write("                    <th>Direcciòn</th>\n");
      out.write("                    <th>Correo</th>\n");
      out.write("                    <th>Acción</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    Connection cnx = null;
                    Statement sta = null;
                    ResultSet rs = null;

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        cnx = DriverManager.getConnection("jdbc:mysql://localhost/venta?user=root&password=");
                        sta = cnx.createStatement();
                        rs = sta.executeQuery("select * from cliente");
                        while (rs.next()) {

                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th style=\"font-weight: 100;\"> ");
      out.print(rs.getString(1));
      out.write(" </th>\n");
      out.write("                    <th style=\"font-weight: 100;\"> ");
      out.print(rs.getString(2));
      out.write(" </th>\n");
      out.write("                    <th style=\"font-weight: 100;\"> ");
      out.print(rs.getString(3));
      out.write(" </th>\n");
      out.write("                    <th style=\"font-weight: 100;\"> ");
      out.print(rs.getString(4));
      out.write(" </th>\n");
      out.write("                    <th style=\"font-weight: 100;\"> ");
      out.print(rs.getString(5));
      out.write(" </th>\n");
      out.write("                    <th style=\"font-weight: 100;\"> <img src=\"Iconos/editar.png\"width=\"30\" height=\"30\">||\n");
      out.write("                        <a href=\"eliminar.jsp?id=");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                            <img src=\"Iconos/eliminar.png\" width=\"30\" height=\"30\">\n");
      out.write("                        </a>\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                        }

                        sta.close();
                        rs.close();
                        cnx.close();

                    } catch (Exception e) {

                    }

                
      out.write("\n");
      out.write("             </table></div>\n");
      out.write("\n");
      out.write("            <!--<a href=\"datos.jsp\" >volver</a> -->\n");
      out.write("\n");
      out.write("            <!---->\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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
