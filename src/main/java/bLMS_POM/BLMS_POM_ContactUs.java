package bLMS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLMS_POM_ContactUs {

	// Constructor
	public BLMS_POM_ContactUs(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "pagetitle")
	WebElement PageTitle_TF;

	// Action on PageTitle
	public void enterPageTitle(String PageTitle) {

		PageTitle_TF.clear();
		PageTitle_TF.sendKeys(PageTitle);
	}

	@FindBy(name = "pagedes")
	WebElement PageDescription_TF;

	// Action on PageDescription
	public void enterPageDescription(String PageDescription) {

		PageDescription_TF.clear();
		PageDescription_TF.sendKeys(PageDescription);
	}

	@FindBy(name = "email")
	WebElement EmailAddress_TF;

	// Action on EmailAddress
	public void enterEmailAddress(String EmailAddress) {

		EmailAddress_TF.clear();
		EmailAddress_TF.sendKeys(EmailAddress);
	}

	@FindBy(name = "mobnum")
	WebElement MobileNumber_TF;

	// Action on MobileNumber
	public void enterMobileNumber(String MobileNumber) {

		PageDescription_TF.clear();
		PageDescription_TF.sendKeys(MobileNumber);
	}

	@FindBy(name = "submit")
	WebElement Submit_Button;

	// Action on Submit
	public void clickSubmit() {
		Submit_Button.click();
	}
}
