package org.testngg;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testtNg extends BaseClass {
	@BeforeClass
	private void beforeClass() {
       lanchBrowersChrome();
	}
	@BeforeMethod
	private void beforemethod() {
        System.out.println("test start time........"+new Date());
	}
	@Test
	private void test() {
		urlLanuch("https://www.flipkart.com/");
		implicitWait(20, TimeUnit.SECONDS);
		LoginFlipkart l=new LoginFlipkart();
		fillTextBox(l.getEmail(), "9962774881");
		fillTextBox(l.getPassword(), "123456");
		jsClick(l.getClick());
	}
	@AfterMethod
	private void aftermethod() throws IOException {
 System.out.println("test end time......."+new Date());
 TakesScreenshots("filpkart");
	}


}
