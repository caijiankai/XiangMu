package com.jk.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全局捕获异常案例
 * 
 * @author jiankaicai
 *
 */
@RestController
public class ErrorController {
		//全局捕获异常的思路,使用AOP技术,采用异常通知
	//	如果每个方法可能都会发生异常,每个方法都加上try
	
	@RequestMapping("/getUser")
	public String getUser(int i) {	
		
		  int j=0;
		try {
			 j=1/i;
		}catch(Exception e) {
			return "系统错误";
		}
			return "sucess";
		}
			
}
