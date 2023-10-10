package testCases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageObjectModel.SignUpObject;
import resources.BaseClass;

public class VerifySignUp extends BaseClass {
	
	@Test
	
	public void signUp() throws IOException, InterruptedException
	{
		driverInitialize();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		SignUpObject obj=new SignUpObject(driver);
		
		obj.enterFirstName().sendKeys("Rahul");
		
		Thread.sleep(1000);
		
		obj.enterLastName().sendKeys("Hole");
		
		Thread.sleep(1000);
		
		obj.enterEmailId().sendKeys("holerahul888@gmail.com");
		
		Thread.sleep(1000);
		
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);
		
	    obj.enterCompanyName().sendKeys("Infosys");
	    
	    Thread.sleep(1000);
	    
	    obj.clickEmployee().sendKeys(Keys.ARROW_DOWN);
	    
	    obj.clickEmployee().sendKeys(Keys.ARROW_DOWN);

	    Thread.sleep(1000);
	    
	    obj.enterPhone().sendKeys("7697543203");
	    
	    Thread.sleep(1000);
	    
	    obj.clickCheckBox().click();
	    
	    Thread.sleep(1000);
	    
	}

}
