package com.crm.qa.pages;

import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.hdf.extractor.NewOleFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.testBase;

import bsh.This;

public class managerloginPage extends testBase {
	
	
	@FindBy(css = "button[ng-click='manager()']")
	static
	WebElement loginLink;

public String validateloginpageTitle() {
	return driver.getTitle();
}

public static void login() {
	
	PageFactory.initElements(driver, new managerloginPage());
	loginLink.click();
	
	
	
}

}
