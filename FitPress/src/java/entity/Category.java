
package entity;

public class Category {
    private String isim;
    private int category_id;

    public Category() {
    }

    public Category(String isim, int category_id) {
        this.isim = isim;
        this.category_id = category_id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
    
}
