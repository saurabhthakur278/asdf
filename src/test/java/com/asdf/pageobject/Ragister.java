package com.asdf.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ragister {
WebDriver ldriver;
	
	public Ragister(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver, this);
		
	}
	
	@FindBy(id="gender-male")
	WebElement maleIcon;
	
	@FindBy(id="FirstName")
	WebElement FirstName;
	
	

	@FindBy(id="LastName")
	WebElement LastName;

	

	@FindBy(id="Email")
	WebElement Email;

	

	@FindBy(id="Password")
	WebElement Password;
	
	

	@FindBy(id="ConfirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(id="register-button")
	WebElement button;

	
	@FindBy(css=".ico-login")
	WebElement loginbtn;
	
	public void clickOnGender() {
		maleIcon.click();
	}
	
	public void enterInfo(String FN, String LN, String EMAIL)
	{
		FirstName.sendKeys(FN);
		LastName.sendKeys(LN);
		Email.sendKeys(EMAIL);
	}
	
	public void enterpass(String pass, String pass1) {
		Password.sendKeys(pass);
		ConfirmPassword.sendKeys(pass1);
		button.click();
		
	}
	
	public void loginbtn() {
		loginbtn.click();
	}
	
}
