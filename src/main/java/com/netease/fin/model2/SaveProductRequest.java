package com.netease.fin.model2;

import java.util.Map;

/**
 * 产品请求
 * @author hzsiyaomin
 *
 */
public class SaveProductRequest extends Request{
	private static final long serialVersionUID = 1L;
	private Integer productId;
	private Integer machantId;
	private String name;
	private Integer bizId;
	private String appKey;
	private String appPrivateKey;
	private String appPublicKey;
	private Integer authTplId;
	private Integer defConfigId;
	private Map<String,String> detailPage;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getMachantId() {
		return machantId;
	}
	public void setMachantId(Integer machantId) {
		this.machantId = machantId;
	}
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
	public String getAppPrivateKey() {
		return appPrivateKey;
	}
	public void setAppPrivateKey(String appPrivateKey) {
		this.appPrivateKey = appPrivateKey;
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
	public Integer getDefConfigId() {
		return defConfigId;
	}
	public void setDefConfigId(Integer defConfigId) {
		this.defConfigId = defConfigId;
	}
	public Map<String, String> getDetailPage() {
		return detailPage;
	}
	public void setDetailPage(Map<String, String> detailPage) {
		this.detailPage = detailPage;
	}
	
	
}
