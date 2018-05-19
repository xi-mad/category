package cn.group.category.controller;

import cn.group.category.common.beans.ResultBean;
import cn.group.category.pojo.PropertyAppend;
import cn.group.category.service.PropertyAppendService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */
@RestController
@RequestMapping("/property")
public class PropertyAppendController {

    @Resource
    private PropertyAppendService propertyAppendService;

    @GetMapping("/category")
    public ResultBean category(@RequestParam("id") Integer id) {
        return new ResultBean<>(propertyAppendService.getByCategory(id));
    }

    @PostMapping("/add")
    public ResultBean add(PropertyAppend propertyAppend) {
        return new ResultBean<>(propertyAppendService.insert(propertyAppend));
    }
}
