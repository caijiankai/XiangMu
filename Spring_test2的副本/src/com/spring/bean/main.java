/**
 * 
 */
package com.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caijiankai
 *
 */
public class main {
		
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Person person12=(Person)ac.getBean("person12");
		//System.out.println(person12);
		Person person3=(Person)ac.getBean("person3");
		System.out.println(person3);
		/**
		 * IOC容器bean的声明周期
		 * 1.通过构造器或者是工厂方法创建对象
		 * 2.需要将属性进行注入
		 * 后置处理器的前置处理
		 * 3.调用初始化方法
		 * 后置处理器后置处理
		 * 4.正常的去使用bean
		 * 5.调用销毁的方法
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
	}
	
	
		



}
