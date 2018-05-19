package cn.group.category.service.impl;

import cn.group.category.dao.ProductMapper;
import cn.group.category.pojo.Category;
import cn.group.category.pojo.Product;
import cn.group.category.pojo.ProductExample;
import cn.group.category.pojo.PropertyAppend;
import cn.group.category.pojo.enums.*;
import cn.group.category.service.CategoryService;
import cn.group.category.service.ProductService;
import cn.group.category.service.PropertyAppendService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static cn.group.category.common.utils.CheckUtil.*;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productDao;

    @Resource
    private CategoryService categoryService;

    @Resource
    private PropertyAppendService propertyAppendService;

    @Override
    public Integer insert(Product product) {
        verifyProduct(product);
        return productDao.insert(product);
    }

    private void verifyProduct(Product product) {
        notNull(product, "param.is.null");
        notNull(product.getCategoryId(), "product.category.id.is.empty");

        Category category = categoryService.get(product.getCategoryId());
        check(category.getLeaf().equals(Leaf.yes), "category.insert.error");

        List<PropertyAppend> byCategory = propertyAppendService.getByCategory(product.getCategoryId());
        Map<Integer, PropertyAppend> map = new HashMap<>((int) (byCategory.size() / 0.75));
        byCategory.forEach(p -> map.put(p.getId(), p));

        notEmpty(product.getName(), "product.name.is.empty");
        check(product.getName().length() < 50, "product.attr.is.too.long", "商品名称");
        notEmpty(product.getAppend(), "product.append.is.empty");

        JSONObject jsonObject = JSONObject.parseObject(product.getAppend());
        jsonObject.forEach((k, v) -> {
            PropertyAppend propertyAppend = map.get(Integer.parseInt(k));
            if (propertyAppend.getIsRequired().equals(Required.yes)) {
                switch (propertyAppend.getInputType()) {
                    case text:
                        handlerTextInput(propertyAppend, v);
                        break;
                    case textarea:
                        handlerTextInput(propertyAppend, v);
                        break;
                    case select:
                        handlerTextInput(propertyAppend, v);
                        break;
                    case radio:
                        handlerTextInput(propertyAppend, v);
                        break;
                    case checkbox:
                        handlerCheckboxInput(propertyAppend, v);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    private void handlerCheckboxInput(PropertyAppend propertyAppend, Object v) {
        Set<String> val = Stream.of(((String) v).split("\\|")).collect(Collectors.toSet());
        val.forEach(test -> handlerTextInput(propertyAppend, test));
    }

    private void handlerTextInput(PropertyAppend propertyAppend, Object v) {

        boolean useDefault = propertyAppend.getUseDefault().equals(UseDefault.yes);
        Set<String> collect = null;
        if (useDefault) {
            collect = Stream.of(propertyAppend.getDefaultValue().split(",")[1].split("\\|")).collect(Collectors.toSet());
        }
        switch (propertyAppend.getValueType()) {
            case bool:
                if (useDefault) {
                    check(collect.contains(v), "product.attr.is.error", propertyAppend.getDisplayName());
                }
                break;
            case date:
                check(isDate((String) v), "product.attr.is.error", propertyAppend.getDisplayName());
                break;
            case f1oat:
                try {
                    Float f = Float.valueOf((String) v);
                    check(f > 0, "product.attr.is.error", propertyAppend.getDisplayName());
                } catch (Throwable s) {
                    fail("product.attr.is.error", propertyAppend.getDisplayName());
                }
                break;
            case string:
                String s = (String) v;
                notEmpty(s, "product.attr.is.empty", propertyAppend.getDisplayName());
                if (useDefault) {
                    check(collect.contains(v), "product.attr.is.error", propertyAppend.getDisplayName());
                }
                check(s.length() < propertyAppend.getValueLength(), "product.attr.is.too.long", propertyAppend.getDisplayName());
                break;
            case integer:
                try {
                    Integer.valueOf((String) v);
                } catch (Throwable s1) {
                    fail("product.attr.is.error", propertyAppend.getDisplayName());
                }
                break;
            default:
                break;
        }
    }

    @Override
    public List<Product> getByCategory(Integer id) {
        categoryService.get(id);
        ProductExample example = new ProductExample();
        example.createCriteria().andCategoryIdEqualTo(id);
        List<Product> products = productDao.selectByExampleWithBLOBs(example);
        handler(products);
        return products;
    }

    private void handler(List<Product> products) {}

    private boolean isDate(String date)
    {
        String regex = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";

        Pattern pat = Pattern.compile(regex);

        Matcher mat = pat.matcher(date);

        return mat.matches();
    }
}
