/**
 * 
 */
package com.jk.Util;

import java.sql.DriverManager;

/**
 * @author caijiankai
 *数据库连接
 *
 */
public class Connection {
	private static Connection connection = null;
    public static Connection getMysqlConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");    	 //加载数据库连接驱动
            String user = "root";                        //用户名
            String pwd = "";                       		 //密码
            String url = "jdbc:mysql://localhost:3306/test2";//连接URL
            connection = (Connection) DriverManager.getConnection(url, user, pwd);//获取连接
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
      
    }

}	

