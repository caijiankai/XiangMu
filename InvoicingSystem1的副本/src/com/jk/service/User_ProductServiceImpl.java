/**
 * 
 */
package com.jk.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jk.dao.BaseDao;
import com.jk.dao.user.UserDao;
import com.jk.entity.Product;
import com.jk.entity.Sale;
import com.jk.entity.Users;

/**
 * @author caijiankai
 *
 */
@Service
public class User_ProductServiceImpl implements User_ProductService {
	
	@Resource
	private UserDao userDao;
	
	/**
	 * 增加用户信息
	 * @param user
	 * @return
	 */
	@Override
	public boolean add(Users users) {
			
		boolean flag = false;
		Connection connection = null;
		try {
			connection = BaseDao.getConnection();
			connection.setAutoCommit(false);//开启JDBC事务管理
			int updateRows = userDao.add(connection,users);
			connection.commit();
			if(updateRows > 0){
				flag = true;
				System.out.println("add success!");
			}else{
				System.out.println("add failed!");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				System.out.println("rollback==================");
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally{
			//在service层进行connection连接的关闭
			BaseDao.closeResource(connection, null, null);
		}
		return flag;
		

	}

	/**
	 * 通过userCode获取User
	 * @param connection
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	@Override
	public Users getLoginUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 查询所有商品
	 * @throws Exception 
	 */
	@Override
	public Product getProduct() throws Exception {
		Connection connection = null;
		Product pr=new Product();
		pr=userDao.getProduct(connection);
			
		return pr;
	}
	
	/**
	 * 查询指定商品的库存
	 */
	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 修改指定商品的库存
	 * 
	 */
	@Override
	public Product modifyProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	  * 对销售记录按指定的排序规则分页查询
	  */
	@Override
	public List<Product> queryProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 进行用户登陆的匹配
	 */
	@Override
	public Users login(String userName, int passWord) {
		Connection connection = null;
		Users user = null;
		try {
			//获取数据库连接
			connection = BaseDao.getConnection();
			//获取用户
			user = userDao.getLoginUser(connection, userName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeResource(connection, null, null);
		}		
		
		
		return user;
	}
	@Override
	public int getUserCount(String queryUserName, int queryUserRole) {
		// TODO Auto-generated method stub
		Connection connection = null;
		int count = 0;
		System.out.println("queryUserName ---- > " + queryUserName);
		System.out.println("queryUserRole ---- > " + queryUserRole);
		try {
			connection = BaseDao.getConnection();
			count = userDao.getUserCount(connection, queryUserName,queryUserRole);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeResource(connection, null, null);
		}
		return count;
	}

	/* (non-Javadoc)
	 * @see com.jk.service.User_ProductService#addSale(int, float, int)
	 */
	@Override
	public boolean addSale(int id, float price, int quantity) {
		boolean flag = false;
		Connection connection = null;
		Sale sale=null;
		int updateRows;
		sale.setId(id);
		sale.setPrice(price);
		sale.setQuantity(quantity);
		try {
			connection = BaseDao.getConnection();
			connection.setAutoCommit(false);//开启JDBC事务管理
			 updateRows=userDao.addSaleProduct(connection, sale);
			connection.commit();
			if(updateRows > 0){
				flag = true;
				System.out.println("add success!");
			}else{
				System.out.println("add failed!");
			}
		} catch (Exception e) {
			try {
				System.out.println("rollback==================");
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally{
			//在service层进行connection连接的关闭
			BaseDao.closeResource(connection, null, null);
		}
		
		return flag;
	
		
	}
	

}
