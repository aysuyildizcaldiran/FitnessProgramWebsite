/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Category;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class CategoryDAO extends DBConnection {
    
     public Category findByID(int category_id){
        Category c=null;
         try {
            Statement st = this.getConnection().createStatement();
            String query = "select*from category where id="+category_id;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
               c=new Category(rs.getString("isim"),rs.getInt("category_id"));
            }
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         return c;
    }
    public void create(Category c) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "insert into category (isim) values ('" + c.getIsim() + "') ";
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Category c) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "delete from category where category_id="+ c.getCategory_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Category c) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "update category set isim='" + c.getIsim() + "' where id=" + c.getCategory_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Category> getList() {
        List<Category> list = new ArrayList<>();
        try {
            Statement st = this.getConnection().createStatement();
            String query = "select*from category";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
               list.add(new Category(rs.getString("isim"),rs.getInt("category_id")));
            }
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    
}
