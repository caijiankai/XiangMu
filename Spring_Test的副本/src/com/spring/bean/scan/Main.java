/**
 * 
 */
package com.spring.bean.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caijiankai
 *
 */
public class Main {
			public static void main(String[] args) {
				//获取容器对象
				 ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext-scan.xml");
				//Person p1=(Person)ac.getBean("abc");
				//p1.eat();
				Action action=(Action) ac.getBean("action");
				action.execute();
				
			}
}
