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
<<<<<<< HEAD
                    
                    <h2 class="fw-bold text-center py-5">LOGIN</h2>
                    
                    <%-- LOGIN --%>
                    <form action="Validar" method="POST">
                        <div class="mb-4 text-center">
                            <label for="email" class="form-label">Usuario</label>
                            <input type="text" class="form-control" name="txtUser">
                        </div>
                        <div class="mb-4 text-center">
                            <label for="password" class="form-label">Contraseña</label>
                            <input type="password" class="form-control" name="txtPass">
                        </div>
                        <div class="mb-4 form-check">
                            <input type="checkbox" name="connected" class="form-check-input">
                            <label for="connected" class="form-check-label">Mantenerme conectado</label>
                        </div>
                        
                        <div class="d-grid">
                            <input type="submit" name="accion" value="Ingresar" class="btn btn-outline-primary btn-block">
                        </div>
                        
                        <%-- Login con redes sociales --%>
                        
=======
                     <div class="textfield">
                        <label for="Contraseña" style="font-family: 'Nunito', sans-serif;">Contraseña</label>
                        <input type="password" name="txtPass" placeholder="Contraseña">
                    </div> 
                    <input type="submit" name="accion" value="Ingresar" class="btn-login" >
>>>>>>> origin/aurrea-2019284
                    </form>
                </div>
                </form>
            </div>
        </div>
    </body>
</html>
