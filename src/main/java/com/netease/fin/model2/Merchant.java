package com.netease.fin.model2;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
/**
 * 商户信息
 * @author hzsiyaomin
 *
 */
public class Merchant implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String ursName;
	
	@Size(min=1,max=20,message="长度必须在1到20之间")
	private String name;
	
	@Size(min=1,max=10,message="长度必须在1到10之间")
	private String concat;
	
	@Size(min=11,max=11,message="手机号长度必须为11")
	private String mobile;
	
	@Email(message="请输入正确的邮箱地址")
	private String email;
	
	private String status = "new";//new/authing/pass/fail
	private String enabled = "n";//true false 是否被禁用
	
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
