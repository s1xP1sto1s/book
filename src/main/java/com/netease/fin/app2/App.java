package com.netease.fin.app2;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netease.fin.dao.MerchantMapper;
import com.netease.fin.model2.Merchant;



@Controller
@EnableAutoConfiguration
@MapperScan("com.netease.fin.dao")
public class App {
	
	@Autowired
	MerchantMapper merMapper;

    @RequestMapping("/")
    @ResponseBody
    String home() {
    	Merchant merchant = new Merchant();
    	merchant.setId(14);
    	merchant.setName("shop");
    	merchant.setUrsName("lin");
    	merchant.setConcat("1212");
    	merchant.setEmail("123132");
    	merchant.setEnabled("y");
    	merchant.setMobile("1231345");
    	merchant.setStatus("asdasdf");
    	
    	Merchant merchant2 = new Merchant();
    	merchant2.setId(13);
    	merchant2.setName("shop");
    	merchant2.setUrsName("lin");
    	merchant2.setConcat("1212");
    	merchant2.setEmail("123132");
    	merchant2.setEnabled("y");
    	merchant2.setMobile("1231345");
    	merchant2.setStatus("asdasdf");
    	
    	List<Merchant> list = new ArrayList<Merchant>();
    	list.add(merchant);
    	list.add(merchant2);
    	
//    	merMapper.insertMerchant(merchant2);
        merMapper.insertManyMerchant(list);
    	System.out.println("ok!");
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}

