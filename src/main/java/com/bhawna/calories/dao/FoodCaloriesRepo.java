
package com.bhawna.calories.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhawna.calories.entity.FoodCalories;

@Repository
public interface FoodCaloriesRepo extends JpaRepository<FoodCalories, String>{
}
