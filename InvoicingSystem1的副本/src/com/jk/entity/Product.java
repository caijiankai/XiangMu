/**
 * 
 */
package com.jk.entity;

/**
 * @author caijiankai
 *	商品表
 */
public class Product {
	/**
	 * @return the id
	 */
	
	//商品id
	private int id;
	//商品名称
	private String productName;
	//库存量
	private int quantity;
	
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
		
}
