
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
   Proveedor pProveedor = new Proveedor();
    @Override
    public List listarProveedor() {
        List<Proveedor> listaProveedor = new ArrayList();
        String sql = "select * from Proveedor";
        try{
            con = conect.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Proveedor nuevoProveedor = new Proveedor();
                nuevoProveedor.setNitProveedor(rs.getInt("nitProveedor"));
                nuevoProveedor.setNombreProveedor(rs.getString("nombreProveedor"));
                listaProveedor.add(nuevoProveedor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaProveedor;
    }
    
    public List listarMoneda(){
        List<Moneda> listaMoneda = new ArrayList();
        String sql = "select * from Moneda";
        try{
            con = conect.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Moneda nuevoMoneda = new Moneda();
                nuevoMoneda.setIdMoneda(rs.getInt("idMoneda"));
                nuevoMoneda.setNombreMoneda(rs.getString("nombreDeMoneda"));
                listaMoneda.add(nuevoMoneda);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaMoneda;
    }

    @Override
    public PagoServicio list(int id) {
        String sql = "select * from PagoServicio where identificadorPago" + id;
        try{
            con = conect.Conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                pservicio.setIdentificadorPago(rs.getInt("identificadorPago"));
                pservicio.setIdCliente(rs.getInt("idCliente"));
                pservicio.setNitProveedor(rs.getString("nitProveedor"));
                pservicio.setMonto(rs.getString("Monto"));
                pservicio.setIdMoneda(rs.getString("idMoneda"));
                pservicio.setFecha(rs.getString("fechaYHora"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return pservicio;
    }

    @Override
    public boolean add(PagoServicio per) {
        String sql = "insert into PagoServicio(Proveedor, Moneda) values(?, ?, ?, ?)";
        try{
            con = conect.Conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ps.setString(1, per.getNitProveedor());
                ps.setString(2, per.getIdMoneda());
                ps.setString(3, per.getFecha());
                ps.setString(4, per.getMonto());
                ps.executeUpdate();
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo agregar");
        }
        return false; //Cambiar
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "delete from PagoServicio where identificadorPago = " + id;
        try{
            con = conect.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("No se pudo eliminar");
        return false; //Cambiar
    }   
}
