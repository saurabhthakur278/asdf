package com.asdf.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {

WebDriver ldriver;
	
	public landingPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver, this);
		
	}
	
	@FindBy(css=".product-title")
	List<WebElement> li;
	
	@FindBy(css=".button-2.product-box-add-to-cart-button")
	List<WebElement> add;
	
	@FindBy(id="product_enteredQuantity_4")
	WebElement enter;
	
	@FindBy(id="add-to-cart-button-4")
	WebElement btn;
	
	@FindBy(css=".close")
	WebElement bar; 
	
	@FindBy(css=".button-1.cart-button")
	WebElement addcart;
	
	@FindBy(css=".cart-label")
	WebElement cartsymbol;
	
	
	@FindBy(id="checkout")
	WebElement checkout;
	
	@FindBy(id="termsofservice")
	WebElement checkbox;
	
	public void selectprod(String productName)
	{
		for(int i=0;i<=li.size()-1;i++) {
			if(li.get(i).getText().contains(productName)) {
				
				add.get(i).click();
			}
		}
		
	}
	
	public void addtocart() {
		
		btn.click();
		bar.click();
	}
	
	public void addToCart1() {
		
		Actions ac=new Actions(ldriver);
		ac.moveToElement(cartsymbol).build().perform();
		addcart.click();
	}
	
	public void check() {
		checkbox.click();
		checkout.click();
	}

	
}
