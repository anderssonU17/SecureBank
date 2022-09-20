
package modelo;

import config.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Prestamo;

public class PrestamoDAO implements CRUD{
    Conexion conect = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Prestamo nPrestamo = new Prestamo();

    @Override
    public List listar() {
        ArrayList <Prestamo> listaPrestamo = new ArrayList<>();
        String sql = "select * from Prestamo";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Prestamo nuevoPrestamo = new Prestamo();
                nuevoPrestamo.setIdPrestamo(rs.getInt("idPrestamo"));
                nuevoPrestamo.setIdCliente(rs.getInt("idCliente"));
                nuevoPrestamo.setPlazoMeses(rs.getString("plazoMeses"));
                nuevoPrestamo.setMontoPrestamo(rs.getInt("montoPrestamo"));
                nuevoPrestamo.setFechaPrestamo(rs.getDate("fechaPrestamo"));
                listaPrestamo.add(nuevoPrestamo);
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return listaPrestamo;
    }

    @Override
    public Prestamo Listar(int id) {
        String sql = "select * from Prestamo where idPrestamo =" + id;
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                nPrestamo.setIdPrestamo(rs.getInt("idPrestamo"));
                nPrestamo.setIdCliente(rs.getInt("idCliente"));
                nPrestamo.setPlazoMeses(rs.getString("plazoMeses"));
                nPrestamo.setMontoPrestamo(rs.getInt("montoPrestamo"));
                nPrestamo.setFechaPrestamo(rs.getDate("fechaPrestamo"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return nPrestamo;
    }

    @Override
    public boolean Agregar(Prestamo pres) {
        //insert into Prestamo(idPrestamo, idCliente, plazoMeses, montoPrestamo, fechaPrestamo)
        String sql = "insert into Prestamo(idPrestamo, idCliente, plazoMeses, montoPrestamo, fechaPrestamo) values('"+pres.getIdPrestamo()+"','"+pres.getIdCliente()+"','"+pres.getPlazoMeses()+"', '"+pres.getMontoPrestamo()+"', '"+pres.getFechaPrestamo()+"')";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return false;
    }

    @Override
    public boolean Editar(Prestamo Pres) {
        return false;
    }

    @Override
    public boolean Eliminar(int id) {
        return false;
    }
    
}
