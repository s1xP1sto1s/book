package com.netease.fin.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.netease.fin.model.Biz;
import com.netease.fin.model.ServiceImportInfo;
import com.netease.fin.model.Protocol;
import com.netease.fin.model.Provider;
/**
 * 配置信息服务
 * @author hzsiyaomin
 *
 */
@Service
public class ConfigServiceImpl implements ConfigService{
	private ServiceImportInfo info=new ServiceImportInfo();
	private List<Biz> bizList=new ArrayList<>();
	@PostConstruct
	public void init(){
		Biz bizLoan=new Biz(0,"贷款","小额贷款");
		Biz bizRisk=new Biz(0,"风控","风控业务");
		bizList.add(bizLoan);
		bizList.add(bizRisk);
		List<Protocol> protocols=new ArrayList<>();
		Protocol protocol=new Protocol();
		protocol.setDesc("进件接口");
		protocol.setName("loan.apply.submit");
		protocol.setParamDemo("{xxx}");
		protocol.setBiz(bizLoan);
		Provider provider=new Provider();
		provider.setBalance("ip_hash");//TODO 多种
		provider.setDesc("公积金贷进件");
		provider.setStatus("on/off/downg");
		provider.setIpPorts(new String[]{"localhost:8080"});
		provider.setName("loan.apply.submit.gjj");
		provider.setUrl("http://xxx/aa/bb");
		protocol.addProvider(provider);
		protocols.add(protocol);
		bizLoan.setProtocols(protocols);
		info.setBizList(bizList);
		System.out.println("inited");		
	}

	@Override
	public List<Biz> getBizList() {
		return bizList;
	}

	@Override
	public List<Protocol> getProtoclList(int bizId) {
		for(Biz biz:info.getBizList()){
			if(biz.getId().equals(bizId)){
				return biz.getProtocols();
			}
		}
		return Collections.emptyList();
	}

	@Override
	public Protocol getProtocol(int bizId,String protocolName) {
		for(Biz biz:info.getBizList()){
			if (biz.getId().equals(bizId)) {
				for(Protocol p:biz.getProtocols()){
					if(p.getName().equals(protocolName)){
						return p;
					}
				}
			}
		}
		return null;
	}

	@Override
	public ServiceImportInfo getImportInfo() {
		return info;
	}

}
