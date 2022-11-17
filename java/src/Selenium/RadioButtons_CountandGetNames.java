package Selenium;


import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	//fetch all the radios present in the webpages and get their names.


public class RadioButtons_CountandGetNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sures\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.mercurytravels.co.in/");
				//we need to click the flight option
				driver.findElement(By.linkText("Flights")).click();
				List<WebElement> nradios=driver.findElements(By.xpath("//input[@type='radio']"));
				System.out.println(nradios.size());
				for(int i=0;i<nradios.size();i++)
				{
					String rnames=nradios.get(i).getAttribute("name");
					System.out.println(rnames);
				}
			}
	}


