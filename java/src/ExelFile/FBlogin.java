package ExelFile;

import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin 
{
	ChromeDriver d;
	@Test
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sures\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\\");
		d = new ChromeDriver();
		//d.get("https://www.facebook.com");
		//d.manage().window().maximize();
	}
	@Test
	public void login() throws IOException, InterruptedException
	{
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		FileInputStream fi = new FileInputStream("C:\\Users\\sures\\OneDrive\\Desktop\\Demo.xlsx");
		XSSFWorkbook wbk = new XSSFWorkbook(fi);
		XSSFSheet wks = wbk.getSheet("Sheet1");
		d.findElement(By.xpath("//input[@name='email']")).sendKeys(wks.getRow(4).getCell(0).getStringCellValue());
		d.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(wks.getRow(4).getCell(1).getStringCellValue());
		//d.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).sendKeys("abd");
		//d.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("1123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		wbk.close();
	}
}