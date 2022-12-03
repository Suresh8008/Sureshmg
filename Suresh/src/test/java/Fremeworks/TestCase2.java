package Fremeworks;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase2 
{
	WebDriver driver;

	   ModularDataDriven hrm;
	   @Test
	   public void data() throws Exception{
		   hrm=new ModularDataDriven();
		    hrm.open();
		    hrm.login("Admin", "admin123");
		    hrm.loginStatus("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		    hrm.addEmp("suresh", "QA", "tester", "Emp001");
		    hrm.logout();
		    hrm.close();
}
}