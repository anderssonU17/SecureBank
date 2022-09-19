<%-- 
    Document   : index
    Created on : 13/09/2022, 12:58:29 AM
    Author     : enner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Principal</title>
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        
        <style>
            
            body{
                background: #adffff; font-family: 'Montserrat';
            }
            
            .container{
                height: 70vh;
                margin: 8%;
                display: flex;

                box-shadow: 0px 1px 54px 10px rgba(0, 0, 0, 0.30);
                padding: 35px;
            }
            
            .d0{
                justify-content: center;
                align-items: center;
            }

            
        </style>
    </head>
    <body>
        <div class="container">
            <div>
                <img src="img/prestamo.png" class="mx_auto d-block" width="600" alt=""> 
            </div>
            <div>
                <div class="text-center">
                    <h1 class="text center"> ¿Desea realizar un préstamos?</h1><br>
                    <a class="btn btn-warning" href="Controlador?accion=listar">Listar Préstamo</a>
                </div>
            </div>
        </div>
    </body>
</html>
