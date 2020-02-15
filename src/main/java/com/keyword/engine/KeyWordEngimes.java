package com.keyword.engine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.keyword.bases.BaseTest;

public class KeyWordEngimes {
//	public WebDriver driver;
//	public Properties prop;
//
//	public static Workbook book;
//	public static Sheet sheet;
//
//	public BaseTest base;
//	public WebElement element;
//
//	public final String SCENARIO_SHEET_PATH = "C:\\Users\\Shahin Alam\\eclipse-workspace"
//			+ "\\KeyWordDriverTest\\src\\main\\java\\com\\keyword\\testdata\\KeyWord.xlsx.xlsx";
//
//	public void StartExecution(String sheetname) {
//		String locatorname = null;
//		String locatorvalue = null;
//		FileInputStream file = null;
//
//		try {
//			file = new FileInputStream(SCENARIO_SHEET_PATH);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//
//		try {
//			book = WorkbookFactory.create(file);
//		} catch (EncryptedDocumentException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		sheet = book.getSheet(sheetname);
//		int k = 0;
//		for (int i = 0; i < sheet.getLastRowNum(); i++) {
//			String locatorcolvalue = sheet.getRow(i + 1).getCell(k + 1).toString().trim();// id=username
//			if (!locatorcolvalue.equalsIgnoreCase("NA")) {
//				locatorname = locatorcolvalue.split("=")[0].trim();// id
//				locatorvalue = locatorcolvalue.split("=")[1].trim();// username
//			}
//			String Actions = sheet.getRow(i + 1).getCell(k + 2).toString().trim();
//			String value = sheet.getRow(i + 1).getCell(k + 3).toString().trim();
//
//			switch (Actions) {
//			case "open Browser":
//				base = new BaseTest();
//				prop = base.Initialization_Properties();
//				if (value.isEmpty() || value.equals("NA")) {
//					driver = base.Initialization_Driver(prop.getProperty("browser"));
//				} else {
//					base.Initialization_Driver("value");
//				}
//				break;
//
//			case "enter url":
//				if (value.isEmpty() || value.equals("NA")) {
//					driver.get(prop.getProperty("url"));
//				} else {
//					driver.get(value);
//				}
//				break;
//
//			case "quit":
//				driver.quit();
//				break;
//
//			default:
//				break;
//			}
//
//			switch (locatorname) {
//			case "name":
//				element = driver.findElement(By.id(locatorvalue));
//				if (Actions.equalsIgnoreCase("sendkeys")) {
//					element.clear();
//					element.sendKeys(value);
//				} else if (Actions.equalsIgnoreCase("click")) {
//					element.click();
//				}
//				locatorname = null;
//				break;
//			case "xpath":
//				element = driver.findElement(By.xpath(locatorvalue));
//				if (Actions.equalsIgnoreCase("sendkeys")) {
//					element.clear();
//					element.sendKeys(value);
//				} else if (Actions.equalsIgnoreCase("click")) {
//					element.click();
//				}
//				locatorname = null;
//				break;
//
//			case "linkText":
//				element = driver.findElement(By.linkText(locatorvalue));
//				element.click();
//				locatorname = null;
//				break;
//			default:
//				break;
//			}
//
//		}
//
//	}

}
