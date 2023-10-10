package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpObject {
	
	public static WebDriver driver;
	
	private By FirstName=By.xpath("//input[@name='UserFirstName']");
	
	private By LastName=By.xpath("//input[@name='UserLastName']");
	
	private By EmailId=By.xpath("//input[@name='UserEmail']");
	
	private By JobTitle1=By.xpath("//select[@name='UserTitle']");
	
	private By companyName=By.xpath("//input[@name='CompanyName']");
	
	private By Employees=By.xpath("//select[@name='CompanyEmployees']");
	
	private By PhoneNo=By.xpath("//input[@name='UserPhone']");
	
	private By Checkbox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	public SignUpObject(WebDriver driver2) {

		this.driver=driver2;
	}

	public WebElement enterFirstName()
	{
		return driver.findElement(FirstName);
	}
	
	public WebElement enterLastName()
	{
		return driver.findElement(LastName);
	}
	
	public WebElement enterEmailId()
	{
		return driver.findElement(EmailId);
	}
	
	public WebElement clickJobTitle()
	{
		return driver.findElement(JobTitle1);
	}
	
	public WebElement enterCompanyName()
	{
		return driver.findElement(companyName);
	}
	
	public WebElement clickEmployee()
	{
		return driver.findElement(Employees);
	}
	
	public WebElement enterPhone()
	{
		return driver.findElement(PhoneNo);
	}
	
	public WebElement clickCheckBox()
	{
		return driver.findElement(Checkbox);
	}
	
}
