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
      out.write("<style type=\"text/css\">\n");
      out.write("@import \"css/estilop.css\";\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Raleway:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <title>Principal</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <a href=\"#\" class=\"logo\" style=\"font-family: Raleway, sans-serif\">Secure<span>Bank</span></a>\n");
      out.write("        \n");
      out.write("            <ul class=\"navbar\">\n");
      out.write("                <li style=\"font-family: Raleway, sans-serif\"><a href=\"#\">Principal</a></li>\n");
      out.write("                <li style=\"font-family: Raleway, sans-serif\"><a href=\"#\">About</a></li>\n");
      out.write("                <li style=\"font-family: Raleway, sans-serif\"><a href=\"#\">Menu</a></li>\n");
      out.write("                <li style=\"font-family: Raleway, sans-serif\"><a href=\"#\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("        \n");
      out.write("            <div class=\"h-icons\">\n");
      out.write("                <a href=\"#\"><i class='bx bx-log-in'></i></a>\n");
      out.write("                <div class=\"bx bx-menu\" id=\"menu-icon\"></div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <section class=\"home\" id=\"home\">\n");
      out.write("            <div class=\"home-text\">\n");
      out.write("                <h1 style=\"font-family: Raleway, sans-serif\"><span>Bienvenidos</span> a SecureBank seguridad financiera!</h1>\n");
      out.write("                <p style=\"font-family: Raleway, sans-serif\">Tendras una gran comodidad al recibir nuestros servicios <br>y darte una salud financiera para ti!</p>\n");
      out.write("                <a href=\"#\" class=\"btn\" style=\"font-family: Raleway, sans-serif\">Inicia Sesion</a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"home-img\">\n");
      out.write("                <img src=\"img/finance.svg\">\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        \n");
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
