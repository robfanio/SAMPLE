package expedia_page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarRental_Page {
	WebDriver driver;

	public CarRental_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ul[@id='uitk-tabs-button-container']/li[3]")
	public WebElement carIcon;
	@FindBy(xpath = "//button[@aria-label='Pick-up']")
	public WebElement going;
	@FindBy(xpath = "//input[@id='location-field-locn']")
	public WebElement location;
	@FindBy(xpath = "//button[@data-testid='submit-button']")
	public WebElement search;

	
	
		
 	public void clickCarIcon() {
		carIcon.click();
	}

	public void clickGoing() {
		going.click();
	}

	public void inputLocation() {
		location.sendKeys("Fort Lauderdale, FL (FLL-Fort Lauderdale - Hollywood Intl.)", Keys.ENTER);
	}

	public void clickSearch() {
		search.click();

	}
}
