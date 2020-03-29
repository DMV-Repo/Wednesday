package com.crm.qa.pages;

import org.apache.poi.hdf.extractor.NewOleFile;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.qa.base.dataProviderClass;

import bsh.This;

public class openAccountPage extends managerloginPage {
	public static String cname, ccurrency;
	
	@FindBy(css = "button[ng-click='openAccount()']")
	static WebElement openaccoutBtn;
	@FindBy(xpath = "//select[@id='userSelect']")
	static WebElement csName;
	@FindBy(xpath = "//select[@id='currency']")
	static WebElement csCurrency;
	@FindBy(css = "button[type='submit']")
	static WebElement processBtn;
	
	
	@Test(dataProvider = "dp", dataProviderClass = dataProviderClass.class)
	
	public static void openAccount(String cname, String currency) {
		PageFactory.initElements(driver, new openAccountPage());
		
		openaccoutBtn.click();
		Select selname = new Select(csName);
		selname.selectByVisibleText(cname);
		Select selcurrency = new Select(csCurrency);
		selcurrency.selectByVisibleText(currency);
		processBtn.click();
		driver.switchTo().alert().accept();
		
	}

}
