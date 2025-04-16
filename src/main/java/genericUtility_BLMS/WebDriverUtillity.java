package genericUtility_BLMS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtillity {

	// Implcit wait
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	// Explicit wait
	public void explicitWait(WebDriver driver,WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	// Select class
	public void select(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public void select(WebElement element, int index) {

		Select s = new Select(element);
		s.selectByIndex(index);
	}

}
