package com.netease.fin.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netease.fin.model2.ProductConfig;
import com.netease.fin.model2.ProductConfig.Select;
import com.netease.fin.model2.ProductConfig.Option;

public class ProductConfigService {
public static void main(String[] args) throws IOException {
	ProductConfig config= new ProductConfig();
	config.setBizType(0);
	config.setTitle("来钱-公积金贷");
	List<Select> selectList=new ArrayList<>();
	Select select=new Select();
	select.setTitle("进件服务");
	select.setOptions(Arrays.asList(new Option("公积金", "loan.apply.submit.gjj")));
	selectList.add(select);
	config.setSelectList(selectList);
	List<ProductConfig> configList=new ArrayList<>();
	configList.add(config);
	new ObjectMapper().getFactory().createGenerator(System.out).writeObject(Arrays.asList(config));

}
}
