
package com.asdf.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {
	WebDriver ldriver;
	
	public indexPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver, this);
		
	}
	
	@FindBy(css=".ico-register")
	WebElement ragisterIcon;
	
	
	public void clickonRagister()
	{
		ragisterIcon.click();
	}
}
