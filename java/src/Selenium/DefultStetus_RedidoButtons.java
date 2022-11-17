package Selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefultStetus_RedidoButtons {
	 
	//finding the default status of radios

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sures\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.mercurytravels.co.in/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Flights")).click();
			List<WebElement> nradios=driver.findElements(By.xpath("//input[@type='radio']"));
			System.out.println(nradios.size());
			
			for(int j=0;j<nradios.size();j++)
			{
				String rname=nradios.get(j).getAttribute("name");
				if(nradios.get(j).isSelected())
				{
					System.out.println(rname+" is actived");
				}
				else
				{
					System.out.println(rname+" is not actived");
					
				}
				
			}

		}

	
}
