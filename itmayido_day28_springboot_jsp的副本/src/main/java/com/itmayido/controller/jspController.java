package com.itmayido.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这是jsp整合springboot
 * @author jiankaicai
 *
 */
@Controller
public class jspController {
	
	@RequestMapping("/jspIndex")
	public String jspIndex() {
		
		return "jspIndex";	
	}
}
