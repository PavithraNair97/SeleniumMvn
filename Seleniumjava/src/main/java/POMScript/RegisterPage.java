package POMScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	
	public RegisterPage() {
		super(driver);
		
	}


	 


	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(id="gender-female")
    private WebElement Female;
	
	@FindBy(id="FirstName")
	private WebElement FirstName;
	
	@FindBy(id="LastName")
	private WebElement LastName;
	
	@FindBy(id="Email")
	private WebElement Email;
	
	
	@FindBy(id="Password")
	private WebElement Password;

	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPassword;

	@FindBy(id="register-button")
    private WebElement 	registerbutton;
	
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement Female() {
		return  Female;
	}
    public WebElement getFirstName() {
    	return FirstName;
    }
    public WebElement getLastName() {
    	return LastName;
    }
	public WebElement Email() {
		return Email;
	}
	
	public WebElement Password() {
		return Password;
	}
	
	
	public WebElement ConfirmPassword() {
		return ConfirmPassword;
	}
	

	public WebElement registerbutton() {
		return registerbutton;
	}
 
}
