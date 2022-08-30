package com.java.programmer.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.java.programmer.entity.Food;

@Service
public interface FoodService {
	public int add(Food food);
	public int edit(Food food);
	public List<Food> findList(Map<String, Object> queryMap);
	public Integer getTotal(Map<String, Object> queryMap);
	public int delete(Long id);
	public Food find(Long id);
	public int updateSels(Long id,Long num);
}
