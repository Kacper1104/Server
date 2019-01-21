package server;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class Kurier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Lista_rozwozowa_ID")
    private Lista_rozwozowa Lista_rozwozowa_ID;
    @Column(nullable = false, length = 20)
    private String Login;
    @Column(nullable = false, length = 20)
    private String Haslo;


    //getters & setters
    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public Lista_rozwozowa getLista_rozwozowa_ID() {
        return Lista_rozwozowa_ID;
    }
    public void setLista_rozwozowa_ID(Lista_rozwozowa lista_rozwozowa_ID) {
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
}