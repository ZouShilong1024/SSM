package com.java.programmer.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.programmer.entity.Order;
import com.java.programmer.entity.OrderItem;
/**
 * 订单信息dao
 * 
 *
 */
@Repository
public interface OrderDao {
	public int add(Order Order);
	public int addItem(OrderItem orderItem);
	public int edit(Order Order);
	public List<Order> findList(Map<String, Object> queryMap);
	public Integer getTotal(Map<String, Object> queryMap);
	public int delete(Long id);
}
