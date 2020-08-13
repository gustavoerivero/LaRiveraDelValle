
package models;

/**
 * Clase de Producto.
 * @author Gustavo
 */
public class Product {
    
    private int     id,
                    quantity;
    
    private String  name,
                    description;
    
    private double  cost,
                    price;
    
    private char    type,
                    state;

    /**
     * Constructor de la clase Producto.
     * @param id Atributo identificador (Autoincrementable).
     * @param quantity Cantidad del producto.
     * @param name Nombre del producto.
     * @param description Descripción del producto.
     * @param cost Costo del producto.
     * @param price Precio del producto.
     * @param type Tipo de producto.
     * @param state Estado (Activo o Inactivo).
     */
    public Product(int id, int quantity, String name, String description, 
            double cost, double price, char type, char state) {
        
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.price = price;
        this.type = type;
        this.state = state;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }
        
}
