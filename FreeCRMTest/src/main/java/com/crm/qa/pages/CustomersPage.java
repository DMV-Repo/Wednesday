package com.crm.qa.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.dataProviderClass;

public class CustomersPage extends managerloginPage{
	public static String custName,lastname, postcode,uname,lname,pcode;
	

	@Test(dataProvider = "dp", dataProviderClass = dataProviderClass.class)
	public void Customers(String custName,String lastname, String postcode) throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@ng-click='showCust()']")).click();
		driver.findElement(By.xpath("//input[@ng-model='searchCustomer']")).sendKeys(custName);
		driver.findElement(By.xpath("//input[@ng-model='searchCustomer']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String fname =driver.findElement(By.xpath("//tr[@class=\"ng-scope\"][1]//following::td[contains(text(),'custName')]")).getText();
		String lsname =driver.findElement(By.xpath("//tr[@class=\"ng-scope\"][1]//following::td[contains(text(),'lastname')]")).getText();
		String code =driver.findElement(By.xpath("//tr[@class=\"ng-scope\"][1]//following::td[contains(text(),'postcode')]")).getText();
		if(fname.equals(custName) && lsname.equals(lastname) && code.equals(postcode)) {
			Assert.assertSame(fname, custName);
		}else {
			Assert.fail("name not found");
		}
	}

}
