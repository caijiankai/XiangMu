/**
 * 
 */
package com.jk.service;

import java.util.List;

import com.jk.entity.*;

/**
 * @author:caijiankai
 *@date: 2018年9月8日 上午10:27:20
 *@Copyright: 2018
 *注意:本内容严格保密,禁止外泄或私自用于商业用途
 *
 */
public interface ModifyOrderService {
		//查询订单的方法,根据订单ID查询订单
		public List<Order>checkOrder(int id);
		//查询商品,根据商品ID查询商品
		public List<Product> checkProducts(int id);
		//添加新订单ID的方法
		public int addOrderTB(Order or);
		//删除订单
		public int deleteOrderTB(int id);
		//显示所有商品
		public List<Product> seeProducts();
		//查询所有商品名字
		public List<Product> checkProductName();
}
