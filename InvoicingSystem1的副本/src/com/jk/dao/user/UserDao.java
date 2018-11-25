package com.jk.dao.user;

import java.sql.Connection;
import java.util.List;

import com.jk.entity.Product;
import com.jk.entity.Sale;
import com.jk.entity.Users;


public interface UserDao {
	
	/**
	 * 通过条件查询-用户表记录数
	 * @param connection
	 * @param userName
	 * @param userRole
	 * @return
	 * @throws Exception
	 */
	public int getUserCount(Connection connection,String userName,int userRole)throws Exception;
	
	
	
	
	/**
	 * 增加用户信息
	 * @param connection
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int add(Connection connection,Users user)throws Exception;

	/**
	 * 通过userCode获取User
	 * @param connection
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public Users getLoginUser(Connection connection,String userCode)throws Exception;

	
	/**
	 * 查询所有商品
	 */
	public Product getProduct(Connection connection) throws Exception;
	
	/**
	 * 添加销售
	 */
	public int addSaleProduct(Connection connection,Sale sale) throws Exception;
	
		
}
