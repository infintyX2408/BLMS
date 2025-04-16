package bLMS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLMS_POM_Login {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement Username_TF;

	// Get Username
	public WebElement getUsername_TF() {
		return Username_TF;
	}

	@FindBy(name = "inputpwd")
	private WebElement Password_TF;

	// Get Password
	public WebElement getPassword_TF() {
		return Password_TF;
	}

	@FindBy(name = "login")
	private WebElement Signin_Button;
	
	// Constructor
	public BLMS_POM_Login(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// Get Signin
	public WebElement getLogin() {
		return Signin_Button;
	}

	@FindBy(xpath = "//a[contains(text(),'I forgot my password')]")
	private WebElement ForgotPassword_Link;

	// Get Forgot Password
	public WebElement getFPLink() {
		return ForgotPassword_Link;
	}

	@FindBy(xpath = "//a[contains(text(),'Back Home!!')]")
	private WebElement BackHome_Link;

	// Get Back home
	public WebElement getBHLink() {
		return BackHome_Link;
	}

}
