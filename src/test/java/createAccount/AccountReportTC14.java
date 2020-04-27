package createAccount;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountReportTC14 {
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
			driver.get(prop.getProperty("URL4"));
			driver.manage().window().maximize();
			driver.get(prop.getProperty("URL5"));
			
			//WebDriverWait Wait = new WebDriverWait(driver,30);
			//Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("//input[@id='username']"))));
			driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='username']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(prop.getProperty("Username"));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='password']")).clear();
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(prop.getProperty("Password"));
			Thread.sleep(2000);
			
		
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
			Thread.sleep(10000);
			
			//3) CREATE ACCOUNT REPORT
			
			driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
			Thread.sleep(10000);
			
			//4) SELECTED REPORT OPTION
			
			
			driver.findElement(By.xpath("//input[@name='dateColumn']")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.id("ext-gen148")).click();
			Thread.sleep(5000);
			
			
			//driver.findElement(By.xpath("///div[contains(@class,'x-combo-list-item x-combo-selected')]")).click();
			//Thread.sleep(5000);
			
			driver.findElement(By.id("ext-comp-1055")).click();
			Thread.sleep(5000);
			
			//div[contains(text(),'Custom')]
			driver.findElement(By.xpath("//div[contains(text(),'Custom')]")).click();
			Thread.sleep(10000);
			
			
			
			driver.findElement(By.xpath("//input[contains(@name,'startDate')]")).click();
			Thread.sleep(10000);
			

			driver.findElement(By.id("ext-gen152")).click();
			Thread.sleep(5000);
			
			//driver.findElement(By.id("ext-gen281")).click();
			//Thread.sleep(5000);
			int date = 26;
			driver.findElement(By.xpath("//td[contains(@class,'x-date-active x-date-today x-date-selected')]//span[contains(text(),'"+date+"')]")).click();
			Thread.sleep(5000);
			//input[contains(@name,'endDate')]
			
			driver.findElement(By.xpath("//input[contains(@name,'endDate')]")).click();
			Thread.sleep(10000);
			

			driver.findElement(By.id("ext-gen154")).click();
			Thread.sleep(2000);
			//driver.findElement(By.id("ext-gen154")).clear();
			//Thread.sleep(2000);
			
			driver.findElement(By.id("ext-gen286")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("ext-gen285")).click();
			Thread.sleep(2000);
			int date2 = 26;
			driver.findElement(By.xpath("//span[contains(text(),'"+date2+"')]")).click();
			Thread.sleep(2000);
			
			}
	
}