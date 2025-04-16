package bLMS_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLMS_POM_SubBanker_Manage {

	WebDriver driver;

	// Constructor
	public BLMS_POM_SubBanker_Manage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Copy')]")
	WebElement Copy_button;

	// Action on Copy_button
	public void clickCopy_button() {
		Copy_button.click();
	}

	@FindBy(xpath = "//span[contains(text(),'CSV')]")
	WebElement CSV_button;

	// Action on CSV_button
	public void clickCSV_button() {
		CSV_button.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Excel')]")
	WebElement Excel_button;

	// Action on Excel_button
	public void clickExcel_button() {
		Excel_button.click();
	}

	@FindBy(xpath = "//span[contains(text(),'PDF')]")
	WebElement PDF_button;

	// Action on PDF_button
	public void clickPDF_button() {
		PDF_button.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Print')]")
	WebElement Print_button;

	// Action on Print_button
	public void clickPrint_button() {
		Print_button.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Column Visibility')]")
	WebElement ColumnVisibility_dropdown;

	// Action on ColumnVisibility_dropdown
	public void clickColumnVisibility_dropdown() {
		ColumnVisibility_dropdown.click();
	}

	// Action on Edit_icon
	public void clickEdit_icon(String username) {
		String xpath = "//td[text()='" + username + "']/..//a[@title='Edit Sub Admin Details']";
		WebElement editIcon = driver.findElement(By.xpath(xpath));
		editIcon.click();
	}

	// Action on Delete_icon
	public void clickDelete_icon(String username) {
		String xpath = "//td[text()='" + username + "']/..//a[@title='Delete this record']";
		WebElement Delete_icon = driver.findElement(By.xpath(xpath));
		Delete_icon.click();
	}

	// Action on Key_icon
	public void clickKey_icon(String username) {
		String xpath = "//td[text()='" + username + "']/..//a[@title='Reset Sub Admin Password']";
		WebElement Key_icon = driver.findElement(By.xpath(xpath));
		Key_icon.click();
	}

}
