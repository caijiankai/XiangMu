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
//spring IOC容器,可以帮我们动态创建对象
public class Main {
	 public static void main(String[] args) {
		 //获取容器对象
		 ApplicationContext ac=new ClassPathXmlApplicationContext("xjc.xml");
		 
		 //如何通过容器对象获取配置好的javabean
		// Person person1=(Person)ac.getBean("person1");
		// System.out.println(person1);
		 //Dog dog1=(Dog)ac.getBean("dog1");	 
		 //System.out.println(dog1);
	 /**
	  * 获取bean的三种常用方法
	  * 1.getBean(String) String:ID的值
	  * 
	  * 
	  */
		 //Dog dog1=(Dog)ac.getBean("dog1");	
		// Dog dog2=(Dog)ac.getBean("dog2");
		 //Dog dog3=(Dog)ac.getBean("dog3");
		// System.out.println(dog1);
		// System.out.println(dog2);
		 //通过构造器得到
		// System.out.println(dog3);
		 //Car car1=(Car)ac.getBean("car1");
		 //System.out.println(car1);
		 //按照类型注入报错UnsatisfiedDependencyException
		 //Car car2=(Car)ac.getBean("car2");
		//System.out.println(car2);
		// Car car3=(Car)ac.getBean("car3");
		// System.out.println(car3);
		// Person person22=(Person)ac.getBean("person22");
		// System.out.println(person22);
		 Person person33=(Person)ac.getBean("person33");
		 System.out.println(person33);
		 
	 }
}
