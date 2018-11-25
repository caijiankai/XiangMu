package com.jk.member.error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 1.全局捕获异常案例
 * 2.捕获返回json格式
 * 捕获返回错误
 * @author jiankaicai
 *
 */
@ControllerAdvice(basePackages="com.jk.member.controller")
public class GlobalExceptionHandler {
	
	
	//ResponseBody返回json格式
	//modelandview返回视图页面
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody	
	public Map<String,Object> errorResult(){
	
		//实际开发中,怎么 将错误记录在日志中 存放在
		Map<String,Object> errorResultMap=new HashMap<String,Object>();
		
	errorResultMap.put("errorCode", "500");
		errorResultMap.put("errorMessage", "全局捕获异常系统错误");
		
		return null;
	
		
	}
}
