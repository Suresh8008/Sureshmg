package TestNg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sortAssert {
  WebDriver driver;
  @BeforeTest
  public void lunch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  HashMap<String, Object> prefs = new HashMap<String,Object>();
	  prefs.put("profile.default_content_settings.popups", 0);
	  prefs.put("download.promt_for_download", true);
	  ChromeOptions options = new ChromeOptions();
	  options.setExperimentalOption("prefs",prefs);
	 
	  driver =new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.get("https://www.selenium.dev/downloads/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
  }
  @Test
  public void operation() throws InterruptedException ,AWTException{
	  driver.findElement(By.linkText("4.5.3")).click();
	  Thread.sleep(5000);
      Robot rb  =new Robot();
      rb.keyPress(KeyEvent.VK_ENTER);
      rb.keyRelease(KeyEvent.VK_ENTER);
      rb.delay(5000);
  }
      
      
  
}
