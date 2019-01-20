package server;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class Kurier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @OneToMany
    @JoinColumn(name="Lista_rozwozowa")
    private Lista_rozwozowa Lista_rozwozowa;
    @Column(nullable = false, length = 20)
    private String Login;
    @Column(nullable = false, length = 20)
    private String Haslo;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Lista_rozwozowa getLista_rozwozowa() {
        return Lista_rozwozowa;
    }

    public void setLista_rozwozowa(Lista_rozwozowa lista_rozwozowa) {
        Lista_rozwozowa = lista_rozwozowa;
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