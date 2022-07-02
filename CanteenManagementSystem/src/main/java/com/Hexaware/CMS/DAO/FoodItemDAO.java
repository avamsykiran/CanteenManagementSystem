package com.Hexaware.CMS.DAO;

import java.util.List;

import com.Hexaware.CMS.Model.FoodItem;

public interface FoodItemDAO {

	List<FoodItem> getAll();
	FoodItem add(FoodItem foodItem);
}
