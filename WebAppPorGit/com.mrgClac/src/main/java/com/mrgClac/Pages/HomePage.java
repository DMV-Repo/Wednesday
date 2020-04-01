package com.mrgClac.Pages;

import org.openqa.selenium.By;

import com.mrgClac.util.utilClass;

public class HomePage extends utilClass {
	
	public void homevalue(String hv) {
		
		
		driver.findElement(By.xpath(prop.getProperty("homvalxpath"))).sendKeys(hv);
		
	}
	public void downpay(String dp) {
		
		driver.findElement(By.id(prop.getProperty("dpayID"))).sendKeys(dp);
		
	}
	public void calBtn() {
		
		driver.findElement(By.xpath(prop.getProperty("CalBtnxpath"))).click();
		
	}
	 public void intRate(String ir) {
		  
		  driver.findElement(By.xpath(prop.getProperty("intRatedxpath"))).sendKeys(ir);
			
		}
	

}
