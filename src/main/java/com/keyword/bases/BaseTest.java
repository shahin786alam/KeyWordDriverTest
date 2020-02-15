package com.keyword.bases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver Initialization_Driver(String browsername) {
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			if(prop.getProperty("headless").equals("yes")) {
				ChromeOptions option=new ChromeOptions();
				//option.addArguments("window-size=1400, 800");
				option.addArguments("headless");
				driver=new ChromeDriver(option);
			}else {
				driver=new ChromeDriver();
			}
		}
		return driver;
	}
	
	public Properties Initialization_Properties() {
		prop= new Properties();
	
			try {
				FileInputStream fis= new FileInputStream("C:\\Users\\Shahin Alam\\eclipse-workspace\\KeyWordDriverFrameWorkTest"
						+ "\\src\\main\\java\\com\\qa\\keyword\\config\\config.properties");
			prop.load(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return prop;
	} 

	

}
