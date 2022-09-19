package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    body{\n");
      out.write("        font-family: Raleway, sans-serif; \n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilop.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Raleway:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <title>Principal</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <a href=\"#\" class=\"logo\">Secure<span>Bank</span></a>\n");
      out.write("        \n");
      out.write("            <ul class=\"navbar\">\n");
      out.write("                <li><a href=\"#Principal\">Principal</a></li>\n");
      out.write("                <li><a href=\"#Seguridad\">Seguridad</a></li>\n");
      out.write("                <li><a href=\"#Servicio\">Servicio</a></li>\n");
      out.write("                <li><a href=\"#Contacto\">Contacto</a></li>\n");
      out.write("            </ul>\n");
      out.write("        \n");
      out.write("            <div class=\"h-icons\">\n");
      out.write("                <a href=\"#\"><i class='bx bx-log-in'></i></a>\n");
      out.write("                <div class=\"bx bx-menu\" id=\"menu-icon\"></div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <section class=\"home\" id=\"Principal\">\n");
      out.write("            <div class=\"home-text\">\n");
      out.write("                <h1 style=\"font-family: Raleway, sans-serif\"><span>Bienvenido</span> a su seguridad financiera!</h1>\n");
      out.write("                <p style=\"font-family: Raleway, sans-serif\">Tendras una gran comodidad al recibir nuestros servicios <br>y darte una salud financiera para ti!</p>\n");
      out.write("                <a href=\"#\" class=\"btn\" style=\"font-family: Raleway, sans-serif\">Inicia Sesion</a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"home-img\">\n");
      out.write("                <img src=\"img/finance.svg\">\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <section class=\"container\">\n");
      out.write("            <div class=\"main-text\">\n");
      out.write("                <h2>Horarios</h2>\n");
      out.write("                <p>7:00 am - 17:00 pm</p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"container-box\">\n");
      out.write("                <div class=\"c-mainbx\">\n");
      out.write("                    <div class=\"container-img\">\n");
      out.write("                        <img src=\"img/banco.png\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container-text\">\n");
      out.write("                        <p>SecureBank Zona 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"c-mainbx\">\n");
      out.write("                    <div class=\"container-img\">\n");
      out.write("                        <img src=\"img/banco.png\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container-text\">\n");
      out.write("                        <p>SecureBank Miraflores</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            <div class=\"c-mainbx\">\n");
      out.write("                    <div class=\"container-img\">\n");
      out.write("                        <img src=\"img/banco.png\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container-text\">\n");
      out.write("                        <p>SecureBank Zona 18</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            <div class=\"c-mainbx\">\n");
      out.write("                    <div class=\"container-img\">\n");
      out.write("                        <img src=\"img/banco.png\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container-text\">\n");
      out.write("                        <p>SecureBank Portales</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>      \n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <section class=\"about\" id=\"Seguridad\">\n");
      out.write("            <div class=\"about-img\">\n");
      out.write("                <img src=\"img/secure.svg\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"about-text\">\n");
      out.write("                <h2>Innovaciones para <br> Tu Bienestar</h2>\n");
      out.write("                <p>Innovamos una banca electrónica con una amplia cantidad de funcionalidades para que fuera más cómodo.\n");
      out.write("                <br><br>\n");
      out.write("                Nuevas formas de protección ante cualquier ataque o cambio de identidad que puedas sufrir ante cualquier percance.\n");
      out.write("                </p>\n");
      out.write("                <a href=\"#\" class=\"btn\">Boton x</a>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <section class=\"menu\" id=\"Servicio\">\n");
      out.write("            <div class=\"main-text\">\n");
      out.write("                <h2>Nuestros Servicios</h2>\n");
      out.write("                <p>Escoge alguno de los servicios<br>que deseas utilizar</p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"menu-content\">\n");
      out.write("              <div class=\"row\">  \n");
      out.write("                  <img src=\"img/pagos.png\">\n");
      out.write("                  <div class=\"menu-text\">\n");
      out.write("                      <div class=\"menu-left\">\n");
      out.write("                          <h4>Pagos a Realizar</h4>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                  <p>Realiza tus pagos a nuestros proveedores registrados.</p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                  <div class=\"row\">  \n");
      out.write("                  <img src=\"img/Prestamo.png\">\n");
      out.write("                  <div class=\"menu-text\">\n");
      out.write("                      <div class=\"menu-left\">\n");
      out.write("                          <h4>Prestamos</h4>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                  <p>Pide un prestamo y escoge tu plazo para pagarlo.</p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                              <div class=\"row\">  \n");
      out.write("                  <img src=\"img/pagosH.png\">\n");
      out.write("                  <div class=\"menu-text\">\n");
      out.write("                      <div class=\"menu-left\">\n");
      out.write("                          <h4>Pagos Realizados</h4>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                  <p>Revisa tus pagos realizados en nuestro banco.</p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                              <div class=\"row\">  \n");
      out.write("                  <img src=\"img/proveedor.png\">\n");
      out.write("                  <div class=\"menu-text\">\n");
      out.write("                      <div class=\"menu-left\">\n");
      out.write("                          <h4>Proveedores</h4>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                  <p>Encuentra a tus proveedores para realizar tus pagos.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        <section class=\"contact\" id=\"Contacto\">\n");
      out.write("            <div class=\"main-contact\">\n");
      out.write("                <div class=\"contact-content\">\n");
      out.write("                    <h4>Funciones</h4>\n");
      out.write("                    <li><a href=\"#\">Principal</a></li>\n");
      out.write("                    <li><a href=\"#\">Seguridad</a></li>\n");
      out.write("                    <li><a href=\"#\">Servicio</a></li>\n");
      out.write("                    <li><a href=\"#\">Contacto</a></li>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"contact-content\">\n");
      out.write("                    <h4>Otros</h4>\n");
      out.write("                    <li><a href=\"#\">Bienvenida</a></li>\n");
      out.write("                    <li><a href=\"#\">Seguridad</a></li>\n");
      out.write("                    <li><a href=\"#\">Pagos</a></li>\n");
      out.write("                    <li><a href=\"#\">Horarios</a></li>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"contact-content\">\n");
      out.write("                    <h4>Contactanos</h4>\n");
      out.write("                    <li><a href=\"#\">22057898</a></li>\n");
      out.write("                    <li><a href=\"#\">SecureBank@gmail.com</a></li>\n");
      out.write("                    <li><a href=\"#\">FAX</a></li>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"contact-content\">\n");
      out.write("                    <h4>Redes Sociales</h4>\n");
      out.write("                    <li><a href=\"#\">Facebook</a></li>\n");
      out.write("                    <li><a href=\"#\">Instagram</a></li>\n");
      out.write("                    <li><a href=\"#\">Twitter</a></li>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <div class=\"last-text\">\n");
      out.write("            <p>© 2022 Todos los Derechos Reservados a SecureBank Entity.</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <a href=\"#home\" class=\"scroll-top\">\n");
      out.write("            <i class='bx bx-up-arrow-alt'></i>\n");
      out.write("        </a>\n");
      out.write("        <script src=\"https://unpkg.com/scrollreveal\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
