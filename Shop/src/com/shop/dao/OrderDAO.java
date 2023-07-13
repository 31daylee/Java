package com.shop.dao;

import java.util.List;

import com.shop.db.DBHelper;
import com.shop.vo.OrderVO;

public class OrderDAO extends DBHelper{

	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO customerDAO() {
		return instance;
	}
	
	private OrderDAO() {};
	
	public int insertOrder(OrderVO vo) {
		return 0;
	}
	public OrderVO selectOrder(int orderNo) {
		return null;
	}
	public List<OrderVO> selectOrders() {
		return null;
	}
	public int updateOrder(int orderNo) {
		return 0;
	}
	public int deleteOrder(int orderNo) {
		return 0;
	}

	public static OrderDAO getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
