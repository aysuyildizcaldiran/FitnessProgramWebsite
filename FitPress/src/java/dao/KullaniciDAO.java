/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Egitmen;
import entity.Kullanici;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.DBConnection;

public class KullaniciDAO extends DBConnection {

    private Kullanici kullanici;
    private Egitmen egitmen;

    /*
    public Kullanici getUser(String email, String password) {
        Kullanici u = null;
        try {

            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from kullanici where email='" + email + "' and sifre='" + password + "'");
            rs.next();
            u = new Kullanici(rs.getInt("kullanici_id"), rs.getString("isim"), rs.getString("telefon"), rs.getString("email"), rs.getString("adres"), rs.getString("password"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return u;
    }
    
    */
    
    public void create(Kullanici kullanici) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "insert into kullanici (isim,telefon,email,adres,sifre) values ('" + kullanici.getIsim() + "','" + kullanici.getTelefon() + "','" + kullanici.getEmail() + "','" + kullanici.getAdres() + "','" + kullanici.getPassword() + "') ";
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Kullanici kullanici) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "update kullanici set isim='" + kullanici.getEmail() + "' where id=" + kullanici.getKullanici_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Kullanici kullanici) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "delete from kullanici where id=" + kullanici.getKullanici_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Kullanici findByID(int kullanici_id) {
        Kullanici c = null;
        try {
            Statement st = this.getConnection().createStatement();

            String query = "select * from kullanici where kullanici_id=" + kullanici_id;

            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                c = (new Kullanici(rs.getInt("kullanici_id"), rs.getString("isim"), rs.getString("telefon"), rs.getString("email"), rs.getString("adres"),rs.getString("password")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return c;

    }
    public Kullanici findByMail(String mail) {
        Kullanici c = null;
        try {
            Statement st = this.getConnection().createStatement();
            String query = "select * from kullanici where email='" + mail+"'";

            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                c = (new Kullanici(rs.getInt("kullanici_id"), rs.getString("isim"), rs.getString("telefon"), rs.getString("email"), rs.getString("adres"),rs.getString("password")));
            }

        } catch (Exception e) {
            System.out.println("kullanici get by email"+e.getMessage());
        }

        
        return c;
    }

    
}
