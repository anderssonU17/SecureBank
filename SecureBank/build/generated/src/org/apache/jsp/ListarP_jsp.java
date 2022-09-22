package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;

public final class ListarP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Listar Prestamo</title>\r\n");
      out.write("        <link href=\"./css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        \r\n");
      out.write("        <style>\r\n");
      out.write("            \r\n");
      out.write("            body{background:#adffff;margin:0; font-family: 'Montserrat';}\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            #main-container{\r\n");
      out.write("\tmargin: 150px auto;\r\n");
      out.write("\twidth: 600px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        table{\r\n");
      out.write("                background-color: white;\r\n");
      out.write("                text-align: left;\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th, td{\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        thead{\r\n");
      out.write("                background-color: #246355;\r\n");
      out.write("                border-bottom: solid 5px #0F362D;\r\n");
      out.write("                color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr:nth-child(even){\r\n");
      out.write("                background-color: #ddd;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr:hover td{\r\n");
      out.write("                background-color: #369681;\r\n");
      out.write("                color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1 class=\"text-center\"><b>|---- Lista de Prestamos Realizados ----|</b></h1>\r\n");
      out.write("            <a class=\"btn btn-warning\" href=\"Controlador?accion=agregar\">Realizar un Prestamo</a>\r\n");
      out.write("            <table class=\"table table-bordered bg-success\" border=\"2\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th class=\"text-center\">CODIGO PRESTAMO</th>\r\n");
      out.write("                        <th class=\"text-center\">CODIGO CLIENTE</th>\r\n");
      out.write("                        <th class=\"text-center\">PLAZO</th>\r\n");
      out.write("                        <th class=\"text-center\">MONTO</th>\r\n");
      out.write("                        <th class=\"text-center\">FECHA</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>      \r\n");
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
