package cn.group.category.pojo;

import cn.group.category.pojo.enums.Leaf;
import cn.group.category.pojo.enums.Show;

import java.io.Serializable;

/**
 * @author 
 */
public class Category implements Serializable {
    private Integer id;

    private Integer parentId;

    private String categoryName;

    private Integer depth;

    private Leaf leaf;

    private Integer rootId;

    private Integer orders;

    private Show isShow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Leaf getLeaf() {
        return leaf;
    }

    public void setLeaf(Leaf leaf) {
        this.leaf = leaf;
    }

    public Integer getRootId() {
        return rootId;
    }

    public void setRootId(Integer rootId) {
        this.rootId = rootId;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Show getIsShow() {
        return isShow;
    }

    public void setIsShow(Show isShow) {
        this.isShow = isShow;
    }
}