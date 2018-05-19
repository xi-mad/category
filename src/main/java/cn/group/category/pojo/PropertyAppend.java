package cn.group.category.pojo;

import cn.group.category.pojo.enums.*;
import java.io.Serializable;

/**
 * @author 
 */

public class PropertyAppend implements Serializable {
    private Integer id;

    private Integer categoryId;

    private String displayName;

    private String fieldName;

    private ValueType valueType;

    private Integer valueLength;

    private InputType inputType;

    private String defaultValue;

    private UseDefault useDefault;

    private Required isRequired;

    private Show isShow;

    private Integer orders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    public Integer getValueLength() {
        return valueLength;
    }

    public void setValueLength(Integer valueLength) {
        this.valueLength = valueLength;
    }

    public InputType getInputType() {
        return inputType;
    }

    public void setInputType(InputType inputType) {
        this.inputType = inputType;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public UseDefault getUseDefault() {
        return useDefault;
    }

    public void setUseDefault(UseDefault useDefault) {
        this.useDefault = useDefault;
    }

    public Required getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Required isRequired) {
        this.isRequired = isRequired;
    }

    public Show getIsShow() {
        return isShow;
    }

    public void setIsShow(Show isShow) {
        this.isShow = isShow;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }
}