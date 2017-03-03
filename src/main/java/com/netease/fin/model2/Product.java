package com.netease.fin.model2;

import java.io.Serializable;
import java.util.Map;
/**
 * 产品信息
 * @author hzsiyaomin
 *
 */
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
	//不公开 易被穷举
	private Integer Id;
	private String name;
	private Integer machantId;
	private Integer bizId;
	private String appKey;
	private String appPublicKey;
	private Integer authTplId;
	private Map<String,String> authTplContent;
	private Integer serviceTplId;
	private Map<String,String> serviceTplContent;
	private Map<String,String> detailPageContent;
	private String status;//online,offline,checking


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBizId() {
		return bizId;
	}

	public void setBizId(Integer bizId) {
		this.bizId = bizId;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getAppPublicKey() {
		return appPublicKey;
	}

	public void setAppPublicKey(String appPublicKey) {
		this.appPublicKey = appPublicKey;
	}

	public Integer getAuthTplId() {
		return authTplId;
	}

	public void setAuthTplId(Integer authTplId) {
		this.authTplId = authTplId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getMachantId() {
		return machantId;
	}

	public void setMachantId(Integer machantId) {
		this.machantId = machantId;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Map<String, String> getAuthTplContent() {
		return authTplContent;
	}

	public void setAuthTplContent(Map<String, String> authTplContent) {
		this.authTplContent = authTplContent;
	}

	public Integer getServiceTplId() {
		return serviceTplId;
	}

	public void setServiceTplId(Integer serviceTplId) {
		this.serviceTplId = serviceTplId;
	}

	public Map<String, String> getServiceTplContent() {
		return serviceTplContent;
	}

	public void setServiceTplContent(Map<String, String> serviceTplContent) {
		this.serviceTplContent = serviceTplContent;
	}

	public Map<String, String> getDetailPageContent() {
		return detailPageContent;
	}

	public void setDetailPageContent(Map<String, String> detailPageContent) {
		this.detailPageContent = detailPageContent;
	}
	
}
