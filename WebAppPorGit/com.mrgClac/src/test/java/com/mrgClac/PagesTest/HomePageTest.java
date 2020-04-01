package com.mrgClac.PagesTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mrgClac.Pages.HomePage;
import com.mrgClac.util.dataProviderClass;

public class HomePageTest extends HomePage {

	@BeforeMethod
	public void launchBrowser() throws IOException {
		setup();
	}

	@Test(dataProviderClass = dataProviderClass.class,dataProvider="dp1")

	public void homepageTest(String Hv, String dpay,String ir) {
		homevalue(Hv);
		downpay(dpay);
		intRate(ir);
		calBtn();

	}



	
	

	//@AfterMethod public void Cleanup() { cleanup(); }
	 

}
