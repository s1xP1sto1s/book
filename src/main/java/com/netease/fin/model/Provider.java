package com.netease.fin.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hzsiyaomin on 2017/2/17.
 */
@JsonIgnoreProperties({"protocol"}) 
public class Provider implements Serializable {
	private static final long serialVersionUID = 1L;
	private Protocol protocol;
    private String name;
    private String desc;
    private String url;
    private String[] ipPorts;
    private String status;
    private String balance;

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

	public Protocol getProtocol() {
		return protocol;
	}

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String[] getIpPorts() {
		return ipPorts;
	}

	public void setIpPorts(String[] ipPorts) {
		this.ipPorts = ipPorts;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
}
