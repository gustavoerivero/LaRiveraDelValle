
package models;

/**
 * Clase de Cuenta Bancaria del Proveedor.
 * @author Gustavo
 */
public class ProviderBankAccount extends BankAccount{

    /**
     * Constructor de la clase de Cuenta Bancaria del Proveedor.
     * @param id Atributo identificador (Autoincrementable).
     * @param ownerId Atributo identificador del propietario de la cuenta.
     * @param dni Documento Nacional de Identidad asociado a la cuenta.
     * @param name Nombre asociado a la cuenta.
     * @param bank Banco asociado a la cuenta.
     * @param email Correo electrónico asociado a la cuenta.
     * @param account Número de cuenta bancaria asociado a la cuenta.
     * @param phone Teléfono asociado a la cuenta.
     * @param state Estado (Activo o Inactivo).
     */
    public ProviderBankAccount(int id, int ownerId, String dni, String name, 
            String bank, String email, long account, long phone, char state) {
        
        super(id, ownerId, dni, name, bank, email, account, phone, state);
    
    }
        
}
