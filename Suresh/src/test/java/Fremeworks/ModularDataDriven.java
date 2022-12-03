package Fremeworks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ModularDataDriven {
   public WebDriver driver;
     
   
   @BeforeTest
   public void open() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   }

   @Test
   public WebDriver getDriver() {
	    return driver;
   }
   @Test
   public void login(String u, String p) throws Exception{
	   
	      
	      driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	      driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(u);
		 // Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(p);
		 // Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(3000);
		 
   }
   @Test
   public String loginStatus(String url) {
	   
	   String actual=driver.getCurrentUrl();
	   String expected=url;
	   Assert.assertEquals(actual,expected, "url is mismatched");
	   return url;
	
	   
   }
   @Test
   public void addEmp(String fn,String mn,String ln,String eid) throws InterruptedException{
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li/a/span[text()='PIM']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li/a[text()='Add Employee']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.name("firstName")).sendKeys(fn);
	   driver.findElement(By.name("middleName")).sendKeys(mn);
	   driver.findElement(By.name("lastName")).sendKeys(ln);
	   driver.findElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']/descendant::input")).sendKeys(eid);
	   //driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	   //driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(eid);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   //Thread.sleep(3000);
	   }
   
   @Test
   public void logout() {
	   driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']//li")).click();
	   driver.findElement(By.linkText("Logout")).click();
	   
   }
   @AfterTest
   public void close() {
	   driver.close();
   }


}

