
package models;

/**
 *
 * @author Gustavo
 */
public class ProviderBankAccount {
    
    private int     id,
                    providerId;
    
    private String  dni,
                    bank,
                    email;
    
    private long    account,
                    phone;
    
    private char    state;

    public ProviderBankAccount(int id, int providerId, String dni, String bank, 
            String email, long account, long phone, char state) {
        
        this.id = id;
        this.providerId = providerId;
        this.dni = dni;
        this.bank = bank;
        this.email = email;
        this.account = account;
        this.phone = phone;
        this.state = state;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
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
