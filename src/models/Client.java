
package models;

/**
 * Clase de Cliente.
 * @author Gustavo
 */
public class Client extends Person{
    
    private String  dni;

    /**
     * Constructor de la clase Cliente.
     * @param id Atributo identificador (Autoincrementable).
     * @param name Nombre del cliente.
     * @param surname Apellido del cliente.
     * @param phone Teléfono del cliente.
     * @param direction Dirección del cliente.
     * @param email Correo electrónico del cliente.
     * @param state Estado (Activo o Inactivo).
     * @param dni Documento Nacional de Identidad del cliente.
     */
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
