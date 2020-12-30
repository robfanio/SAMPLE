package expedia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AbstractBase {
	WebDriver driver;
	Expedia_page page;

  @BeforeMethod
  	  public void beforeMethod() {
	  String path = System.getProperty("user.dir");
	  System.out.println(path);
	  System.setProperty("webdriver.chrome.driver",path+ "\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://expedia.com ");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	  page = new Expedia_page(driver);
	  
  }
@AfterMethod
public void afterMethod() {
driver.quit();
}

}
