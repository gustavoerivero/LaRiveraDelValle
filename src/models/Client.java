
package models;

/**
 *
 * @author Gustavo
 */
public class Client extends Person{
    
    private String  dni;

    public Client(int id, String name, String surname, long phone, 
            String direction, String email, char state, String dni) {
        
        super(id, name, surname, phone, direction, email, state);
    
        this.dni = dni;
    
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
}
