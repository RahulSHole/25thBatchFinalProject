package testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B {
	
	@Test
	
	public void m2() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
