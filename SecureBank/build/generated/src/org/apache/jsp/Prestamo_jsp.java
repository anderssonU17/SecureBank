package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Prestamo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Pagina Principal</title>\r\n");
      out.write("        <link href=\"./css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        \r\n");
      out.write("        <style>\r\n");
      out.write("            \r\n");
      out.write("            body{\r\n");
      out.write("                background: #adffff; font-family: 'Montserrat';\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .container{\r\n");
      out.write("                height: 70vh;\r\n");
      out.write("                margin: 8%;\r\n");
      out.write("                display: flex;\r\n");
      out.write("\r\n");
      out.write("                box-shadow: 0px 1px 54px 10px rgba(0, 0, 0, 0.30);\r\n");
      out.write("                padding: 35px;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .d0{\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"img/prestamop.png\" class=\"mx_auto d-block\" width=\"600\" alt=\"\"> \r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <div class=\"text-center\">\r\n");
      out.write("                    <h1 class=\"text center\"> ¿Desea realizar un préstamo?</h1><br>\r\n");
      out.write("                    <a class=\"btn btn-warning\" href=\"Controlador?accion=listar\">Listar Préstamo</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
