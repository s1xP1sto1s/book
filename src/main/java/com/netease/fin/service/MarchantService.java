package com.netease.fin.service;

import java.io.IOException;

import com.netease.fin.model2.CreateMarchantRequest;
import com.netease.fin.model2.Marchant;

/**
 * 商户服务
 * @author hzsiyaomin
 *
 */
public interface MarchantService {
	public Marchant create(CreateMarchantRequest request) throws IOException;
}
