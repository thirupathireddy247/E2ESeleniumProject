package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landinpage {
	public WebDriver driver;
	
	
	
	public Landinpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
 By Title =By.xpath("//*[text()='Featured Courses']");
 By Login=By.xpath("//*[text()='Login']");
 By Contact=By.xpath("//*[text()='Contact']");
	public WebElement getTitle()
	{
		return driver.findElement(Title);
	}
	public WebElement getContact()
	{
		return driver.findElement(Contact);
	}

	public WebElement getlogin()
	{
		return driver.findElement(Login);
		
	}

}
