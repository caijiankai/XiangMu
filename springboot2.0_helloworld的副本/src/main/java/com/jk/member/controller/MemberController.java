package com.jk.member.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot2.0第一个案例
 * Springboot 依赖于springboot 实现微服务### springboot 默认集成springmvc组件 springcloud
 * 使用spirngmvc 编写微服务http接口 微服务 通讯接口 (http+json格式)
 * @author jiankaicai
 *
 *
 *@RestController=@Controller+@ResponseBody
 *
 */
@RestController
@EnableAutoConfiguration
public class MemberController {
		//@RestController 注解  表示该类中所有方法都会返回json格式
	//@RestController 是springboot提供的吗,不是.为微服务提供返回json格式
	//springboot启动原理:springmvc 注解方式启动,内置http服务器(默认是tomcat)
	//@EnableAutoConfiguration注解作用:自动配置扫包范围默认是在当前类
	@RequestMapping("/memeberIndex")
	public String memberIndex() {
		
		return "springboot2.0全新版本教程,情商";
	}
	
	
	public static void main(String[] args) {
		//整个程序的入口,启动springboot项目,使用springmvc创建内置tomcat服务器,使用tomcat加载springmvc注解启动类
		SpringApplication.run(MemberController.class, args);
	}
	
	
}
