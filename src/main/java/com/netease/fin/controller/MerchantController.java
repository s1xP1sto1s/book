package com.netease.fin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.netease.fin.model2.Merchant;
import com.netease.fin.model2.ValidateInfo;
import com.netease.fin.service.MerchantService;

@Controller
@RequestMapping("/merchant")
public class MerchantController {
	
	@Autowired
	MerchantService merchantService;
	
	/**
	 * 商家入驻
	 * http://localhost:8090/guanghe/merchant/register
	 * @param request
	 * @return
	 */
	@RequestMapping("/register")
	public String register(HttpServletRequest request){
		return "page/account";
	}
	
	/**
	 * 将商家入驻信息入库
	 * http://localhost:8090/guanghe/merchant/process
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/process",method=RequestMethod.POST)
	@ResponseBody
	public ValidateInfo process(@Valid Merchant merchant,BindingResult result){
		
		//TODO 商家账户号不用提交？
	//	merchant.setUrsName(request.getParameter("ursName"));
		merchant.setUrsName("FennLiu");
		
		//数据校验
		//存储校验结果的对象
		ValidateInfo merInfo = new ValidateInfo();
		Map<String,String> errorMap = new HashMap<String,String>();
		if(result.hasErrors()){
			merInfo.setResult("fail");
			List<FieldError> errorList = result.getFieldErrors();
			for(FieldError fe:errorList){
				errorMap.put(fe.getField(), fe.getDefaultMessage());
			}
			merInfo.setErrorMap(errorMap);
		}
		else{
			merInfo.setResult("success");
			//插入或更新商家数据
			List<Merchant> list = merchantService.findByName(merchant.getUrsName());
			if(list.size()==0)
				merchantService.create(merchant);
			else
				merchantService.update(merchant);
		}

		return merInfo;
	}
	
	/**
	 * 由商家名查询商家信息
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/show")
	public String show(HttpServletRequest request,Map<String,Object> model){
		//TODO 获取商家用户名？
//		String ursName = request.getParameter("ursName");
		String ursName = null;
		Cookie[] cks = request.getCookies();
		for(Cookie ck:cks){
			if("ursName".equals(ck.getName())){
				ursName = ck.getValue();
			}
		}
    	Merchant merchant = merchantService.findByName(ursName).get(0);
    	model.put("merchant",merchant);
		return "page/accountInfo";
	}
	
}
