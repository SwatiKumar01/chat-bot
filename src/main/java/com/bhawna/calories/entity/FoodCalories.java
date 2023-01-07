
package com.bhawna.calories.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FOOD_CALORIES")
public class FoodCalories implements Serializable{
    
    
    private static final long serialVersionUID = -5010713110975521552L;
    
    @Id
    @Column(name = "FOOD_CATEGORIES")
    private String foodCategories;
    @Column(name="MEASURE")
    private String measure;
    @Column(name="CALORIES")
    private String calories;
    
    public String getfoodCategories() {
        return foodCategories;
    }
    public void setFoodCategories(String foodCategories) {
        this.foodCategories = foodCategories;
    }
    public String getMeasure() {
        return measure;
    }
    public void setMeasure(String measure) {
        this.measure = measure;
    }
    public String getCalories() {
        return calories;
    }
    public void setCalories(String calories) {
        this.calories = calories;
    }
    @Override
    public String toString() {
	return "CaloriesIssue [foodCategories=" + foodCategories + "]";
    }
}
