package com.netease.fin.service;

import java.io.IOException;

import com.netease.fin.model2.CreateMarchantRequest;
import com.netease.fin.model2.Merchant;

/**
 * 商户服务
 * @author hzsiyaomin
 *
 */
public interface MerchantService {
	public Merchant create(CreateMarchantRequest request) throws IOException;
}
