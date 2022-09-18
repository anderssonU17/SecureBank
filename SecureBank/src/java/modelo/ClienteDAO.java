
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    
    public List listar(){
         String sql = "select * from cliente";
         List<Cliente> listaCliente = new ArrayList<>();
         try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Cliente cl = new Cliente();
                cl.setIdCliente(rs.getInt(1));
                cl.setNombresClientes(rs.getString(2));
                cl.setApellidosClientes(rs.getString(3));
                cl.setDireccion(rs.getString(4));
                cl.setTelefono(rs.getString(5));
                cl.setNacionalidad(rs.getString(6));
                cl.setSexo(rs.getString(7));
                listaCliente.add(cl);
            }
         }catch (Exception e){
             e.printStackTrace();
         }
        


    return listaCliente;
    }
}

