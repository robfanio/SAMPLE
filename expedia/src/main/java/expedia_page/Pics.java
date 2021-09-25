package expedia_page;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Pics {
	WebDriver driver;
	
	public Pics(WebDriver driver) {
		this.driver = driver;
	}
	public void pics() throws IOException {
		String label = new Date().toString().replace(" ", "-").replace(":", "-");
		File screenShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenShot,new File("C:\\Automation\\BootCamp Expedia\\expedia\\pics"+label+"PICS.png"));

	}
	
}
