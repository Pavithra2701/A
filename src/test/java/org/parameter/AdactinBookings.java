package org.parameter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testngg.BaseClass;
public class AdactinBookings extends BaseClass {
	@BeforeClass
	private void before() {
		lanchBrowersChrome();
		}
	@BeforeMethod
	private void BeforeMethod() {
         System.out.println("test starting time......"+new Date());
         }
	@Test
	@Parameters({"username","password","checkin","checkout","fname","lname","address","ccnum","ccv"})
	public void bookingTestng(String user, String pass,String cin,String cout,String namef,String namel,String add,String ccnum1,String ccv1) throws InterruptedException {
	    implicitWait(20, TimeUnit.SECONDS);
		urlLanuch("https://adactinhotelapp.com/");
		LoginPage l=new LoginPage();
		implicitWait(20, TimeUnit.SECONDS);
		maximize();
	    fillTextBox(l.getTxtusername(),user);
		fillTextBox(l.getTxtpassword(),pass);
		jsClick(l.getBtnlogin());
		selectByVisibeText(l.getDroploc(),"Melbourne");
		ThreadSleep(2000);
		selectByVisibeText(l.getDrophotel(),"Hotel Sunshine");
		selectByVisibeText(l.getDroproomtype(),"Deluxe");
		ThreadSleep(2000);
		selectByVisibeText(l.getDroproomno(),"1 - One");
		fillTextBox(l.getCheckin(), cin);
		fillTextBox(l.getCheckout(), cout);
		ThreadSleep(2000);
		selectByVisibeText(l.getDroproom(), "1 - One");
		selectByVisibeText(l.getDropcroom(), "0 - None");
		jsClick(l.getSubmit());
		jsClick(l.getClick());
		jsClick(l.getClickcontinue());
		ThreadSleep(2000);
		fillTextBox(l.getFirstname(),namef);
		fillTextBox(l.getLasttname(), namel);
		fillTextBox(l.getAddress(), add);
		fillTextBox(l.getCcnum(), ccnum1);
		selectByVisibeText(l.getDropcctype(), "American Express");
		selectByVisibeText(l.getCcmonth(), "April");
		selectByVisibeText(l.getCcyear(), "2021");
		fillTextBox(l.getCcv(),ccv1 );
		jsClick(l.getBooknow());
		String txt = getAttribute(l.getOrder());
		System.out.println(txt);
		}
	@AfterMethod
	private void aftermethod() {
		System.out.println("test ending time......"+new Date());
		}
	@AfterClass
	private void afterclass() {
		}
	}

