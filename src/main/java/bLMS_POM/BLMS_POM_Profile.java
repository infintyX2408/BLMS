package bLMS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLMS_POM_Profile {

	// Constructor
	public BLMS_POM_Profile(WebDriver driver) {

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

	@FindBy(id = "regdate")
	WebElement RegistrationDate_tf;

	// Action on RegistrationDate_tf
	public void enterRegistrationDate(String RegistrationDate) {
		RegistrationDate_tf.sendKeys(RegistrationDate);
	}

	@FindBy(id = "update")
	WebElement Update_button;

	// Action on Update_button
	public void clickUpdate_button() {
		Update_button.click();
	}

}
