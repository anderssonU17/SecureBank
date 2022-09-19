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
            <a class="btn btn-warning" href="Controlador?accion=agregar">Realizar un Prestamo</a>
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
        </div>      
    </body>
</html>
