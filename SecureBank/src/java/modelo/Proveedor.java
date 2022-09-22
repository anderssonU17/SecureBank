
package modelo;

public class Proveedor {
    public int nitProveedor;
    public String nombreProveedor;

    public Proveedor() {
    }

    public Proveedor(int nitProveedor, String nombreProveedor) {
        this.nitProveedor = nitProveedor;
        this.nombreProveedor = nombreProveedor;
    }

    public int getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(int nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    @Override
    public String toString() {
        return getNombreProveedor();
    }
 
    
}
