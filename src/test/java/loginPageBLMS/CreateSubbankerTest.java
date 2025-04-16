package loginPageBLMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import bLMS_POM.BLMS_POM_HomePageAdmin;
import bLMS_POM.BLMS_POM_Login;
import bLMS_POM.BLMS_POM_SubBanker_Add;
import bLMS_POM.BLMS_POM_SubBanker_Manage;
import genericUtility_BLMS.WebDriverUtillity;

public class CreateSubbankerTest {
	
	@Test
	public void username() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		WebDriverUtillity wbu = new  WebDriverUtillity();
		wbu.implicitWait(driver);
		driver.manage().window().maximize();
		driver.get("http://49.249.28.218:8081/AppServer/Bank_Locker_Management_System/banker/index.php");
		BLMS_POM_Login blp = new BLMS_POM_Login(driver);
		blp.getUsername_TF().sendKeys("admin");
		blp.getPassword_TF().sendKeys("Test@123");
		blp.getLogin().click();
		BLMS_POM_HomePageAdmin bhp = new BLMS_POM_HomePageAdmin(driver);
		BLMS_POM_SubBanker_Add bsa = new BLMS_POM_SubBanker_Add(driver);
		//BLMS_POM_SubBanker_Manage bsm = new BLMS_POM_SubBanker_Manage(driver);
		bhp.getSubBanker_dropdown().click();
		bhp.getSubBanker_Add_button().click();
		//bhp.getSubBanker_Manage_button().click();
		bsa.enterUsername("jayanth24");
		bsa.enterFullName("sidhijayanth");
		bsa.enterEmailaddress("sid@gmail.com");
		bsa.enterMobilenumber("1234567891");
		bsa.enterPassword("jay");
		bsa.clickSubmit_button();
	}

}
