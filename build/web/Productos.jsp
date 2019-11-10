<%-- 
    Document   : Abarrotes
    Created on : 30-oct-2019, 23:00:46
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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
       <nav class="navbar navbar-expand-lg navbar-light " >
            
            <a class="navbar-brand" href="index.jsp"><img src="img/tienda-online-.png" alt="70" width="150"/></a>
  
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
          <a class="nav-link" href="Productos.jsp"  /><i class="fa fa-fw fa-folder-open" ></i> Productos</a>
         
      </li>
     
      
      
       <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <i class="fa fa-fw fa-sitemap" ></i>Categorias
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="Abarrotes.jsp">Abarrotes</a>
          <a class="dropdown-item" href="#">Frutas y Verduras</a>
           <a class="dropdown-item" href="#">Lácteos y Huevos</a>
          </div>
      </li>
      
     <li class="nav-item">
         <a class="nav-link" href="Clientes.jsp" ><i class="fa fa-fw fa-user" ></i> Clientes</a>
      </li>
         <li class="nav-item">
             <a class="nav-link" href="#" ><i class="fa fa-fw fa-cubes" ></i> Almacen</a>
      </li>
     
         <li class="nav-item">
             <a class="nav-link" href="#" > <i class="fa fa-fw fa-clipboard" ></i> Inventario</a>
      </li>
      
         <li class="nav-item">
             <a class="nav-link" href="#" ><i class="fa fa-fw fa-archive" ></i> Reporte</a>
      </li>
      
            
    </ul>
         <div class="dropdown"  style="margin-right: 10px;" >
       
       <button class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: #252850; margin-right: 20px;">
       <a href="#"><i class="fa fa-fw fa-shopping-cart" ></i> Carrito</a>
  </button>
  <div class="dropdown-menu text-center">
  
    
  </div>
</div>
      <!---->
     <!-- <form class="form-inline my-2 my-lg-0" style="margin-right: 10px;">
       
      <input class="form-control mr-sm-2" type="search" placeholder="" aria-label="Search">
      <button class="btn btn-outline-light my-2 my-sm-0" type="submit"style="color: #252850; border-width: 1px;
  border-style: solid;
  border-color: #252850;">Buscar</button>
    </form>
      
     <!---->
   <div class="dropdown" style="margin-right: 40px;">
       
       <button class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: #252850">
    Usuario Ingresado
  </button>
  <div class="dropdown-menu text-center">
      <a class="dropdown-item" href="#">
          <img src="img/user.png" alt="60" width="60"/>
      </a>
    <a class="dropdown-item" href="#">prueba</a>
    <a class="dropdown-item" href="#"><i class="fa fa-fw fa-envelope" ></i> prueba@gmail.com</a>
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="#"><i class="fa fa-fw fa-wrench" ></i> Configuración</a>
    <a class="dropdown-item" href="login.jsp"><i class="fa fa-fw fa-times" ></i> salir</a>
  </div>
</div>
  </div>
</nav>
        <br><br>
        <h2 style="margin-left: 50px;"><i class="fa fa-fw fa-vcard" ></i> Datos</2>
            <br><br>
            
            
    <div style="width: 100%; height: auto; ">
            
                <div class="row">
                <div class="col-md-3 col-xs-12 col-sm-4">
                   
                    <label style="font-size: 22px;">Nombre: </label>
                            <input type="text" name="txtuser" class="form-control"/></div>
                            
                  <div class="col-md-2 col-xs-12 col-sm-4">
                   
                            <label style="font-size: 22px;">Precio: </label>
                            <input type="text" name="txtuser" class="form-control"/></div>
                  <div class="col-md-2 col-xs-12 col-sm-4">
                   
                           <label style="font-size: 22px;">Cantidad: </label>
                            <input type="text" name="txtuser" class="form-control"/></div>
                            
                  <div class="col-md-3 col-xs-12 col-sm-4">
                   
                          <label style="font-size: 22px;">Estado: </label>
                            <input type="text" name="txtuser" class="form-control"/></div>
                  <div class="col-md-2 col-xs-12 col-sm-4">
                     
                      <p style="margin-top: 40px; mar"><input type="submit" name="accion3" value="Agregar" class=" btn btn-primary "></p></div>
                
               </div>
          
                
                </div>      <!---->
     <!--js-->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>