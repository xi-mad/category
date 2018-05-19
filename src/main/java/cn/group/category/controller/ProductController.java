package cn.group.category.controller;

import cn.group.category.common.beans.ResultBean;
import cn.group.category.pojo.Product;
import cn.group.category.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;


    @PostMapping("/add")
    public ResultBean add(Product product) {
        return new ResultBean<>(productService.insert(product));
    }


    @GetMapping("/category")
    public ResultBean category(@RequestParam("id") Integer id) {
        return new ResultBean<>(productService.getByCategory(id));
    }
}
