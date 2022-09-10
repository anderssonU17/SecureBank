
package modelo;

import config.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class pagoservicioDAO implements CRUD{
   Conexion conect = new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   pagoservicio pservicio = new pagoservicio();
    @Override
    public List listar() {
        ArrayList<pagoservicio> listaServicio = new ArrayList();
        String sql = "select * from PagoServicio";
        try{
            con = conect.getConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaServicio;
    }

    @Override
    public pagoservicio list(int id0) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean add(pagoservicio per) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean edit(pagoservicio per0) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
