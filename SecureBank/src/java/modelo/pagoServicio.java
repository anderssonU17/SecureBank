
package modelo;

import java.sql.Date;

public class pagoServicio {
    private int identificadorPago;
    private int idCliente;
    private String nitProveedor;
    private String Monto;
    private int idMoneda;
    private Date fechaYHora;

    public pagoServicio() {
    }

    public pagoServicio(int identificadorPago, int idCliente, String nitProveedor, String Monto, int idMoneda, Date fechaYHora) {
        this.identificadorPago = identificadorPago;
        this.idCliente = idCliente;
        this.nitProveedor = nitProveedor;
        this.Monto = Monto;
        this.idMoneda = idMoneda;
        this.fechaYHora = fechaYHora;
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

    public int getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(int idMoneda) {
        this.idMoneda = idMoneda;
    }

    public Date getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(Date fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
    
    
}
