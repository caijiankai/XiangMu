/**
 * 
 */
package com.spring.aop;

import org.springframework.stereotype.Component;

/**
 * @author caijiankai
 *
 */
@Component
public  class  ComputerImpl1 implements Computer {

	/* 
	 * 加法
	 */
	@Override
	public int add(int a, int b) {	
		
		int result=a+b;	
		
		return result;
	}

	/* 
	 * 减法
	 * 
	 */
	@Override
	public int sub(int a, int b) {
		
		int result=a-b;
		
		return result;
	}

	/*
	 * 乘法
	 */
	@Override
	public int mul(int a, int b) {	
		int result=a*b;	
		return result;
	}

	/* 
	 * 除法
	 */
	@Override
	public int div(int a, int b) {	
		int result=a/b;	
		return result;
	}
				
}
