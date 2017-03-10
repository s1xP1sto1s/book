package com.netease.fin.app2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netease.fin.dao.MerchantMapper;
import com.netease.fin.dao.ProductMapper;
import com.netease.fin.model2.Merchant;
import com.netease.fin.model2.Product;
import com.netease.fin.service.MerchantService;



@Controller
@ComponentScan("com.netease.fin.service")
@EnableAutoConfiguration
@MapperScan("com.netease.fin.dao")
public class App {
	
	@Autowired
	MerchantMapper merMapper;
	
	@Autowired
	ProductMapper proMapper;
	
	@Autowired
	MerchantService merService;

//    @RequestMapping("/")
    @ResponseBody
    List<Product> home() throws IOException {
//    	Merchant merchant = new Merchant();
//    	merchant.setName("shop");
//    	merchant.setUrsName("lin");
//    	merchant.setConcat("1212");
//    	merchant.setEmail("123132");
//    	merchant.setEnabled("y");
//    	merchant.setMobile("1231345");
//    	merchant.setStatus("asdasdf");
//    	
//    	Merchant merchant2 = new Merchant();
//    	merchant2.setName("shop");
//    	merchant2.setUrsName("lin");
//    	merchant2.setConcat("1212");
//    	merchant2.setEmail("123132");
//    	merchant2.setEnabled("y");
//    	merchant2.setMobile("1231345");
//    	merchant2.setStatus("asdasdf");
//    	
//    	List<Merchant> list = new ArrayList<Merchant>();
//    	list.add(merchant);
//    	list.add(merchant2);
//    	list.add(merchant2);
    	
//    	int index = merMapper.insertMerchant(merchant);
//        int index = merMapper.insertManyMerchant(list);
//    	List<Merchant> res = merMapper.selectMerchantByUsername("lin");
//    	System.out.println(res.size()+" ok!");
//        return "Hello World!";
    	
//    	String str = null;
//		try {
//			str = merService.create(null);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	return str;
    	
//    	Merchant merchant2 = new Merchant();
//    	merchant2.setName("商店");
//    	merchant2.setUrsName("六六");
//    	merchant2.setConcat("1212");
//    	merchant2.setEmail("123132");
//    	merchant2.setEnabled("y");
//    	merchant2.setMobile("1231345");
//    	merchant2.setStatus("asdasdf");
//    	
//    	String status = merService.create(merchant2);
//    	
//    	List<Merchant> list = merService.findByName("六六");
//    	for(Merchant m:list)
//    		System.out.println(m.getName());
//    	return ""+list.size();
//    	
    	Product pro = new Product();
    	pro.setName("name");
    	pro.setMerchantId(20);
    	pro.setBizId(123);
    	pro.setProductType("new");
    	pro.setAppKey("123456");
    	pro.setMerchantPublicKey("456123");
    	pro.setPlatformPublicKey("1312");
    	pro.setPlatformPrivateKey("456123");
    	pro.setAuthTplId(123);
    	pro.setAuthTplContent("fdasfsda");
    	pro.setServiceTplId(456);
    	pro.setServiceTplContent("asdfsaf");
    	pro.setDetailPageContent("asdfasdf");
    	pro.setStatus("checked");
    	
//    	List<Product> list = new ArrayList<Product>();
//    	list.add(pro);
//    	list.add(pro);
//    	list.add(pro);
//    	int res = proMapper.insertManyProduct(list);
    	
//    	pro.setId(3);
//    	pro.setStatus("unchecked");
//    	proMapper.updateProduct(pro);
    	
    	List<Product> list = proMapper.selectProductByMerchantId(20);
    	return list;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}

