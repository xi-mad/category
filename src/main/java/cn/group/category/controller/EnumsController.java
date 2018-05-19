package cn.group.category.controller;

import cn.group.category.common.beans.ResultBean;
import cn.group.category.pojo.enums.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */
@RestController
@RequestMapping("/enum")
public class EnumsController {

    @GetMapping("/input/type")
    public ResultBean inputType() {
        return new ResultBean<>(InputType.getMap());
    }

    @GetMapping("/value/type")
    public ResultBean valueType() {
        return new ResultBean<>(ValueType.getMap());
    }

    @GetMapping("/required")
    public ResultBean required() {
        return new ResultBean<>(Required.getMap());
    }

    @GetMapping("/show")
    public ResultBean show() {
        return new ResultBean<>(Show.getMap());
    }

    @GetMapping("/use/default")
    public ResultBean useDefault() {
        return new ResultBean<>(UseDefault.getMap());
    }


}
