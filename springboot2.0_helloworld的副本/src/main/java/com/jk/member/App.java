package com.jk.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan(basePackages= {"com.jk.member.controller","com.jk.order.controller"})
@SpringBootApplication
public class App {
		public static void main(String[] args) {
			//整个程序入口,启动springboot项目创建内置tomcat服务器,使用tomcat加载springmvc,注解启动
			//@ComponentScan缺点:如果扫包比较多,写起来很麻烦
			//@SpringBootApplication等于@EnableAutoConfiguration+@ComponentScan同级包和当前包
			SpringApplication.run(App.class, args);
		}
}
