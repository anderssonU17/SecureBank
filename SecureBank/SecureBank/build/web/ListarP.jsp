<%-- 
    Document   : listar
    Created on : 13/09/2022, 01:07:46 AM
    Author     : enner
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Prestamo</title>
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        
        <style>
            
            body{background:#adffff;margin:0; font-family: 'Montserrat';}
            

            
            #main-container{
	margin: 150px auto;
	width: 600px;
        }

        table{
                background-color: white;
                text-align: left;
                border-collapse: collapse;
                width: 100%;
        }

        th, td{
                padding: 20px;
        }

        thead{
                background-color: #246355;
                border-bottom: solid 5px #0F362D;
                color: white;
        }

        tr:nth-child(even){
                background-color: #ddd;
        }

        tr:hover td{
                background-color: #369681;
                color: white;
        }

            
        </style>
        
        
        
    </head>
    <body>

        <div class="container">
            <h1 class="text-center"><b>|---- Lista de Prestamos Realizados ----|</b></h1>
            <a class="btn btn-warning" href="Controlador?menu=Principal">Regresar</a>
            <table class="table table-bordered bg-success" border="2">
                <thead>
                    <tr>
                        <th class="text-center">CODIGO PRESTAMO</th>
                        <th class="text-center">CODIGO CLIENTE</th>
                        <th class="text-center">PLAZO</th>
                        <th class="text-center">MONTO</th>
                        <th class="text-center">FECHA</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="prestamo" items="${prestamos}">
                    <tr>
                        <td>${prestamo.getIdPrestamo()}</td>
                        <td>${prestamo.getIdCliente()}</td>
                        <td>${prestamo.getPlazoMeses()}</td>
                        <td>${prestamo.getMontoPrestamo()}</td>
                        <td>${prestamo.getFechaPrestamo()}</td>
                    </c:forEach>
                    </tr>
                </tbody>
            </table>
        </div>      
    </body>
</html>
