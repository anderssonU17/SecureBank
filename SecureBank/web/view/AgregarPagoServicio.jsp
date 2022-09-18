<%-- 
    Document   : agregar
    Created on : 17/09/2022, 02:18:34 PM
    Author     : humbe
--%>

<%@page import="modelo.Moneda"%>
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
                <div>
                    <%
                        PagoServicioDAO dao = new PagoServicioDAO();
                        List<Proveedor> listaPs = dao.listarProveedor();
                        Iterator<Proveedor> iterator = listaPs.iterator();
                        Proveedor per = null;
                        if(iterator.hasNext()){
                            per = iterator.next(); 
                    %>
                <label for="areas" _msthash="61815" _msttexthash="250705">Proveedores: </label> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <select>
                    <option value="0" _msthash="239915" msttexthash="156741">seleccione:</option>
                    <option value="1" _msthash="240096" msttexthash="121469"><%= per.toString() %></option>
                    <option value="2" _msthash="240096" msttexthash="121469"><%= per.toString() %></option>
                    <option value="3" _msthash="240096" msttexthash="121469"><%= per.toString() %></option>
                    <option value="4" _msthash="240096" msttexthash="121469"><%= per.toString() %></option>
                    <option value="5" _msthash="240096" msttexthash="121469"><%= per.toString() %></option>
                </select><br><br>
                <%}%>
                </div>
                <div>
                     <%
                        PagoServicioDAO mon = new PagoServicioDAO();
                        List<Moneda> listaMon = mon.listarMoneda();
                        Iterator<Moneda> iteratorr = listaMon.iterator();
                        Moneda perM = null;
                        if(iteratorr.hasNext()){
                            perM = iteratorr.next(); 
                    %>
                <label for="areas" _msthash="61815" _msttexthash="250705">Monedas: </label> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <select>
                    <option value="0" _msthash="239915" _msttexthash="156741">selecciona</option>
                    <option value="0" _msthash="239915" _msttexthash="156741"><%=perM.toString() %></option>
                    <option value="0" _msthash="239915" _msttexthash="156741"><%=perM.getNombreMoneda() %></option>
                    <option value="0" _msthash="239915" _msttexthash="156741"><%=perM.nombreMoneda %></option>
                </select><br><br>
                <%}%>
                <input class="btn btn-primary" type="submit" name="accion" value="Agregar"><br><br>
                </div>
            </form>
        </div>
    </body>
</html>
