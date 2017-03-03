package com.netease.fin.model;

import java.io.Serializable;
import java.util.List;

/**
 * 业务模型
 * Created by hzsiyaomin on 2017/2/17.
 */
public class Biz implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
    private String bizName;
    private String desc;
    private List<Protocol> protocols;
    public Biz(int id,String bizName,String desc){
    	this.id=id;
    	this.bizName=bizName;
    	this.desc=desc;
    }
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBizName() {
		return bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<Protocol> getProtocols() {
		return protocols;
	}
	public void setProtocols(List<Protocol> protocols) {
		this.protocols = protocols;
	}
    
}
