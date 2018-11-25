package com.itmayido.controller;

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
		
	@RequestMapping("/getUser")
	public String getUser(int i) {
			int j=1/i;
				
			return "sucess";
		}
}
