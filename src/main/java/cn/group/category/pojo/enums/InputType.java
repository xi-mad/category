package cn.group.category.pojo.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lxd
 * @date 2018/5/8
 */

public enum InputType {
    /**
     * 输入类型
     */
    radio("单选框"),
    text("文本框"),
    checkbox("复选框"),
    select("下拉框"),
    textarea("文本域");

    private String name;

    private static Map<String, String> map = new HashMap<>();

    InputType(String name) {
        this.name = name;
    }

    public static Map<String, String> getMap() {
        Arrays.stream(InputType.values()).forEach(type -> map.put(type.name(), type.getName()));
        return map;
    }

    public static boolean contains(InputType value) {
        return getMap().keySet().contains(value.name());
    }

    public String getName() {
        return name;
    }
}
