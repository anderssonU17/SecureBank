<%-- 
    Document   : agregar
    Created on : 13/09/2022, 01:04:56 AM
    Author     : enner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hacer Prestamo</title>
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        
        
        <style>
            
            body{background:#91e9e7;margin:0}
            .form{
                width:340px;height:700px;background:#e6e6e6;border-radius:8px;box-shadow:0 0 40px -10px #000;margin:calc(50vh - 220px) auto;padding:20px 30px;max-width:calc(100vw - 40px);box-sizing:border-box;font-family:'Montserrat',sans-serif;position:relative
            }
            h2{
                margin:10px 0;padding-bottom:10px;width:180px;color:#78788c;border-bottom:3px solid #78788c
            }
            input{
                width:100%;padding:10px;box-sizing:border-box;background:none;outline:none;resize:none;border:0;font-family:'Montserrat',sans-serif;transition:all .3s;border-bottom:2px solid #bebed2
            }
            input:focus{border-bottom:2px solid #78788c}
            p:before{
                content:attr(type);display:block;margin:28px 0 0;font-size:14px;color:#5a5a5a
            }
            button{
                float:right;padding:8px 12px;margin:8px 0 0;font-family:'Montserrat',sans-serif;border:2px solid #78788c;background:0;color:#5a5a6e;cursor:pointer;transition:all .3s
            }
            button:hover{background:#78788c;color:#fff}
            div{
                content:'Hi';position:absolute;bottom:-15px;right:-20px;background:#50505a;color:#fff;width:320px;padding:16px 4px 16px 0;border-radius:6px;font-size:13px;box-shadow:10px 10px 40px -14px #000
            }
            span{margin:0 5px 0 15px}
            
        </style>
        
        
        
        
        
        
        <%-- <style>
            
            .container{
                height: 50vh;
                margin: 15%;
                display: flex;
                justify-content: center;
                align-items: center;
            }
            
        </style> --%>
        
        
    </head>
    <body>
        
        
        <form class="form" action="Controlador?menu=AgregarPrestamo" method="POST">
            <h2 class="text-center">Agregar Préstamo</h2>
            <p>Id Cliente:<input type="text" name="txtIdCliente" placeholder="Escribe tu id..."></input></p>
            <p>Plazo a meses:<input type="text" name="txtPlazoMeses" placeholder="Escribe el plazo..."></input></p>
            <p>Monto Prestamo:<input type="text" name="txtMontoPrestamo" placeholder="Escribe el número..."></input></p>
            <p>Fecha:<input type="text" name="txtFechaPrestamo"></input></p>
            <input type="submit" name="accion" value="Agregar" class="btn btn-warning">
        <div>
            <span class="fa fa-envelope-o"></span> SecureBank@company.com
        </div>
        </form>
        
        
        
        
        
        
      
        
        <%-- FORMULARIO ANTERIOR (Por si existiera un error)
                <div class="container">
            
            <h1>Agregar Prestamo</h1>
            <form action="Controlador">
                <strong>Id_Prestamo: </strong><br>
                <input type="int" name="idPrestamo"><br><br>
                <strong>Id_Cliente:</strong> <br>
                <input type="int" name="idCliente"><br><br>
                <strong>Plazo_Meses:</strong> <br>
                <input type="text" name="txtPlazoMeses"><br><br>
                <strong>Monto_Prestamo:</strong> <br>
                <input type="int" name="montoPrestamo"><br><br>
                <strong>Fecha_Prestamo:</strong> <br>
                <input type="date" name="fechaPrestamo"><br><br>
                <input type="submit" name="accion" value="Agregar"><br><br>
            </form>
        </div> --%>
        
        <<script src="bootstrap.bundle.min.js"></script>
        
    </body>
</html>
