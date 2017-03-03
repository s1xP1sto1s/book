package com.netease.fin.adapter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.netease.fin.filter.FreemarkerGlobalVarInterceptor;
import com.netease.fin.filter.LoginInterceptor;

@Configuration
public class MvcInterceptorConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new FreemarkerGlobalVarInterceptor()).addPathPatterns("/ui/**");
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**");
    }
}