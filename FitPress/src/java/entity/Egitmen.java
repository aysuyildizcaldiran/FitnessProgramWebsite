package entity;

import java.util.List;

public class Egitmen {

    private int egitmen_id;
    private String isim;
    private String telefon;
    private String email;
    private String adres;
    private String password;
    private List<Egitimler> egitimler;

    public Egitmen() {
    }

    public Egitmen(int egitmen_id, String isim, String telefon, String email, String adres, String password, List<Egitimler> egitimler) {
        this.egitmen_id = egitmen_id;
        this.isim = isim;
        this.telefon = telefon;
        this.email = email;
        this.adres = adres;
        this.password = password;
        this.egitimler = egitimler;
    }

    public int getEgitmen_id() {
        return egitmen_id;
    }

    public void setEgitmen_id(int egitmen_id) {
        this.egitmen_id = egitmen_id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Egitimler> getEgitimler() {
        return egitimler;
    }

    public void setEgitimler(List<Egitimler> egitimler) {
        this.egitimler = egitimler;
    }

}
