package server;


import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class Kurier {
    @Id
    private Integer ID;
    @Column
    private Integer Lista_rozwozowa_ID;
    @Column(length = 20)
    private String Login;
    @Column(length = 20)
    private String Haslo;
    @Column(length = 50)
    private String Imie_I_Nazwisko;


    //getters & setters
    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public Integer getLista_rozwozowa_ID() {
        return Lista_rozwozowa_ID;
    }
    public void setLista_rozwozowa_ID(Integer lista_rozwozowa_ID) {
        Lista_rozwozowa_ID = lista_rozwozowa_ID;
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
    public String getImie_I_Nazwisko() {
        return Imie_I_Nazwisko;
    }
    public void setImie_I_Nazwisko(String imie_I_Nazwisko) {
        Imie_I_Nazwisko = imie_I_Nazwisko;
    }
}