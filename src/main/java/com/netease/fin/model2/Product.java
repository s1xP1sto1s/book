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
	private Integer merchantId;
	private Integer bizId = 0;
	private String productType;
	private String appKey = "";
	
	private String merchantPublicKey = "";
	private String platformPublicKey = "";
	private String platformPrivateKey = "";
	
	private Integer authTplId = 0;
	private String authTplContent = "";
	private Integer serviceTplId = 0;
	private String serviceTplContent = "";
	private String detailPageContent = "";
	private String status = "online";//online,offline,checking
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	public Integer getBizId() {
		return bizId;
	}
	public void setBizId(Integer bizId) {
		this.bizId = bizId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getMerchantPublicKey() {
		return merchantPublicKey;
	}
	public void setMerchantPublicKey(String merchantPublicKey) {
		this.merchantPublicKey = merchantPublicKey;
	}
	public String getPlatformPublicKey() {
		return platformPublicKey;
	}
	public void setPlatformPublicKey(String platformPublicKey) {
		this.platformPublicKey = platformPublicKey;
	}
	public String getPlatformPrivateKey() {
		return platformPrivateKey;
	}
	public void setPlatformPrivateKey(String platformPrivateKey) {
		this.platformPrivateKey = platformPrivateKey;
	}
	public Integer getAuthTplId() {
		return authTplId;
	}
	public void setAuthTplId(Integer authTplId) {
		this.authTplId = authTplId;
	}
	public String getAuthTplContent() {
		return authTplContent;
	}
	public void setAuthTplContent(String authTplContent) {
		this.authTplContent = authTplContent;
	}
	public Integer getServiceTplId() {
		return serviceTplId;
	}
	public void setServiceTplId(Integer serviceTplId) {
		this.serviceTplId = serviceTplId;
	}
	public String getServiceTplContent() {
		return serviceTplContent;
	}
	public void setServiceTplContent(String serviceTplContent) {
		this.serviceTplContent = serviceTplContent;
	}
	public String getDetailPageContent() {
		return detailPageContent;
	}
	public void setDetailPageContent(String detailPageContent) {
		this.detailPageContent = detailPageContent;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
