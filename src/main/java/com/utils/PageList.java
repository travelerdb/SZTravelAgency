package com.utils;

import java.util.List;

public class PageList {
	//总行数
	private Long total;
	//显示的数据
	private List rows;
	
	public PageList(){}

	public PageList(Long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageList [total=" + total + ", rows=" + rows + "]";
	}
	
	
}
