package com.bdqn.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdqn.dao.UserMapper;
import com.bdqn.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserMapper {
	@Autowired
	private UserMapper dao;

	@Override
	public Map<String, Object> checkLogin(Map<String, Object> params) {
		return dao.checkLogin(params);
	}

	@Override
	public void updateUserPass(Map<String, String> params) {
		
		dao.updateUserPass(params);
	}

	@Override
	public List<Map<String, Object>> userList(Map<String,Object> params) {
		return dao.userList(params);
	}

	@Override
	public int userListCount(Map<String,Object> params) {
		return dao.userListCount(params);
	}
	
	



}
