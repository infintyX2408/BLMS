package bLMS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLMS_POM_BwDates {

	// Constructor
	public BLMS_POM_BwDates(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "submit")
	WebElement Submit_button;

	// Action on Submit_button
	public void clickSubmit_button() {
		Submit_button.click();
	}

}
