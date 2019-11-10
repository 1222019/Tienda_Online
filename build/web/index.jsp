<%@ page import="java.sql.*" %>  

<%
if(session.getAttribute("login")!=null) //check login session user not access or back to index.jsp page
{
	response.sendRedirect("welcome.jsp");
}
%>

<%
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
%>

<!DOCTYPE html>
<html>

<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	 <title>Sistema de Ventas y Almacen</title>
         
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

	
	<script>
		
		function validate()
		{
			var usuario = document.myform.txt_usuario;
			var password = document.myform.txt_password;
				
			if (usuario.value == null || usuario.value == "") //check email textbox not blank
			{
				window.alert("Por favor colocar Usuario ?"); //alert message
				usuario.style.background = '#D5DAE1';
				usuario.focus();
				return false;
			}
			if (password.value == null || password.value == "") //check password textbox not blank
			{
				window.alert("Por favor colocar Contraseña ?"); //alert message
				password.style.background = '#D5DAE1'; 
				password.focus();
				return false;
			}
		}
			
	</script>
	
</head>

<body>

                                        
   <!---->
   
   <div class="container mt-4 col-4" style="padding: 20px 0px 0px 0px;">
            <div class="card col-sm-10" >
                <div class="card-body " >
                   <!-- <form class="form-sign" action="Validar" method="POST">-->
                    <form class="form-sign" method="post" name="myform" onsubmit="return validate();">
                        <div class="form-group text-center" >
                            
                            <img src="img/tienda-online-.png" width="320px"  height="180px" class="img-fluid"/><br><br>
                           <h4> <b>Bienvenido al Sistema de Ventas Online</b></h4>  <br>
                           <p style="color:red">				   		
					<%
					if(request.getAttribute("errorMsg")!=null)
					{
						out.println(request.getAttribute("errorMsg")); //error message for email or password 
					}
					%>
					</p>
				   
				 
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="text" name="txt_usuario" id="usuario" placeholder="Ingresar Usuario">
                            
                        </div>
                        <div class="form-group  ">
                          <input class="form-control" type="password" name="txt_password" id="password" placeholder="Ingresar Contraseña">
                            
                        </div>
                        <br>
                        <center><input class="btn btn-primary" type="submit" name="btn_login" value="Login"></center>
                      
                        <hr style="border-color: #252850;">
                        No tienes una cuenta? <b><a href="register.jsp" class="form-log-in-with-existing"> Registrate </b></a>
                        
                        
                    </form>
                </div>
            </div>
        </div>

 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>

</html>
