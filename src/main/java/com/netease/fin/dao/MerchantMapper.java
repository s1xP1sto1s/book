package com.netease.fin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.netease.fin.model2.Merchant;

@Mapper
public interface MerchantMapper {
	
	int insertMerchant(Merchant merchant);
	
	int insertManyMerchant(List<Merchant> list);
	
	List<Merchant> selectMerchantByName(@Param("name") String name);
	
}
