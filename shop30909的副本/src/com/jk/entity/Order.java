/**
 * 
 */
package com.jk.entity;

/**
 * @author:caijiankai
 *@date: 2018年9月8日 上午9:04:57
 *@Copyright: 2018
 *注意:本内容严格保密,禁止外泄或私自用于商业用途
 *
 */

public class Order {
	//详情id
	int id;
	//对应商品表的id
	int proID;
	//订购数量
	int quantity;
	/**
	 * @return the id
	 */
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
	 * @return the proID
	 */
	public int getProID() {
		return proID;
	}
	/**
	 * @param proID the proID to set
	 */
	public void setProID(int proID) {
		this.proID = proID;
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
