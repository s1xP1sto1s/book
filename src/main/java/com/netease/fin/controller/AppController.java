package com.netease.fin.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netease.fin.model.ServiceImportInfo;
import com.netease.fin.service.ConfigService;

@Controller
@RequestMapping(value = "/ui")
public class AppController {
	@Resource
	private ConfigService configService;
	@RequestMapping(value = "/config")
	@ResponseBody
	  public ServiceImportInfo config() {
	    return configService.getImportInfo();
	  }
	@RequestMapping("/hi")  
    public String web(HttpServletRequest request,Map<String,Object> model){  
        model.put("time","xxx");  
        model.put("message","xx");  
        request.setAttribute("attr", "abc");
        return "web";//返回的内容就是templetes下面文件的名称  
    }  
}
