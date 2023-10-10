package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingExcelSheet {
	
	@Test
	
	public void excelHandling() throws IOException, InterruptedException
	
	{
		
		FileInputStream fs=new FileInputStream("\\C:\\Users\\ACER\\Desktop\\Book1.xlsx\\");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cellfirst=row.getCell(0);
		
		XSSFCell cellsecond=row.getCell(1);
		
		System.out.println(sheet.getRow(0).getCell(0));
		
		System.out.println(sheet.getRow(0).getCell(1));
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		
		username.click();
		
		Thread.sleep(1000);
		
		username.sendKeys(cellfirst.getStringCellValue());
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		
		password.click();
		
		Thread.sleep(1000);
		
		password.sendKeys(cellsecond.getStringCellValue());
		
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		
		login.click();
		
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
