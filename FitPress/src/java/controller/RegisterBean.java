
package controller;
import dao.EgitmenDAO;
import dao.KullaniciDAO;
import entity.Category;
import entity.Egitmen;
import entity.Kullanici;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named(value = "registerBean")
@SessionScoped
public class RegisterBean implements Serializable{
    
    private Kullanici kullanici;
    private Egitmen egitmen;
    private EgitmenDAO egitmenDao;
    private KullaniciDAO dao;

    public RegisterBean() {
    }

    public Egitmen getEgitmen() {
         if(egitmen==null){
           egitmen=new Egitmen();
        }
        return egitmen;
    }

    public void setEgitmen(Egitmen egitmen) {
        this.egitmen = egitmen;
    }

    public EgitmenDAO getEgitmenDao() {
        if(egitmenDao==null){
            egitmenDao=new EgitmenDAO();
        }
        return egitmenDao;
    }

    public void setEgitmenDao(EgitmenDAO egitmenDao) {
        this.egitmenDao = egitmenDao;
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
    
    
    //Kullanici
    public void createK(){
        this.getDao().create(kullanici);
        kullanici=new Kullanici();
    }
    public void updateK(){
       this.getDao().update(kullanici);
        kullanici=new Kullanici();
    }
    public void deleteK(Kullanici kullanici){
        this.getDao().delete(kullanici);
              
    }
    
    
    //Egitmen
     public void createE(){
        this.getEgitmenDao().createEgitmen(egitmen);
        egitmen=new Egitmen();
    }
    public void updateE(){
        this.getEgitmenDao().createEgitmen(egitmen);
        egitmen=new Egitmen();
    }
    public void deleteE(Egitmen egitmen){
        this.getEgitmenDao().deleteEgitmen(egitmen);
              
    }
    
    
    
    
    
}
