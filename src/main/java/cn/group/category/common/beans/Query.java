package cn.group.category.common.beans;


/**
 * @author lxd
 */
public class Query implements Page {

    private Integer pageSize = 15;

    private Integer currentPage = 0;

    private int tmp = 0;

    private Long count;

    private String orderByClause;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public Integer getLimit() {
        return getPageSize();
    }

    @Override
    public void setLimit(Integer limit) {
        this.setPageSize(limit);
    }

    @Override
    public Integer getOffset() {
        return getPageSize() * getCurrentPage() + tmp;
    }

    @Override
    public Long getCount() {
        return count;
    }

    @Override
    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public void setOffset(Integer offset) {
        setCurrentPage(offset / getPageSize());
        this.tmp = offset % getPageSize();
    }

    @Override
    public String getOrderByClause() {
        return orderByClause;
    }

    @Override
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    @Override
    public void clear() {
        this.currentPage=0;
        this.pageSize=Integer.MAX_VALUE;
    }
}
