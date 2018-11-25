package com.jk.service;

import com.jk.entity.EnterpriseTalent;
import java.util.List;

public interface UserService {

   List checkEn();

   List checkDpar();

   List checkEn2(String var1);

   List checkEn3(int var1);

   List addEn(EnterpriseTalent var1);

   List modifyEn(EnterpriseTalent var1);

   List deleteEn(String var1);
}
