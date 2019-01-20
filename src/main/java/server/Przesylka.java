package server;

import javax.persistence.*;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
public class Przesylka {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @Column
    private String Status_przesylki;
    @Column
    private String Opcja_dostawy;
    @Column
    private double Koszt_Do_Zaplaty;
    @Column
    private Date Data_nadania;
    @Column
    private boolean Na_liscie_rozwozowej;
    @Column
    private Integer Proba_dostarczenia;
    @Column
    private Date Ostatnia_zmiana_statusu;
    @OneToMany
    @JoinColumn(name="Lista_rozwozowa_ID")
    private Lista_rozwozowa Lista_rozwozowa;
    @OneToMany
    @JoinColumn(name="Nadawca_ID")
    private Nadawca Nadawca;
}
