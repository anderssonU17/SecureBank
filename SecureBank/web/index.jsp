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
        <style>
        @import url('https://fonts.googleapis.com/css2?family=Nunito:wght@700&display=swap');
        </style>
        <title>Login</title>
    </head>
    <body>
        <form action="Validar" method="POST">
        <div class="main-login">
            <div class="left-login">
                <h1 style="font-family: 'Nunito', sans-serif;">Unete a nosotros!</h1>
                <img src="img/animado.svg" class="left-login-image" alt="Animado">
                <img src>
            </div>
            <div class="right-login">
                <div class="card-login">
                    <h1 style="font-family: 'Nunito', sans-serif;">LOGIN</h1>
                    <div class="textfield">
                        <label for="Usuario" style="font-family: 'Nunito', sans-serif;">Usuario</label>
                        <input type="text" name="txtUser" placeholder="Usuario">
                    </div>
                     <div class="textfield">
                        <label for="Contraseña" style="font-family: 'Nunito', sans-serif;">Contraseña</label>
                        <input type="password" name="txtPass" placeholder="Contraseña">
                    </div> 
                    <input type="submit" name="accion" value="Ingresar" class="btn-login" >
                    </form>
                </div>
                </form>
            </div>
        </div>
    </body>
</html>
