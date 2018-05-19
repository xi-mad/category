package cn.group.category.pojo.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */
public enum ValueType {

    /**
     * 值类型
     */
    string("字符串"),
    integer("整数"),
    date("日期"),
    bool("逻辑值"),
    f1oat("浮点数");

    private String name;

    private static Map<String, String> map = new HashMap<>();

    ValueType(String name) {
        this.name = name;
    }

    public static Map<String, String> getMap() {
        Arrays.stream(ValueType.values()).forEach(type -> map.put(type.name(), type.getName()));
        return map;
    }

    public static boolean contains(ValueType value) {
        return getMap().keySet().contains(value.name());
    }

    public String getName() {
        return name;
    }
}
