/**
 * 
 */
package com.bdqn.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdqn.service.UserService;

/**
 * @author:caijiankai
 *@date: 2018年8月20日 上午6:25:20
 *@Copyright: 2018
 *注意:本内容严格保密,禁止外泄或私自用于商业用途
 *
 */
@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	private UserService userService;//用户service
		
	/**
	 * 检查登录
	 */
	@RequestMapping("checklogin")
	@ResponseBody
	public String checkLogin(String name,String password,HttpSession session) {
		String result = "success";
		//构造参数
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		params.put("password", password);
		//查询结果
		Map<String, Object> resultMap = userService.checkLogin(params);
		if(resultMap!=null) {
			if(!resultMap.get("password").equals(password)) {
				result="passerr";		//用户名密码错误
			}else{
				if(!resultMap.get("status").equals("1")){
					result = "statuserr";//用户被冻结
				}
			}
		}else {
			result = "usernot";//用户不存在
		}
		session.setAttribute("user", resultMap);	
		return result;	
		
	}
	
	
	
	
	
}
