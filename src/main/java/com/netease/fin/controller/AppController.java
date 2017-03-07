package com.netease.fin.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netease.fin.model.ServiceImportInfo;
import com.netease.fin.model2.Merchant;
import com.netease.fin.model2.Product;
import com.netease.fin.service.ConfigService;
import com.netease.fin.service.MerchantService;

@Controller
@RequestMapping(value = "/guanghe")
public class AppController {
	
	@Autowired
	MerchantService merchantService;
	
	@Resource
	private ConfigService configService;
	@RequestMapping(value = "/config")
	@ResponseBody
	  public ServiceImportInfo config(@RequestBody Product product) {
	    return configService.getImportInfo();
	  }
	@RequestMapping("/hi")  
    public String web(HttpServletRequest request,Map<String,Object> model){  	
        model.put("time","xxx");  
        model.put("message","xx");  
        request.setAttribute("attr", "abc");
        return "web";//返回的内容就是templetes下面文件的名称  
    }
	/**
	 * 光合开放平台主页
	 * http://localhost:8090/guanghe/index
	 * @param request
	 * @return
	 */
	@RequestMapping("/index")
	public String index(HttpServletRequest request){
		return "page/index";
	}
	
	/**
	 * 商家入驻
	 * http://localhost:8090/guanghe/merchant/register
	 * @param request
	 * @return
	 */
	@RequestMapping("/merchant/register")
	public String register(HttpServletRequest request){
		return "page/account";
	}
	
	/**
	 * 处理商家入驻信息
	 * http://localhost:8090/guanghe/merchant/process
	 * @param request
	 * @return
	 */
	@RequestMapping("/merchant/process")
	public String process(HttpServletRequest request){
		return "web";
	}
}
