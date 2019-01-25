package server;

import javax.persistence.*;
import java.util.Date;


@Entity // This tells Hibernate to make a table out of this class
public class Awizo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer ID;
    @Column
    @Temporal(TemporalType.DATE)
    private Date Data_zostawienia;
    @Column
    private Integer Przesylka_ID;


    //getters & setters
    public Date getData_zostawienia() {
        return Data_zostawienia;
    }
    public void setData_zostawienia(Date Data_zostawienia) {
        this.Data_zostawienia = Data_zostawienia;
    }
    public Integer getPrzesylka_ID() {
        return Przesylka_ID;
    }
    public void setPrzesylka_ID(Integer Przesylka_ID) {
        this.Przesylka_ID = Przesylka_ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public Integer getID() {
        return ID;
    }
}
