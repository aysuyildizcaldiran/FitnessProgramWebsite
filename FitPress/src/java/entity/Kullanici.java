
package entity;

public class Kullanici {
    private int kullanici_id;
    private String isim;
    private String telefon;
    private String email;
    private String adres;
    private String password;

    public Kullanici() {
    }

    public Kullanici(int kullanici_id, String isim, String telefon, String email, String adres, String password) {
        this.kullanici_id = kullanici_id;
        this.isim = isim;
        this.telefon = telefon;
        this.email = email;
        this.adres = adres;
        this.password = password;
    }

    public int getKullanici_id() {
        
        return kullanici_id;
    }

    public void setKullanici_id(int kullanici_id) {
        this.kullanici_id = kullanici_id;
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
    
    
    
    
    
}
