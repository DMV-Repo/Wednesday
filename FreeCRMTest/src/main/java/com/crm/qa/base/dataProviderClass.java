package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;



public class dataProviderClass {
	static XSSFWorkbook excelWorkbook = null;
	static XSSFSheet excelSheet = null;
	static XSSFRow row = null;
	static XSSFCell cell = null;
	
	
	public static Object[][] getData(String sheetName) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Abdel\\eclipse-workspace\\com.mrgClac\\src\\main\\java\\com\\mrgClac\\util\\MCExcel.xlsx"); // Your .xlsx file name along with path
		excelWorkbook = new XSSFWorkbook(fis);
		// Read sheet inside the workbook by its name
		excelSheet = excelWorkbook.getSheet(sheetName); //Your sheet name
		int rowCount = excelSheet.getLastRowNum() ;
		int colCount = excelSheet.getRow(0).getLastCellNum();

		Object data[][] = new Object[rowCount][colCount];
		for (int rNum = 0; rNum < rowCount; rNum++) 
		{
			for (int cNum = 0; cNum < colCount; cNum++) 
			{
				data[rNum][cNum] =excelSheet.getRow(rNum+1).getCell(cNum).toString(); 
			}
			
		}
		return data;
		
		//data[6][2]= {{700000,7000},{800000,8000},{500000,5000},{400000,4000},{200000,2000}};
	}
	
	@DataProvider(name="dp1")
	public Object[][] getTestdata() throws IOException {
		
		Object data[][] =dataProviderClass.getData("mchomepage");
		return data;
	}
	}

