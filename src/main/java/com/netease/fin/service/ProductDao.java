package com.netease.fin.service;

import com.netease.fin.model2.Product;

/**
 * 产品dao
 * @author hzsiyaomin
 *
 */
public interface ProductDao {
	public int insert(Product product);
	public int update(Product product);
	public int getByAppKey(String appKey);
}
