package com.log4j;




import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class log4jHRM {

	WebDriver driver;

	private static Logger logger=(Logger) LogManager.getLogger(log4jHRM.class);
	
	@BeforeTest
	public void open(){
		WebDriverManager.chromedriver().setup();
		
		logger.info("Testcase execution started");
		driver=new ChromeDriver();
		logger.info("Browser opened successfully");
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		logger.info("page opened Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	@Test
	public void operation() throws InterruptedException{
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		 // Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		 // Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(3000);
		  logger.info("login successfully");
	}
	@AfterTest
	public void close() {
		driver.close();
		logger.info("driver close");
		
	}
}


