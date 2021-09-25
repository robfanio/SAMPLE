package expedia;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Reporting.Listen1.class)
public class Expedia_test extends AbstractBase {
  @Test
  public void BookingFlights() throws InterruptedException, IOException {
	  
	  // Choosing flights
	  page.clickFlights();
	  page.clickRoundTrip();
	  
	  //Choosing days to live and going on the calendar
	  page.inputLeaving();
	  shot.pics();
	  page.inputGoingTo();
	  page.clickCalendar1();
	  shot.pics();
	  Thread.sleep(2000);
	  page.clickBeginDate();
	  shot.pics();
	  page.clickEndDate();
	  page.clickDone();
	  page.clickSearch();
	  shot.pics();
	  Thread.sleep(2000);
	  
	  page.clickPick();
	  page.clickContinue();
	  Thread.sleep(2000);
	  page.clickPick();
	  page.clickContinue();
	  page.clickNoThanks();
	
	  //Check out New window
	  page.newWindow();
	  
	  //Form
	  page.inputFirstName("Robinson");
	  page.inputMiddleName("Abarca");
	  page.inputLastName("Fanio");
	  page.selectCountry();
	  page.inputPhone("6097052255");
	  page.clickMale();
	  page.selectMonth();
	  page.selectDay();
	  page.selectYear();
	  page.inputFullname("Robinson Fanio");
	  page.inputCrditCard("1111222233334444");
	  page.inputCardMonth();
	  page.inputCardYear();
	  page.inputSecurirtyCode("123");
	  page.selectCountry();
	  page.InputStreet("111 atlantic ave");
	  page.InputCity("Atlantic City");
	  page.inputState();
	  page.inputZipcode("08401");
	  page.inputEmail("robfanio81@gmail.com");
	  page.inputPassword("ImASoftwaretester");
	  page.inputPassword2("ImASoftwaretester");
	  page.clickBooking();
	 
	  
  }
 
  
  @Test
  public void RentalTest() throws InterruptedException {

	  car.clickCarIcon();
	  Thread.sleep(3000);
	  car.clickGoing();
	  car.inputLocation();
	  car.clickSearch();
  }
  

  
  
  

}
