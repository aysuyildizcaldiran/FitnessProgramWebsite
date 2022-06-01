
package controller;

import dao.EgitimlerDAO;
import entity.Egitimler;
import jakarta.inject.Named;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "entityBean")
@SessionScoped
public class EgitimBean implements Serializable {

    private Egitimler entity;
    private EgitimlerDAO dao;
    private List<Egitimler> list;
    public EgitimBean() {
    }

    public Egitimler getEgitim() {
         if (entity == null) {
            entity = new Egitimler();
        }
        return entity;
    }

    public void setEgitim(Egitimler entity) {
        this.entity = entity;
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

    public List<Egitimler> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<Egitimler> list) {
        this.list = list;
    }
    public void create() {
        this.getDao().create(entity);
        entity = new Egitimler();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new Egitimler();
    }

    public void delete(Egitimler e) {
        this.getDao().delete(e);
        entity = new Egitimler();
    }
    
    
    
}
