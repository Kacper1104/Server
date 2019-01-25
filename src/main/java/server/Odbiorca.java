package server;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class Odbiorca{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @Column(length = 255)
    private String Adnotacje;
    @Column(length = 50, nullable = false)
    private String Imie_I_Nazwisko;
    @Column(length = 50, nullable = false)
    private String Adres;
    @Column(length = 6, nullable = false)
    private String Kod_Pocztowy;
    @Column(length = 50, nullable = false)
    private String Miejscowosc;
    @Column(length = 20, nullable = false)
    private String Login;
    @Column(length = 20, nullable = false)
    private String Haslo;

    //getters & setters
    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public String getAdnotacje() {
        return Adnotacje;
    }
    public void setAdnotacje(String adnotacje) {
        Adnotacje = adnotacje;
    }
    public String getImie_I_Nazwisko() {
        return Imie_I_Nazwisko;
    }
    public void setImie_I_Nazwisko(String imie_I_Nazwisko) {
        Imie_I_Nazwisko = imie_I_Nazwisko;
    }
    public String getAdres() {
        return Adres;
    }
    public void setAdres(String adres) {
        Adres = adres;
    }
    public String getKod_Pocztowy() {
        return Kod_Pocztowy;
    }
    public void setKod_Pocztowy(String kod_Pocztowy) {
        Kod_Pocztowy = kod_Pocztowy;
    }
    public String getMiejscowosc() {
        return Miejscowosc;
    }
    public void setMiejscowosc(String miejscowosc) {
        Miejscowosc = miejscowosc;
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