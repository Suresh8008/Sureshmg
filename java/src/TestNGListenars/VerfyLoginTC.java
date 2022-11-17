package TestNGListenars;

	import org.testng.annotations.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Listeners;


public class VerfyLoginTC {

	
	
	WebDriver driver;
	  @BeforeTest
	  public void launhBrowser(){
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.mercurytravels.co.in/");
	  }
	  @Test(priority = 1)
	  public void Login() throws InterruptedException {
		  driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/li[1]")).click();
		  driver.findElement(By.linkText("User Login")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("sign_user_email")).sendKeys("pradeeppabba3p@gmail.com");
		  driver.findElement(By.id("sign_user_password")).sendKeys("Prd@8817");
		  driver.findElement(By.xpath("//form[@class='form-signin']/descendant::button[text()='Log in']")).click();
		  Thread.sleep(10000);
	  }
	  @Test(priority = 2)
	  public void logInStatus() {
		  String expected="Welcome, Pradeep";
		  String actual = driver.findElement(By.partialLinkText("Welcome")).getText();
		  System.out.println(actual);
		  if(expected.contains(actual)) 
			  System.out.println("log in sucessfull"); 
		  
		  else 
			  System.out.println("log in unsucessfull");
	  }  
	  @Test(priority = 3)
	  public void logout() {
		  driver.findElement(By.partialLinkText("Welcome")).click();
		  driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/descendant::a[text()=' Log Out']")).click();
		
	  }
	  @AfterTest
	  public void tearDown() {
		  driver.close();
	  }

	
}
