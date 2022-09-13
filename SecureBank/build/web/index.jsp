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
        <link href="bootstrap.min.css" rel="stylesheet">
        <title>Login</title>
    </head>
    <body>
        
        
        <div class="container w-75 bg-primary mt-5 rounded shadow">
            <div class="row align-items-stretch">
                <%-- Contenido del responsive --%>
                <div class="col bg d-none d-lg-block col-md-5 col-lg-5 col-xl-6 rounded">
                    
                </div>
                <%-- Contenido --%>
                <div class="col bg-white p-5 rounded-end">
                    <div class="text-center">
                        <img src="img/logoremove.png" width="48">
                    </div>
                    
                    <h2 class="fw-bold text-center py-5">LOGIN</h2>
                    
                    <%-- LOGIN --%>
                    <form action="Validar" method="POST">
                        <div class="mb-4 text-center">
                            <label for="email" class="form-label">Usuario</label>
                            <input type="text" class="form-control" name="txtUser">
                        </div>
                        <div class="mb-4 text-center">
                            <label for="password" class="form-label">Contraseña</label>
                            <input type="password" class="form-control" name="txtUser">
                        </div>
                        <div class="mb-4 form-check">
                            <input type="checkbox" name="connected" class="form-check-input">
                            <label for="connected" class="form-check-label">Mantenerme conectado</label>
                        </div>
                        
                        <div class="d-grid">
                            <input type="submit" name="accion" value="Ingresar" class="btn btn-outline-primary btn-block">
                        </div>
                        
                        <%-- Login con redes sociales --%>
                        
                    </form>
                </div>
            </div>
        </div>
               
        
        <%-- Otro formulario (REVISAR ANDERSON) --%>
       <%-- <div class="container w-75 bg-primay mt-5 rounded shadow">
            <div class="row align-items-stretch"> 
                <div class="col bg d-none d-lg-block col-md-5 col-lg-5 col-xl-6 rounded">
                    
                </div>
    
                <div class="col mt-4 col-lg-8 text-end">
                    <img src="/SecureBank/img/fondo2.png" class="banner">
                </div>

                <div class="mt-4 col-lg-4">

                    <div class="d0 card col-sm-10">
                        <div class="d1 card-body">
                            <form class="form-sign" action="Validar" method="POST">
                                <div class="form-group text-center px-lag-5 pt-lag-4 pb-lag-3 p-4">
                                    <h3 class="login-form">Login</h3>
                                    <img src="img/logoremove.png" alt="600" width="140"/><br>
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
                                <input type="submit" name="accion" value="Ingresar" class="btn btn-outline-primary btn-block">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div> --%>
        
        
        
        
        
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
        <script src="bootstrap.bundle.min.js"></script>
    </body>
</html>
