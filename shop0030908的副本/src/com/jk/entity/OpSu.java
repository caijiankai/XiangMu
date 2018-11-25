/**
 * 
 */
package com.jk.entity;

/**
 * @author:caijiankai
 *@date: 2018年9月8日 下午1:59:26
 *@Copyright: 2018
 *注意:本内容严格保密,禁止外泄或私自用于商业用途
 *
 */
public class OpSu {
		int quantity;
		int proID;
		int id;
		//商品名称
		String name;
		//商品图样路径
		String pic;
		//商品单价
		Float money;
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
		 * @return the money
		 */
		public Float getMoney() {
			return money;
		}

		/**
		 * @param money the money to set
		 */
		public void setMoney(Float money) {
			this.money = money;
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
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the pic
		 */
		public String getPic() {
			return pic;
		}

		/**
		 * @param pic the pic to set
		 */
		public void setPic(String pic) {
			this.pic = pic;
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
		
		
}
