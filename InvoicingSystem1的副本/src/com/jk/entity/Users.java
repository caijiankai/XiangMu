package com.jk.entity;
/**
 * 
 */

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author caijiankai
 *用户
 */
public class Users {
		//用户id
		private int id;
		//用户名
		@NotEmpty(message="用户名必填")
		private String userName;
		//密码
		@NotNull(message="密码必填")
		@Length(min=6,max=10,message="用户密码长度为6-10")
		private int password;
		//真实姓名
		private String realName;
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the userName
		 */
		public String getUserName() {
			return userName;
		}
		/**
		 * @param userName the userName to set
		 */
		public void setUserName(String userName) {
			this.userName = userName;
		}
		/**
		 * @return the password
		 */
		public int getPassword() {
			return password;
		}
		/**
		 * @param password the password to set
		 */
		public void setPassword(int password) {
			this.password = password;
		}
		/**
		 * @return the realName
		 */
		public String getRealName() {
			return realName;
		}
		/**
		 * @param realName the realName to set
		 */
		public void setRealName(String realName) {
			this.realName = realName;
		}
		
}
