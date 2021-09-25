package expedia_page;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Expedia_page {
	WebDriver driver;
	
	//ELEMENT LOCATORS
	@FindBy(linkText ="Flights")public WebElement flights;
	@FindBy(linkText ="Roundtrip") public WebElement roundTrip;
	@FindBy(xpath = "//button[@aria-label='Leaving from']") public WebElement leavingFrom;
	@FindBy(xpath = "//button[@aria-label='Going to']") public WebElement goingTo;
	@FindBy(id= "d1-btn") public WebElement calendar1;
	@FindBy(xpath= "//button[@data-testid='submit-button']") public WebElement search;
	@FindBy(xpath = "//table[@class='uitk-new-date-picker-weeks']/tbody[1]/tr[2]/td[1]/button[@aria-label='Feb 7, 2021']") public WebElement pickDay1;
	@FindBy(xpath = "//div[@class='uitk-new-date-picker-month'][2]/table/tbody/tr[3]/td[1]") public WebElement pickDay2;
	@FindBy(xpath="//div[@class='uitk-flex uitk-new-date-picker-menu-footer']/button") public WebElement done;
	@FindBy(className = "uitk-card-link") public WebElement pickPrice;
	@FindBy(xpath= "//button[@data-test-id='select-button']") public WebElement btnContinue;
	@FindBy(xpath = "//a[text()='No Thanks']") public WebElement noThanks;
	@FindBy(xpath =  "//button[text()='Check out']") public WebElement checkout;
	
	//Form Element Locators
	@FindBy(id="firstname[0]") public WebElement firstName;
	@FindBy(xpath = "//input[@data-tealeaf-name='middleName']") public WebElement middleName;
	@FindBy(id="lastname[0]") public WebElement lastName;
	@FindBy(xpath="//select[@id='country_code[0]']") public WebElement selectCountry;
	@FindBy(id = "gender_male[0]") public WebElement maleBtn;
	@FindBy(xpath = "//select[@class='cko-field date-of-birth-month compound-validation main-traveler']") public WebElement birthMonth;
	@FindBy(xpath = "//select[@class='cko-field date-of-birth-day compound-validation main-traveler']") public WebElement birthDay;
	@FindBy(xpath = "//select[@class='cko-field date-of-birth-year compound-validation main-traveler']") public WebElement birthYear;
	@FindBy(id ="phone-number[0]") public WebElement phoneNumber;
	@FindBy(xpath = "//input[@class='text billing-cardholder-name cko-field cardholder-above-cardname gb-whitelist']") public WebElement fullName;
	@FindBy(id = "creditCardInput") public WebElement creditCard;
	@FindBy(xpath = "//select[@name='creditCards[0].expiration_month']") public WebElement selectMonth;
	@FindBy(xpath = "//select[@name='creditCards[0].expiration_year']") public WebElement selectYear;
	@FindBy(id = "new_cc_security_code")public WebElement securityCode;
	@FindBy(name = "creditCards[0].street") public WebElement streets;
	@FindBy(xpath= "//input[@class='text billing-city cko-field gb-whitelist']") public WebElement city;
	@FindBy(xpath = "//select[@class='billing-state-dropdown cko-field billing-state-select gb-whitelist']")public WebElement selectState;
	@FindBy(xpath = "//input[@class='text billing-zip-code cko-field gb-whitelist']") public WebElement zipcode;
	@FindBy(xpath = "//input[@data-tealeaf-name='email']") public WebElement email;
	@FindBy(xpath="//input[@title='Password should be 6-30 characters, no spaces.']") public WebElement password;
	@FindBy(xpath = "//input[@name='repeat_password']") public WebElement password2;
	@FindBy(xpath = "//button[@id='complete-booking']") public WebElement clickButton;
	// CONSTRUCTOR
	public Expedia_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	//METHODS
	public void clickFlights() {
		flights.click();
	}
	public void clickRoundTrip() {
		roundTrip.click();
	}
	public void inputLeaving() {
		leavingFrom.sendKeys("Atlantic City, NJ (ACY-Atlantic City Intl.)",Keys.ENTER);
	}

	
	public void inputGoingTo() {
		goingTo.sendKeys("Fort Lauderdale, FL (FLL-Fort Lauderdale - Hollywood Intl.)",Keys.ENTER);
		
	}
	
	public void clickCalendar1() {
		calendar1.click();
	}
	
	public void clickBeginDate() {
		pickDay1.click();
	}
	
	public void clickEndDate() {
		pickDay2.click();
	}
	
	public void clickDone() {
		done.click();
	}
	
	public void clickSearch() {
		search.click();
	}
	
	public void clickPick() {
		pickPrice.click();
	}
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	public void clickNoThanks() {
		noThanks.click();
	}
	
	
	public void newWindow() throws InterruptedException {
		
		String parentWindow= driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		int count = allWindows.size();
		System.out.println(count);
		
		for(String child: allWindows) {
			 {
				driver.switchTo().window(child);
			}
			 
		}
		Thread.sleep(3000);
		 checkout.click();
	}
	
	//FORM method
	
	public void inputFirstName(String text) {
		
		firstName.sendKeys(text);
	}
	
	public void inputMiddleName(String text) {
		middleName.sendKeys(text);
	}
	
	public void inputLastName(String text) {
		lastName.sendKeys(text);
	}
	
	//Select Country
	
	public void selectCountry() {
		Select country = new Select(selectCountry);
		country.selectByVisibleText("United States of America +1");
		
	}
	public void inputPhone(String phone) {
		phoneNumber.sendKeys(phone);
	}
	
	public void clickMale() {
		maleBtn.click();
	}
	
	public void selectMonth() {
		Select month = new Select(birthMonth);
		month.selectByValue("04");
	}
	public void selectDay() {
		Select day = new Select(birthDay);
		day.selectByValue("19");
	}
	
	public void selectYear() {
		Select year = new Select(birthYear);
		year.selectByValue("1981");
	}
	
	public void inputFullname(String text) {
		fullName.sendKeys(text);
	}
	
	public void inputCrditCard(String number) {
		creditCard.sendKeys(number);
	}
	
	public void inputCardMonth() {
		Select month = new Select(selectMonth);
		month.selectByIndex(2);
	}
	
	public void inputCardYear() {
		Select year = new Select(selectYear);
		year.selectByValue("2022");
	}
	
	public void inputSecurirtyCode(String number) {
		
		securityCode.sendKeys(number);
	}
	public void InputStreet(String text) {
		streets.sendKeys(text);
	}
	
	public void InputCity(String text) {
		city.sendKeys(text);
	}
	 public void inputState() {
		 Select state = new Select(selectState);
		 state.selectByValue("NJ");
	 }
	 public void inputZipcode(String number) {
		 zipcode.sendKeys(number);
		
	}
	 public void inputEmail(String text) {
		 email.sendKeys(text);
	 }
	 
	 public void inputPassword(String text) {
		 password.sendKeys(text);
	 }
	 
	 public void inputPassword2(String text) {
		 password2.sendKeys(text);
	 }
	 public void clickBooking() {
		 clickButton.click();
	 }
}