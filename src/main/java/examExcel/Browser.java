package examExcel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Browser {
public static WebDriver driver =null;
	
	public static void LoginTOsalsesforce() {
	}
	
		/*if(sBrowser.startsWith("ch")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else
		{
			System.out.println("you have not given browser type correctly");
		}
		
		WebDriver driver =null;
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		//WebDriver driver1 = new ChromeDriver();*/
		
	 
		/*driver.get(prop.getProperty("URL1"));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL2"));
		driver.get(prop.getProperty("URL3"));
	
          
          
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(prop.getProperty("Username"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(prop.getProperty("Password"));
		Thread.sleep(3000);
		
		

		driver.findElement(By.xpath("//input[@id='Login']")).click();*/
		 
     public static void waitForPageElementToVisible(WebElement eleToWait)  
        {
        WebDriverWait Wait = new WebDriverWait(Browser.driver,30);
     	Wait.until(ExpectedConditions.visibilityOf(eleToWait));
        }
	
}


