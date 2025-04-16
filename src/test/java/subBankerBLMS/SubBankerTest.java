package subBankerBLMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bLMS_POM.BLMS_POM_HomePageAdmin;
import bLMS_POM.BLMS_POM_SubBanker_Add;
import bLMS_POM.BLMS_POM_SubBanker_Manage;
import genericUtility_BLMS.BaseClass;
import genericUtility_BLMS.WebDriverUtillity;

public class SubBankerTest extends BaseClass{
	
	WebDriver driver;
	BLMS_POM_SubBanker_Add bsa = new BLMS_POM_SubBanker_Add(driver);
	BLMS_POM_SubBanker_Manage bsm = new BLMS_POM_SubBanker_Manage(driver);
	SoftAssert soft = new SoftAssert();
	WebDriverUtillity wbu = new WebDriverUtillity();
	
	@Test
	public void clickSubBankerDropdownTest() throws InterruptedException {

		BLMS_POM_HomePageAdmin bhp = new BLMS_POM_HomePageAdmin(driver);
		//wbu.implicitWait(driver);
		//wbu.explicitWait(driver, bhp.getSubBanker_dropdown());
		bhp.getSubBanker_dropdown().click();
		bhp.getSubBanker_Add_button().isDisplayed();
		bhp.getSubBanker_Manage_button().isDisplayed();
		
	}
	
	/*@Test
	public void clickAddLinkTest() {
		
		
		
	}*/

}
