package com.asdf.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

WebDriver ldriver;
	
	public loginpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver, this);
		
	}
	
 @FindBy(css=".ico-login")
 WebElement loginbtn;
	
	@FindBy(id="Email")
	WebElement emil;
	
	@FindBy(id="Password")
	WebElement pass;
	
	@FindBy(id="RememberMe")
	WebElement check;
	
	@FindBy(css=".button-1.login-button")
	WebElement lgbtn;
	
	public void a() {
		loginbtn.click();
	}
	
	public void enterfield(String username, String password)
	{
		
		emil.sendKeys(username);
		pass.sendKeys(password);
		check.click();
		lgbtn.click();
	}
	
}
