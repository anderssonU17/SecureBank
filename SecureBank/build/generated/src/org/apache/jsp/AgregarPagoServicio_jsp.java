package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Moneda;
import java.util.ArrayList;
import modelo.Proveedor;
import modelo.PagoServicio;
import java.util.Iterator;
import java.util.List;
import modelo.PagoServicioDAO;

public final class AgregarPagoServicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Agregar PagoServicio</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("            <h2>Nuevo Pago Servicio</h2>\r\n");
      out.write("            <form class=\"form-horizontal\" action=\"Controlador\" method=\"post\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    ");

                        PagoServicioDAO dao = new PagoServicioDAO();
                        List<Proveedor> listaPs = dao.listarProveedor();
                        Iterator<Proveedor> iterator = listaPs.iterator();
                        Proveedor per = null;
                        if(iterator.hasNext()){
                            per = iterator.next(); 
                    
      out.write("\r\n");
      out.write("                <label for=\"areas\" _msthash=\"61815\" _msttexthash=\"250705\">Proveedores: </label> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("                <select>\r\n");
      out.write("                    <option value=\"0\" _msthash=\"239915\" msttexthash=\"156741\">seleccione:</option>\r\n");
      out.write("                    <option value=\"1\" _msthash=\"240096\" msttexthash=\"121469\">");
      out.print( per.toString() );
      out.write("</option>\r\n");
      out.write("                    <option value=\"2\" _msthash=\"240096\" msttexthash=\"121469\">");
      out.print( per.toString() );
      out.write("</option>\r\n");
      out.write("                    <option value=\"3\" _msthash=\"240096\" msttexthash=\"121469\">");
      out.print( per.toString() );
      out.write("</option>\r\n");
      out.write("                    <option value=\"4\" _msthash=\"240096\" msttexthash=\"121469\">");
      out.print( per.toString() );
      out.write("</option>\r\n");
      out.write("                    <option value=\"5\" _msthash=\"240096\" msttexthash=\"121469\">");
      out.print( per.toString() );
      out.write("</option>\r\n");
      out.write("                </select><br><br>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                     ");

                        PagoServicioDAO mon = new PagoServicioDAO();
                        List<Moneda> listaMon = mon.listarMoneda();
                        Iterator<Moneda> iteratorr = listaMon.iterator();
                        Moneda perM = null;
                        if(iteratorr.hasNext()){
                            perM = iteratorr.next(); 
                    
      out.write("\r\n");
      out.write("                <label for=\"areas\" _msthash=\"61815\" _msttexthash=\"250705\">Monedas: </label> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("                <select>\r\n");
      out.write("                    <option value=\"0\" _msthash=\"239915\" _msttexthash=\"156741\">selecciona</option>\r\n");
      out.write("                    <option value=\"0\" _msthash=\"239915\" _msttexthash=\"156741\">");
      out.print(perM.toString() );
      out.write("</option>\r\n");
      out.write("                    <option value=\"0\" _msthash=\"239915\" _msttexthash=\"156741\">");
      out.print(perM.getNombreMoneda() );
      out.write("</option>\r\n");
      out.write("                    <option value=\"0\" _msthash=\"239915\" _msttexthash=\"156741\">");
      out.print(perM.nombreMoneda );
      out.write("</option>\r\n");
      out.write("                </select><br><br>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"col-lg-5\">\r\n");
      out.write("                <form action=\"Controlador\">\r\n");
      out.write("                    <label for=\"areas\" _msthash=\"61815\" _msttexthash=\"250705\">Fecha: </label> <br><br>\r\n");
      out.write("                    <input class=\"form-control\" type =\"text\" name=\"txtFecha\"><br><br>\r\n");
      out.write("                    <label for=\"areas\" _msthash=\"61815\" _msttexthash=\"250705\">Monto: </label><br><br>\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"txtMonto\"><br><br>\r\n");
      out.write("                    <input class=\"btn btn-primary\" type=\"submit\" name=\"accion\" value=\"Agregar\"><br><br>\r\n");
      out.write("                </form>\r\n");
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
