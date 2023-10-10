package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot2 {
	
	@Test
	 
	public void screenShot() throws InterruptedException, IOException
	{
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
				
	/*	TakesScreenshot scrshot=(TakesScreenshot)driver;
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		
		File destination= new File("\\C:\\Users\\ACER\\Desktop\\ScreenShot\\shut.png");
		
		FileUtils.copyFile(source, destination);
		
		Thread.sleep(4000);      */
		
        WebElement shot=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]"));
		
		TakesScreenshot scrshot1=(TakesScreenshot)driver;
		
		File source1 = scrshot1.getScreenshotAs(OutputType.FILE);
		
		File destination1= new File("\\C:\\Users\\ACER\\Desktop\\ScreenShot\\shut1.png");
		
		FileUtils.copyFile(source1, destination1);
		
         Thread.sleep(3000);
		
		System.out.println("Done .......captured");
		
		driver.close();        
		
		
	}
	

}
