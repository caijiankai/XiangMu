package com.jk.dao.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.jk.dao.BaseDao;
import com.jk.entity.Product;
import com.jk.entity.Sale;
import com.jk.entity.Users;
import com.mysql.jdbc.StringUtils;

/**
 * dao层抛出异常，让service层去捕获处理
 * @author Administrator
 *
 */
@Repository
public  class UserDaoImpl implements UserDao{
	/**
	 * 通过条件查询-用户表记录数
	 * @param connection
	 * @param userName
	 * @param userRole
	 * @return
	 * @throws Exception
	 */
	@Override
	public int getUserCount(Connection connection, String userName, int id)
			throws Exception {
		// TODO Auto-generated method stub
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int count = 0;
		if(connection != null){
			StringBuffer sql = new StringBuffer();
			sql.append("select count(1) as count from users u,sale s where u.id = s.userId");
			List<Object> list = new ArrayList<Object>();
			if(!StringUtils.isNullOrEmpty(userName)){
				sql.append(" and u.userName like ?");
				list.add("%"+userName+"%");
			}
			if(id > 0){
				sql.append(" and u.id = ?");
				list.add(id);
			}
			Object[] params = list.toArray();
			System.out.println("sql ----> " + sql.toString());
			rs = BaseDao.execute(connection, pstm, rs, sql.toString(), params);
			if(rs.next()){
				count = rs.getInt("count");
			}
			BaseDao.closeResource(null, pstm, rs);
		}
		return count;
	}
	
	
	
	/**
	 * 
	 * 插入新用户
	 * 
	 */
	@Override
	public int add(Connection connection, Users user) throws Exception {
		// TODO Auto-generated method stub
		PreparedStatement pstm = null;
		int updateRows = 0;
		if(null != connection){
			String sql = "insert into users (id,userName,realName" +
					"password) " +
					"values(?,?,?,?)";
			Object[] params = {user.getId(),user.getRealName(),user.getPassword(),
							user.getUserName()};
			updateRows = BaseDao.execute(connection, pstm, sql, params);
			BaseDao.closeResource(null, pstm, null);
		}
		return updateRows;
	}

	/**
	 * 查询所有用户
	 * 
	 */
	@Override
	public Users getLoginUser(Connection connection, String userName)
			throws Exception {
		
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Users user = null;
		if(null != connection){
			String sql = "select * from users where userName=?";
			Object[] params = {userName};
			rs=BaseDao.execute(connection, pstm, rs, sql, params);
			if(rs.next()){
				user = new Users();
				user.setId(rs.getInt("id"));
				user.setPassword(rs.getInt("password"));
				user.setRealName(rs.getString("realName"));
				user.setUserName(rs.getString("userName"));						
			}
			BaseDao.closeResource(null, pstm, rs);
		}
		return user;
	}

	/**
	 * 查询所有商品
	 */
	@Override
	public Product getProduct(Connection connection) throws Exception {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Product pr=null;
		if(null != connection){
			String sql = "SELECT * FROM test2.product ";	
			rs = BaseDao.execute(connection, pstm, rs, sql);
			if(rs.next()){
				pr = new Product();
				pr.setId(rs.getInt("id"));
				pr.setProductName(rs.getString("productName"));
				pr.setQuantity(rs.getInt("quantity"));									
			}
			BaseDao.closeResource(null, pstm, rs);
		}
		return pr;
	
	}



	/* (non-Javadoc)
	 * @see com.jk.dao.user.UserDao#addSaleProduct(java.sql.Connection, com.jk.entity.Sale)
	 */
	@Override
	public int addSaleProduct(Connection connection, Sale sale) throws Exception {
					PreparedStatement pstm = null;
					int updateRows = 0;
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					if(null != connection){
						String sql = "INSERT INTO `test2`.`sale` (`price`, `quantity`, `totalPrice`,"
					+ " `saleDate`, `userId`, `productId`) "
					+ "VALUES (?, ?,?,?,?,?)";
						Object[] params= {sale.getPrice(),sale.getQuantity(),sale.getTotalPrice(),
								df.format(new Date()),sale.getUserId(),sale.getProductId()};
						updateRows = BaseDao.execute(connection, pstm, sql, params);
						BaseDao.closeResource(null, pstm, null);
	
					}
					return updateRows;
	
	}
	
	
}




