package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.dataProviderClass;
import com.crm.qa.base.testBase;



public class addNewCustomer extends managerloginPage{
	public static String uname, lname,pcode;
	@FindBy(css = "button[ng-click='addCust()']")
	WebElement addCustomerLink;

	@FindBy(css = "input[placeholder='First Name']")
	WebElement firstname;
	
	@FindBy(css = "input[placeholder='Last Name']")
	WebElement lastname;
	
	@FindBy(css =  "input[placeholder='Post Code']")
	WebElement postCode;
	
	@FindBy(css = "button[type='submit']")
	WebElement laddCustomerBtn;
	

public String validateloginpageTitle() {
	return driver.getTitle();
}
@Test(dataProvider = "dp", dataProviderClass = dataProviderClass.class)
public  void  AddCustomer(String uname, String lname,String pcode) {
	PageFactory.initElements(driver, this);
	
	addCustomerLink.click();
	firstname.sendKeys(uname);
	lastname.sendKeys(lname);
	postCode.sendKeys(pcode);
	laddCustomerBtn.click();
	driver.switchTo().alert().accept();
	
	
}


}
