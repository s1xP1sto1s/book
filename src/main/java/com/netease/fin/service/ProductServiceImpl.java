package com.netease.fin.service;

import com.netease.fin.model2.Product;
import com.netease.fin.model2.SaveProductRequest;
import com.netease.fin.model2.UpdateProductAppSecretRequest;
/**
 * 产品服务
 * @author hzsiyaomin
 *
 */
public class ProductServiceImpl implements ProductService{

	@Override
	public Product createProduct(SaveProductRequest request) {
		// TODO Auto-generated method stub
		//生成appkey apppublickey appprivate key
		request.setAppKey("");//宽度为6的随机字符串
		request.setAppPrivateKey("");
		request.setAppPrivateKey("");//rsa
		//save to db
		
		Product res=new Product();
		return res;
	}

	@Override
	public Product updateAppSecret(UpdateProductAppSecretRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProductAppPK(String appKey) {
		// TODO Auto-generated method stub
		return null;
	}

}
