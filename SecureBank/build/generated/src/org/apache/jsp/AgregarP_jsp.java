package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AgregarP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Agregar Prestamo</title>\r\n");
      out.write("        <link href=\"./css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <style>\r\n");
      out.write("            \r\n");
      out.write("            body{background:#91e9e7;margin:0}\r\n");
      out.write("            .form{\r\n");
      out.write("                width:340px;height:700px;background:#e6e6e6;border-radius:8px;box-shadow:0 0 40px -10px #000;margin:calc(50vh - 220px) auto;padding:20px 30px;max-width:calc(100vw - 40px);box-sizing:border-box;font-family:'Montserrat',sans-serif;position:relative\r\n");
      out.write("            }\r\n");
      out.write("            h2{\r\n");
      out.write("                margin:10px 0;padding-bottom:10px;width:180px;color:#78788c;border-bottom:3px solid #78788c\r\n");
      out.write("            }\r\n");
      out.write("            input{\r\n");
      out.write("                width:100%;padding:10px;box-sizing:border-box;background:none;outline:none;resize:none;border:0;font-family:'Montserrat',sans-serif;transition:all .3s;border-bottom:2px solid #bebed2\r\n");
      out.write("            }\r\n");
      out.write("            input:focus{border-bottom:2px solid #78788c}\r\n");
      out.write("            p:before{\r\n");
      out.write("                content:attr(type);display:block;margin:28px 0 0;font-size:14px;color:#5a5a5a\r\n");
      out.write("            }\r\n");
      out.write("            button{\r\n");
      out.write("                float:right;padding:8px 12px;margin:8px 0 0;font-family:'Montserrat',sans-serif;border:2px solid #78788c;background:0;color:#5a5a6e;cursor:pointer;transition:all .3s\r\n");
      out.write("            }\r\n");
      out.write("            button:hover{background:#78788c;color:#fff}\r\n");
      out.write("            div{\r\n");
      out.write("                content:'Hi';position:absolute;bottom:-15px;right:-20px;background:#50505a;color:#fff;width:320px;padding:16px 4px 16px 0;border-radius:6px;font-size:13px;box-shadow:10px 10px 40px -14px #000\r\n");
      out.write("            }\r\n");
      out.write("            span{margin:0 5px 0 15px}\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <form class=\"form\" action=\"Controlador\">\r\n");
      out.write("            <h2 class=\"text-center\">Agregar Préstamo</h2>\r\n");
      out.write("            <p type=\"Id del cliente:\"><input type=\"int\" name=\"idCliente\" placeholder=\"Escribe tu id...\"></input></p>\r\n");
      out.write("            <p type=\"Plazo a Meses:\"><input type=\"text\" name=\"txtPlazoMeses\" placeholder=\"Escribe el plazo...\"></input></p>\r\n");
      out.write("            <p type=\"Monto del préstamo:\"><input type=\"int\" name=\"montoPrestamo\" placeholder=\"Escribe el número...\"></input></p>\r\n");
      out.write("            <p type=\"Fecha del préstamo:\"><input type=\"date\" name=\"fechaPrestamo\"></input></p>\r\n");
      out.write("            <input type=\"submit\" name=\"accion\" value=\"Agregar\" class=\"btn btn-warning\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <span class=\"fa fa-envelope-o\"></span> SecureBank@company.com\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <<script src=\"bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        \r\n");
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
