package server;

import javax.persistence.*;


@Entity // This tells Hibernate to make a table out of this class
public class Nadawca {
    @Id
    private Integer ID;
    @Column(length = 34)
    private String Numer_konta;
    @Column(length = 50)
    private String Imie_I_Nazwisko;
    @Column(length = 50)
    private String Adres;
    @Column(length = 6)
    private String Kod_Pocztowy;
    @Column(length = 50)
    private String Miejscowosc;
    @Column(length = 20)
    private String Login;
    @Column(length = 20)
    private String Haslo;

    //getters & setters
    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public String getNumer_konta() {
        return Numer_konta;
    }
    public void setNumer_konta(String numer_konta) {
        Numer_konta = numer_konta;
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