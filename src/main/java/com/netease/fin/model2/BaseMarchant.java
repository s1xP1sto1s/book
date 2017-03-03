package com.netease.fin.model2;

import java.io.Serializable;

public class BaseMarchant implements Serializable{
	protected Integer id;
	protected String ursName;
	protected String name;
	protected String concat;
	protected String mobile;
	protected String email;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUrsName() {
		return ursName;
	}
	public void setUrsName(String ursName) {
		this.ursName = ursName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getConcat() {
		return concat;
	}
	public void setConcat(String concat) {
		this.concat = concat;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
