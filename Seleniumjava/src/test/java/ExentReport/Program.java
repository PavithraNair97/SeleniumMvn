package ExentReport;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Program {
	@Test
	public void report() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String screenshot = driver.getScreenshotAs(OutputType.BASE64);
		ExtentSparkReporter esp= new ExtentSparkReporter("ExtentReport//report.html");
		ExtentReports er= new ExtentReports();
		er.attachReporter(esp);
		ExtentTest et = er.createTest("Program");
	    et.log(Status.INFO, "Test Case Attached With Extent Report");
	   
	    et.addScreenCaptureFromBase64String(screenshot);
	    er.flush();
	
	}
}
