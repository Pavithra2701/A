package org.testngg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BaseClass {
	// WebDriver Method
	public static WebDriver driver;

	// 1
	public static WebDriver lanchBrowersChrome() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Maven\\Driver\\chromedriver.exe");
		return driver = new ChromeDriver();
	}
	public static WebDriver lanchBrowersFirefox() {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Maven\\Driver\\geckodriver.exe");
		return driver = new FirefoxDriver();
	}

	// 2
	public static void urlLanuch(String url) {
		driver.get(url);

	}

	// 3
	public static String getTitle() {
		return driver.getTitle();
	}

	// 4
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	// 5
	public static String getWindowHandling() {
		return driver.getWindowHandle();
	}

	// 6
	public static Set<String> getWindowHandlings() {
		return driver.getWindowHandles();
	}

	// 7
	public static void close() {
		driver.close();
	}

	// 8
	public static void quit() {
		driver.quit();
	}

	// 9
	public static void maxmizeWindow() {
		driver.manage().window().maximize();
		;
	}

	// 10
	public static void fillTextBox(WebElement e, String value) {
		e.sendKeys(value);
	}

	// 11
	public static void buttonClick(WebElement e) {
		e.click();
	}

	// 12
	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");
	}

	// 13
	public static void dragAndDrop(WebElement src, WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	// 14
	public static void moveToElement(WebElement des) {
		Actions a = new Actions(driver);
		a.moveToElement(des).perform();
	}

	// 15
	public static void contextClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
	}

	// 16
	public static void acceptAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	// 17
	public static void dismissAlert() {
	    Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	// 18
	public static void promptAlertAccept(String text) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(text);
		al.accept();
	}

	// 19
	public static void promptAlertDismiss(String text) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(text);
		al.dismiss();
	}

	//20
	public static void ThreadSleep(long a) throws InterruptedException {
		Thread.sleep(a);
	}

	// 21
	public static void selectByValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}

	// 22
	public static void selectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}

	// 23
	public static void selectByVisibeText(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByVisibleText(value);
	}

	// 24
	public static String getOption(WebElement e) {
		Select s = new Select(e);
		List<WebElement> op = s.getOptions();
		String text = null;
		for (WebElement x : op) {
			text = x.getText();
		}
		return text;
	}

	// 25
	public static String getAllSelectOption(WebElement e) {
		Select s = new Select(e);
		List<WebElement> allOption = s.getAllSelectedOptions();
		String text=null;
		for (WebElement x : allOption) {
			text=x.getText();

		}
		return text;
	}

	// 26
	public static WebElement getFirstSelectOption(WebElement e) {

		Select s = new Select(e);
		WebElement ee = s.getFirstSelectedOption();
		return ee;
	}

	// 27
	public static boolean isMultiple(WebElement e) {
		Select s = new Select(e);
		return s.isMultiple();
	}

	// 28
	public static void deSelectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.deselectByIndex(index);
	}

	//29
	public static void deSelectByValue(WebElement e, String value) {
		Select s = new Select(e);
		s.deselectByValue(value);
	}

	//30
	public static void deSelectByVisibleText(WebElement e, String text) {
		Select s = new Select(e);
		s.deselectByValue(text);
	}

	// 31
	public static void deSelectAll(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
	}

	// 32
	public static void frameswitchtobyint(int d) {
		driver.switchTo().frame(d);
	}

	// 33
	public static void frameSwitchToById(String id) {
		driver.switchTo().frame(id);
	}

	// 34
	public static void frameSwitchToByName(String name) {
		driver.switchTo().frame(name);
	}

	// 35
	public static void frameSwitchToWebElement(WebElement e) {
		driver.switchTo().frame(e);
	}

	// 36
	public static void defaultContext() {
		driver.switchTo().defaultContent();
	}

	// 37
	public static void implicitWait(long l,TimeUnit t) {
		driver.manage().timeouts().implicitlyWait(l, t);
	}

	// 38
	public static void explicitWaitAlert(long l) {
		WebDriverWait w = new WebDriverWait(driver, l);
		Alert a = w.until(ExpectedConditions.alertIsPresent());
		a.accept();
	}

	//39
	public static void explicitWaitFrameByid(long l, String id) {
		WebDriverWait w = new WebDriverWait(driver, l);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(id)));
	}

	// 40
	public static void explicitWaitFrameByName(long l, String name) {
		WebDriverWait w = new WebDriverWait(driver, l);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name(name)));
	}

	//41
	public static void explicitWaitTextBoxbyId(long l, String id) {
		WebDriverWait w = new WebDriverWait(driver, l);
		w.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	}

	// 42
	public static void fluentWait(long l, long l1) {
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(l))
				.pollingEvery(Duration.ofSeconds(l1)).ignoring(Throwable.class);
		Alert s = w.until(ExpectedConditions.alertIsPresent());
		s.accept();
	}

	//43
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	//44
	public static void navigateBack() {
		driver.navigate().back();
	}

	//45
	public static void navigateforward() {
		driver.navigate().forward();
	}

	//46
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	//47
	public static boolean isDisplayed(WebElement e) {
		return e.isDisplayed();
	}

	//48
	public static boolean isEnabled(WebElement e) {
		return e.isEnabled();
	}

	//49
	public static boolean isSelected(WebElement e) {
		return e.isSelected();
	}
    //50
	public static String jsgetAttribute(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object tt = js.executeScript("return arguments[0].getAttribute('value')", e);
		String s=(String)tt;
		return s;
        }
	//51
	public static void jsInsert(String s, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + s + "')", e);
	}
	//52
	public static void jsClick(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", e);
	}
	//53
	public static void maximize() {
    driver.manage().window().maximize();
	}
	//54
	public static void click(WebElement e) {
		e.click();
     }
	public static void TakesScreenshots(String imgName) throws IOException {
      TakesScreenshot ts=(TakesScreenshot)driver;
      File src = ts.getScreenshotAs(OutputType.FILE);
      File des=new File("./Screen/"+imgName+".pmg");
      FileUtils.copyDirectory(src, des);
      
	}
	

}
