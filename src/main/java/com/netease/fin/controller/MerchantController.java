package com.netease.fin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.netease.fin.model2.Merchant;
import com.netease.fin.model2.MerchantInfo;
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
	public MerchantInfo process(HttpServletRequest request,HttpServletResponse response){
		Merchant merchant = new Merchant(); 
		merchant.setName(request.getParameter("name"));
		merchant.setUrsName(request.getParameter("ursName"));
		merchant.setConcat(request.getParameter("concat"));
		merchant.setEmail(request.getParameter("email"));
		merchant.setMobile(request.getParameter("mobile"));
		
		//TODO 数据校验		
		List<Merchant> list = merchantService.findByName(merchant.getUrsName());
		if(list.size()==0)
			merchantService.create(merchant);
		else
			merchantService.update(merchant);
		
		Map<String,String> errorMap = new HashMap<String,String>();
		errorMap.put("ursName", "不合法");
		errorMap.put("email", "不合法");
		MerchantInfo merInfo = new MerchantInfo();
		merInfo.setData("fail");
		merInfo.setErrorMap(errorMap);
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
//		String ursName = request.getParameter("ursName");
		String ursName = "lin";
    	Merchant merchant = merchantService.findByName(ursName).get(0);
    	model.put("id", merchant.getId());
    	model.put("ursName", merchant.getUrsName());
    	model.put("concat", merchant.getConcat());
    	model.put("email", merchant.getEmail());
    	model.put("name", merchant.getName());
    	model.put("mobile", merchant.getMobile());
    	model.put("status", merchant.getStatus());
    	model.put("enabled", merchant.getEnabled());
		return "page/accountInfo";
	}
	
//	@RequestMapping(value="/test")
//	public String test(HttpServletRequest request){
////		String ursName = request.getParameter("ursName");
//		String ursName = "lin";
//    	Merchant merchant = merchantService.findByName(ursName).get(0);
//    	ModelAndView mav = new ModelAndView();
//    	mav.addObject("id", merchant.getId());
//    	mav.addObject("ursName", merchant.getUrsName());
//    	mav.addObject("concat", merchant.getConcat());
//    	mav.addObject("email", merchant.getEmail());
//    	mav.addObject("name", merchant.getName());
//    	mav.addObject("mobile", merchant.getMobile());
//    	mav.addObject("status", merchant.getStatus());
//    	mav.addObject("enabled", merchant.getEnabled());
//		return "page/accountInfo";
//	}
}
