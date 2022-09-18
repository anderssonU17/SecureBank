<%-- 
    Document   : Principal
    Created on : 15/09/2022, 04:03:19 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<style>
    body{
        font-family: Raleway, sans-serif; 
    }
</style>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilop.css">
        <link rel="stylesheet" href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">
        
        <title>Principal</title>
    </head>
    <body>
        <header>
            <a href="#" class="logo">Secure<span>Bank</span></a>
        
            <ul class="navbar">
                <li><a href="#">Principal</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Menu</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        
            <div class="h-icons">
                <a href="#"><i class='bx bx-log-in'></i></a>
                <div class="bx bx-menu" id="menu-icon"></div>
            </div>
        </header>
        
        <section class="home" id="home">
            <div class="home-text">
                <h1 style="font-family: Raleway, sans-serif"><span>Bienvenido</span> a su seguridad financiera!</h1>
                <p style="font-family: Raleway, sans-serif">Tendras una gran comodidad al recibir nuestros servicios <br>y darte una salud financiera para ti!</p>
                <a href="#" class="btn" style="font-family: Raleway, sans-serif">Inicia Sesion</a>
            </div>
            
            <div class="home-img">
                <img src="img/finance.svg">
            </div>
        </section>
        
        <%--CONTENIDO DE LA PAGINA--%>
        <section class="container">
            <div class="main-text">
                <h2>Horarios</h2>
                <p>7:00 am - 17:00 pm</p>
            </div>
            
            <div class="container-box">
                <div class="c-mainbx">
                    <div class="container-img">
                        <img src="img/banco.png">
                    </div>
                    <div class="container-text">
                        <p>SecureBank Zona 1</p>
                    </div>
                </div>
            </div>
            
            <div class="c-mainbx">
                    <div class="container-img">
                        <img src="img/banco.png">
                    </div>
                    <div class="container-text">
                        <p>SecureBank Miraflores</p>
                    </div>
                </div>
            
            <div class="c-mainbx">
                    <div class="container-img">
                        <img src="img/banco.png">
                    </div>
                    <div class="container-text">
                        <p>SecureBank Zona 18</p>
                    </div>
                </div>
            
            <div class="c-mainbx">
                    <div class="container-img">
                        <img src="img/banco.png">
                    </div>
                    <div class="container-text">
                        <p>SecureBank Portales</p>
                    </div>
                </div>
            
        </section>
        
        
        <script type="text/javascript" src="js/script.js"></script>
        
    </body>
</html>
