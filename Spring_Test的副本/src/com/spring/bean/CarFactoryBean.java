/**
 * 
 */
package com.spring.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author caijiankai
 *
 */
public class CarFactoryBean implements FactoryBean<Object> {

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#getObject()
	 */
	@Override
	public Object getObject() throws Exception {
		Car car1=new Car();
		car1.setType("BENZ");
		return car1;
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#getObjectType()
	 */
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#isSingleton()
	 */
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
