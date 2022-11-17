package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class Login {
	public static void capture1(WebDriver driver , String name) throws IOException
	{		TakesScreenshot ps = (TakesScreenshot)driver;	File ss=ps.getScreenshotAs(OutputType.FILE);
	Files.copy(ss,new File("C:\\Users\\sures\\OneDrive\\Desktop\\Screenshot\\"+name+".jpg"));
	}

	

	public static void main(String []args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://google.com/");
    driver.manage().window().maximize();
    Login.capture1(driver, "suresh");
    driver.navigate().to("http://www.amazon.in");
    Login.capture1(driver, "face");
    
    driver.close();


 

	}

	//private static void capture(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}

	

