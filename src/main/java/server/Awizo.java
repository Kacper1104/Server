package server;

import javax.persistence.*;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
public class Awizo{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer ID;
    @Column
    private Date Data_zostawienia;
    @OneToMany
    @JoinColumn(name="Przesylka_ID")
    private Przesylka Przesylka;

    public Integer getId() {
        return ID;
    }

    public void setId(Integer ID) {
        this.ID = ID;
    }

    public Date getData_zostawienia() {
        return Data_zostawienia;
    }

    public void setData_zostawienia(Date Data_zostawienia) {
        this.Data_zostawienia = Data_zostawienia;
    }

    public Przesylka getPrzesylka() {
        return Przesylka;
    }

    public void setPrzesylka(Przesylka Przesylka) {
        this.Przesylka = Przesylka;
    }
}
