package controller;

import dao.EgitmenDAO;
import dao.KullaniciDAO;
import entity.Egitmen;
import entity.Kullanici;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;

@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    private Kullanici kullanici;
    private Egitmen egitmen;
    private EgitmenDAO egitmenDao;
    private KullaniciDAO dao;


    public LoginBean() {
    }

    public Egitmen getEgitmen() {
        if (egitmen == null) {
            egitmen = new Egitmen();
        }
        return egitmen;
    }

    public void setEgitmen(Egitmen egitmen) {
        this.egitmen = egitmen;
    }

    public Kullanici getKullanici() {
        if (kullanici == null) {
            kullanici = new Kullanici();
        }
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public EgitmenDAO getEgitmenDao() {
        if (egitmenDao == null) {
            egitmenDao = new EgitmenDAO();
        }
        return egitmenDao;
    }

    public void setEgitmenDao(EgitmenDAO egitmenDao) {
        this.egitmenDao = egitmenDao;
    }

    public KullaniciDAO getDao() {
        if (dao == null) {
            dao = new KullaniciDAO();
        }
        return dao;
    }

    public void setDao(KullaniciDAO dao) {
        this.dao = dao;
    }

    public void login() {

        if (kullanici.getEmail().equals("aysu@gmail.com") && kullanici.getPassword().equals("123456")) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("validUser", kullanici);
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Kullanıcı bilgileri geçersiz."));
        }
    }

    /*
    public void login() {
        Kullanici user = this.getDao().getUser(this.email, this.password);
        if (user != null) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("ValidUser", kullanici);

        } else {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Kullanıcı bilgileri geçersiz."));

        }
    }
     */
}
