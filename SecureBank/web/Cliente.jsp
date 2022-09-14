<%-- 
    Document   : Cliente
    Created on : 7/09/2022, 10:16:10 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
    <style>
        .header {
        text-aling:center;
        height:300px;
        padding: 12 px;
        }
        .avatar{
            width: 200px;
            height: 200px;
            border-radius: 50%;
            background-image: url("");
        }
        .user-name{
            font-size: 18px;
            margin-top: 14px;
        }
    </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente</title>
    </head>
    <body>
      <div class="m-4"  id="Frame">
           <iframe src="" name="myFrame" style=" height: 100%; width: 100%;" id="myFrame"></iframe>
        <div class="nav-item dropdown" id="Drop" >
                <a class="nav-link dropdown-toggle text-dark " data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">
                    ${usuario.getNombresEmpleado()}</a>
            <ul class="dropdown-menu  text-center">
                <a class="dropdown-item" href="#">
                    <img src="img/men.jpg" alt="" width="60"/></a><br>
                <a class="dropdown-item" href="#">${usuario.getUsuario()}</a>
                <a class="dropdown-item" href="#">usuario@gmail.com</a>
        <div class="dropdown-divider"></div>
            <form action="Validar" method="POST">
                <button name="accion" value="Regresar" class="dropdown-item bg-danger" href="#">Regresar</button>
            </form>
            </ul>
        </div>
    </div>
    </body>
</html>