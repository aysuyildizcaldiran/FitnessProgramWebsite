package entity;

import dao.EgitimlerDAO;
import dao.KullaniciDAO;
import java.util.List;

public class Egitimler {

    private int egitim_id;
    private String isim;
    private String aciklama;
    private Egitmen egitmen;
    EgitimlerDAO dao;

    private double fiyat;
    private Category category;
    private List<Egitimler> list;


    public Egitimler() {
    }

    public Egitimler(int egitim_id, String isim, String aciklama, Egitmen egitmen, double fiyat, Category category) {
        this.egitim_id = egitim_id;
        this.isim = isim;
        this.aciklama = aciklama;
        this.egitmen = egitmen;
        this.fiyat = fiyat;
        this.category = category;
    }

    public Egitimler(int egitim_id, String isim, String aciklama, double fiyat) {
        this.egitim_id = egitim_id;
        this.isim = isim;
        this.aciklama = aciklama;
        this.fiyat = fiyat;
    }


    public List<Egitimler> getList() {
        return list;
    }

    public void setList(List<Egitimler> list) {
        this.list = list;
    }

    public EgitimlerDAO getDao() {
        if (dao == null) {
            dao = new EgitimlerDAO();
        }
        return dao;
    }

    public void setDao(EgitimlerDAO dao) {
        this.dao = dao;
    }

  
    public int getEgitim_id() {
        return egitim_id;
    }

    public void setEgitim_id(int egitim_id) {
        this.egitim_id = egitim_id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Egitmen getEgitmen() {
        return egitmen;
    }

    public void setEgitmen(Egitmen egitmen) {
        this.egitmen = egitmen;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
