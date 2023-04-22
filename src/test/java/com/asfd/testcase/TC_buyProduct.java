package com.asfd.testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.asdf.pageobject.landingPage;

public class TC_buyProduct extends Base {
	String productName="AppleMacBook Pro 13-inch";
	
	@Test
public void getProd() throws InterruptedException, IOException {
	driver.get(url);
	logger.info("url open");
	
	landingPage lp=new landingPage(driver);
	lp.selectprod(productName);
	lp.addtocart();
	Thread.sleep(3000);
	lp.addToCart1();
	lp.check();
	captureScreenShot(driver, "productName");
}	

}
