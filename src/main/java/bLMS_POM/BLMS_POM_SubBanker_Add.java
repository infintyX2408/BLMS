package bLMS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLMS_POM_SubBanker_Add {

	// Constructor
	public BLMS_POM_SubBanker_Add(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}	

	@FindBy(id = "sadminusername")
	WebElement Username_tf;

	// Action on Username_tf
	public void enterUsername(String username) {
		Username_tf.sendKeys(username);
	}

	@FindBy(id = "fullname")
	WebElement FullName_tf;

	// Action on FullName_tf
	public void enterFullName(String fullname) {
		FullName_tf.sendKeys(fullname);
	}

	@FindBy(id = "emailid")
	WebElement Emailaddress_tf;

	// Action on Emailaddress_tf
	public void enterEmailaddress(String Emailaddress) {
		Emailaddress_tf.sendKeys(Emailaddress);
	}

	@FindBy(id = "mobilenumber")
	WebElement Mobilenumber_tf;

	// Action on Mobilenumber_tf
	public void enterMobilenumber(String Mobilenumber) {
		Mobilenumber_tf.sendKeys(Mobilenumber);
	}

	@FindBy(id = "inputpwd")
	WebElement Password_tf;

	// Action on Password_tf
	public void enterPassword(String Password) {
		Password_tf.sendKeys(Password);
	}
	
	@FindBy(id = "submit")
	WebElement Submit_button;

	// Action on Submit_button
	public void clickSubmit_button() {
		Submit_button.click();
	}

}
