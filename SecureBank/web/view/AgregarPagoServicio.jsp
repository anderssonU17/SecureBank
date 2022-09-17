<%-- 
    Document   : agregar
    Created on : 17/09/2022, 02:18:34 PM
    Author     : humbe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar PagoServicio</title>
    </head>
    <body>
        <div>
            <h1>Agregar Nuevo Proveedor</h1>
            <form action="Controlador">
                <strong>Proveedor: </strong><br><br>
                <input class="form-control" type="text" name="txtProveedor"><br><br>
                <strong>Moneda</strong><br><br>
                <input class="form-control" type="text" name="txtMoneda"><br><br>
                <input class="btn btn-primary" type="submit" name="accion" value="Agregar"><br><br>
            </form>
        </div>
    </body>
</html>
