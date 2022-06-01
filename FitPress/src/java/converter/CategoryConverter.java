package converter;

import dao.CategoryDAO;
import entity.Category;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
@FacesConverter("categoryConverter")
public class CategoryConverter implements Converter {

    private CategoryDAO categoryDao;

    public CategoryDAO getCategoryDao() {
        if (categoryDao == null) {
            this.categoryDao = new CategoryDAO();
        }
        return categoryDao;
    }

    public void setCategoryDao(CategoryDAO categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        int id = Integer.valueOf(string);
        Category c = this.getCategoryDao().findByID(id);
        return c;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        Category c = (Category) t;
        return String.valueOf(c.getCategory_id());
    }

}
