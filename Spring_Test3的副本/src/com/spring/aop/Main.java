/**
 * 
 */
package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caijiankai
 *
 */
public class Main {
		public static void main(String[] args) {
			/*Computer computer=new ComputerImpl();
			int result=computer.add(1, 2);
			System.out.println(result);*/
			
			/*Computer computer=new ComputerImpl1();
			ComputerProxy profxy=new ComputerProxy(computer);
			computer=profxy.getComputerProfxy();
			int result=computer.add(1, 2);
			System.out.println(result);*/
			
			//测试
			ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
			Computer computer=(Computer) ac.getBean("computerImpl1");
			System.out.println(computer.add(1, 3));
			
			
			
		}	
}
