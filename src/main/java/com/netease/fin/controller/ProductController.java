package com.netease.fin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netease.fin.model2.Product;
import com.netease.fin.model2.ValidateInfo;
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
	public ValidateInfo process(@Valid Product product,BindingResult result){

		//TODO 获得商家ID
//		product.setMerchantId(Integer.parseInt(request.getParameter("merchantId")));
		product.setMerchantId(20);
		
		//数据校验
		//存储校验结果的对象
		ValidateInfo proInfo = new ValidateInfo();
		Map<String,String> errorMap = new HashMap<String,String>();
		if(result.hasErrors()){
			proInfo.setResult("fail");
			List<FieldError> errorList = result.getFieldErrors();
			for(FieldError fe:errorList){
				errorMap.put(fe.getField(), fe.getDefaultMessage());
			}
			proInfo.setErrorMap(errorMap);
		}
		else{
			proInfo.setResult("success");
			productService.createProduct(product);
		}
		return proInfo;
	}
}
