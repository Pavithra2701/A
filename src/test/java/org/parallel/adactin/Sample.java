package org.parallel.adactin;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.parameter.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testngg.BaseClass;

public class Sample extends BaseClass{
	@Parameters({"browserName"})
    @BeforeClass
    private void beforeClass(String browser) {
     if(browser.equals("chrome")) {
    	 lanchBrowersChrome();
     }
     else if (browser.equals("firefox")) {
    	 lanchBrowersFirefox();
	}
     else {
		System.err.println("invalid browser......");
	}
    }
	 @BeforeMethod
	 private void beforemethod() {
         System.out.println("test starting time......"+new Date());
	}
	 @AfterMethod
		private void aftermethod() {
			System.out.println("test ending time......"+new Date());
			}
	 @AfterClass
		private void afterclass() {
		 quit();
			}
	 @Test
		public void bookingTestng() throws InterruptedException {
		    implicitWait(20, TimeUnit.SECONDS);
			urlLanuch("https://adactinhotelapp.com/");
			LoginPage l=new LoginPage();
			implicitWait(20, TimeUnit.SECONDS);
			maximize();
		    fillTextBox(l.getTxtusername(),"PavithraPrabhu");
			fillTextBox(l.getTxtpassword(),"prabhu2701");
			jsClick(l.getBtnlogin());
			selectByVisibeText(l.getDroploc(),"Melbourne");
			ThreadSleep(2000);
			selectByVisibeText(l.getDrophotel(),"Hotel Sunshine");
			selectByVisibeText(l.getDroproomtype(),"Deluxe");
			ThreadSleep(2000);
			selectByVisibeText(l.getDroproomno(),"1 - One");
			fillTextBox(l.getCheckin(), "14/02/2021");
			fillTextBox(l.getCheckout(), "16/02/2021");
			ThreadSleep(2000);
			selectByVisibeText(l.getDroproom(), "1 - One");
			selectByVisibeText(l.getDropcroom(), "0 - None");
			jsClick(l.getSubmit());
			jsClick(l.getClick());
			jsClick(l.getClickcontinue());
			ThreadSleep(2000);
			fillTextBox(l.getFirstname(),"Pavithra");
			fillTextBox(l.getLasttname(), "Sivakumar");
			fillTextBox(l.getAddress(), "asnbfdwujehdfkjbszmbgvzdreliuikivhjf");
			fillTextBox(l.getCcnum(), "1234567891234567");
			selectByVisibeText(l.getDropcctype(), "American Express");
			selectByVisibeText(l.getCcmonth(), "April");
			selectByVisibeText(l.getCcyear(), "2021");
			fillTextBox(l.getCcv(),"197" );
			jsClick(l.getBooknow());
			String txt = getAttribute(l.getOrder());
			System.out.println(txt);
			}
}
