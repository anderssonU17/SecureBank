<%-- 
    Document   : index
    Created on : 9/09/2022, 04:17:35 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Trirong">
        <link rel="stylesheet" href="/SecureBank/css/style.css" />
        <title>Login</title>
    </head>
    <body>
        <div class="row"> 
            <div class="mt-4 col-lg-8">
                <img src="/SecureBank/img/fondo2.png" class="banner">
            </div>
           
            <div class="mt-4 col-lg-4">
                <div class="d0 card col-sm-10">
                    <div class="d1 card-body">
                        <form class="form-sign" action="Validar" method="POST">
                            <div class="form-group text-center px-lag-5 pt-lag-4 pb-lag-3 p-4">
                                <h3 class="login-form">Login</h3>
                                <img src="img/logoremove.png" alt="650" width="200"/><br>
                                <label> 
                                    Registrate en el programa<br>
                                    ¿Qué esperas?
                                </label>
                                <img src="img/Bank.png" alt="100" width="50"/><br>
                            </div>
                            <div class="d5 form-group text-center">
                                <label>Usuario</label>
                                <input type="text" name="txtUser" class="form-control">
                            </div>
                            <div class="d6 form-group text-center">
                                <label>Contraseña</label>
                                <input type="password" name="txtPass" class="form-control">
                            </div>
                            <input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-block">
                        </form>
                    </div>
                </div>
            </div>
        </div>
        
        
        
        
        
        
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
