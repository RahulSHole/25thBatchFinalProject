package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	
	@Test
	
	public void capturingScreenShot() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.14.0");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		TakesScreenshot scrshot=(TakesScreenshot)driver;
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		
		File destination= new File("\\C:\\Users\\ACER\\Desktop\\ScreenShot\\sc.png");
		
		FileUtils.copyFile(source, destination);
		
		System.out.println("Done .......captured");
		
		driver.close();
		
		
		
		
	}

}


