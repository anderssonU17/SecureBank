
package modelo;


public class Cliente {
    private int idCliente;
    private String dpi;
    private String nombresClientes;
    private String apellidosClientes;
    private String direccion;
    private String telefono;
    private String sexo;
    private String nacionalidad;

    public Cliente() {
    }

    public Cliente(int idCliente, String dpi, String nombresClientes, String apellidosClientes, String direccion, String telefono, String sexo, String nacionalidad) {
        this.idCliente = idCliente;
        this.dpi = dpi;
        this.nombresClientes = nombresClientes;
        this.apellidosClientes = apellidosClientes;
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

    public String getNombresClientes() {
        return nombresClientes;
    }

    public void setNombresClientes(String nombresClientes) {
        this.nombresClientes = nombresClientes;
    }

    public String getApellidosClientes() {
        return apellidosClientes;
    }

    public void setApellidosClientes(String apellidosClientes) {
        this.apellidosClientes = apellidosClientes;
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
