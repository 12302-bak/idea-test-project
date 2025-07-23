package _framework.mybatis.interceptors.page;

import java.util.ArrayList;

/**
 * <dl>
 * <dt>PageList</dt>
 * <dd>Description:分页集合</dd>
 * </dl>
 */
public class PageList<E> extends ArrayList<E> {
	private static final long serialVersionUID = -3048177108454143126L;

	public final static int DEFAULT_PAGE_SIZE = 15; // 默认分页大小

	private int pageNumber; // 第几页

	private int pageSize; // 每页页数

	private int total; // 总条数

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
