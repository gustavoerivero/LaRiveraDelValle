
package models;

import java.util.Date;

/**
 * Clase de Venta.
 * @author Gustavo
 */
public class Sale {
    
    private int     id,
                    employeeId,
                    clientId;
    
    private Date    date;
    
    private double  subtotal,
                    iva,
                    total;
    
    private char    state;

    /**
     * Constructor de la clase Venta.
     * @param id Atributo identificador (Autoincrementable).
     * @param employeeId Atributo identificador del empleado asociado a la venta.
     * @param clientId Atributo identificador del cliente asociado a la venta.
     * @param date Fecha de la venta.
     * @param subtotal Subtotal de la venta.
     * @param iva IVA de la venta.
     * @param total Total de la venta.
     * @param state Estado (Activo o Inactivo).
     */
    public Sale(int id, int employeeId, int clientId, Date date, 
            double subtotal, double iva, double total, char state) {
        
        this.id = id;
        this.employeeId = employeeId;
        this.clientId = clientId;
        this.date = date;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.state = state;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }
        
}
