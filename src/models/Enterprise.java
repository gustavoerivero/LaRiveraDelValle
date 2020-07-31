
package models;

/**
 *
 * @author Gustavo
 */
public class Enterprise {
    
    private int     id;
    
    private String  rif,
                    name,
                    description,
                    direction,
                    email;
    
    private long    phone;
    
    private char    state;

    public Enterprise(int id, String rif, String name, String description, 
            String direction, String email, long phone, char state) {
        
        this.id = id;
        this.rif = rif;
        this.name = name;
        this.description = description;
        this.direction = direction;
        this.email = email;
        this.phone = phone;
        this.state = state;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }
        
}
