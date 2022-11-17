package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchingChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//System.setProperty("webdriver.chrome.driver","C:\\Users\\sures\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		
		
		driver.findElement(By.id("login_field")).sendKeys("suresh");
		driver.findElement(By.id("password")).sendKeys("Suresh123");
		driver.findElement(By.xpath("//input[@name='timestamp_secret']/following-sibling::input[1]")).click();























/*
driver.get("https://www.google.com/");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getPageSource());
    System.out.println(driver.getWindowHandle());
    driver.navigate().to("https://www.bing.com");

    Thread.sleep(2000);

   driver.navigate().back();

   Thread.sleep(2000);

   driver.navigate().forward();

   Thread.sleep(2000);

   driver.navigate().refresh();

   Thread.sleep(2000);

   driver.close();
*/

	}

}
