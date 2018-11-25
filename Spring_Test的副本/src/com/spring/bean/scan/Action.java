/**
 * 
 */
package com.spring.bean.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author caijiankai
 *
 */
//autowired:按照类型自动装配,如果在IOC容器中存在多个service类型的话;异常

@Controller
public class Action {
	@Autowired
	private MyService service;
	public String execute() {
			System.out.println("走入到Action中的add方法");
			service.add();		
			return "";
			
		}
}
