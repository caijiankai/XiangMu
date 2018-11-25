/**
 * 
 */
package com.jk.controller;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.servlet.ModelAndView;

import com.jk.entity.Product;
import com.jk.entity.Users;
import com.jk.service.User_ProductService;
import com.jk.tools.Constants;
import com.jk.tools.PageSupport;

/**
 * @author caijiankai
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	private Logger logger = Logger.getLogger(UserController.class);
	@Resource 
	private User_ProductService user_ProductService;
			
	@RequestMapping(value="/login.html")
	public String login(){
		logger.debug("welcome>>>>>>>>login");
		
		return "main";
	}
	
	@RequestMapping(value="/dologin.html",method=RequestMethod.POST)
	public String doLogin(@RequestParam String userName,@RequestParam int passWord,HttpServletRequest request,HttpSession session){
		logger.info("welcome to doLogin>>>>>>>>"+userName);
		//调用service方法，进行用户匹配
		Users user = user_ProductService.login(userName, passWord);
		
		if(null != user){//登录成功
			logger.info("登录成功!!!>>>>>>>>");
			//放入session
			session.setAttribute(Constants.USER_SESSION, user);
			//页面跳转（frame.jsp）
			return "redirect:/user/main.html";
			//response.sendRedirect("jsp/frame.jsp");
		}else{
			//页面跳转（login.jsp）带出提示信息--转发
			request.setAttribute("error", "用户名或密码不正确");
			return "login";
		}
	}
	
	@RequestMapping(value="/main.html")
	public String main(HttpSession session){
		if(session.getAttribute(Constants.USER_SESSION) == null){
			return "redirect:/user/login.html";
		}
		return "main";
	}
	
	@RequestMapping(value="/XiaoShou.html")
	public String XiaoShou(HttpSession session){
		logger.info("登录成功!!!>>>>>>>>");
		return "xiaoshou";
	}
	@RequestMapping(value="/logout.html")
	public String logout(HttpSession session){
		//清除session
		session.removeAttribute(Constants.USER_SESSION);
		return "login";
	}
	
	@RequestMapping(value="/userlist.html")
	public String getUserList(Model model,
							@RequestParam(value="queryname",required=false) String queryUserName,
							@RequestParam(value="queryUserRole",required=false) String queryUserRole,
							@RequestParam(value="pageIndex",required=false) String pageIndex){
		logger.info("getUserList ---- > queryUserName: " + queryUserName);
		logger.info("getUserList ---- > queryUserRole: " + queryUserRole);
		logger.info("getUserList ---- > pageIndex: " + pageIndex);
		int _queryUserRole = 0;		
		List<Users> userList = null;
		//设置页面容量
    	int pageSize = Constants.pageSize;
    	//当前页码
    	int currentPageNo = 1;
    
		if(queryUserName == null){
			queryUserName = "";
		}
		if(queryUserRole != null && !queryUserRole.equals("")){
			_queryUserRole = Integer.parseInt(queryUserRole);
		}
		
    	if(pageIndex != null){
    		try{
    			currentPageNo = Integer.valueOf(pageIndex);
    		}catch(NumberFormatException e){
    			return "redirect:/user/syserror.html";
    			//response.sendRedirect("syserror.jsp");
    		}
    	}	
    	//总数量（表）	
    	int totalCount	= user_ProductService.getUserCount(queryUserName,_queryUserRole);
    	//总页数
    	PageSupport pages=new PageSupport();
    	pages.setCurrentPageNo(currentPageNo);
    	pages.setPageSize(pageSize);
    	pages.setTotalCount(totalCount);
    	int totalPageCount = pages.getTotalPageCount();
    	//控制首页和尾页
    	if(currentPageNo < 1){
    		currentPageNo = 1;
    	}else if(currentPageNo > totalPageCount){
    		currentPageNo = totalPageCount;
    	}
		//userList = userService.getUserList(queryUserName,_queryUserRole,currentPageNo,pageSize);
		model.addAttribute("userList", userList);
		//List<Role> roleList = null;
		//roleList = roleService.getRoleList();
		//model.addAttribute("roleList", roleList);
		model.addAttribute("queryUserName", queryUserName);
		model.addAttribute("queryUserRole", queryUserRole);
		model.addAttribute("totalPageCount", totalPageCount);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("currentPageNo", currentPageNo);
		return "userlist";
	}
	
	@RequestMapping(value="/addXiaoShou.html")
	public ModelAndView addXiaoShou() {
		Product pr=new Product();
		try {
			pr=user_ProductService.getProduct();
			System.out.println(pr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView view = new ModelAndView();
		view.addObject("pr",pr);
		view.setViewName("addXiaoshou");
		return view;
	}
	@RequestMapping(value="/saveProduct")
	public void saveProduct(@RequestParam int id,@RequestParam int price,
			@RequestParam int quantity) {
		
	}

}
