package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;
import resources.BaseClass;

public class VerifyLoginPage extends BaseClass{
	
	@Test
	
	public void verifyLogin() throws IOException, InterruptedException
	{
		driverInitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		LoginPageObject obj=new LoginPageObject(driver);
		
		obj.enterUsername().sendKeys("RahulHole123");
		
		Thread.sleep(2000);
		
		obj.enterPassword().sendKeys("Rahul123");
		
		Thread.sleep(2000);
		
		obj.clickOnlogin().click();
		
		Thread.sleep(2000);
		
		obj.clickOntfrfree().click();
		
		Thread.sleep(2000);
		
	}
	
}
