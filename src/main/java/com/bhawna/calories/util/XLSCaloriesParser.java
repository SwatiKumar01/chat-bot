package com.bhawna.calories.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Component;

import com.bhawna.calories.entity.FoodCalories;

@Component
public class XLSCaloriesParser implements CaloriesParser{

	@Override
	public List<FoodCalories> parseReportFile(String fileAsolutePath) throws EncryptedDocumentException, InvalidFormatException {
		List<FoodCalories> list = new LinkedList<FoodCalories>();
		try {
			FileInputStream excelFileInputStream = new FileInputStream(new File(fileAsolutePath));
			list = parseReportFile(excelFileInputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<FoodCalories> parseReportFile(File file) throws EncryptedDocumentException, InvalidFormatException {
		List<FoodCalories> list = new LinkedList<FoodCalories>();
		try {
			FileInputStream excelFileInputStream = new FileInputStream(file);
			list = parseReportFile(excelFileInputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<FoodCalories> parseReportFile(InputStream inputStream) throws EncryptedDocumentException, InvalidFormatException {
		Workbook workbook;
		List<FoodCalories> issueList = new LinkedList<>();
		try {
			workbook = WorkbookFactory.create(inputStream);

			Sheet sheet = workbook.getSheetAt(0);
			Map<String, Integer> headerMap = readHeader(workbook, 0, 0);
			//List<List<String>> rows = readRows(workbook, sheet, 1, sheet.getPhysicalNumberOfRows());
			List<List<String>> rows = readRows(workbook, sheet, 1, 203);


			ExcelValuesMapper<FoodCalories> mapper = new ExcelValuesMapper<FoodCalories>() {

				@Override
				public List<FoodCalories> mapValues(Map<String, Integer> headerMap, List<List<String>> rowList) {
					List<FoodCalories> list = new LinkedList<>();
					int count = 0;
					for(List<String> row : rowList){
						System.out.println(count);
						FoodCalories data = new FoodCalories();
						data.setFoodCategories(readCaseValueAsString(row.get(headerMap.get("Food Categories"))));
						data.setMeasure(row.get(headerMap.get("Measure")));
						data.setCalories(row.get(headerMap.get("Calories")));
						list.add(data);
						count++;
					}
					return list;
				}
				private String readCaseValueAsString(String value){
					try{
						return (int) Double.parseDouble(value)+"";
					}catch(NumberFormatException nfe){
						return value.trim();
					}

				}

			};

			issueList = mapper.mapValues(headerMap, rows);


		}catch (IOException e) {
			e.printStackTrace();
		}
		return issueList;

	}

	private List<List<String>> readRows(Workbook workbook, Sheet sheet, int startRow, int endRow){

		List<List<String>> allRowsValue = new ArrayList<>(endRow - startRow + 1);
		for(int rowIndex = startRow; rowIndex <= endRow; rowIndex++)
		{
			System.out.println("reading row: " + rowIndex);
			Row row = sheet.getRow(rowIndex);
			if(row !=null){
				int cellCount = row.getPhysicalNumberOfCells();
				List<String> rowValues = new ArrayList<String>(cellCount);
				Iterator<Cell> cellIter = row.iterator();
				while(cellIter.hasNext()){
					Cell cell = cellIter.next();
					String value = readCellValString(cell);
					rowValues.add(value);
				}
				allRowsValue.add(rowValues);
			}
		}
		return allRowsValue;

	}

	private Map<String, Integer> readHeader(Workbook workbook, int sheetNo, int rownum){

		Sheet sheet = workbook.getSheetAt(sheetNo);
		return readHeader(workbook, sheet, 0);
	}
	private Map<String, Integer> readHeader(Workbook workbook, Sheet sheet, int rownum){
		Map<String, Integer> headerMap = new HashMap<String, Integer>();
		Row headerRow = sheet.getRow(rownum);
		Iterator<Cell> cellIter = headerRow.iterator();
		int index = 0;
		while(cellIter.hasNext()){
			Cell cell = cellIter.next();
			String value = readCellValString(cell);
			headerMap.put(value, index++);
		}
		return headerMap;
	}

	private String readCellValString(Cell cell){
		if (cell.getCellTypeEnum().equals(CellType.STRING)) {
			String value = cell.getStringCellValue();
			value = value.trim();
			return CaloriesUtils.isNotNullEmptyString(value) ? value : "";
		} else if (cell.getCellTypeEnum().equals(CellType.NUMERIC)) {
			return cell.getNumericCellValue() + "";
		} else if(cell.getCellTypeEnum().equals(CellType.BLANK)){
			return "";
		} else{
			return "";
		}
	}

}
