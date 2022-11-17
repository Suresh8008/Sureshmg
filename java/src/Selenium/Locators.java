package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sures\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		//Thread.sleep(3000);
		driver.findElement(By.id("login_field")).sendKeys("suresh");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("suresh123");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		//driver.findElement(By.partialLinkText("Create")).click();
	}
	}
