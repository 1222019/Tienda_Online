package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.*;
import java.util.*;

public final class Catalogo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <title>Bienvenido : ");
      out.print(session.getAttribute("login"));
      out.write("</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estios.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light \" >\r\n");
      out.write("\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"img/tienda-online-.png\" alt=\"70\" width=\"150\"/></a>\r\n");
      out.write("\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                    <li class=\"nav-item active\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"Productos.jsp\"><i class=\"fa fa-fw fa-folder-open\"></i> Productos</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"fa fa-fw fa-sitemap\" ></i>Categorias\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"welcome.jsp?idcate=1\">Abarrotes</a>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"welcome.jsp?idcate=2\">Frutas y Verduras</a>\r\n");
      out.write("                            <!--<a class=\"dropdown-item\" href=\"#\">Lácteos y Huevos</a>-->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"Clientes.jsp\" ><i class=\"fa fa-fw fa-user\" ></i> Clientes</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" ><i class=\"fa fa-fw fa-cubes\" ></i> Almacen</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" > <i class=\"fa fa-fw fa-clipboard\" ></i> Inventario</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" ><i class=\"fa fa-fw fa-archive\" ></i> Reporte</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"dropdown\"  style=\"margin-right: 10px;\" >\r\n");
      out.write("\r\n");
      out.write("                    <button class=\"btn btn-outline-light dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"color: #252850; margin-right: 20px;\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-fw fa-shopping-cart\" ></i> Carrito</a>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"dropdown-menu text-center\">\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!---->\r\n");
      out.write("                <!-- <form class=\"form-inline my-2 my-lg-0\" style=\"margin-right: 10px;\">\r\n");
      out.write("                  \r\n");
      out.write("                 <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"\" aria-label=\"Search\">\r\n");
      out.write("                 <button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\"style=\"color: #252850; border-width: 1px;\r\n");
      out.write("             border-style: solid;\r\n");
      out.write("             border-color: #252850;\">Buscar</button>\r\n");
      out.write("               </form>\r\n");
      out.write("                 \r\n");
      out.write("                <!---->\r\n");
      out.write("                <div class=\"dropdown\" style=\"margin-right: 40px;\">\r\n");
      out.write("\r\n");
      out.write("                    <button class=\"btn btn-outline-light dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"color: #252850\">\r\n");
      out.write("                        Usuario Ingresado\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"dropdown-menu text-center\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                            <img src=\"img/boy.png\" alt=\"60\" width=\"60\" class=\"img-fluid\"/>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">");
      out.print(session.getAttribute("login"));
      out.write("</a>\r\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"logout.jsp\"><i class=\"fa fa-fw fa-times\" ></i> salir</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                        \r\n");
      out.write("        <img src=\"img/images.jpg\" class=\"img-fluid\" alt=\"img-fluid\" width=\"100%\">        \r\n");
      out.write("        <!--<h2 style=\"color: #252850; margin-left: 50px;\" class=\"mt-4\"></h2>-->\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                \r\n");
      out.write("                    \r\n");
      out.write("                    ");

                        ArrayList<Producto> lstprod; 
                        int idclase;
                        Clase clasObj=new Clase();
                        Producto prodObj=new Producto();
                        idclase=Integer.parseInt(request.getParameter("idclase"));
                        /*idclase=1;*/
                        clasObj.setId(idclase);
                        ConsultaProducto modProd = new ConsultaProducto();
                        lstprod = modProd.listarCatalogo(clasObj);
                        
                        for (int i = 0; i < lstprod.size(); i++) {
                            prodObj=null;
                            prodObj= (Producto)lstprod.get(i);
                    
      out.write("\r\n");
      out.write("                    <div class=\"col-xs-10 col-sm-6 col-md-3 product\">\r\n");
      out.write("                        <div class=\"card\">                        \r\n");
      out.write("                            \r\n");
      out.write("                            <img src=\"img/");
      out.print( prodObj.getImagen() );
      out.write("\">\r\n");
      out.write("                            <h3>");
      out.print(prodObj.getDescripcion());
      out.write("</h3>\r\n");
      out.write("                            <span>Precio:</span><h4><span>S/ </span>");
      out.print(prodObj.getPrecio());
      out.write("</h4>\r\n");
      out.write("                            <form action=\"agregarItem\" method=\"POST\">\r\n");
      out.write("                                <input type=\"hidden\" id=\"txt-idprod\" name=\"idprod\" value=\"");
      out.print( prodObj.getId());
      out.write("\">\r\n");
      out.write("                                <span>Cant</span><input type=\"text\" id=\"txt-cantidad\" name=\"cantidad\">                                \r\n");
      out.write("                                <input type=\"submit\" class=\"\" value=\"Agregar\">\r\n");
      out.write("                            </form>                        \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                   \r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <!--<center><a href=\"\"><img src=\"img/azucar.png\" class=\"img-fluid\" alt=\"img-fluide\"></a></center>-->\r\n");
      out.write("                                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <!--<div class=\"col-sm\">\r\n");
      out.write("                    <center><a href=\"\"><img src=\"img/azucar_blanca.jpg\" class=\"img-fluid\" alt=\"img-fluid\"></a></center>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm\">\r\n");
      out.write("                    <center><a href=\"\"><img src=\"img/atun.png\" class=\"img-fluid\" alt=\"img-fluid\"></a></center>\r\n");
      out.write("                </div>-->\r\n");
      out.write("                \r\n");
      out.write("            </div>           \r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        <!--<h2 style=\"color: #252850; margin-left: 50px;\" class=\"mt-4\">FRUTAS Y VERDURAS</h2><br>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm\">\r\n");
      out.write("                    <center> <img src=\"img/naranja.JPG\" class=\"img-fluid\" alt=\"img-fluid\" > </center>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm\">\r\n");
      out.write("                    <center><img src=\"img/tomate.JPG\" class=\"img-fluid\" alt=\"img-fluid\" > </center>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm\">\r\n");
      out.write("                    <center><img src=\"img/zapallo.JPG\" class=\"img-fluid\" alt=\"img-fluid\" > </center>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>-->\r\n");
      out.write("\r\n");
      out.write("        <!--<footer class=\"footer mt-auto py-3\">\r\n");
      out.write("            <div class=\"container\">              \r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>-->\r\n");
      out.write("        \r\n");
      out.write("        <!-- Footer -->\r\n");
      out.write("        <footer class=\"page-footer font-small blue pt-4 \">\r\n");
      out.write("            <!-- Footer Links -->\r\n");
      out.write("            <div class=\"container-fluid text-center text-md-left pb-3 pt-2\" style=\"background-color: gainsboro\">\r\n");
      out.write("                <!-- Grid row -->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <!-- Grid column -->\r\n");
      out.write("                    <div class=\"col-md-6 mt-md-0 mt-3\">\r\n");
      out.write("                        <!-- Content -->\r\n");
      out.write("                        <!--<h5 class=\"text-uppercase\">Comunicate con nosotros</h5>\r\n");
      out.write("                        <p>Here you can use rows and columns to organize your footer content.</p>-->\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"Footer-left\">\r\n");
      out.write("                            <h3 class=\"title-xl\">Comunícate con nosotros</h3>\r\n");
      out.write("                            <div class=\"Footer__phones\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    Lima: <a title=\"Teléfono Lima\" class=\"Footer__phonelink\" href=\"tel:+5116746800\">(511)674-6800</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    Provincia: <a title=\"Teléfono Provincia\" class=\"Footer__phonelink\" href=\"tel:+080100985\">0-801-00985</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"Footer__social\">\r\n");
      out.write("                                <h3 class=\"Footer__accordion__title\">Síguenos en:</h3>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <!--<a title=\"Facebook\" class=\"Follow\" href=\"\" target=\"_blank\">\r\n");
      out.write("                                        <i class=\"fa fa-facebook\"></i><span>Facebook</span>\r\n");
      out.write("                                    </a>-->\r\n");
      out.write("                                    <a class=\"icons-sm fb-ic\" type=\"button\" role=\"button\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                                    <a title=\"Twitter\" class=\"icons-sm tw-ic\" href=\"\" target=\"_blank\">\r\n");
      out.write("                                        <i class=\"fa fa-twitter\"></i><span></span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a title=\"Youtube\" class=\"icons-sm yt-ic\" href=\"\" target=\"_blank\">\r\n");
      out.write("                                        <i class=\"fa fa-youtube\"></i><span></span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a title=\"Instagram\" class=\"icons-sm ins-ic\" href=\"\" target=\"_blank\">\r\n");
      out.write("                                        <i class=\"fa fa-instagram\"></i>\r\n");
      out.write("                                        <span></span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>                     \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Grid column -->\r\n");
      out.write("                    <hr class=\"clearfix w-100 d-md-none pb-3\">\r\n");
      out.write("                    <!-- Grid column -->\r\n");
      out.write("                    <div class=\"col-md-3 mb-md-0 mb-3\">\r\n");
      out.write("                        <!-- Links -->\r\n");
      out.write("                        <h5 class=\"text-uppercase\">Nosotros</h5>\r\n");
      out.write("                        <ul class=\"list-unstyled\">                            \r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#!\">Conocenos</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#!\">Historia</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#!\">Trabaja con nosotros</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#!\">Ventas corporativas</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Grid column -->\r\n");
      out.write("                    <!-- Grid column -->\r\n");
      out.write("                    <div class=\"col-md-3 mb-md-0 mb-3\">                        <!-- Links -->\r\n");
      out.write("                        <h5 class=\"text-uppercase\">Atencion al cliente</h5>\r\n");
      out.write("                        <ul class=\"list-unstyled\">                            \r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#!\">Horario de atencion telefonica</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#!\">Preguntas frecuentas</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#!\">Cambios y devoluciones</a>\r\n");
      out.write("                            </li>                            \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Grid column -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Grid row -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Footer Links -->\r\n");
      out.write("            <!-- Copyright -->            \r\n");
      out.write("            <!-- Copyright -->\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- Footer -->\r\n");
      out.write("        <!--js-->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("    <!--\r\n");
      out.write("        <div class=\"main-content\">\r\n");
      out.write("            \r\n");
      out.write("            <center>\r\n");
      out.write("            \r\n");
      out.write("    ");

        if (session.getAttribute("login") == null || session.getAttribute("login") == " ") //check condition unauthorize user not direct access welcome.jsp page
        {
            response.sendRedirect("index.jsp");
        }
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <h1> Welcome, ");
      out.print(session.getAttribute("login"));
      out.write(" </h1>\r\n");
      out.write("\r\n");
      out.write("    <h2><a href=\"logout.jsp\">Logout</a></h2>\r\n");
      out.write("\r\n");
      out.write("    </center>\r\n");
      out.write("            \r\n");
      out.write("</div>\r\n");
      out.write("<-->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
