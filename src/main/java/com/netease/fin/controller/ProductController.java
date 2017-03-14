package com.netease.fin.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netease.fin.model2.Product;
import com.netease.fin.model2.ProductInfo;
import com.netease.fin.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	/**
	 * 根据商户Id查询产品
	 * @param request
	 * @return
	 */
	@RequestMapping("/manager")
	public String manager(HttpServletRequest request,Map<String,Object> model){
//		int merchantId = Integer.parseInt(request.getParameter("merchantId"));
		List<Product> product = productService.findProductByMerchantId(20);
		model.put("product", product);
		return "page/product";
	}
	
		
	/**
	 * 创建产品页面
	 * @return
	 */
	@RequestMapping("/addProduct")
	public String addProduct(){
		return "page/addProduct";
	}
	
	
	/**
	 * 商家数据入库
	 * @param request
	 * @return
	 */
	@RequestMapping("/process")
	@ResponseBody
	public ProductInfo process(HttpServletRequest request){
		Product product = new Product();
		product.setName(request.getParameter("name"));
		//TODO 获得商家ID
//		product.setMerchantId(Integer.parseInt(request.getParameter("merchantId")));
		product.setMerchantId(20);
		product.setProductType(request.getParameter("productType"));
		//TODO 数据校验
		productService.createProduct(product);
		return new ProductInfo();
	}
}
