package com.netease.fin.model2;

import java.io.Serializable;
import java.util.List;

public class ProductConfig implements Serializable {
	private static final long serialVersionUID = 1L;
	private int bizType;
	private String title;
	private List<Select> selectList;

	public int getBizType() {
		return bizType;
	}

	public void setBizType(int bizType) {
		this.bizType = bizType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Select> getSelectList() {
		return selectList;
	}

	public void setSelectList(List<Select> selectList) {
		this.selectList = selectList;
	}
	public static class Select implements Serializable {

		private static final long serialVersionUID = 1L;
		private String title;
		private String name;
		private List<Option> options;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public List<Option> getOptions() {
			return options;
		}

		public void setOptions(List<Option> options) {
			this.options = options;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	public static class Option implements Serializable {

		private static final long serialVersionUID = 1L;
		public Option(){}
		public Option(String title,String value){
			this.title=title;
			this.value=value;
		}
		private String title;
		private String value;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}

}

