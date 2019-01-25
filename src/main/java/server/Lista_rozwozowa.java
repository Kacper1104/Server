package server;

import javax.persistence.*;
import java.util.Date;


@Entity // This tells Hibernate to make a table out of this class
public class Lista_rozwozowa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @Column
    @Temporal(TemporalType.DATE)
    private Date Data;
    //fk
    @Column
    private Magazynier Magazynier_ID;

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
}