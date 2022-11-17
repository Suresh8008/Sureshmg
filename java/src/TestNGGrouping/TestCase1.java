package TestNGGrouping;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


public class TestCase1 {

	

	  @Test(groups = {"somke","sanity"})
	  public void test1() {
		  System.out.println("test1");
	  }
	  @Test(groups = {"sanity","regression"})
	  public void test2() {
		  System.out.println("test2");
	  }
	  @Test
	  public void test3() {
		  System.out.println("test3");
	  }

	}

