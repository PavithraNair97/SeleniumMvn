package generic;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_Test extends Utility_Method {

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("DBase Coneected Successfully");
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Connection to the Database ");
	}
	
	@BeforeClass
	public void beforeclass() {
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		Reporter.log("Browser Connected Successfully ");
	}
	
	@AfterClass
	public void afterclass() {
	    driver.quit();
		Reporter.log("Browser Closed Successfully ");
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("Closed the Database ");
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("DBase Closed Successfully");
	}
	
}
