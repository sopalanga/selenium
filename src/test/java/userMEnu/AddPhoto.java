package userMEnu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddPhoto {
	private static WebDriver driver;

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
			driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
			Thread.sleep(2000);
			//span[@class='profileImage chatter-avatarFull chatter-avatar']//img[@class='chatter-photo']
			driver.findElement(By.xpath("//span[@class='profileImage chatter-avatarFull chatter-avatar']//img[@class='chatter-photo']"));
			WebElement ele = driver.findElement(By.xpath("//span[@class='profileImage chatter-avatarFull chatter-avatar']//img[@class='chatter-photo']"));
			Thread.sleep(2000);
			 Actions act = new Actions(driver);
			 act.moveToElement(ele).perform();
				//a[@id='uploadLink']
				
				driver.findElement(By.xpath("//a[@id='uploadLink']")).click();
				Thread.sleep(2000);
				
				driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));
				Thread.sleep(2000);
				//WebDriverWait Wait = new WebDriverWait(driver,30);
				//Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"))));
				driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
				Thread.sleep(2000);
				
				driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile")).sendKeys("C:\\Users\\schavalmane\\Desktop\\Cute.jpg");
				Thread.sleep(10000);
				
				
				driver.findElement(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadBtn']")).click();
				System.out.println("image uploaded");
				Thread.sleep(10000);
				
				driver.findElement(By.xpath("//div[@class='uploadButtonPanel']"));
				Thread.sleep(10000);
				
				driver.findElement(By.id("j_id0:j_id7:save")).click();
				driver.switchTo().defaultContent();
				Thread.sleep(10000);
				
	}

	
	
}


