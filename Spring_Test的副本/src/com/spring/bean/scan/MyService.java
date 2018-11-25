
package com.spring.bean.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author caijiankai
 *
 */
@Service
public class MyService {
		@Autowired
		private DAO dao;
		public void add() {
			System.out.println("service 当中的add方法调用");
			dao.insert();
		
		}
}
