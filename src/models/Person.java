package models;

/**
 *
 * @author Gustavo
 */
public class Person {

    private int id;

    private String name,
            surname,
            direction,
            email;
    private long phone;
    private char state;

    public Person(int id, String name, String surname,
            long phone, String direction, String email, char state) {

        super();

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.direction = direction;
        this.email = email;
        this.state = state;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
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

    public int getEstatus() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

}
