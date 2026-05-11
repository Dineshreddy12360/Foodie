package com.Yarragunta.Dinesh.Kumar.Reddy.myapp.repository;

import com.Yarragunta.Dinesh.Kumar.Reddy.myapp.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {

}