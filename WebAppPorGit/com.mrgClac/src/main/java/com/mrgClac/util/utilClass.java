package com.mrgClac.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utilClass extends dataProviderClass{
	
	public static WebDriver driver;
	public static Properties prop;
	

	public static void setup() throws IOException {
		
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Abdel\\eclipse-workspace\\com.mrgClac\\src\\main\\resources\\config.properties");
		prop.load(file);
		String brows = prop.getProperty("browser");
		if(brows.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}else
		
		if(brows.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else 
		if(brows.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
					}
		
		driver.get(prop.getProperty("url"));
			
		}
	
	public void cleanup() {
		driver.close();
	}

}
