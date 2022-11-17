package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseActions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com/slider/");
	        System.out.println("demoqa webpage Displayed");
	        
	    	//Maximise browser window
		driver.manage().window().maximize();
		    
		//Adding wait 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	                
	        //Instantiate Action Class        
	        Actions actions = new Actions(driver);
	        //Retrieve WebElemnt 'slider' to perform mouse hover 
	    	//WebElement slider = driver.findElement(By.xpath("sliderContainer"));
	    	WebElement slider = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary xh-highlight']"));
	    	//Move mouse to x offset 50 i.e. in horizontal direction
	    	actions.moveToElement(slider,50,0).perform();
	    	slider.click();
	    	System.out.println("Moved slider in horizontal directions");
	    	
	        // Close the main window 
	        driver.close();
	 }
	 
	
	
		
	}
