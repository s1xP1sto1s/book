package com.netease.fin.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netease.fin.dao.MerchantMapper;
import com.netease.fin.model2.CreateMarchantRequest;
import com.netease.fin.model2.Merchant;

@Service
public class MerchantServiceImpl implements MerchantService {
	
	@Autowired
	MerchantMapper merchantMapper;

	@Override
	public String create(Merchant merchant){
		int num = merchantMapper.insertMerchant(merchant);
		return num>0?"success":"faled";
	}

	@Override
	public List<Merchant> findByName(String username) {
		List<Merchant> list = merchantMapper.selectMerchantByUsername(username);
		return list;
	}

	@Override
	public String update(Merchant merchant) {
		int num = merchantMapper.updateMerchant(merchant);
		return num>0?"success":"faled";
	}

}
