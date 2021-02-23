package org.nykaa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testngg.BaseClass;

public class Sample extends BaseClass {
	@BeforeClass
	private void beforeclass() {
     lanchBrowersChrome();
     WebDriver h= new ChromeDriver();
	}
	@BeforeMethod
	private void beforemethod() {
      System.out.println("Time start....."+new Date());
	}
	@Test
	private void test() throws AWTException {
       urlLanuch("https://www.nykaa.com/");
       implicitWait(20,TimeUnit.SECONDS);
       maximize();
       Pom p=new Pom();
       fillTextBox(p.getSearch(),"nivea lip balm");
       Robot r=new Robot();
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
       System.out.println("***********ALL PRODUCT NAME*************");
       List<WebElement> els = driver.findElements(By.className("m-content__product-list__title"));
       for (WebElement allproduct : els) {
    	   String  allp= allproduct.getText();
    	   System.out.println(allp);
	}
       System.out.println("**********PRICE**********");
      
       List<WebElement> prs = driver.findElements(By.xpath("//span[@class='post-card__content-price-offer']"));
       List<String>li=new LinkedList<>();
       for (WebElement price : prs) {
    	   String allps = price.getText();
    	   li.add(allps);
    	   System.out.println(allps);
    	   }
       Collections.sort(li);
       System.out.println(li);
       Collections.sort(li,Collections.reverseOrder());
       System.out.println(li);
      }
}
