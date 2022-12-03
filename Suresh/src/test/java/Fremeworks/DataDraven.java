package Fremeworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDraven {
	WebDriver driver;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet ws;
	Row r;
	
	@BeforeTest
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Test
	public void operation() throws IOException, InterruptedException
	{
		File file=new File("C:\\Users\\sures\\eclipse-workspace\\java\\Suresh\\src\\test\\resources\\Suresh1.xlsx");
		fis=new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
		ws=wb.getSheet("Sheet1");
		int rowc=ws.getLastRowNum();
		for (int i=1;i<=rowc;i++)
		{
			r=ws.getRow(i);
			driver.findElement(By.linkText("REGISTER")).click();
			driver.findElement(By.name("firstName")).clear();
			driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("lastName")).clear();
			driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.name("phone")).clear();
			driver.findElement(By.name("phone")).sendKeys(String.valueOf((int)r.getCell(2).getNumericCellValue()));
			driver.findElement(By.id("userName")).clear();
			driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
			driver.findElement(By.name("address1")).clear();
			driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
			driver.findElement(By.name("city")).clear();
			driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElement(By.name("state")).clear();
			driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
			driver.findElement(By.name("postalCode")).clear();
			driver.findElement(By.name("postalCode")).sendKeys(String.valueOf((int)r.getCell(7).getNumericCellValue()));
			Select dcountry=new Select(driver.findElement(By.name("country")));
			dcountry.selectByVisibleText(r.getCell(8).getStringCellValue());
			Thread.sleep(3000);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
			driver.findElement(By.name("confirmPassword")).clear();
			driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
			driver.findElement(By.name("submit")).click();
			Thread.sleep(3000);
			
			
			
			
			
			
			
		}
	}

}

