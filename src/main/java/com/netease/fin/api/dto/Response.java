package com.netease.fin.api.dto;

import java.io.Serializable;

/**
 * web响应
 * 
 * @author hzsiyaomin
 *
 */
public class Response<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	public Response() {
	}

	public Response(int code, String msg, T body) {
		this.code = code;
		this.msg = msg;
		this.body = body;
	}

	private int code;
	private String msg;
	private T body;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

}
