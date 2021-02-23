package org.testngg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginFlipkart extends BaseClass {
	public LoginFlipkart() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement email;
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement click;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getClick() {
		return click;
	}
	

}
