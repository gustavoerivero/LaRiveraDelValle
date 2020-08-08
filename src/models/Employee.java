
package models;

/**
 * Clase de Empleado.
 * @author Gustavo
 */
public class Employee extends Person{
    
    private int     enterpriseId;
    
    private String  dni;
    
    private char    job;

    /**
     * Constructor de la clase Empleado.
     * @param id Atributo identificador (Autoincrementable).
     * @param enterpriseId Atributo identificador de la empresa.
     * @param name Nombre del empleado.
     * @param surname Apellido del empleado.
     * @param phone Teléfono del empleado.
     * @param direction Dirección del empleado.
     * @param email Correo electrónico del empleado.
     * @param state Estado (Activo o Inactivo).
     * @param dni Documento Nacional de Identidad del empleado.
     * @param job Cargo del empleado.
     */
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
