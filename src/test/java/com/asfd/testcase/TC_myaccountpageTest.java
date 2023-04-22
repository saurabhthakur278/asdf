package com.asfd.testcase;

import org.testng.annotations.Test;

import com.asdf.pageobject.Ragister;
import com.asdf.pageobject.indexPage;
import com.asdf.pageobject.loginpage;

public class TC_myaccountpageTest extends Base{
	
	
	@Test
	public void oprn() {
		driver.get(url);
		logger.info("url open");
		
		
		indexPage ip=new indexPage(driver);
		ip.clickonRagister();
		
		Ragister rg=new Ragister(driver);
		rg.clickOnGender();
		rg.enterInfo("saurabh", "thakur", "tsaurabh@gmail.com");
		rg.enterpass("Qwerty@123", "Qwerty@123");
		rg.loginbtn();
		
		loginpage lp=new loginpage(driver);
		lp.enterfield("tsaurabh@gmail.com", "Qwerty@123");
		
	}
	
	

}

