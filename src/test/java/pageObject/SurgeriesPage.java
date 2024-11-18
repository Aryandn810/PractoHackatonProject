package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SurgeriesPage extends BaseClass {

	public SurgeriesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[contains(text(),'Lab Tests')]")
	WebElement labTest;
	@FindBy(xpath = "//div[contains(text(),\"Aurangabad\")]")
	WebElement AurangabadElement;

	public void ClickOnLabTest() {
		try {
			wait.until(ExpectedConditions.visibilityOf(labTest));
			labTest.click();
		} catch (StaleElementReferenceException e) {
			wait.until(ExpectedConditions.visibilityOf(labTest));
			js.executeScript("arguments[0].click();", labTest);
		}
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void waitUnitlVisibilityOfLocations() {
		wait.until(ExpectedConditions.visibilityOf(AurangabadElement));
	}

	public void clickonAurangabad() {
		AurangabadElement.click();
	}

	public void getDiagnosticsCitys() {
		List<WebElement> cities = driver.findElements(
				By.xpath("//div[@class=\"u-d__inline city-selector__city u-marginb--std-half u-pointer\"]"));
		for (WebElement ele : cities) {
			System.out.print(ele.getText() + ", ");
		}
	}

}
