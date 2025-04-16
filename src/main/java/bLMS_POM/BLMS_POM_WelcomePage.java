package bLMS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLMS_POM_WelcomePage {

	// Constructor
	public BLMS_POM_WelcomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	private WebElement Home_link;

	// Get Home_link
	public WebElement getHome_link() {

		return Home_link;
	}

	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	private WebElement AboutUs_link;

	// Get AboutUs_link
	public WebElement getAboutUs_link() {

		return AboutUs_link;
	}

	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	private WebElement ContactUs_link;

	// Get ContactUs_link
	public WebElement getContactUs_link() {

		return ContactUs_link;
	}

	@FindBy(xpath = "//a[contains(text(),'Assign Locker')]")
	private WebElement AssignLocker_link;

	// Get AssignLocker_link
	public WebElement getAssignLocker_link() {

		return AssignLocker_link;
	}

	@FindBy(xpath = "//a[contains(text(),'Bankers')]")
	private WebElement Bankers_link;

	// Get Bankers_link
	public WebElement getBankers_link() {

		return Bankers_link;
	}

}
