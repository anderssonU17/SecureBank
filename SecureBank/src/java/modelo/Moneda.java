
package modelo;

public class Moneda {
    public int idMoneda;
    public String nombreMoneda;

    public Moneda() {
    }

    public Moneda(int idMoneda, String nombreMoneda) {
        this.idMoneda = idMoneda;
        this.nombreMoneda = nombreMoneda;
    }

    public int getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(int idMoneda) {
        this.idMoneda = idMoneda;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }

    @Override
    public String toString() {
        return getNombreMoneda();
    }
    
    
    
}
