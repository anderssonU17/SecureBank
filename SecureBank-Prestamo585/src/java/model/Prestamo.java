
package model;

import java.sql.Date;

public class Prestamo {
   private int idPrestamo;
   private int idCliente;
   private String plazoMeses;
   private int montoPrestamo;
   private Date fechaPrestamo;

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, int idCliente, String plazoMeses, int montoPrestamo, Date fechaPrestamo) {
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(String plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public int getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(int montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
   
}
