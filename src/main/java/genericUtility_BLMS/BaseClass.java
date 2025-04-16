package genericUtility_BLMS;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import bLMS_POM.BLMS_POM_HomePageAdmin;
import bLMS_POM.BLMS_POM_Login;
import bLMS_POM.BLMS_POM_WelcomePage;

public class BaseClass {

	static WebDriver driver;
	PropertyFileUtility pfu = new PropertyFileUtility();
	WebDriverUtillity wbu = new WebDriverUtillity();
	SoftAssert soft = new SoftAssert();

	@BeforeClass
	public void launchBrowser() throws IOException {


		String browser = pfu.getProperty("Browser");
		String url = pfu.getProperty("URL");

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else {

			throw new IllegalArgumentException("Invalid browser specified" + browser);

		}
		
		wbu.implicitWait(driver);
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void login() throws IOException {
		
		BLMS_POM_Login bpl = new BLMS_POM_Login(driver);
		BLMS_POM_WelcomePage bwp = new BLMS_POM_WelcomePage(driver);
		String username = pfu.getProperty("Username");
		String password = pfu.getProperty("Password");
		String actualTitle = "BLMS | Dashboard";
		wbu.implicitWait(driver);
		bwp.getBankers_link().click();
		bpl.getUsername_TF().sendKeys(username);
		bpl.getPassword_TF().sendKeys(password);
		bpl.getLogin().click();
		
		String expectedTitle = driver.getTitle();		
		soft.assertEquals(actualTitle,expectedTitle);
		soft.assertAll();
						
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {

		BLMS_POM_HomePageAdmin bhp = new BLMS_POM_HomePageAdmin(driver);
		bhp.getAccountSettings_dropdown().click();
		bhp.getLogout_button().click();
		
	}
	
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
		
	}

}
