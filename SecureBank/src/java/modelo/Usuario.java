
package modelo;

import java.sql.Date;

public class Usuario {
    private int idUsuario; 
    private String usuario; 
    private String Contraseña; 
    private int idEstadoUsuario; 
    private Date fechaCreacion; 

    public Usuario() {
    }

    public Usuario(int idUsuario, String usuario, String Contraseña, int idEstadoUsuario, Date fechaCreacion) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.Contraseña = Contraseña;
        this.idEstadoUsuario = idEstadoUsuario;
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getIdEstadoUsuario() {
        return idEstadoUsuario;
    }

    public void setIdEstadoUsuario(int idEstadoUsuario) {
        this.idEstadoUsuario = idEstadoUsuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    
}
