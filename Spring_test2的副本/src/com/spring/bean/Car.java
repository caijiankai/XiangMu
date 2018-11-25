/**
 * 
 */
package com.spring.bean;

/**
 * @author caijiankai
 *
 */
public class Car {
		private String type;

		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Car [type=" + type + "]";
		}

		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}
		
}
