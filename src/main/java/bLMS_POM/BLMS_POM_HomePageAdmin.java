package bLMS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLMS_POM_HomePageAdmin {

	// Constructor
	public BLMS_POM_HomePageAdmin(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//p[contains(text(),'Dashboard')])")
	private WebElement Dashboard;

	// Get Dashboard_dropdown
	public WebElement getDashboard_dropdown() {
		return Dashboard;
	}
	@FindBy(xpath="//p[contains(text(),'Sub-Banker')]")
	private WebElement SubBanker_dropdown;

	// Get SubBanker_dropdown
	public WebElement getSubBanker_dropdown() {
		return SubBanker_dropdown;
	}

	@FindBy(xpath = "(//p[contains(text(),'Add')]/..)[1]")
	private WebElement SubBanker_Add_button;

	// Get SubBanker_Add_button
	public WebElement getSubBanker_Add_button() {
		return SubBanker_Add_button;
	}

	@FindBy(xpath = "(//p[contains(text(),'Manage')]/..)[1]")
	private WebElement SubBanker_Manage_button;

	// Get SubBanker_Manage_button
	public WebElement getSubBanker_Manage_button() {
		return SubBanker_Manage_button;
	}

	@FindBy(xpath = "(//p[contains(text(),'Reports')])")
	private WebElement Reports_dropdown;

	// Get Reports_dropdown
	public WebElement getclickReports_dropdown() {
		return Reports_dropdown;
	}

	@FindBy(xpath = "(//p[contains(text(),'B/w Dates')])")
	private WebElement BwDates_button;

	// Get B/w Dates_button
	public WebElement getBwDates_button() {
		return BwDates_button;
	}

	@FindBy(xpath = "(//p[contains(text(),'Search Report')])")
	private WebElement SearchReport_button;

	// Get SearchReport_button
	public WebElement getSearchReport_button() {
		return SearchReport_button;
	}

	@FindBy(xpath = "(//p[contains(text(),'Pages')])")
	private WebElement Pages_dropdown;

	// Get Pages_dropdown
	public WebElement getPages_dropdown() {
		return Pages_dropdown;
	}

	@FindBy(xpath = "(//p[contains(text(),'About us')])")
	private WebElement AboutUs_button;

	// Get AboutUs_button
	public WebElement getAboutUs_button() {
		return AboutUs_button;
	}

	@FindBy(xpath = "(//p[contains(text(),'Contact us')])")
	private WebElement ContactUs_button;

	// Get ContactUs_button
	public WebElement getContactUs_button() {
		return ContactUs_button;
	}

	@FindBy(xpath = "(//p[contains(text(),'Account Settings')])")
	private WebElement AccountSettings_dropdown;

	// Get AccountSettings_dropdown
	public WebElement getAccountSettings_dropdown() {
		return AccountSettings_dropdown;
	}

	@FindBy(xpath = "(//p[contains(text(),'Profile')])")
	private WebElement Profile_button;

	// Get Profile_button
	public WebElement getProfile_button() {
		return Profile_button;
	}

	@FindBy(xpath = "(//p[contains(text(),'Change Password')])")
	WebElement ChangePassword_button;

	// Get ChangePassword_button
	public WebElement getChangePassword_button() {
		return ChangePassword_button;
	}

	@FindBy(xpath = "//p[contains(text(),'Logout')]")
	private WebElement Logout_button;

	// Get Logout_button
	public WebElement getLogout_button() {
		return Logout_button;
	}

}
