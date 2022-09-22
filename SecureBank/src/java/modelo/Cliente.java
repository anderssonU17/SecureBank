
package modelo;


public class Cliente {
    private int idCliente;
    private String dpi;
    private String nombresCliente;
    private String apellidosCliente;
    private String direccion;
    private String telefono;
    private String sexo;
    private String nacionalidad;

    public Cliente() {
    }

    public Cliente(int idCliente, String dpi, String nombresCliente, String apellidosCliente, String direccion, String telefono, String sexo, String nacionalidad) {
        this.idCliente = idCliente;
        this.dpi = dpi;
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

  
    
}
