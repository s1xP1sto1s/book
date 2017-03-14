package com.netease.fin.service;

import java.io.IOException;
import java.util.List;


import com.netease.fin.model2.Merchant;

/**
 * 商户服务
 * @author hzsiyaomin
 *
 */
public interface MerchantService {
	/**
	 * 创建商户
	 * @param merchant
	 * @return
	 * @throws IOException
	 */
	public String create(Merchant merchant);
	
	/**
	 * 根据用户名查询商户
	 * @param username
	 * @return
	 */
	public List<Merchant> findByName(String username);
	
	/**
	 * 更新商家信息
	 * @param merchant
	 * @return
	 */
	public String update(Merchant merchant);
}
