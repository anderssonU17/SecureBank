<%-- 
    Document   : index
    Created on : 12/09/2022, 11:28:20 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Login</title>
    </head>
    <body>
        <div class="main-login">
            <div class="left-login">
                <h1>Login</h1><br>Unete a nosotros!</h1>
                <h1>Otro titulo</h1>
            </div>
            <div class="right-login">
                <div class="card-login">
                    <h1>LOGIN</h1>
                    <div class="textfield">
                        <label for="Usuario">Usuario</label>
                        <input type="text" name="txtUser" placeholder="Usuario">
                    </div>
                     <div class="textfield">
                        <label for="Contraseña">Contraseña</label>
                        <input type="password" name="txtPass" placeholder="Contraseña">
                    </div> 
                    <input type="submit" name="accion" value="Ingresar" class="btn-login">
                </div>
            </div>
        </div>
    </body>
</html>
