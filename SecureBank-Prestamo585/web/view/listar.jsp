<%-- 
    Document   : listar
    Created on : 13/09/2022, 01:07:46 AM
    Author     : enner
--%>

<%@page import="java.util.Iterator"%>
<%@page import="model.Prestamo"%>
<%@page import="java.util.List"%>
<%@page import="modelDAO.PrestamoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Prestamo</title>
    </head>
    <body>
        <h1>Lista de Prestamos Realizados</h1>
        <a href="Controlador?accion=agregar">Realizar un Prestamo</a>
        <table border="2">
            <thead>
                <tr>
                    <th>CODIGO PRESTAMO</th>
                    <th>CODIGO CLIENTE</th>
                    <th>PLAZO</th>
                    <th>MONTO</th>
                    <th>FECHA</th>
                </tr>
            </thead>
            <%
                PrestamoDAO dao = new PrestamoDAO(); 
                List <Prestamo> listaPrestamo = dao.listar();
                Iterator<Prestamo> iterator = listaPrestamo.iterator();
                Prestamo pres = null;
                while (iterator.hasNext()){
                    pres = iterator.next();
            %>
            <tbody>
                <tr>
                    <td><%= pres.getIdPrestamo()%></td>
                    <td><%= pres.getIdCliente()%></td>
                    <td><%= pres.getPlazoMeses()%></td>
                    <td><%= pres.getMontoPrestamo()%></td>
                    <td><%= pres.getFechaPrestamo()%></td>

                </tr>
                <%}%>
            </tbody>
        </table>
    </body>
</html>
