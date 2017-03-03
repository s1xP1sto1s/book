package com.netease.fin.model2;

import java.io.Serializable;
/**
 * 商户信息
 * @author hzsiyaomin
 *
 */
public class Marchant implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String ursName;
	private String name;
	private String concat;
	private String mobile;
	private String email;
	private String status;//new/authing/pass/fail
	private String enabled;//true false 是否被禁用
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	
}
