/**
 * 
 */
package com.bdqn.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bdqn.dao.UserMapper;
import com.bdqn.service.UserService;

/**
 * @author:caijiankai
 *@date: 2018年8月20日 下午2:42:45
 *@Copyright: 2018
 *注意:本内容严格保密,禁止外泄或私自用于商业用途
 *
 */


@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("userList")
	public ModelAndView userList(@RequestParam Map<String, Object> params){
		ModelAndView view = new ModelAndView();
		int dangYe = null==params.get("dangYe")?1:Integer.parseInt(params.get("dangYe")+"");//当前页
		int pageSize =2;//每页要显示的条数
		int zongCount= userService.userListCount(params);//总条数
		int zongYe = 0;//总页数
		if(zongCount % pageSize == 0){
			zongYe = zongCount / pageSize;
		}else{
			zongYe = zongCount / pageSize +1;
		}
		params.put("dangPage", dangYe);
		params.put("pageSize", pageSize);
		
		List<Map<String, Object>> userList = userService.userList(params);
		
		view.addObject("userList",userList);
		view.addObject("dangYe",dangYe);
		view.addObject("zongYe",zongYe);
		view.addObject("zongCount",zongCount);
		//如果模糊查询的条件不为空 则把条件回传给页面,展示上次模糊的条件
		if(null !=params.get("name")){
			view.addObject("name",params.get("name"));
		}
		
		view.setViewName("userList");
		return view;
	}

}

	
	

