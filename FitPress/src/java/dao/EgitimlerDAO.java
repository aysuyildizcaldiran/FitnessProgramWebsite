
package dao;

import entity.Category;
import entity.Egitimler;
import entity.Egitimler;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class EgitimlerDAO extends DBConnection {
     public void create(Egitimler egitim) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "insert into egitim (isim) values ('" + egitim.getIsim() + "') ";
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     public void update(Egitimler egitim) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "update category set isim='" + egitim.getIsim() + "' where id=" + egitim.getEgitim_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
      public void delete(Egitimler egitim) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "delete from category where id="+ egitim.getEgitim_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       public List<Egitimler> getList() {
        List<Egitimler> list = new ArrayList<>();
        try {
            Statement st = this.getConnection().createStatement();
            String query = "select*from egitimler";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
               list.add(new Egitimler());
            }
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
