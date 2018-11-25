
package com.jk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.ModifyOrder;
import com.jk.entity.Order;
import com.jk.entity.Product;
import com.jk.service.ModifyOrderService;

/**
 * @author:caijiankai
 *@date: 2018年9月8日 上午10:31:05
 *@Copyright: 2018
 *注意:本内容严格保密,禁止外泄或私自用于商业用途
 *
 */
@Service("modifyOrderService")
public class ModifyOrderServiceImpl implements ModifyOrderService {

	/* (non-Javadoc)
	 * @see com.jk.service.ModifyOrderService#checkOrder(int)
	 */
	
	@Autowired
	private ModifyOrder mo;
	
	@Override
	public List<Order> checkOrder(int id) {
		// TODO Auto-generated method stub
		return mo.checkOrder(id);
	}

	/* (non-Javadoc)
	 * @see com.jk.service.ModifyOrderService#checkProducts(int)
	 */
	@Override
	public List<Product> checkProducts(int id) {
		// TODO Auto-generated method stub
		return mo.checkProducts(id);
	}

	/* (non-Javadoc)
	 * @see com.jk.service.ModifyOrderService#addOrderTB(com.jk.entity.Order)
	 */
	@Override
	public int addOrderTB(Order or) {
		// TODO Auto-generated method stub
		return mo.addOrderTB(or);
	}

	/* (non-Javadoc)
	 * @see com.jk.service.ModifyOrderService#deleteOrderTB(int)
	 */
	@Override
	public int deleteOrderTB(int id) {
		// TODO Auto-generated method stub
		return mo.deleteOrderTB(id);
	}

	/* (non-Javadoc)
	 * @see com.jk.service.ModifyOrderService#seeProducts()
	 */
	@Override
	public List<Product> seeProducts() {
		// TODO Auto-generated method stub
		return mo.seeProducts();
		
	}

	/* (non-Javadoc)
	 * @see com.jk.service.ModifyOrderService#checkProductName()
	 */
	@Override
	public List<Product> checkProductName() {
		// TODO Auto-generated method stub
		return mo.checkProductName();
	}

}
