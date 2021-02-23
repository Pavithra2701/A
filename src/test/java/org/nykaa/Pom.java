package org.nykaa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testngg.BaseClass;

public class Pom extends BaseClass {
	public Pom() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@type='search']")
private WebElement search;
@FindBy(xpath="(//div[@class='SearchIcon'])[2]")
private WebElement button;
public WebElement getButton() {
	return button;
}
public WebElement getSearch() {
	return search;
}

}
