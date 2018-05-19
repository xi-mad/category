package cn.group.category.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author 
 */

public class Product implements Serializable {
    private Integer id;

    private Integer categoryId;

    private String name;

    private List<Category> appends;

    private String append;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getAppends() {
        return appends;
    }

    public void setAppends(List<Category> appends) {
        this.appends = appends;
    }

    public String getAppend() {
        return append;
    }

    public void setAppend(String append) {
        this.append = append;
    }
}