<%-- 
    Document   : agregar
    Created on : 13/09/2022, 01:04:56 AM
    Author     : enner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Prestamo</title>
    </head>
    <body>
        <h1>Agregar Prestamo</h1>
        <form action="Controlador">
            <strong>IdPrestamo: </strong><br>
            <input type="int" name="idPrestamo"><br><br>
            <strong>IdCliente:</strong> <br>
            <input type="int" name="idCliente"><br><br>
            <strong>PlazoMeses:</strong> <br>
            <input type="text" name="txtPlazoMeses"><br><br>
            <strong>MontoPrestamo:</strong> <br>
            <input type="int" name="montoPrestamo"><br><br>
            <strong>FechaPrestamo:</strong> <br>
            <input type="date" name="fechaPrestamo"><br><br>
            <input type="submit" name="accion" value="Agregar"><br><br>
        </form>
    </body>
</html>
