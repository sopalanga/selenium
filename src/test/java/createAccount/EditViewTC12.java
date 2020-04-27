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

public class EditViewTC12 {
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
			
			driver.findElement(By.xpath("//body//option[4]")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(prop.getProperty("NewViewName"));
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//select[@name='fcol1']//option[contains(text(),'Account Name')]")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//select[@name='fop1']//option[contains(text(),'contains')]")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@name='fval1']")).clear();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@name='fval1']")).sendKeys("a");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[1]")).click();
			Thread.sleep(5000);
			
			
			
	}		

}
