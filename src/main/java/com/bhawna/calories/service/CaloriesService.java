package com.bhawna.calories.service;


import java.util.List;

import com.bhawna.calories.entity.FoodCalories;
public interface CaloriesService {
    public void emptyAndInsertAllIntoDB(List<FoodCalories> issueList);
    public FoodCalories getFoodCalories(String food);
  
}
