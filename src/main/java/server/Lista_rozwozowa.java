package server;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Lista_rozwozowa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @Column
    private Date Data;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name="Magazynier_ID")
    private Magazynier Magazynier_ID;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "Lista_rozwozowa_ID")
    private Kurier kurier;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Lista_rozwozowa_ID")
    private List<Przesylka> przesylka;

    //getters & setters
    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public Date getData() {
        return Data;
    }
    public void setData(Date data) {
        Data = data;
    }
    public Magazynier getMagazynier_ID() {
        return Magazynier_ID;
    }
    public void setMagazynier_ID(Magazynier magazynier_ID) {
        Magazynier_ID = magazynier_ID;
    }
    public Kurier getKurier() {
        return kurier;
    }
    public void setKurier(Kurier kurier) {
        this.kurier = kurier;
    }
    public List<Przesylka> getPrzesylka() {
        return przesylka;
    }
    public void setPrzesylka(List<Przesylka> przesylka) {
        this.przesylka = przesylka;
    }
}