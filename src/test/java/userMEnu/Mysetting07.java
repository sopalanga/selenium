package userMEnu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mysetting07 {
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
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(prop.getProperty("Username"));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(prop.getProperty("Password"));
			Thread.sleep(2000);
			
			
	
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("PersonalInfo_font")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[contains(text(),'Login History')]")).click();
			Thread.sleep(2000);
		
			//driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
			//Thread.sleep(2000);
			
			
			
			driver.findElement(By.id("DisplayAndLayout_font")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[contains(text(),'Customize My Tabs')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//select[@name='p4']")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//option[contains(text(),'Salesforce Chatter')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[contains(text(),'Reports')]")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='save']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("EmailSetup_font")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[contains(text(),'My Email Settings')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='sender_name']")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='sender_name']")).sendKeys(prop.getProperty("EmailName"));
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@name='sender_email']")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='sender_email']")).sendKeys(prop.getProperty("EmailAddress"));
			Thread.sleep(3000);
			
			driver.findElement(By.id("auto_bcc0")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//td[contains(@class,'pbButtonb')]//input[contains(@name,'save')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//body/div/div/table/tbody/tr/td/div/div/div[6]/a[1]")).click();
			Thread.sleep(2000);
			//span[contains(text(),'Activity Reminders')]
			
			driver.findElement(By.xpath("//span[contains(text(),'Activity Reminders')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("testbtn")).click();
			Thread.sleep(2000);
	}
}
