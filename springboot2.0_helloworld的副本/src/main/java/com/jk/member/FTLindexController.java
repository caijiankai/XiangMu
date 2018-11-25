package com.jk.member;

import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 整合framework 作者:
 * @author jiankaicai
 *
 */

@Controller
public class FTLindexController {
	@RequestMapping("/ftlIndex")	
	public String ftlIndex(Map<String,Object>map) {
		map.put("name", "cjk");	//Reqest.set
		map.put("age", "20");
		map.put("sex", "0");
		
		return "ftlIndex";
		
	}
}
