package com.bhawna.calories.controller;

import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.support.ExceptionMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhawna.calories.entity.FoodCalories;
import com.bhawna.calories.service.CaloriesService;

@RestController
@RequestMapping(value="/calories")
public class CaloriesController {
    CaloriesController(){
	System.out.println("inside CaloriesController");
    }
    @Autowired
    protected CaloriesService caloriesService;
    
    @CrossOrigin
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ResponseEntity<?> countIssuesByFoodCategories(@RequestParam("food") String foodCategories){
	ResponseEntity<?> response = null;
	int count = 0;
	try{
	    //count = CaloriesService.countIssuesByFoodCategories(foodCategories);
		FoodCalories food = caloriesService.getFoodCalories(foodCategories);
		/*food.setCalories("100");
		food.setFoodCategories("Laddo");
		food.setMeasure("100 gms");*/
	    response = new ResponseEntity<FoodCalories>(food, HttpStatus.OK);
	}catch(Exception e){
	    response = new ResponseEntity<ExceptionMessage>(new ExceptionMessage(e), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	return response ;
    }
   /* 
    @RequestMapping(value = "/issues/date", method = RequestMethod.GET)
    public ResponseEntity<?> countIssuesByDate(@RequestParam("date") String dateString){
	ResponseEntity<?> response = null;
	int count = 0;
	try{
	    List<String> priorities = new LinkedList<String>();
	    String accountName = "";
	    List<String> resultList = CaloriesService.countIssuesByFoodCategories(foodCategories, measure, calories);
	    System.out.println(resultList);
	    response = new ResponseEntity<List<String>>(resultList, HttpStatus.OK);
	}catch(Exception e){
	    response = new ResponseEntity<ExceptionMessage>(new ExceptionMessage(e), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	return response ;
    } */
}
