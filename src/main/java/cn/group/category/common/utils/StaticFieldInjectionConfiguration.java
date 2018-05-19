package cn.group.category.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 * @author lxd
 */
@Component
public class StaticFieldInjectionConfiguration {

    @Autowired
    MessageSource resources;

    @PostConstruct
    private void init() {
        System.out.println("\n\n-----StaticFieldInjectionConfiguration----");
        CheckUtil.setResources(resources);
    }
}