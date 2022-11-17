package Sikuli;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class downloadFiles {
	WebDriver driver;
	  @BeforeTest
	  public void open() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  HashMap<String,Object> prefs= new HashMap<String,Object>();
		  prefs.put("profile.default_content_settings.popups", 0);
		  prefs.put("download.prompt_for_download",true);
		  ChromeOptions options=new ChromeOptions();
		  options.setExperimentalOption("prefs", prefs);
		  driver=new ChromeDriver(options);
		 // driver.manage().window().maximize();
		  driver.get("https://www.selenium.dev/downloads/");
	  }
	  
	  @Test
	  public void windowElement() throws InterruptedException, FindFailed {
		  Thread.sleep(3000);
		  driver.findElement(By.linkText("4.6.0")).click();
		  Screen s=new Screen();
		  Pattern button=new Pattern("C:\\Users\\sures\\OneDrive\\Pictures\\save.png");
		  Thread.sleep(3000);
		  s.click(button);
		  Thread.sleep(5000);
		  
	  }
	  @AfterTest
	  public void close() {
		 // driver.close();
	  }
	}

