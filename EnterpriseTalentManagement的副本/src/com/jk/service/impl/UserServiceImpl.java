package com.jk.service.impl;

import com.jk.dao.mapper.UserMapper;
import com.jk.entity.EnterpriseTalent;
import com.jk.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

   @Autowired
   private UserMapper up;


   public List checkEn() {
      return this.up.checkEn();
   }

   public List checkDpar() {
      return this.up.checkDpar();
   }

   public List checkEn2(String name) {
      return this.up.checkEn2(name);
   }

   public List checkEn3(int id) {
      return this.up.checkEn3(id);
   }

   public List addEn(EnterpriseTalent en) {
      return this.up.addEn(en);
   }

   public List modifyEn(EnterpriseTalent en) {
      return this.up.modifyEn(en);
   }

   public List deleteEn(String id) {
      return this.up.deleteEn(id);
   }
}