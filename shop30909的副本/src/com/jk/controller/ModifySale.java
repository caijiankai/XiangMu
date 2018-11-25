/**
 * 
 */
package com.jk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jk.entity.Product;
import com.jk.service.ModifyOrderService;

/**
 * @author:caijiankai
 *@date: 2018年9月8日 上午10:25:30
 *@Copyright: 2018
 *注意:本内容严格保密,禁止外泄或私自用于商业用途
 *
 */
@Controller
@RequestMapping("see")
public class ModifySale {
		
		
		@Autowired
		private ModifyOrderService mo;
		@RequestMapping("product")
	public ModelAndView seeProduct(){
		ModelAndView mv=new ModelAndView();
		List<Product> sp=mo.seeProducts();
		//System.out.println(sp.size());
		//model.addAttribute("sp", "sp");
		mv.addObject("sp", sp);
		mv.setViewName("seeProduct");		
			return mv;		
	}	
	
		@RequestMapping("delete")
		public ModelAndView deleteProduct(String id){
			ModelAndView mv=new ModelAndView();
			int sp=mo.deleteOrderTB(Integer.parseInt(id));
			System.out.println(sp);
			//System.out.println(sp.size());
			//model.addAttribute("sp", "sp");
			//mv.addObject("sp", sp);
			//mv.setViewName("seeProduct");	
			if(sp>0) {
				mv.setViewName("deleteSucess");
				return mv;
			}
				
				return mv;		
		}	 
		
		@RequestMapping("addProduct")
		public ModelAndView addProduct(){
			ModelAndView mv=new ModelAndView();
			List<Product> cplist=mo.checkProductName();
			mv.addObject("cplist",cplist);	
			mv.setViewName("addProduct");
			return  mv;	
		}	 
		
		
		
}

