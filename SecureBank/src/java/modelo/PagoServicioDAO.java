
package modelo;

import config.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PagoServicioDAO implements CRUD{
   Conexion conect = new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   PagoServicio pservicio = new PagoServicio();
    @Override
    public List listar() {
        ArrayList<PagoServicio> listaServicio = new ArrayList();
        String sql = "select * from PagoServicio";
        try{
            con = conect.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                PagoServicio nuevopagoservicio = new PagoServicio();
                nuevopagoservicio.setIdentificadorPago(rs.getInt("identificadorPago"));
                nuevopagoservicio.setIdCliente(rs.getInt("idCliente"));
                nuevopagoservicio.setNitProveedor(rs.getString("nitProveedor"));
                nuevopagoservicio.setMonto(rs.getString("Monto"));
                nuevopagoservicio.setIdMoneda(rs.getInt("idMoneda"));
                nuevopagoservicio.setFechaYHora(rs.getDate("fechaYHora"));
                listaServicio.add(nuevopagoservicio);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaServicio;
    }

    @Override
    public PagoServicio list(int id0) {
        String sql = "select * from PagoServicio where identificadorPago";
        try{
            con = conect.Conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                pservicio.setIdentificadorPago(rs.getInt("identificadorPago"));
                pservicio.setIdCliente(rs.getInt("idCliente"));
                pservicio.setNitProveedor(rs.getString("nitProveedor"));
                pservicio.setMonto(rs.getString("Monto"));
                pservicio.setIdMoneda(rs.getInt("idMoneda"));
                pservicio.setFechaYHora(rs.getDate("fechaYHora"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return pservicio;
    }

    @Override
    public boolean add(PagoServicio per) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean edit(PagoServicio per0) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
