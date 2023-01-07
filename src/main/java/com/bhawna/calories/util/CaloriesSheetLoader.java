package com.bhawna.calories.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhawna.calories.entity.FoodCalories;
import com.bhawna.calories.service.CaloriesService;

@Component
public class CaloriesSheetLoader {
    @Autowired
    protected CaloriesService caloriesService;
    @Autowired
    protected XLSCaloriesParser claoriesParser;
    @PostConstruct
    public void loadSheetIntoDb(){
    	List<FoodCalories> foodCaloriesList;

    try (InputStream inputStream = CaloriesSheetLoader.class.getResourceAsStream("/Calories.xlsx")){
    		foodCaloriesList = claoriesParser.parseReportFile(inputStream);
    		caloriesService.emptyAndInsertAllIntoDB(foodCaloriesList);
    	} catch (EncryptedDocumentException | InvalidFormatException e) {
    		e.printStackTrace();
    	} catch (IOException e1) {
    		e1.printStackTrace();
    	}
    }
}
