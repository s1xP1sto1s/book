package com.netease.fin.filter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * 会话
 * @author hzsiyaomin
 *
 */
public class LoginCheckInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception exp)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView exp)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object exp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(request.getRequestedSessionId());
		Cookie[] cks = request.getCookies();
		String ckContent=null;
		if (cks!=null) {
			for(Cookie ck:cks){
				if (ck.getName().equals("xxx")) {
					
					break;
				}
			}
		}
		//sessionid == null
		//解析cookie
		//无cookie表示 未登录 需要重新登录
		//cookie失效 需要重新登录
		//request中设置未登录
		//如果是异步请求返回未登录
		//判断 请求是不是ajax 如果是 则返回需要登录的code
		
		return true;
	}

}
