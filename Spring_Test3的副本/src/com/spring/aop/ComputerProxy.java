/**
 * 
 */
package com.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author caijiankai
 *
 */
public class ComputerProxy {
		//即将被代理的对象
		private Computer computer;
		public  ComputerProxy(Computer computer) {
			this.computer=computer;
			
		}
		//	computer与我们的代理发生关系
		//已经被代理的对象
		public Computer getComputerProfxy() {
			ClassLoader loader=Computer.class.getClassLoader();
			Class[] interfaces= {Computer.class};
			InvocationHandler h=new InvocationHandler() {
				
				
				//profxy:代理对象
				//method:即将被代理对象的方法
				//args:方法的参数
				@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					// TODO Auto-generated method stub
					System.out.println("正在进行"+method.getName());
					Object o=method.invoke(computer, args);
					System.out.println("正在结束"+method.getName());
					return o;
				}
								
				
			};
			Computer com=(Computer)Proxy.newProxyInstance(loader, interfaces, h);
			
			return com;
			
		}
		
		
}
/*
	public class Person{
		private Dog dog;	
	}
	public class Dog{
	
	}
	

*/