package com.netease.fin.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hzsiyaomin on 2017/2/17.
 */
@JsonIgnoreProperties({"biz"}) 
public class Protocol implements Serializable {
	private static final long serialVersionUID = 1L;
	private Biz biz; 			// 所属业务
	private Integer bizId;
	private String name; 		// 协议名，接口名
	private String paramDemo; 	// 参数
	private String desc; 		// 协议描述
	private List<Provider> providers;	//服务提供者
	public void addProvider(Provider provider){
		if(providers==null){
			providers=new ArrayList<>();
			providers.add(provider);
		}
	}
	public Biz getBiz() {
		return biz;
	}

	public void setBiz(Biz biz) {
		this.biz = biz;
		this.bizId=biz.getId();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParamDemo() {
		return paramDemo;
	}

	public void setParamDemo(String paramDemo) {
		this.paramDemo = paramDemo;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}
	public Integer getBizId() {
		return bizId;
	}
	public void setBizId(Integer bizId) {
		this.bizId = bizId;
	}

}
