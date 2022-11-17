package TestNg;


	

	import org.testng.annotations.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;

	public class TestNGLogin {
		ChromeDriver driver;

	  @BeforeTest
	    public void chromeLaunch() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\sures\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
			
			
		  
	  }
	  @Test
	  public void login()  {
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		  
	  }
	  @Test(priority = 1)
	  public void loginStatus(){
		  String curl=driver.getCurrentUrl();
		  String aurl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		  if(aurl.contains(curl)) {
			  System.out.println("Welcome To HomePage");
		  } 
		  else {
			  System.out.println("Hompage Failure");
		  }
	  }
	  @Test(priority = 2)
	  public void Logout() {
		  driver.findElement(By.className("oxd-userdropdown-tab")).click();
		  driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();
		  
		  
	  }
}
