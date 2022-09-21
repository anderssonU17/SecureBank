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
                <li><a href="#Principal">Principal</a></li>
                <li><a href="#Seguridad">Seguridad</a></li>
                <li><a href="#Servicio">Servicio</a></li>
                <li><a href="#Contacto">Contacto</a></li>
            </ul>
        
            <div class="h-icons">
                <a href="Controlador?menu=Cliente" style="color: white; font-weight: bold">Perfil</a>
                <div class="bx bx-menu" id="menu-icon"></div>
            </div>
        </header>
        
        <section class="home" id="Principal">
            <div class="home-text">
                <h1 style="font-family: Raleway, sans-serif"><span>Bienvenido</span> a su seguridad financiera!</h1>
                <p style="font-family: Raleway, sans-serif">Tendras una gran comodidad al recibir nuestros servicios <br>y darte una salud financiera para ti!</p>
                <a href="#" class="btn" style="font-family: Raleway, sans-serif">Hola ${nombreUsuario.getNombreUsuario()}</a>
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
        
        
        <section class="about" id="Seguridad">
            <div class="about-img">
                <img src="img/secure.svg">
            </div>
            
            <div class="about-text">
                <h2>Innovaciones para <br> Tu Bienestar</h2>
                <p>Innovamos una banca electrónica con una amplia cantidad de funcionalidades para que fuera más cómodo.
                <br><br>
                Nuevas formas de protección ante cualquier ataque o cambio de identidad que puedas sufrir ante cualquier percance.
                </p>
                <a href="#" class="btn">Boton x</a>
            </div>
        </section>
        
        <%--SECCION DEL MENU--%>
        <section class="menu" id="Servicio">
            <div class="main-text">
                <h2>Nuestros Servicios</h2>
                <p>Escoge alguno de los servicios<br>que deseas utilizar</p>
            </div>
            
            <div class="menu-content">
              <div class="row">  
                  <img src="img/pagos.png">
                  <div class="menu-text">
                      <div class="menu-left">
                          <h4>Pagos a Realizar</h4>
                       </div>
                    </div>
                  <p>Realiza tus pagos a nuestros proveedores registrados.</p>
                </div>
                
                  <div class="row">
                    <a href="Controlador?menu=Prestamo">
                  <img src="img/prestamop.png">
                  <div class="menu-text">
                      <div class="menu-left">
                          <h4>Prestamos</h4>
                       </div>
                    </a>
                    </div>
                  <p>Pide un prestamo y escoge tu plazo para pagarlo.</p>

                </div>
                
                   <div class="row">  
                       <a href="Controlador?menu=ListarPrestamo&accion=Listar">
                  <img src="img/pagosH.png">
                  <div class="menu-text">
                      <div class="menu-left">
                          <h4>Pagos Realizados</h4>
                       </div>
                    </div>
                  </a>
                  <p>Revisa tus pagos realizados en nuestro banco.</p>
                </div>
                
                <a href="Controlador?menu=Opciones">
                  <div class="row">  
                  <img src="img/proveedor.png">
                  <div class="menu-text">
                   <div class="menu-left">
                       <h4>Proveedores</h4>
                       </div>
                      </a>
                    </div>
                  <p>Encuentra a tus proveedores para realizar tus pagos.</p>
                </div>
            </div>
        </section>
        
        <%--SECCION DE CONTACTO--%>
        
        <section class="contact" id="Contacto">
            <div class="main-contact">
                <div class="contact-content">
                    <h4>Funciones</h4>
                    <li><a href="#">Principal</a></li>
                    <li><a href="#">Seguridad</a></li>
                    <li><a href="#">Servicio</a></li>
                    <li><a href="#">Contacto</a></li>
                </div>
                
                <div class="contact-content">
                    <h4>Otros</h4>
                    <li><a href="#">Bienvenida</a></li>
                    <li><a href="#">Seguridad</a></li>
                    <li><a href="#">Pagos</a></li>
                    <li><a href="#">Horarios</a></li>
                </div>
                
                <div class="contact-content">
                    <h4>Contactanos</h4>
                    <li><a href="#">22057898</a></li>
                    <li><a href="#">SecureBank@gmail.com</a></li>
                    <li><a href="#">FAX</a></li>
                </div>
                
                <div class="contact-content">
                    <h4>Redes Sociales</h4>
                    <li><a href="#">Facebook</a></li>
                    <li><a href="#">Instagram</a></li>
                    <li><a href="#">Twitter</a></li>
                </div>
            </div>
        </section>
        
        <div class="last-text">
            <p>© 2022 Todos los Derechos Reservados a SecureBank Entity.</p>
        </div>
        
        <a href="#home" class="scroll-top">
            <i class='bx bx-up-arrow-alt'></i>
        </a>
        <script src="https://unpkg.com/scrollreveal"></script>
        <script type="text/javascript" src="js/script.js"></script>
        
    </body>
</html>
