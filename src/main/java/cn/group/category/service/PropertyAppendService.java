package cn.group.category.service;

import cn.group.category.pojo.PropertyAppend;

import java.util.List;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */
public interface PropertyAppendService {

    /**
     * select
     * @param id
     * @return
     */
    List<PropertyAppend> getByCategory(Integer id);

    /**
     * insert
     * @param propertyAppend
     * @return
     */
    Integer insert(PropertyAppend propertyAppend);
}
