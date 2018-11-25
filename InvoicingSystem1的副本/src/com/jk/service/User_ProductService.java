package com.jk.service;

import java.sql.Connection;
import java.util.List;

import com.jk.entity.Product;

import com.jk.entity.Users;




public interface User_ProductService {
	
	
	/**
	 * 用户登录
	 * @param userCode
	 * @param userPassword
	 * @return
	 */
	public Users login(String userName,int passWord);
	
	/**
	 * 增加用户信息
	 * @param user
	 * @return
	 */
	public boolean add(Users users);
	
	/**
	 * 通过userCode获取User
	 * @param connection
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public Users getLoginUser(Users user);
	
	/**
	 * 查询所有商品
	 * @throws Exception 
	 */
	public Product getProduct() throws Exception;

	/**
	 * 查询指定商品的库存
	 */
	public Product getProduct(int id);
	/**
	 * 修改指定商品的库存
	 * 
	 */
	 public Product modifyProduct(int id);
	 /**
	  * 添加销售记录
	  */
	 public boolean addSale(int id,float price,int quantity);
	 /**
	  * 对销售记录按指定的排序规则分页查询
	  */
	  public List<Product> queryProduct();
	  /**
		 * 根据条件查询用户表记录数
		 * @param queryUserName
		 * @param queryUserRole
		 * @return
		 */
	public int getUserCount(String queryUserName,int queryUserRole);
	  
	  
}
