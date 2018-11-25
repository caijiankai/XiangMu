/**
 * 
 */
package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author caijiankai
 *
 */
@Aspect
@Component
public class ComputerAspect {
	 
	@Before("execution(public int com.spring.aop.ComputerImpl1.add(int , int ))")
	public void a() {
		  System.out.println("调用add方法之前");
	  }
	  @After("execution(public int com.spring.aop.ComputerImpl1.add(int , int ))")
	  public void b() {
		  System.out.println("调用add方法之后");
	  }
	  
}
