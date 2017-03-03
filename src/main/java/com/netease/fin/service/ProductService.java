package com.netease.fin.service;

import com.netease.fin.model2.Product;
import com.netease.fin.model2.SaveProductRequest;
import com.netease.fin.model2.UpdateProductAppSecretRequest;

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
	public Product createProduct(SaveProductRequest request);
	/**
	 * 更新app密钥
	 * @param request
	 * @return
	 */
	public Product updateAppSecret(UpdateProductAppSecretRequest request);
	/**
	 * 获取产品私钥
	 * @param appKey
	 * @return
	 */
	public String getProductAppPK(String appKey);

}
