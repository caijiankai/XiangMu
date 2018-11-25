/**
 * 
 */
package com.spring.bean;

import java.util.List;

/**
 * @author caijiankai
 *
 */
public class Car {
		
	
		private String type;
		private String factory;
		
		private double price;
			
		
		public Car() {
			
		}
		
		/**
		 * @return the factoryΩ
		 *
		public String getFactory() {
			return factory;
		}


		/**
		 * @param factory the factory to set
		 */
		public void setFactory(String factory) {
			this.factory = factory;
		}
	
		
		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}


		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}


		/**
		 * @return the price
		 */
		public double getPrice() {
			return price;
		}


		/**
		 * @param price the price to set
		 */
		public void setPrice(double price) {
			this.price = price;
		}


		/**ΩΩΩΩΩΩΩΩΩΩΩΩΩΩΩΩΩΩΩ
		 * @param type
		 * @param factory
		 * @param privce
		 */
		public Car(String type, String factory, double price) {
			super();
			this.type = type;
			this.factory = factory;
			this.price = price;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Car [type=" + type + ", factory=" + factory + ", price=" + price + "]";
		}


		
		
		
}
