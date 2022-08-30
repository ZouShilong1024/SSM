package com.java.programmer.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.java.programmer.entity.Order;
import com.java.programmer.entity.OrderItem;

@Service
public interface OrderService {
	public int add(Order order);
	public int addItem(OrderItem orderItem);
	public int edit(Order Order);
	public List<Order> findList(Map<String, Object> queryMap);
	public Integer getTotal(Map<String, Object> queryMap);
	public int delete(Long id);
}
