package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Opciones_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"https://cdn.lineicons.com/3.0/lineicons.css\" rel=\"stylesheet\">\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/EstiloOp.css\">\r\n");
      out.write("        <title>SecureBank</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <main>\r\n");
      out.write("            <h1>Eliga un Proveedor...</h1>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"container_box\">\r\n");
      out.write("                <div class=\"box\">\r\n");
      out.write("                    <img src=\"img/Tigo.png\" width=\"100\" height=\"85\"></i>\r\n");
      out.write("                    <h5>Tigo</h5>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                 <div class=\"box\">\r\n");
      out.write("                     <img src=\"img/Claro.jpg\" width=\"100\" height=\"85\"></i>\r\n");
      out.write("                    <h5>Claro</h5>\r\n");
      out.write("                     \r\n");
      out.write("                </div>\r\n");
      out.write("                 <div class=\"box\">\r\n");
      out.write("                     <img src=\"img/Elektra.png\" width=\"100\" height=\"85\"></i>\r\n");
      out.write("                    <h5>Elektra</h5>\r\n");
      out.write("                     \r\n");
      out.write("                </div>\r\n");
      out.write("                 <div class=\"box\">\r\n");
      out.write("                     <img src=\"img/Max.jpg\" width=\"100\" height=\"85\"></i>\r\n");
      out.write("                    <h5>Max</h5>\r\n");
      out.write("                     \r\n");
      out.write("                </div>\r\n");
      out.write("                 <div class=\"box\">\r\n");
      out.write("                     <img src=\"img/La curacao.jpeg\" width=\"100\" height=\"85\"></i>\r\n");
      out.write("                    <h5>La Curacao</h5>\r\n");
      out.write("                     \r\n");
      out.write("                </div>\r\n");
      out.write("                 <div class=\"box\">\r\n");
      out.write("                     <img src=\"img/Rent a Car.SA.jpg\" width=\"150\" height=\"85\"></i>\r\n");
      out.write("                    <h5>Rent a Car.SA</h5>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                 <div class=\"box\">\r\n");
      out.write("                     <img src=\"img/macrosistemas.png\" width=\"100\" height=\"85\"></i>\r\n");
      out.write("                    <h5>Macrosistemas</h5>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"box\">\r\n");
      out.write("                     <img src=\"img/Guateprenda.jpg\" width=\"100\" height=\"85\"></i>\r\n");
      out.write("                    <h5>Guateprenda</h5>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"box\">\r\n");
      out.write("                     <img src=\"img/EEGSA.jpg\" width=\"100\" height=\"85\"></i>\r\n");
      out.write("                    <h5>EEGSA</h5>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                 <div class=\"box\">\r\n");
      out.write("                     <img src=\"img/Otros Pagos.jpg\" width=\"100\" height=\"85\"></i>\r\n");
      out.write("                    <h5>Otros Pagos</h5>\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
