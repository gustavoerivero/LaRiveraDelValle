
package models;

import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class User {
    
    private String  email,
                    password;
    
    private char    type,
                    rememberData,
                    state;
    
    private Date    firstSession,
                    lastSession;

    public User(String email, String password, char type, char rememberData, 
            char state, Date firstSession, Date lastSession) {
        
        this.email = email;
        this.password = password;
        this.type = type;
        this.rememberData = rememberData;
        this.state = state;
        this.firstSession = firstSession;
        this.lastSession = lastSession;
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getRememberData() {
        return rememberData;
    }

    public void setRememberData(char rememberData) {
        this.rememberData = rememberData;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

    public Date getFirstSession() {
        return firstSession;
    }

    public void setFirstSession(Date firstSession) {
        this.firstSession = firstSession;
    }

    public Date getLastSession() {
        return lastSession;
    }

    public void setLastSession(Date lastSession) {
        this.lastSession = lastSession;
    }
        
}
