package com.netease.fin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netease.fin.dao.ProductMapper;
import com.netease.fin.model2.Product;

/**
 * 产品服务
 * @author hzsiyaomin
 *
 */
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductMapper productMapper;
	
	
	@Override
	public String createProduct(Product product) {
		int num = productMapper.insertProduct(product);
		return num>0?"success":"fail";
	}

	@Override
	public List<Product> findProductByMerchantId(int merchantId) {
		List<Product> list = productMapper.selectProductByMerchantId(merchantId);
		return list;
	}
	
	
}
