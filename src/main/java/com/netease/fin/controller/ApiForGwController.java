package com.netease.fin.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netease.fin.api.dto.Response;
import com.netease.fin.model.Protocol;
import com.netease.fin.model.ServiceImportInfo;
import com.netease.fin.service.ConfigService;

@Controller
@RequestMapping(value = "/gw")
public class ApiForGwController {
	@Resource
	private ConfigService configService;
	@RequestMapping(value = "/protocol/{bizId}/{protocolName}")
	@ResponseBody
	  public Response<Protocol> config(@PathVariable int bizId,@PathVariable String protocolName) {
	    Protocol protocol = configService.getProtocol(bizId, protocolName);
	    Response<Protocol> result=new Response<>();
	    result.setBody(protocol);
		return result;
	}
	@RequestMapping("/hi")  
    public String web(HttpServletRequest request,Map<String,Object> model){  
        model.put("time","xxx");  
        model.put("message","xx");  
        request.setAttribute("attr", "abc");
        return "web";//返回的内容就是templetes下面文件的名称  
    }  
}
