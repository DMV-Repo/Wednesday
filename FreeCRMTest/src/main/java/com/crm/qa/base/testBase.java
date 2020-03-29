package com.crm.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	 public static void initialization() throws IOException {
		 prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Abdel\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		 
	String browserName = prop.getProperty("browser");
	System.out.println(browserName);
	if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		if(prop.getProperty("headlessbrowser").equalsIgnoreCase("yes")) {
		ChromeOptions cOptions = new ChromeOptions();
		cOptions.addArguments("--Headless");
		driver = new ChromeDriver(cOptions);
		
		}else {driver = new ChromeDriver();}
}
	if(browserName.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		if(prop.getProperty("headlessbrowser").equalsIgnoreCase("yes")) {
		FirefoxOptions cOptions = new FirefoxOptions();
		cOptions.addArguments("--Headless");
		driver = new FirefoxDriver(cOptions);
		
		}else {driver = new FirefoxDriver();}
}
	e_driver = new EventFiringWebDriver(driver);
	eventListener = new WebEventListener();
	e_driver.register(eventListener);
	driver = e_driver ;
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
 }
	
		public void cleanup() {
			driver.close();
		}
		
		public static void captureScreenShot() throws IOException {
			
			File srcFile =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			Date d = new Date();

		    
			String screenShotName = d.toString().replace(":"," ").replace(" ", "")+ ".jpg";

			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"\\ScreenShots\\"+screenShotName));	
			}
}
