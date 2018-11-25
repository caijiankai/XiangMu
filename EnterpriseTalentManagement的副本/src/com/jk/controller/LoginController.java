/**
 * 
 */
package com.jk.controller;

import com.jk.service.UserService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"see"})
public class LoginController {

   @Autowired
   private UserService us;


   @RequestMapping({"enterpriseTalent"})
   public ModelAndView seeEnterpriseTalent() {
      ModelAndView mv = new ModelAndView();
      List en = this.us.checkEn();
      mv.addObject("enList", en);
      mv.setViewName("ShowPerson");
      return mv;
   }

   @RequestMapping({"userList"})
   public ModelAndView userList(@RequestParam Map params) {
      ModelAndView view = new ModelAndView();
      if(params.get("dangYe") == null) {
         boolean var10000 = true;
      } else {
         Integer.parseInt("" + params.get("dangYe"));
      }

      boolean pageSize = true;
      return view;
   }

   @RequestMapping({"check"})
   public ModelAndView checkPerson(@RequestParam String name) {
      ModelAndView mv = new ModelAndView();
      List de = this.us.checkEn2(name);
      mv.addObject("deList", de);
      mv.setViewName("deList");
      return mv;
   }

   @RequestMapping({"addPerson"})
   public ModelAndView addPerson() {
      ModelAndView mv = new ModelAndView();
      mv.setViewName("addPerson");
      return mv;
   }

   @RequestMapping({"updateRencai"})
   public ModelAndView updateRencai() {
      ModelAndView mv = new ModelAndView();
      mv.setViewName("updatePerson");
      return mv;
   }

   @RequestMapping({"deleteRencai"})
   public ModelAndView deleteRencai(@RequestParam int id) {
      ModelAndView mv = new ModelAndView();
      return mv;
   }
}