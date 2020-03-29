package com.crm.qa.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.managerloginPage;

public class loginPaheTest extends managerloginPage {

	public static managerloginPage page;
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		
	}
	
	@Test
	public void loginTest() {
		
		login();
	}
	
	@AfterMethod
	public void Cleanup() {
		cleanup();
	}

}
