package com.netease.fin.model2;

import java.io.Serializable;
import java.util.Map;

public class ProductInfo implements Serializable {
	private String result;//success|fail|error
	private String errorMsg;//result=error时用到
	private Map<String,String> errorMap;//返回fail的信息
	private String data;
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Map<String, String> getErrorMap() {
		return errorMap;
	}
	public void setErrorMap(Map<String, String> errorMap) {
		this.errorMap = errorMap;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}
