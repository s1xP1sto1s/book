package com.netease.fin.model2;
/**
 * 更新产品app key
 * @author hzsiyaomin
 *
 */
public class UpdateProductAppSecretRequest extends Request{
	private static final long serialVersionUID = 1L;
	private int marchantId;
	private int productId;
	public int getMarchantId() {
		return marchantId;
	}
	public void setMarchantId(int marchantId) {
		this.marchantId = marchantId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
}
