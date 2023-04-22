package com.asfd.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.asdf.pageobject.Ragister;
import com.asdf.pageobject.indexPage;
import com.asdf.pageobject.loginpage;
import com.asdf.utilities.ReadExcelFile;

public class TC_myaccountpageTest2 extends Base{
	
	
	@Test(dataProvider = "logindata")
	public void oprn(String emailAdd, String pass) {
		driver.get(url);
		logger.info("url open");
		
		
//		indexPage ip=new indexPage(driver);
//		ip.clickonRagister();
//		
//		Ragister rg=new Ragister(driver);
//		rg.clickOnGender();
//		rg.enterInfo("saurabh", "thakur", emailAdd);
//		rg.enterpass(pass, pass);
//		rg.loginbtn();
		
		loginpage lp=new loginpage(driver);
		lp.a();
		lp.enterfield(emailAdd, pass);
		
		
		
		
	}
	
	@DataProvider(name="logindata")
	public String [][] logindata()
	{
		String fileName = System.getProperty("user.dir") + "\\test data\\testdata.xlsx";


		int ttlRows = ReadExcelFile.getRowCount(fileName, "Shee1");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "Sheet1");
	

		String data[][]=new String[ttlRows-1][ttlColumns];

		for(int i=1;i<ttlRows;i++)//rows =1,2
		{
			for(int j=0;j<ttlColumns;j++)//col=0, 1,2
			{

				data[i-1][j]=ReadExcelFile.getCellValue(fileName,"Sheet1", i,j);
			}

		}
		return data;
	}
	

}

