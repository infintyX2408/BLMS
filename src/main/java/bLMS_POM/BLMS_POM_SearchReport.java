package bLMS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLMS_POM_SearchReport {

	// Constructor
	public BLMS_POM_SearchReport(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "searchinput")
	WebElement SearchLockerDetails_tf;

	// Action on SearchLockerDetails_tf
	public void enterSearchLockerDetails(String LockerNo_KeyNo_Name) {
		SearchLockerDetails_tf.sendKeys(LockerNo_KeyNo_Name);
	}

	@FindBy(id = "submit")
	WebElement Search_button;

	// Action on submit_button
	public void clickSearch_button() {
		Search_button.click();
	}

}
