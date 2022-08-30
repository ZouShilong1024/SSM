package com.java.programmer.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.java.programmer.entity.FoodCategory;

@Service
public interface FoodCategoryService {
	public int add(FoodCategory foodCategory);
	public int edit(FoodCategory foodCategory);
	public List<FoodCategory> findList(Map<String, Object> queryMap);
	public Integer getTotal(Map<String, Object> queryMap);
	public int delete(Long id);
	public List<FoodCategory> findAll();
}
