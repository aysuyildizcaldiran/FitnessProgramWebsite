
package controller;
import dao.KullaniciDAO;
import entity.Category;
import entity.Kullanici;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named(value = "registerBean")
@SessionScoped
public class RegisterBean implements Serializable{
    
    private Kullanici kullanici;
    private KullaniciDAO dao;

    public RegisterBean() {
    }

    public Kullanici getKullanici() {
        if(kullanici==null){
           kullanici=new Kullanici();
        }
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public KullaniciDAO getDao() {
         if(dao==null){
            dao=new KullaniciDAO();
        }
        return dao;
    }

    public void setDao(KullaniciDAO dao) {
        this.dao = dao;
    }
    
    public void create(){
        this.getDao().create(kullanici);
        kullanici=new Kullanici();
    }
    public void update(){
       this.getDao().update(kullanici);
        kullanici=new Kullanici();
    }
    public void delete(Kullanici kullanici){
        this.getDao().delete(kullanici);
              
    }
    
}
