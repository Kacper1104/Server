package server;

import javax.persistence.*;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Magazynier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @Column(nullable = false)
    private String Login;
    @Column(nullable = false)
    private String Haslo;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Magazynier_ID")
    private List<Lista_rozwozowa> lista_rozwozowa;


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
    public List<Lista_rozwozowa> getLista_rozwozowa() {
        return lista_rozwozowa;
    }
    public void setLista_rozwozowa(List<Lista_rozwozowa> lista_rozwozowa) {
        this.lista_rozwozowa = lista_rozwozowa;
    }
}