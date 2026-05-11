package com.Yarragunta.Dinesh.Kumar.Reddy.myapp.service;

import com.Yarragunta.Dinesh.Kumar.Reddy.myapp.model.FoodItem;
import com.Yarragunta.Dinesh.Kumar.Reddy.myapp.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {

    @Autowired
    private FoodItemRepository foodItemRepository;

    // Get all food items
    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }

    // Add new food item
    public FoodItem addFoodItem(FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }

    // Delete food item
    public void deleteFoodItem(Long id) {
        foodItemRepository.deleteById(id);
    }
}
