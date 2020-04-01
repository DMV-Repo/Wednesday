package com.mrgClac.Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	
	public static void main(String[] args) throws IOException {
		
	Properties abdel  = new Properties();
	
	FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Abdel\\eclipse-workspace\\com.mrgClac\\src\\main\\resources\\config.properties");
		abdel.load(fileInputStream);
	String uRLString = abdel.getProperty("url");
		WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	//Open url
	
	
	driver.get(uRLString);
	
	}
}
