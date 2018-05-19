package cn.group.category.controller;

import cn.group.category.common.beans.ResultBean;
import cn.group.category.pojo.Category;
import cn.group.category.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @GetMapping("/get")
    public ResultBean get(@RequestParam("id") Integer id) {
        return new ResultBean<>(categoryService.get(id));
    }

    @GetMapping("/all")
    public ResultBean all() {
        return new ResultBean<>(categoryService.all());
    }

    @PostMapping("/insert")
    public ResultBean insert(Category category) {
        return new ResultBean<>(categoryService.insert(category));
    }
}
