/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.CategoryDAO;
import entity.Category;
import jakarta.inject.Named;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "categoryBean")
@SessionScoped
public class CategoryBean implements Serializable{

    private Category entity;
    private CategoryDAO dao;
    private List<Category> list;

    public CategoryBean() {
    }

    public Category getEntity() {
        if (entity == null) {
            entity = new Category();
        }
        return entity;
    }

    public void setEntity(Category entity) {
        this.entity = entity;
    }

    public String getIsim(int id) {
        Category c = this.getDao().findByID(id);
        return c.getIsim();
    }

    public CategoryDAO getDao() {
        if (dao == null) {
            dao = new CategoryDAO();
        }
        return dao;
    }

    public void setDao(CategoryDAO dao) {
        this.dao = dao;
    }

    public List<Category> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<Category> list) {
        this.list = list;
    }

    public void create() {
        this.getDao().create(entity);
        entity = new Category();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new Category();
    }

    public void clear() {
        entity = new Category();
    }

    public void delete(Category c) {
        this.getDao().delete(c);

    }

}
