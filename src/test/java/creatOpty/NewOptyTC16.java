package creatOpty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewOptyTC16 {
	
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
			//driver.findElement(By.xpath("//input[@id='username']")).clear();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(prop.getProperty("Username"));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='password']")).clear();
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(prop.getProperty("Password"));
			Thread.sleep(2000);
			
		
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//li[@id='Opportunity_Tab']")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//input[@name='new']")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//input[@name='opp3']")).sendKeys(prop.getProperty("OpportunityName"));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='opp4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td//td[2]//span[1]//a[1]//img[1]")).click();
			Thread.sleep(2000);
			
			driver.switchTo().frame(driver.findElement(By.id("//[@name='searchFrame']")));
			driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys(prop.getProperty("Search"));
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='go']")).click();
			Thread.sleep(2000);
			
			
			
			driver.findElement(By.xpath("//input[@name='opp9']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='calToday']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[contains(text(),'Prospecting')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='opp12']"));
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//option[contains(text(),'Web')]")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@name='opp17']")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//td[@class='last dataCol']//img[@class='lookupIcon']")).click();
		    Thread.sleep(2000);
		 
		    driver.findElement(By.xpath("//td[@class='last dataCol']")).click();
		    Thread.sleep(2000);
			
		  
		   // driver.switchTo().frame(driver.findElement(By.id("searchFrame")));
			//System.out.println("sucess");
		    //driver.findElement(By.xpath("/ //a[contains(@class,'dataCell')]")).click();
			
		    driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']")).click();
			
	}			

}
