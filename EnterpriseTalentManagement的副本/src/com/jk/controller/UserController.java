package com.jk.controller;

import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"modify"})
public class UserController {

   @Autowired
   private UserService us;


   @RequestMapping({"addRencai"})
   public ModelAndView addPerson() {
      ModelAndView mv = new ModelAndView();
      return mv;
   }
}
