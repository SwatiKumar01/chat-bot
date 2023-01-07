package com.bhawna.calories.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bhawna.calories.dao.FoodCaloriesRepo;
import com.bhawna.calories.entity.FoodCalories;

@Service
public class CaloriesServiceImpl implements CaloriesService{

    @Autowired
    protected FoodCaloriesRepo foodCaloriesRepo;
    
   
    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public void emptyAndInsertAllIntoDB(List<FoodCalories> foodCaloriesList) {
    	foodCaloriesRepo.deleteAll();
    	foodCaloriesRepo.save(foodCaloriesList);
    }


	@Override
	public FoodCalories getFoodCalories(String food) {
		FoodCalories foodCalories = foodCaloriesRepo.findOne(food);
		if(foodCalories == null){
			throw new RuntimeException("No such food exist in our db");
		}
		return foodCalories;
	}
    
  
}

