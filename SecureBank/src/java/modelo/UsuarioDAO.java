
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UsuarioDAO {
    Conexion cn = new Conexion(); 
    Connection con; 
    PreparedStatement ps; 
    ResultSet rs;
    
    public Usuario validar(String idUsuario, String contraseña){
        
        Usuario usuario = new Usuario();
    
        String sql = "select * from Usuario where idUsuario = ? and contraseña = ?";
        try{
            con = cn.Conexion(); 
            ps = con.prepareStatement(sql);
            ps.setString(1, idUsuario);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
            while(rs.next()){
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setContraseña(rs.getString("contraseña"));
            }
        
        }catch(Exception e){
            e.printStackTrace();
        }
        return usuario; 
    }
}
