package com.netease.fin.model2;

import java.io.Serializable;

public class AccountStatus implements Serializable {
	private boolean regist = false;//用户是否注册
	private boolean identification = false;//商家是否入驻
	
	public boolean isRegist() {
		return regist;
	}
	public void setRegist(boolean regist) {
		this.regist = regist;
	}
	public boolean isIdentification() {
		return identification;
	}
	public void setIdentification(boolean identification) {
		this.identification = identification;
	}
	
}
