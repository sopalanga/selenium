package salesforce_login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTOsalsesforce {
	/*public static WebDriver driver =null;
	
	static void waitForPageElementToVisible(WebElement eleToWait)  
    {
    WebDriverWait Wait = new WebDriverWait(LoginTOsalsesforce.driver,30);
 	Wait.until(ExpectedConditions.visibilityOf(eleToWait));
    }*/

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
			
			System.out.println("URL1 ::" + prop.getProperty("URL1"));
			System.out.println("URL2 ::" + prop.getProperty("URL2"));
			System.out.println("URL3 ::" + prop.getProperty("URL3"));
			System.out.println("User name::" +prop.getProperty("Username"));
		    System.out.println("Password::" +prop.getProperty("Password"));
		    
	  }
	}


