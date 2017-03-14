package com.netease.fin.service;

import java.util.List;

import com.netease.fin.model2.Product;


/**
 * 产品服务
 * 
 * @author hzsiyaomin
 *
 */
public interface ProductService {
	/**
	 * 创建产品
	 * 
	 * @return
	 */
	String createProduct(Product product);

	/**
	 * 由商户Id查询商户的产品
	 * @param merchantId
	 * @return
	 */
	List<Product> findProductByMerchantId(int merchantId);
}
