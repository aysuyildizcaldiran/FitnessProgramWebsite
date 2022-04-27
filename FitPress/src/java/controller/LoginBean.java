
package controller;

import entity.Kullanici;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;

@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable{
    private Kullanici kullanici;

    public LoginBean() {
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
    
     public void login(){
        if(kullanici.getEmail().equals("aysu")&&kullanici.getPassword().equals("123")){
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("validUser",kullanici);
        }else{
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Username of Password is Wrong!"));
        }
    }
    
    
}
