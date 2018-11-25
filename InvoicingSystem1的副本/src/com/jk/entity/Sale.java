/**
 * 
 */
package com.jk.entity;

import java.util.Date;

/**
 * @author caijiankai
 *销售记录表
 */
public class Sale {
		//数量
		private int quantity;
		//总价
		private float totalPrice;
		//销售日期
		private Date saleDate;
		//销售员id
		private int userId;
		//商品id
		private int productId;
		//记录id
		private int id;
		//销售单价
		private float price;
		
		
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
		 * @return the price
		 */
		public float getPrice() {
			return price;
		}
		/**
		 * @param price the price to set
		 */
		public void setPrice(float price) {
			this.price = price;
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
		/**
		 * @return the totalPrice
		 */
		public float getTotalPrice() {
			return totalPrice;
		}
		/**
		 * @param totalPrice the totalPrice to set
		 */
		public void setTotalPrice(float totalPrice) {
			this.totalPrice = totalPrice;
		}
		/**
		 * @return the saleDate
		 */
		public Date getSaleDate() {
			return saleDate;
		}
		/**
		 * @param saleDate the saleDate to set
		 */
		public void setSaleDate(Date saleDate) {
			this.saleDate = saleDate;
		}
		/**
		 * @return the userId
		 */
		public int getUserId() {
			return userId;
		}
		/**
		 * @param userId the userId to set
		 */
		public void setUserId(int userId) {
			this.userId = userId;
		}
		/**
		 * @return the productId
		 */
		public int getProductId() {
			return productId;
		}
		/**
		 * @param productId the productId to set
		 */
		public void setProductId(int productId) {
			this.productId = productId;
		}
		
}
