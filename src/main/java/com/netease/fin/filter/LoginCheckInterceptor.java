package com.netease.fin.filter;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.netease.fin.model2.ValidateInfo;
import com.netease.urs.ntescode;

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
				if (ck.getName().equals("NTES_SESS")) {
					ckContent = ck.getValue();
					ntescode n = new ntescode();
					int ret = n.validate_cookie(ckContent.getBytes(),8,2400,false);
					if(ret<=0){
						//cookie失效，需要重新登陆
						response.sendRedirect("/login");
						return false;
						//request中设置未登录
						//如果是异步请求返回未登录
						//判断 请求是不是ajax 如果是 则返回需要登录的code
					}
					else{
						//cookie有效，ip校验
						String userip = new String(n.p_uid);
						String removeip = request.getRemoteAddr();
						if(userip!=null && userip.equals(removeip)){
							//ip校验通过
							return true;
						}
						else{
							//ip校验失败
							response.sendRedirect("/login");
							return false;
						}
					}
				}
			}
		}
		//无"NTES_SESS"cookie，说明未登陆，需要重新登陆
//		response.sendRedirect("/login");
		ValidateInfo vi = new ValidateInfo();
		vi.setResult("fail");
		Map<String,String> map = new HashMap<String,String>();
		map.put("say","666");
		vi.setErrorMap(map);
//		String json = JSONObject.;
//		response.getWriter().println(json);
		return false;
	}

}
