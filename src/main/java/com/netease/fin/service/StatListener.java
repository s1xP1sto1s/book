package com.netease.fin.service;

import java.io.IOException;
import java.util.Calendar;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netease.fin.model2.Stat;

/**
 * 统计数据监听
 * 
 * @author hzsiyaomin
 *
 */
public class StatListener {
	public static void main(String[] args) throws IOException {
		Stat stat = new Stat();
		stat.setAppKey("abcd");
		stat.setBizId(0);
		stat.setStatName("提交进件量");
		stat.setStatTime(Calendar.getInstance().getTimeInMillis());
		stat.setStatType("loan.apply.submit.entrence");
		stat.setVal(1);
		new ObjectMapper().getFactory().createGenerator(System.out).writeObject(stat);
	}
}
