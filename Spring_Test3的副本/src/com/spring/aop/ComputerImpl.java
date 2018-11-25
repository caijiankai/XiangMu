/**
 * 
 */
package com.spring.aop;

/**
 * @author caijiankai
 *
 */
public  class  ComputerImpl implements Computer {

	/* 
	 * 加法
	 */
	@Override
	public int add(int a, int b) {
		System.out.println("正在开始调用add方法,操作数为:"+a+"\t"+b);
		int result=a+b;
		System.out.println("add方法执行结束,操作数为:"+a+"\t"+b);
		return result;
	}

	/* 
	 * 减法
	 * 
	 */
	@Override
	public int sub(int a, int b) {
		System.out.println("正在开始调用sub方法,操作数为:"+a+"\t"+b);
		int result=a-b;
		System.out.println("sub方法执行结束,操作数为:"+a+"\t"+b);
		return result;
	}

	/*
	 * 乘法
	 */
	@Override
	public int mul(int a, int b) {
		System.out.println("正在开始调用mul方法,操作数为:"+a+"\t"+b);
		int result=a*b;
		System.out.println("mul方法执行结束,操作数为:"+a+"\t"+b);
		return result;
	}

	/* 
	 * 除法
	 */
	@Override
	public int div(int a, int b) {
		System.out.println("正在开始调用div方法,操作数为:"+a+"\t"+b);
		int result=a/b;
		System.out.println("div方法执行结束,操作数为:"+a+"\t"+b);
		return result;
	}
				
}
