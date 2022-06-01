/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import dao.EgitimlerDAO;
import entity.Egitimler;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

@FacesConverter("egitimConverter")
public class EgitimConverter implements Converter{
    private EgitimlerDAO egitimDao;
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        int id = Integer.valueOf(string);
        Egitimler c = this.getEgitimDao().findByID(id);
        return c;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
       Egitimler c=(Egitimler)t;
      return String.valueOf(c.getEgitim_id());
    }

    public EgitimlerDAO getEgitimDao() {
        if (egitimDao == null) {
            this.egitimDao = new EgitimlerDAO();
        }
        return egitimDao;
    }

    public void setEgitimDao(EgitimlerDAO egitimDao) {
        this.egitimDao = egitimDao;
    }
    
}
