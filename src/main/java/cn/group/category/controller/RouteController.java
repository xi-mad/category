package cn.group.category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */
@Controller
public class RouteController {
    @RequestMapping("/category/view")
    public String view() {
        return "pages/category/view";
    }

    @RequestMapping("/category/node/attr")
    public String nodeAttr() {
        return "pages/category/node/attr";
    }

    @RequestMapping("/product/view")
    public String add(@RequestParam("id") Integer id) {
        return "pages/product/view";
    }
}
