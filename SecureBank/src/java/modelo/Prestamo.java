package modelo;

import java.sql.Date;

public class Prestamo {
   private int idPrestamo;
   private String idCliente;
   private String plazoMeses;
   private String montoPrestamo;
   private String fechaPrestamo;

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, String idCliente, String plazoMeses, String montoPrestamo, String fechaPrestamo) {
        this.idPrestamo = idPrestamo;
        this.idCliente = idCliente;
        this.plazoMeses = plazoMeses;
        this.montoPrestamo = montoPrestamo;
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(String plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public String getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(String montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

   
}