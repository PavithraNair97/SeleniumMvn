package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import generic.Utility_Method;

public class BasePage extends Utility_Method{

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
