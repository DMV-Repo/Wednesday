package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.managerloginPage;
import com.crm.qa.pages.openAccountPage;

public class openAccountPageTest extends openAccountPage{
	@BeforeMethod
	public void launchbrowser() throws IOException {
		initialization();
		managerloginPage.login();
	}
@Test
public static void openAccountPageTest() {
	
	openAccount(cname, ccurrency);
}
}
