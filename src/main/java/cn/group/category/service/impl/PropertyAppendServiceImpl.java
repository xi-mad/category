package cn.group.category.service.impl;

import cn.group.category.dao.PropertyAppendMapper;
import cn.group.category.pojo.Category;
import cn.group.category.pojo.PropertyAppend;
import cn.group.category.pojo.PropertyAppendExample;
import cn.group.category.pojo.enums.*;
import cn.group.category.service.CategoryService;
import cn.group.category.service.PropertyAppendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static cn.group.category.common.utils.CheckUtil.check;
import static cn.group.category.common.utils.CheckUtil.notEmpty;
import static cn.group.category.common.utils.CheckUtil.notNull;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */
@Service
public class PropertyAppendServiceImpl implements PropertyAppendService {

    @Resource
    private PropertyAppendMapper propertyAppendDao;

    @Resource
    private CategoryService categoryService;

    @Override
    public List<PropertyAppend> getByCategory(Integer id) {
        categoryService.get(id);
        PropertyAppendExample example = new PropertyAppendExample();
        example.createCriteria().andCategoryIdEqualTo(id);
        return propertyAppendDao.selectByExample(example);
    }

    @Override
    public Integer insert(PropertyAppend propertyAppend) {
        notNull(propertyAppend, "param.is.null");
        Category category = categoryService.get(propertyAppend.getCategoryId());
        check(category.getLeaf().equals(Leaf.yes), "category.insert.error");
        notEmpty(propertyAppend.getDisplayName(), "display.name.is.empty");
        check(propertyAppend.getDisplayName().length() <= 50, "display.name.is.too.long");
        notEmpty(propertyAppend.getFieldName(), "field.name.is.empty");
        check(propertyAppend.getFieldName().length() <= 50, "field.name.is.too.long");
        notNull(propertyAppend.getValueType(), "value.type.is.empty");
        check(ValueType.contains(propertyAppend.getValueType()), "value.type.is.error");
        notNull(propertyAppend.getValueLength(), "value.length.is.empty");
        check(propertyAppend.getValueLength() > 0, "value.length.is.error");
        notNull(propertyAppend.getInputType(), "input.type.is.empty");
        check(InputType.contains(propertyAppend.getInputType()), "input.type.is.error");
        notNull(propertyAppend.getDefaultValue(), "default.value.is.error");
        check(propertyAppend.getDefaultValue().length() < 500, "default.value.is.too.long");
        notNull(propertyAppend.getIsRequired(), "required.is.empty");
        check(Required.contains(propertyAppend.getIsRequired()), "required.is.error");
        notNull(propertyAppend.getIsShow(), "show.is.empty");
        check(Show.contains(propertyAppend.getIsShow()), "show.is.error");
        notNull(propertyAppend.getOrders(), "orders.is.empty");

        return propertyAppendDao.insert(propertyAppend);
    }
}
