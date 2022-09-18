<%-- 
    Document   : agregar
    Created on : 17/09/2022, 02:18:34 PM
    Author     : humbe
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Proveedor"%>
<%@page import="modelo.PagoServicio"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.PagoServicioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar PagoServicio</title>
    </head>
    <body>
        <div>
            <h2>Agregar Nuevo Proveedor</h2>
            <form class="form-horizontal" action="Controlador" method="post">
                <label for="areas" _msthash="61815" _msttexthash="250705">Proveedores: </label> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <select class="form-control" id="cboProveedor" name="cboProveedor">
                 <% List<Proveedor> listarPagoServicio = (List<Proveedor>)request.getAttribute("Proveedor");
                    if(listarPagoServicio!=null)
                    for(Proveedor Proveedor:listarPagoServicio) {%>
                    <option value="<%=Proveedor.getNitProveedor()%>"><%= Proveedor.getNombreProveedor() %></option>
                <%}%>  
                </select><br><br>
                <label for="areas" _msthash="61815" _msttexthash="250705">Monedas: </label> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <select>
                    <option value="0" _msthash="239915" _msttexthash="156741">selecciona</option>
                    
                </select><br><br>
                <input class="btn btn-primary" type="submit" name="accion" value="Agregar"><br><br>
            </form>
        </div>
    </body>
</html>
