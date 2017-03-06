package com.netease.fin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.netease.fin.model2.Product;

@Mapper
public interface ProductMapper {
	void insertProduct(Product product);
	
	void insertManyProduct(List<Product> list);
	
	void updateProdyct(Product product);
	
	void selectProductById(@Param("id") int id);

}
