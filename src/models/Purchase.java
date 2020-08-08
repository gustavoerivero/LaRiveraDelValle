
package models;

import java.util.Date;

/**
 * Clase de Compra.
 * @author Gustavo
 */
public class Purchase {
    
    private int     id,
                    employeeId,
                    providerId;
    
    private Date    date;
    
    private double  subtotal,
                    iva,
                    total;
    
    private char    state;

    /**
     * Constructor de la clase Compra.
     * @param id Atributo identificador (Autoincrementable).
     * @param employeeId Atributo identificador del empleado asociado a la compra.
     * @param providerId Atributo identificador del proveedor asociado a la compra.
     * @param date Fecha de la compra.
     * @param subtotal Subtotal de la compra.
     * @param iva IVA de la compra.
     * @param total Total de la compra.
     * @param state Estado (Activo o Inactivo).
     */
    public Purchase(int id, int employeeId, int providerId, Date date, 
            double subtotal, double iva, double total, char state) {
        
        this.id = id;
        this.employeeId = employeeId;
        this.providerId = providerId;
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

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
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
