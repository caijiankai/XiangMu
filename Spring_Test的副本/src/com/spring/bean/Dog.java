/**
 * 
 */
package com.spring.bean;

/**
 * @author caijiankai
 *
 */
public class Dog {
		String type;
		String name;
		int age;
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Dog [type=" + type + ", name=" + name + ", age=" + age + "]";
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
	 * @param name
	 * @param age
	 */
	public Dog(String type) {
		this.type=type;
		System.out.println("创建了一个dog");
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
		 * @return the age
		 */
		public int getAge() {
			return age;
		}
		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}
}
