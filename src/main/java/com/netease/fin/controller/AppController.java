package com.netease.fin.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	 * 将商家入驻信息入库
	 * http://localhost:8090/guanghe/merchant/process
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/merchant/process",method=RequestMethod.POST)
	public void process(HttpServletRequest request,HttpServletResponse response){
		Merchant merchant = new Merchant(); 
		merchant.setName(request.getParameter("name"));
		merchant.setUrsName(request.getParameter("ursName"));
		merchant.setConcat(request.getParameter("concat"));
		merchant.setEmail(request.getParameter("email"));
		merchant.setMobile(request.getParameter("mobile"));
		
//		System.out.println(request.getParameter("ursname"));
		List<Merchant> list = merchantService.findByName(merchant.getUrsName());
		if(list.size()==0)
			merchantService.create(merchant);
		else
			merchantService.update(merchant);
		
		//设置响应状态码200入库成功
		response.setStatus(200);
	}
	
	@RequestMapping(value="/merchant/show")
	public String show(Map<String,Object> model){
    	Merchant merchant = merchantService.findByName("laldad@126.com").get(0);
    	model.put("ursName", merchant.getUrsName());
    	model.put("concat", merchant.getConcat());
    	model.put("email", merchant.getEmail());
    	model.put("name", merchant.getName());
    	model.put("mobile", merchant.getMobile());
    	model.put("status", merchant.getStatus());
		return "page/accountInfo";
	}
}
