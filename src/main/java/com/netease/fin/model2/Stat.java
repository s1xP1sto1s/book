package com.netease.fin.model2;

import java.io.Serializable;

public class Stat implements Serializable{
	private static final long serialVersionUID = 1L;
	private int bizId;
	private String appKey;
	private String statType;
	private String statName;
	private long statTime;
	private double val;
	public int getBizId() {
		return bizId;
	}
	public void setBizId(int bizId) {
		this.bizId = bizId;
	}
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getStatType() {
		return statType;
	}
	public void setStatType(String statType) {
		this.statType = statType;
	}
	public String getStatName() {
		return statName;
	}
	public void setStatName(String statName) {
		this.statName = statName;
	}
	public long getStatTime() {
		return statTime;
	}
	public void setStatTime(long statTime) {
		this.statTime = statTime;
	}
	public double getVal() {
		return val;
	}
	public void setVal(double val) {
		this.val = val;
	}
	
}
