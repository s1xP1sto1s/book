package com.netease.fin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.netease.fin.model2.Product;

@Mapper
public interface ProductMapper {
	/**
	 * 插入一个商品
	 * @param product
	 * @return
	 */
	int insertProduct(Product product);
	
	/**
	 * 一个线程同时插入多个商品
	 * @param list
	 * @return
	 */
	int insertManyProduct(List<Product> list);
	
	/**
	 * 更新商品
	 * @param product
	 * @return
	 */
	int updateProduct(Product product);
	
	/**
	 * 根据商品名查询商品
	 * @param name
	 * @return
	 */
	List<Product> selectProductByMerchantId(@Param("merchantId") int merchantId);
	
	/**
	 * 根据商品名称删除商品
	 * @param name
	 * @return
	 */
	public int deleteProductByName(@Param("name") String name);

}
