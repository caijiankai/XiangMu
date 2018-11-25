/**
 * 
 */
package com.spring.bean.scan;

import org.springframework.stereotype.Repository;

/**
 * @author caijiankai
 *
 */
@Repository
public class DAO {
		public void insert() {
			System.out.println("正在调用DAO中的insert方法");
		}
}
