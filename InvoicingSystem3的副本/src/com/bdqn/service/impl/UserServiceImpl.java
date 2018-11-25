/**
 * 
 */
package com.bdqn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdqn.dao.UserMapper;
import com.bdqn.entity.Department;
import com.bdqn.entity.EnterpriseTalent;
import com.bdqn.service.UserService;



/**
 * @author:caijiankai
 *@date: 2018年9月15日 下午2:33:07
 *@Copyright: 2018
 *注意:本内容严格保密,禁止外泄或私自用于商业用途
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserMapper up;
	//A. 分页查询所有的人才信息，按工作年限降序排列
	@Override
	public List<EnterpriseTalent> checkEn() {
		// TODO Auto-generated method stub
		return up.checkEn();
	}

	//B. 查询所有的部门
	@Override
	public List<Department> checkDpar() {
		// TODO Auto-generated method stub
		return up.checkDpar();
	}

	//C. 根据指定部门，分页查询人才信息，按工作年限降序排列
	@Override
	public List<EnterpriseTalent> checkEn2(String name) {
		// TODO Auto-generated method stub
		return up.checkEn2(name);
	}

	//D. 根据人才编号查询人才信息
	@Override
	public List<EnterpriseTalent> checkEn3(int id) {
		// TODO Auto-generated method stub
		return up.checkEn3(id);
	}

	//E. 添加人才信息
	@Override
	public List<EnterpriseTalent> addEn(EnterpriseTalent en) {
		// TODO Auto-generated method stub
		return up.addEn(en);
	}

	//F.修改人才信息
	@Override
	public List<EnterpriseTalent> modifyEn(EnterpriseTalent en) {
		// TODO Auto-generated method stub
		return up.modifyEn(en);
	}

	
	//G. 删除人才信息
	public List<EnterpriseTalent> deleteEn(String id) {
		// TODO Auto-generated method stub
		return up.deleteEn(id);
	}

}
