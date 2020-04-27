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

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyProfile {

	
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
				//a[@class='contactInfoLaunch editLink']//img
				driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
				Thread.sleep(2000);
				//a[contains(text(),'About')]
				//driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")).click();
				driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
				Thread.sleep(2000);
				//System.out.println(driver.findElement(By.xpath("//a[contains(text(),'About')]")).getText());
				driver.findElement(By.xpath("//input[@id='lastName']")).clear();
				driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(prop.getProperty("LastName"));
				
				driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
				Thread.sleep(2000);
				//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]
				//driver.switchTo().frame(driver.findElement(By.id("cke_1_contents")));
				//driver.findElement(By.id("cke_1_contents")).click();
				//Thread.sleep(2000);
				//System.out.println(driver.findElement(By.xpath("//body[@class='chatterPublisherRTE cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).getText());
				//Thread.sleep(2000);
		}

		
		
	}


