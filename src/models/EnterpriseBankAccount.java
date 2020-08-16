
package models;

/**
 * Clase de Cuenta Bancaria de la Empresa
 * @author Gustavo
 */
public class EnterpriseBankAccount extends BankAccount{
    
    private int     walletId;
    
    private double  amount;

    /**
     * Constructor de la clase de Cuenta Bancaria de la Empresa.
     * @param amount Monto de la cuenta.
     * @param id Atributo identificador (Autoincrementable).
     * @param ownerId Atributo identificador del propietario de la cuenta.
     * @param walletId Atributo identificador de la billetera (de poseer).
     * @param dni Documento Nacional de Identidad de la Empresa.
     * @param name Nombre del propietario asocado a la cuenta.
     * @param bank Banco asociado a la cuenta.
     * @param email Correo electrónico asociado a la cuenta.
     * @param account Número de cuenta bancaria.
     * @param phone Teléfono asociado a la cuenta.
     * @param state Estado (Activo o Inactivo).
     */
    public EnterpriseBankAccount(double amount, int id, int ownerId, int walletId, 
            String dni, String name, String bank, String email, long account, 
            long phone, char state) {
        
        super(id, ownerId, dni, name, bank, email, account, phone, state);
        
        this.walletId = walletId;
        this.amount = amount;
        
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
       
}
