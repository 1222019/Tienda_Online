<%-- 
    Document   : prueba
    Created on : 30-oct-2019, 22:46:24
    Author     : jesus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Sistema de Ventas y Almacen</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
   <body>
        <div class="container mt-4 col-4" style="padding: 80px 0px 0px 0px;">
            <div class="card col-sm-10" >
                <div class="card-body " >
                   <!-- <form class="form-sign" action="Validar" method="POST">-->
                    <form class="form-sign" action="" method="POST">
                        <div class="form-group text-center" >
                            
                           <img src="img/tienda-online-.png" class="img-responsive"/><br><br>
                            <br/>
                            <h3> <b>Crear nueva cuenta</b></h3><br>
                        </div>
                        <div class="form-group">
                          
                            <input type="text" name="txtnombre" class="form-control" placeholder="Ingresar Nombre"/>
                        </div>
                        <div class="form-group">
                            
                            <input type="password" name="txtclave" class="form-control" placeholder="Ingresar Contraseña"/>
                        </div>
                                               
                        <br>
                            
                    
                         <center><a href="#"><button type="button" class="btn btn-primary">Crear Usuario</button></a></center>
                         <hr style="border-color: #252850;">
                         <center> <p><a href="index.jsp">Regresar</a></p></center>
                        
                    </form>
                </div>
            </div>
        </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
