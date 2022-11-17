package ExelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ExelHRMlogin 
{
	WebDriver driver;
	@BeforeTest
	public void Open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Test
  public void oparetios() throws IOException, InterruptedException{
	  FileInputStream fis=new FileInputStream("C:\\Users\\sures\\OneDrive\\Desktop\\Demo.xlsx");
	  XSSFWorkbook wo=new XSSFWorkbook(fis);
	  XSSFSheet ws=wo.getSheet("Sheet1");
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(ws.getRow(4).getCell(0).getStringCellValue());
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ws.getRow(4).getCell(1).getStringCellValue());
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(3000);
	  wo.close();
	  
  }
}

