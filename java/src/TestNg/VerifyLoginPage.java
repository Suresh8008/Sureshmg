package TestNg;


	

	import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class VerifyLoginPage {
		ChromeDriver driver;
		
	  @BeforeTest
	  public void chromeLauncher() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\sures\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
	  }
	 

	  @Test
	  public void googleSearchClick() {
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Magneq Solutions",Keys.ENTER);
		 // driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]")).click();
		    
		  
	  
	  
	  
	  
	  }

	  
	}

