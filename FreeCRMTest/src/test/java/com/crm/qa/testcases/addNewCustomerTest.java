package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.dataProviderClass;
import com.crm.qa.pages.addNewCustomer;
import com.crm.qa.pages.managerloginPage;

public class addNewCustomerTest extends addNewCustomer {
	public static managerloginPage page ;
	@BeforeMethod
	
	public void setup() throws IOException {
		initialization();
		managerloginPage.login();
	}
	
	@Test
	public void AddnewCustomerTest() {
		
		AddCustomer( uname,lname,pcode);
		
	}
	@AfterMethod
	public void CleanupMethod() {
		cleanup();
	}

}
