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
    @ManyToOne
    @JoinColumn(name="Magazynier_ID")
    private Magazynier magazynier;

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

    public Magazynier getMagazynier() {
        return magazynier;
    }

    public void setMagazynier(Magazynier magazynier) {
        this.magazynier= magazynier;
    }
}