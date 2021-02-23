package org.dataprovider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testngg.BaseClass;

public class LoginPage extends BaseClass{
public LoginPage() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement txtusername;
@FindBy(id="password")
private WebElement txtpassword;
@FindBy(id="login")
private WebElement btnlogin;
@FindBy(id="location")
private WebElement droploc;
@FindBy(id="hotels")
private WebElement drophotel;
@FindBy(id="room_type")
private WebElement droproomtype;
@FindBy(id="room_nos")
private WebElement droproomno;
@FindBy(id="datepick_in")
private WebElement checkin;
@FindBy(id="datepick_out")
private WebElement checkout;
@FindBy(id="adult_room")
private WebElement droproom;
@FindBy(id="child_room")
private WebElement dropcroom;
@FindBy(id="Submit")
private WebElement submit;
@FindBy(id="radiobutton_0")
private WebElement click;
@FindBy(id="continue")
private WebElement clickcontinue;
@FindBy(id="first_name")
private WebElement firstname;
@FindBy(id="last_name")
private WebElement lasttname;
@FindBy(id="address")
private WebElement address;
@FindBy(id="cc_num")
private WebElement ccnum;
@FindBy(id="cc_type")
private WebElement dropcctype;
public WebElement getTxtusername() {
	return txtusername;
}
public WebElement getTxtpassword() {
	return txtpassword;
}
public WebElement getBtnlogin() {
	return btnlogin;
}
public WebElement getDroploc() {
	return droploc;
}
public WebElement getDrophotel() {
	return drophotel;
}
public WebElement getDroproomtype() {
	return droproomtype;
}
public WebElement getDroproomno() {
	return droproomno;
}
public WebElement getCheckin() {
	return checkin;
}
public WebElement getCheckout() {
	return checkout;
}
public WebElement getDroproom() {
	return droproom;
}
public WebElement getDropcroom() {
	return dropcroom;
}
public WebElement getSubmit() {
	return submit;
}
public WebElement getClick() {
	return click;
}
public WebElement getClickcontinue() {
	return clickcontinue;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLasttname() {
	return lasttname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCcnum() {
	return ccnum;
}
public WebElement getDropcctype() {
	return dropcctype;
}
public WebElement getCcmonth() {
	return ccmonth;
}
public WebElement getCcyear() {
	return ccyear;
}
public WebElement getCcv() {
	return ccv;
}
public WebElement getBooknow() {
	return booknow;
}
public WebElement getOrder() {
	return order;
}
@FindBy(id="cc_exp_month")
private WebElement ccmonth;
@FindBy(id="cc_exp_year")
private WebElement ccyear;
@FindBy(id="cc_cvv")
private WebElement ccv;
@FindBy(id="book_now")
private WebElement booknow;
@FindBy(id="order_no")
private WebElement order;
	

}
