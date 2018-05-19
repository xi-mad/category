package cn.group.category.pojo.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */

public enum Required {

    /**
     * 是否必填
     */
    yes("是"), no("否");

    private String name;

    private static Map<String, String> map = new HashMap<>();

    Required(String name) {
        this.name = name;
    }

    public static Map<String, String> getMap() {
        Arrays.stream(Required.values()).forEach(type -> map.put(type.name(), type.getName()));
        return map;
    }

    public static boolean contains(Required value) {
        return getMap().keySet().contains(value.name());
    }

    public String getName() {
        return name;
    }
}
