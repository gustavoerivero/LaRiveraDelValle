
package models;

/**
 *
 * @author Gustavo
 */
public class Product {
    
    private int     id,
                    quantity;
    
    private String  name,
                    description;
    
    private double  cost;
    
    private char    type,
                    state;

    public Product(int id, int quantity, String name, String description, 
            double cost, char type, char state) {
        
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.description = description;
        this.cost = cost;
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
