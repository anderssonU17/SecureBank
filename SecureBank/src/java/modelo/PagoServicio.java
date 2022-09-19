
package modelo;

import java.sql.Date;

public class PagoServicio {
    private int identificadorPago;
    private int idCliente;
    private String nitProveedor;
    private String Monto;
    private String idMoneda;
    private String fecha;

    public PagoServicio() {
    }

    public PagoServicio(int identificadorPago, int idCliente, String nitProveedor, String Monto, String idMoneda, String fecha) {
        this.identificadorPago = identificadorPago;
        this.idCliente = idCliente;
        this.nitProveedor = nitProveedor;
        this.Monto = Monto;
        this.idMoneda = idMoneda;
        this.fecha = fecha;
    }

    public int getIdentificadorPago() {
        return identificadorPago;
    }

    public void setIdentificadorPago(int identificadorPago) {
        this.identificadorPago = identificadorPago;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(String nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getMonto() {
        return Monto;
    }

    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

    public String getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(String idMoneda) {
        this.idMoneda = idMoneda;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

 
    
}
