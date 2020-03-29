package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.CustomersPage;
import com.crm.qa.pages.addNewCustomer;
import com.crm.qa.pages.managerloginPage;

public class CustomersTest extends CustomersPage{
	
	@BeforeMethod
	public void launchbrowser() throws IOException {
		initialization();
		managerloginPage.login();
		
	}

@Test
public void customerTest() throws InterruptedException {
	
	Customers(custName,lastname, postcode);
}


}
