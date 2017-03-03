package com.netease.fin.model;

import java.io.Serializable;
import java.util.List;

/**
 * 服务引入信息
 * 
 * @author hzsiyaomin
 *
 */
public class ServiceImportInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Biz> bizList;
	public List<Biz> getBizList() {
		return bizList;
	}
	public void setBizList(List<Biz> bizList) {
		this.bizList = bizList;
	}

}
