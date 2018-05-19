package cn.group.category.service.impl;

import cn.group.category.dao.CategoryMapper;
import cn.group.category.pojo.Category;
import cn.group.category.pojo.CategoryExample;
import cn.group.category.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static cn.group.category.common.utils.CheckUtil.*;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryDao;


    @Override
    public Category get(Integer id) {
        notNull(id, "param.is.null");
        Category category = categoryDao.selectByPrimaryKey(id);
        notNull(category, "id.error", id);
        return category;
    }

    @Override
    public List<Category> all() {
        return categoryDao.selectByExample(new CategoryExample());
    }

    @Override
    public Integer insert(Category category) {
        notNull(category, "param.is.null");
        //todo check every member

        return categoryDao.insert(category);
    }


}
