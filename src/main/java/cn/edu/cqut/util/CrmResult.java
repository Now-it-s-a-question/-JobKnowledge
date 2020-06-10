package cn.edu.cqut.util;

import java.util.List;

public class CrmResult<E> {
	private Integer code;
	private String msg;
	private Long count;
	private List<E> EntityList;
	private E entity;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public List<E> getEntityList() {
		return EntityList;
	}
	public void setEntityList(List<E> entityList) {
		this.EntityList = entityList;
	}

	public E getEntity() {
		return entity;
	}

	public void setEntity(E entity) {
		this.entity = entity;
	}
}
