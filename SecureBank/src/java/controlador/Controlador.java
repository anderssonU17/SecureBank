/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.PagoServicio;
import modelo.PagoServicioDAO;
import modelo.Proveedor;

/**
 *
 * @author USER
 */
public class Controlador extends HttpServlet {
    PagoServicio pagoServicio = new PagoServicio();
    PagoServicioDAO pagoServicioDAO = new PagoServicioDAO();
    
    int codServicio;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                PagoServicioDAO pServicioDAO = new PagoServicioDAO();
        
        List<Proveedor> listarPagoServicio = pServicioDAO.listarProveedor();
        request.setAttribute("PagoServicio", listarPagoServicio);
        request.getRequestDispatcher("AgregarPagoServicio.jsp").forward(request, response);
        
        
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        
        if(menu.equals("Principal")){ //Cambiar de principal a otro que sea necesario
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }else if(menu.equals("PagoServicio")){
            switch(accion){
                case "Listar":
                    List listarPServicio = pagoServicioDAO.listarProveedor();
                    request.setAttribute("PagoServicio", listarPServicio);
                    break;
                case "Agregar":
                    String Proveedor = request.getParameter("txtProveedor");
                    String Moneda = request.getParameter("txtMoneda");
                    pagoServicio.setNitProveedor(Proveedor);
                    pagoServicio.setIdMoneda(Moneda);
                    pagoServicioDAO.add(pagoServicio);
                    request.getRequestDispatcher("Controlador?menu=PagoServicio&accion=Listar").forward(request, response);
                    break;
                case "Eliminar":
                    codServicio = Integer.parseInt(request.getParameter("identificadorPago"));
                    pagoServicioDAO.eliminar(codServicio);
                    request.getRequestDispatcher("Controlador?menu=PagoServicio&accion=Listar").forward(request, response);
                    break;
            }
        }else if(menu.equals("")){
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
