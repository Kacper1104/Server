package server;

import javax.persistence.*;


@Entity // This tells Hibernate to make a table out of this class
public class Magazynier{
    @Id
    private Integer ID;
    @Column
    private String Login;
    @Column
    private String Haslo;


    //getters & setters
    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public String getLogin() {
        return Login;
    }
    public void setLogin(String login) {
        Login = login;
    }
    public String getHaslo() {
        return Haslo;
    }
    public void setHaslo(String haslo) {
        Haslo = haslo;
    }
}