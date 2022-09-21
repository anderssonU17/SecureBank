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
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.Prestamo;
import modelo.PrestamoDAO;
import modelo.Usuario;
import modelo.UsuarioDAO;

/**
 *
 * @author USER
 */
public class Controlador extends HttpServlet {
    Cliente cliente = new Cliente(); 
    ClienteDAO clienteDAO = new ClienteDAO(); 
    Prestamo prestamo = new Prestamo(); 
    PrestamoDAO prestamoDAO = new PrestamoDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        
        if(menu.equals("Principal")){
           request.getRequestDispatcher("Principal.jsp").forward(request, response);
           
        }else if (menu.equals("Cliente")){
            request.getRequestDispatcher("Cliente.jsp").forward(request, response);
        }else if (menu.equals("Prestamo")){
            request.getRequestDispatcher("Prestamo.jsp").forward(request, response);
        }else if(menu.equals("ListarPrestamo")){
                switch(accion){
                    case "Listar":
                        List listaPrestamo = prestamoDAO.listar();
                        request.setAttribute("prestamos", listaPrestamo);
                        break;
                }
            request.getRequestDispatcher("ListarP.jsp").forward(request, response);
        }else if(menu.equals("AgregarPrestamo")){
            request.getRequestDispatcher("AgregarP.jsp").forward(request, response);
            switch(accion){
                case "Agregar":
                        String idCliente = request.getParameter("txtIdCliente");
                        String PlazoM = request.getParameter("txtPlazoMeses");
                        String MontoP = request.getParameter("txtMontoPrestamo");
                        String FechaP = request.getParameter("txtFechaPrestamo");
                        prestamo.setIdCliente(idCliente);
                        prestamo.setPlazoMeses(PlazoM);
                        prestamo.setMontoPrestamo(MontoP);
                        prestamo.setFechaPrestamo(FechaP);
                        prestamoDAO.agregar(prestamo);
                    break;
            }
        }else if(menu.equals("Opciones")){
            request.getRequestDispatcher("Opciones.jsp").forward(request, response);
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
