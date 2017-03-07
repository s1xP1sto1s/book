package com.netease.fin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.netease.fin.model2.Merchant;
/**
 * 商家的持久层接口
 * @author hzlinfeng1
 *
 */
@Mapper
public interface MerchantMapper {
	/**
	 * 单个商户插入
	 * @param merchant
	 * @return
	 */
	int insertMerchant(Merchant merchant);
	
	/**
	 * 一个线程一次插入多个商户
	 * @param list
	 * @return
	 */
	int insertManyMerchant(List<Merchant> list);
	
	/**
	 * 根据商户名称查询
	 * @param name
	 * @return
	 */
	List<Merchant> selectMerchantByName(@Param("name") String name);
	
	/**
	 * 根据用户名称查询
	 * @param name
	 * @return
	 */
	List<Merchant> selectMerchantByUsername(@Param("username") String name);
	
}
