
package entity;

import entity.Kullanici;
import java.util.List;

public class Egitmen extends Kullanici{
   private List<Egitimler>egitimler;
   

    public Egitmen(List<Egitimler> egitimler, int egitmen_id) {
        this.egitimler = egitimler;
       
    }

    public Egitmen(List<Egitimler> egitimler, int kullanici_id, String isim, String telefon, String email, String adres, String password) {
        super(kullanici_id, isim, telefon, email, adres, password);
        this.egitimler = egitimler;
       
    }

    public List<Egitimler> getEgitimler() {
        return egitimler;
    }

    public void setEgitimler(List<Egitimler> egitimler) {
        this.egitimler = egitimler;
    }
   
    
}
