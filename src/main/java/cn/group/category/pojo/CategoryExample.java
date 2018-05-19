package cn.group.category.pojo;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andDepthIsNull() {
            addCriterion("depth is null");
            return (Criteria) this;
        }

        public Criteria andDepthIsNotNull() {
            addCriterion("depth is not null");
            return (Criteria) this;
        }

        public Criteria andDepthEqualTo(Integer value) {
            addCriterion("depth =", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotEqualTo(Integer value) {
            addCriterion("depth <>", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthGreaterThan(Integer value) {
            addCriterion("depth >", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthGreaterThanOrEqualTo(Integer value) {
            addCriterion("depth >=", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthLessThan(Integer value) {
            addCriterion("depth <", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthLessThanOrEqualTo(Integer value) {
            addCriterion("depth <=", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthIn(List<Integer> values) {
            addCriterion("depth in", values, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotIn(List<Integer> values) {
            addCriterion("depth not in", values, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthBetween(Integer value1, Integer value2) {
            addCriterion("depth between", value1, value2, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotBetween(Integer value1, Integer value2) {
            addCriterion("depth not between", value1, value2, "depth");
            return (Criteria) this;
        }

        public Criteria andLeafIsNull() {
            addCriterion("leaf is null");
            return (Criteria) this;
        }

        public Criteria andLeafIsNotNull() {
            addCriterion("leaf is not null");
            return (Criteria) this;
        }

        public Criteria andLeafEqualTo(String value) {
            addCriterion("leaf =", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotEqualTo(String value) {
            addCriterion("leaf <>", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThan(String value) {
            addCriterion("leaf >", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThanOrEqualTo(String value) {
            addCriterion("leaf >=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThan(String value) {
            addCriterion("leaf <", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThanOrEqualTo(String value) {
            addCriterion("leaf <=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLike(String value) {
            addCriterion("leaf like", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotLike(String value) {
            addCriterion("leaf not like", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafIn(List<String> values) {
            addCriterion("leaf in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotIn(List<String> values) {
            addCriterion("leaf not in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafBetween(String value1, String value2) {
            addCriterion("leaf between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotBetween(String value1, String value2) {
            addCriterion("leaf not between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andRootIdIsNull() {
            addCriterion("root_id is null");
            return (Criteria) this;
        }

        public Criteria andRootIdIsNotNull() {
            addCriterion("root_id is not null");
            return (Criteria) this;
        }

        public Criteria andRootIdEqualTo(Integer value) {
            addCriterion("root_id =", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotEqualTo(Integer value) {
            addCriterion("root_id <>", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdGreaterThan(Integer value) {
            addCriterion("root_id >", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("root_id >=", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLessThan(Integer value) {
            addCriterion("root_id <", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLessThanOrEqualTo(Integer value) {
            addCriterion("root_id <=", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdIn(List<Integer> values) {
            addCriterion("root_id in", values, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotIn(List<Integer> values) {
            addCriterion("root_id not in", values, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdBetween(Integer value1, Integer value2) {
            addCriterion("root_id between", value1, value2, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotBetween(Integer value1, Integer value2) {
            addCriterion("root_id not between", value1, value2, "rootId");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Integer value) {
            addCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Integer value) {
            addCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Integer value) {
            addCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Integer value) {
            addCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Integer> values) {
            addCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Integer> values) {
            addCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Integer value1, Integer value2) {
            addCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(String value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(String value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(String value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(String value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(String value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(String value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLike(String value) {
            addCriterion("is_show like", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotLike(String value) {
            addCriterion("is_show not like", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<String> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<String> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(String value1, String value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(String value1, String value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}