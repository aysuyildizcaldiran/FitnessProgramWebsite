/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Kullanici;
import java.sql.Connection;
import java.sql.Statement;
import util.DBConnection;

public class KullaniciDAO extends DBConnection{
   
     public void create(Kullanici kullanici) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "insert into kullanici (isim,telefon,email,adres,sifre) values ('" + kullanici.getIsim() + "','" + kullanici.getTelefon()+ "','" + kullanici.getEmail() + "','" + kullanici.getAdres() + "','" + kullanici.getPassword() + "') ";
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     public void update(Kullanici kullanici) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "update category set isim='" + kullanici.getEmail() + "' where id=" + kullanici.getKullanici_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
      public void delete(Kullanici kullanici) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "delete from category where id="+ kullanici.getKullanici_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
     
}
