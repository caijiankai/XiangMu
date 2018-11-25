/**
 * 
 */
package com.bdqn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bdqn.service.UserService;

/**
 * @author:caijiankai
 *@date: 2018年9月15日 下午5:00:03
 *@Copyright: 2018
 *注意:本内容严格保密,禁止外泄或私自用于商业用途
 *
 */
@Controller
@RequestMapping("modify")
public class UserController {
	@Autowired
	private UserService us;
	
	@RequestMapping("addRencai")
	public ModelAndView addPerson(){
		ModelAndView mv=new ModelAndView();
		//EnterpriseTalent en;
		//List<EnterpriseTalent> addRencai=us.addEn(en);

		return mv;				
	}
	
	
	
}
