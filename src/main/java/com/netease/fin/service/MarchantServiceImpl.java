package com.netease.fin.service;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netease.fin.model2.CreateMarchantRequest;
import com.netease.fin.model2.Marchant;

public class MarchantServiceImpl implements MarchantService {
	public static void main(String[] args) throws IOException {
		new MarchantServiceImpl().create(null);
	}

	@Override
	public Marchant create(CreateMarchantRequest request) throws IOException {
		// TODO Auto-generated method stub
		Marchant marchant = new Marchant();
		marchant.setConcat("张三");
		marchant.setEmail("35066546@163.com");
		marchant.setEnabled("y");
		marchant.setId(0);
		marchant.setMobile("13212128888");
		marchant.setName("商户A");
		marchant.setStatus("authing");
		marchant.setUrsName("urs@126.com");
		new ObjectMapper().getFactory().createGenerator(System.out).writeObject(marchant);
		return null;
	}

}
