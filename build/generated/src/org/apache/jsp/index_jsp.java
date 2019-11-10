package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("  \r\n");
      out.write("\r\n");

if(session.getAttribute("login")!=null) //check login session user not access or back to index.jsp page
{
	response.sendRedirect("welcome.jsp");
}

      out.write("\r\n");
      out.write("\r\n");

try
{
	Class.forName("com.mysql.jdbc.Driver"); //load driver
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/venta","root",""); //create connection
	
	if(request.getParameter("btn_login")!=null) //check login button click event not null
	{
		String dbusuario,dbpassword;
		
		String usuario,password;
		
		usuario=request.getParameter("txt_usuario"); //txt_email
		password=request.getParameter("txt_password"); //txt_password
		
		PreparedStatement pstmt=null; //create statement
		
		pstmt=con.prepareStatement("select * from persona where usuario=? AND password=?"); //sql select query 
		pstmt.setString(1,usuario);
		pstmt.setString(2,password);
		
		ResultSet rs=pstmt.executeQuery(); //execute query and store in resultset object rs.
		
		if(rs.next())
		{
			dbusuario=rs.getString("usuario");
			dbpassword=rs.getString("password");
			
			if(usuario.equals(dbusuario) && password.equals(dbpassword))
			{
				session.setAttribute("login",dbusuario); //session name is login and store fetchable database email address
				response.sendRedirect("welcome.jsp"); //after login success redirect to welcome.jsp page
			}
		}
		else
		{
			request.setAttribute("errorMsg","Usuario o Contraseña Inválido"); //invalid error message for email or password wrong
		}
		
		con.close(); //close connection	
	}
	
}
catch(Exception e)
{
	out.println(e);
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\t <title>Sistema de Ventas y Almacen</title>\r\n");
      out.write("         \r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction validate()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar usuario = document.myform.txt_usuario;\r\n");
      out.write("\t\t\tvar password = document.myform.txt_password;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\tif (usuario.value == null || usuario.value == \"\") //check email textbox not blank\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\twindow.alert(\"Por favor colocar Usuario ?\"); //alert message\r\n");
      out.write("\t\t\t\tusuario.style.background = '#D5DAE1';\r\n");
      out.write("\t\t\t\tusuario.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (password.value == null || password.value == \"\") //check password textbox not blank\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\twindow.alert(\"Por favor colocar Contraseña ?\"); //alert message\r\n");
      out.write("\t\t\t\tpassword.style.background = '#D5DAE1'; \r\n");
      out.write("\t\t\t\tpassword.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("                                        \r\n");
      out.write("   <!---->\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"container mt-4 col-4\" style=\"padding: 20px 0px 0px 0px;\">\r\n");
      out.write("            <div class=\"card col-sm-10\" >\r\n");
      out.write("                <div class=\"card-body \" >\r\n");
      out.write("                   <!-- <form class=\"form-sign\" action=\"Validar\" method=\"POST\">-->\r\n");
      out.write("                    <form class=\"form-sign\" method=\"post\" name=\"myform\" onsubmit=\"return validate();\">\r\n");
      out.write("                        <div class=\"form-group text-center\" >\r\n");
      out.write("                            \r\n");
      out.write("                            <img src=\"img/tienda-online-.png\" width=\"320px\"  height=\"180px\" class=\"img-fluid\"/><br><br>\r\n");
      out.write("                           <h4> <b>Bienvenido al Sistema de Ventas Online</b></h4>  <br>\r\n");
      out.write("                           <p style=\"color:red\">\t\t\t\t   \t\t\r\n");
      out.write("\t\t\t\t\t");

					if(request.getAttribute("errorMsg")!=null)
					{
						out.println(request.getAttribute("errorMsg")); //error message for email or password 
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"txt_usuario\" id=\"usuario\" placeholder=\"Ingresar Usuario\">\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group  \">\r\n");
      out.write("                          <input class=\"form-control\" type=\"password\" name=\"txt_password\" id=\"password\" placeholder=\"Ingresar Contraseña\">\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <center><input class=\"btn btn-primary\" type=\"submit\" name=\"btn_login\" value=\"Login\"></center>\r\n");
      out.write("                      \r\n");
      out.write("                        <hr style=\"border-color: #252850;\">\r\n");
      out.write("                        No tienes una cuenta? <b><a href=\"register.jsp\" class=\"form-log-in-with-existing\"> Registrate </b></a>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write(" <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
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
