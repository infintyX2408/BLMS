package bLMS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLMS_POM_ChangePassword {

	// Constructor
	public BLMS_POM_ChangePassword(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "currentpassword")
	WebElement CurrentPassword_tf;

	// Action on CurrentPassword_tf
	public void enterCurrentPassword(String CurrentPassword) {
		CurrentPassword_tf.sendKeys(CurrentPassword);
	}

	@FindBy(id = "newpassword")
	WebElement NewPassword_tf;

	// Action on NewPassword_tf
	public void enterNewPassword(String NewPassword) {
		NewPassword_tf.sendKeys(NewPassword);
	}

	@FindBy(id = "confirmpassword")
	WebElement ConfirmPassword_tf;

	// Action on ConfirmPassword_tf
	public void enterConfirmPassword(String ConfirmPassword) {
		ConfirmPassword_tf.sendKeys(ConfirmPassword);
	}

	@FindBy(xpath = "(//button[contains(text(),'Change')])")
	WebElement Change_button;

	// Action on Change_button
	public void clickChange_button() {
		Change_button.click();
	}

}
