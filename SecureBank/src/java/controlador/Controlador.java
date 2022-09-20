
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Prestamo;
import modelo.PrestamoDAO;

public class Controlador extends HttpServlet {

    String listar = "listar.jsp";
    String Agregar = "agregar.jsp";
    Prestamo nuevoPrestamo = new Prestamo();
    PrestamoDAO nuevoPrestamoDAO = new PrestamoDAO();
    int idPrestamo;
    int idCliente;
    Date fechaPrestamo;
    int montoPrestamo;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
    }
}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String acceso = "";
        String action = request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso = listar;
        }else if(action.equalsIgnoreCase("agregar")){
            acceso = Agregar;
        }else if(action.equalsIgnoreCase("Agregar")){
                idPrestamo = Integer.parseInt(request.getParameter("idPrestamo"));
                idCliente = Integer.parseInt(request.getParameter("idCliente"));
                String plazoMeses = request.getParameter("txtPlazoMeses");
                montoPrestamo = Integer.parseInt(request.getParameter("montoPrestamo"));
                fechaPrestamo = Date.valueOf(request.getParameter("fechaPrestamo"));
                nuevoPrestamo.setIdPrestamo(idPrestamo);
                nuevoPrestamo.setIdCliente(idCliente);
                nuevoPrestamo.setPlazoMeses(plazoMeses);
                nuevoPrestamo.setMontoPrestamo(montoPrestamo);
                nuevoPrestamo.setFechaPrestamo(fechaPrestamo);
                nuevoPrestamoDAO.Agregar(nuevoPrestamo);
                acceso = listar;
                
            }
        
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
