
package models;

/**
 *
 * @author Gustavo
 */
public class Employee extends Person{
    
    private int     enterpriseId;
    
    private String  dni;
    
    private char    job;

    public Employee(int id, int enterpriseId, String name, String surname, 
            long phone, String direction, String email, char state,
            String dni, char job) {
        
        super(id, name, surname, phone, direction, email, state);
        
        this.enterpriseId = enterpriseId;
        this.dni = dni;
        this.job = job;
        
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getJob() {
        return job;
    }

    public void setJob(char job) {
        this.job = job;
    }
    
       
}
