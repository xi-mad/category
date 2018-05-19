package cn.group.category.common.beans;

/**
 *
 * @author lxd
 * @date 2018/3/21
 */
public interface Page {


    /**
     * limit
     * @return
     */
    Integer getLimit();

    /**
     * limit
     * @param limit
     */
    void setLimit(Integer limit);

    /**
     * offset
     * @return
     */
    Integer getOffset();

    /**
     * offset
     * @param offset
     */
    void setOffset(Integer offset);

    /**
     * order
     * @return
     */
    String getOrderByClause();

    /**
     * order
     * @param orderByClause
     */
    void setOrderByClause(String orderByClause);

    /**
     * clear
     */
    void clear();

    /**
     * count
     * @return
     */
    Long getCount();

    /**
     * count
     * @param count
     */
    void setCount(Long count);

}
