<%@ page import="java.sql.*" %>  

<%
if(session.getAttribute("login")!=null) //check login session user not access or back to register.jsp page
{
	response.sendRedirect("welcome.jsp");
}
%>


<%
try
{
	Class.forName("com.mysql.jdbc.Driver"); //load driver
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/venta","root",""); //create connection
	
	if(request.getParameter("btn_register")!=null) //check register button click event not null
	{
		String usuario,password;
               
		
		
		usuario=request.getParameter("txt_usuario"); //txt_email
		password=request.getParameter("txt_password"); //txt_password
		
		PreparedStatement pstmt=null; //create statement
		
		pstmt=con.prepareStatement("insert into persona(usuario,password) values(?,?)"); //sql insert query
		
		pstmt.setString(1,usuario);
		pstmt.setString(2,password);
		
		pstmt.executeUpdate(); //execute query
		
		request.setAttribute("successMsg","Registro Completado...!"); //register success messeage

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

	
	<!-- javascript for registeration form validation-->
	<script>	
	
		function validate()
		{
                   
			var usuario_valid= /^[a-z A-Z]+$/; //pattern allowed alphabet a-z or A-Z 
                        var password_valid=/^[A-Z a-z 0-9 !@#$%&*()<>]{6,12}$/; //pattern password allowed A to Z, a to z, 0-9, !@#$%&*()<> charecter 
			
                    
			var usuario = document.getElementById("usuario"); //textbox id fname
                       var password = document.getElementById("password"); //textbox id password
			
                        
            
			if(!usuario_valid.test(usuario.value) || usuario.value=='') 
            {
				alert("Por favor colocar un Usuario...!");
                usuario.focus();
                usuario.style.background = '#D5DAE1';
                return false;                    
            }
			
			if(!password_valid.test(password.value) || password.value=='') 
            {
				alert("Por favor colocar Contraseña...! La contraseña debe ser de 6 a 12 digitos.");
                password.focus();
                password.style.background = '#D5DAE1';
                return false;                    
            }
		}
		
	</script>	

</head>

<body>

      

<!----->

<div class="container mt-4 col-4" style="padding: 80px 0px 0px 0px;">
            <div class="card col-sm-10" >
                <div class="card-body " >
                   
                   <form class="form-register" method="post" onsubmit="return validate();">
                    
                        <div class="form-group text-center" >
                            
                          <img src="img/tienda-online-.png" width="320px"  height="180px" class="img-fluid"/><br><br>
                            <br/>
                            <h3> <b>Crear nueva cuenta</b></h3><br>
                            <p style="color:green">				   		
					<%
					if(request.getAttribute("successMsg")!=null)
					{
						out.println(request.getAttribute("successMsg")); //register success message
					}
					%>
					</p>
                        </div>
                        <div class="form-group">
                          <input type="text" name="txt_usuario" id="usuario" class="form-control" placeholder="Ingresar Nombre">
                          
                        </div>
                        <div class="form-group">
                            <input type="password" name="txt_password" id="password" class="form-control" placeholder="Ingresar Contraseña">
                     
                        </div>
                                               
                        <br>
                            
                        <center><input class="btn btn-primary" type="submit" name="btn_register" value="Register"></center>
                         <hr style="border-color: #252850;">
                         <center> <p>¿ Ya tienes cuenta ? <a href="index.jsp" class="form-log-in-with-existing">Entre aquí</a></p></center>
                        
                    </form>
                </div>
            </div>
        </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>

</html>
