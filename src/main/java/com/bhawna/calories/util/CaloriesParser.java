package com.bhawna.calories.util;


import java.io.File;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.bhawna.calories.entity.FoodCalories;


public interface CaloriesParser {
    public List<FoodCalories> parseReportFile(String fileAsolutePath) throws EncryptedDocumentException, InvalidFormatException;
    public List<FoodCalories> parseReportFile(File file) throws EncryptedDocumentException, InvalidFormatException;
    public List<FoodCalories> parseReportFile(InputStream inputStream) throws EncryptedDocumentException, InvalidFormatException;
}
