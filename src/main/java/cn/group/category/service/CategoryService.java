package cn.group.category.service;

import cn.group.category.pojo.Category;

import java.util.List;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */
public interface CategoryService {


    /**
     * get one
     * @param id
     * @return
     */
    Category get(Integer id);

    /**
     * 全部
     * @return
     */
    List<Category> all();

    /**
     * 添加
     * @param category
     * @return
     */
    Integer insert(Category category);

}
