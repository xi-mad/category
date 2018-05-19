package cn.group.category.service;

import cn.group.category.pojo.Product;

import java.util.List;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */
public interface ProductService {
    /**
     * 添加
     * @param product
     * @return
     */
    Integer insert(Product product);

    /**
     * 查询
     * @param id
     * @return
     */
    List<Product> getByCategory(Integer id);
}
