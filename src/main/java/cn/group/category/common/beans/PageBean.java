package cn.group.category.common.beans;

/**
 *
 * @author lxd
 * @date 2018/3/21
 */
public class PageBean<T> {

    private T rows;

    private long total;

    public PageBean(T rows, long total) {
        super();
        this.rows = rows;
        this.total = total;
    }

    public T getRows() {
        return rows;
    }

    public void setRows(T rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
