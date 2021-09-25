package expedia;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import expedia_page.CarRental_Page;
import expedia_page.Expedia_page;
import expedia_page.Pics;

public class AbstractBase {
	WebDriver driver;
	Expedia_page page;
	Pics shot;
	CarRental_Page car;

  @BeforeMethod
  	  public void beforeMethod() throws AWTException {
	  String path = System.getProperty("user.dir");
	  System.out.println(path);
	  System.setProperty("webdriver.chrome.driver",path+ "\\driver\\chromedriverv88.exe");
	  driver = new ChromeDriver();
	  driver.get("https://expedia.com ");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	  page = new Expedia_page(driver);
	  shot = new Pics(driver);
	  car =new CarRental_Page(driver);
	  
	  Robot robot = new  Robot();
	  
  }
@AfterMethod
public void afterMethod() {
//driver.quit();
}

}
