/**
 * 
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.Department;
import com.bdqn.entity.EnterpriseTalent;



/**
 * @author:caijiankai
 *@date: 2018年9月15日 下午2:31:25
 *@Copyright: 2018
 *注意:本内容严格保密,禁止外泄或私自用于商业用途
 *
 */
public interface UserService {
		//A. 分页查询所有的人才信息，按工作年限降序排列
		public List<EnterpriseTalent> checkEn();
		
		//B. 查询所有的部门
		public List<Department> checkDpar();
		
		//C. 根据指定部门，分页查询人才信息，按工作年限降序排列
		
		public List<EnterpriseTalent> checkEn2(String name);
		
		
		
		//D. 根据人才编号查询人才信息 
		public List<EnterpriseTalent> checkEn3(int id);
		
		//E. 添加人才信息
		public List<EnterpriseTalent> addEn(EnterpriseTalent en);	
		
		//F.修改人才信息
		public List<EnterpriseTalent> modifyEn(EnterpriseTalent en);
		
		
		//G. 删除人才信息
		public List<EnterpriseTalent> deleteEn(String id);


	}
	

