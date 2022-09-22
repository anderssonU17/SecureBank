package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PrestamoDAO{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;

    //METODO LISTAR 


    public List listar() {
        String sql = "select * from Prestamo";
        ArrayList <Prestamo> listaPrestamo = new ArrayList<>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Prestamo pres = new Prestamo();
                pres.setIdPrestamo(rs.getInt("idPrestamo"));
                pres.setIdCliente(rs.getString("idCliente"));
                pres.setPlazoMeses(rs.getString("plazoMeses"));
                pres.setMontoPrestamo(rs.getString("montoPrestamo"));
                pres.setFechaPrestamo(rs.getString("fechaPrestamo"));
                listaPrestamo.add(pres);   
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return listaPrestamo;
    }


    public int agregar(Prestamo pres) {
        //insert into Prestamo(idPrestamo, idCliente, plazoMeses, montoPrestamo, fechaPrestamo);
        String sql = "Insert into prestamo(idCliente, plazoMeses, montoPrestamo, fechaPrestamo) values(?,?,?,?,?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pres.getIdCliente());
            ps.setString(2, pres.getPlazoMeses());
            ps.setString(3, pres.getMontoPrestamo());
            ps.setString(4, pres.getFechaPrestamo());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro");
        }

        return resp;
    }
}