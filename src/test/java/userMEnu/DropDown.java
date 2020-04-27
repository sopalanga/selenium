package userMEnu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import examExcel.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown extends Browser{

	public static void main(String[] args) throws Exception  {
		  File file = new File("C:\\Users\\schavalmane\\eclipse-workspace\\TestCases\\testcases.properties");
		  
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			
			//load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
			WebDriver driver =null;
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			//WebDriver driver1 = new ChromeDriver();
			driver.get(prop.getProperty("URL1"));
			driver.manage().window().maximize();
			driver.get(prop.getProperty("URL2"));
			driver.get(prop.getProperty("URL3"));
			//WebDriverWait Wait = new WebDriverWait(driver,30);
			//Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("//input[@id='username']"))));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(prop.getProperty("Username"));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(prop.getProperty("Password"));
			Thread.sleep(3000);
			
			
	
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
			Thread.sleep(3000);
			
	}

	
	}


