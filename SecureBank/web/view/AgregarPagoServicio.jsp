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
            <h2>Agregar Nuevo Proveedor</h2>
            <form action="Controlador">
                <label for="areas" _msthash="61815" _msttexthash="250705">Proveedores: </label>
                <select>
                    <option value="0" _msthash="239915" _msttexthash="156741">selecciona</option>
                    <option value="1" _msthash="240097" _msttexthash="131469"><% %></option>
                </select><br><br>
                <label for="areas" _msthash="61815" _msttexthash="250705">Monedas: </label>
                <select>
                    <option value="0" _msthash="239915" _msttexthash="156741">selecciona</option>
                    
                </select><br><br>
                <input class="btn btn-primary" type="submit" name="accion" value="Agregar"><br><br>
            </form>
        </div>
    </body>
</html>
