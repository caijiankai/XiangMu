/**
 * 
 */
package com.spring.bean;

/**
 * @author caijiankai
 *
 */
public class Person {
			private String name;
			private Car car;
			
			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "Person [name=" + name + ", car=" + car + "]";
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
			 * @return the car
			 */
			public Car getCar() {
				return car;
			}
			/**
			 * @param car the car to set
			 */
			public void setCar(Car car) {
				this.car = car;
			}
			/**
			 * 
			 * 
			 */

			public Person() {
				System.out.println("走入到了构造器");
			}

}
