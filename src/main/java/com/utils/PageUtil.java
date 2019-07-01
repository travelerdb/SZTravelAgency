package com.utils;

import java.util.List;
import java.util.Map;

/**
 * 分页实体类
 * 
 * @author Sn
 * 
 */
public class PageUtil<T> {

	private List<T> list;// 返回数据信息
	private Integer pageNum;// 当前查询的页数
	private Integer pageCount;// 总页数
	private Long counts;//总行数

	public PageUtil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PageUtil(List<T> list, Integer pageNum, Integer pageCount, Long counts) {
		this.list = list;
		this.pageNum = pageNum;
		this.pageCount = pageCount;
		this.counts = counts;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Long getCounts() {
		return counts;
	}

	public void setCounts(Long counts) {
		this.counts = counts;
	}

	@Override
	public String toString() {
		return "PageUtil{" +
				"list=" + list +
				", pageNum=" + pageNum +
				", pageCount=" + pageCount +
				", counts=" + counts +
				'}';
	}
}
