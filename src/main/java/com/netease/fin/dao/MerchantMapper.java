package com.netease.fin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.netease.fin.model2.Merchant;

@Mapper
public interface MerchantMapper {
	
	void insertMerchant(Merchant merchant);
	
	void insertManyMerchant(List<Merchant> list);
	
}
