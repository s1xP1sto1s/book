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
	
	/**
	 * 光合开放平台主页
	 * http://localhost:8090/guanghe/index
	 * @param request
	 * @return
	 */
	@RequestMapping("/")
	public String index(HttpServletRequest request){
		return "page/index";
	}
	
}
