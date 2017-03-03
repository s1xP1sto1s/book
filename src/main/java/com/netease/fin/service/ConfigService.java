package com.netease.fin.service;

import java.util.List;

import com.netease.fin.model.Biz;
import com.netease.fin.model.ServiceImportInfo;
import com.netease.fin.model.Protocol;

/**
 * 
 * Created by hzsiyaomin on 2017/2/17.
 */
public interface ConfigService {
    /**
     *
     * @return
     */
    public List<Biz> getBizList();

    public List<Protocol> getProtoclList(int bizId);

    public Protocol getProtocol(int bizId,String protocolName);
    
    public ServiceImportInfo getImportInfo();
}
