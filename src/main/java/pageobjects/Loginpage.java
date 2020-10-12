package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	WebDriver driver;
	
 private By email=By.cssSelector("input[type='email']");
  private By password=By.id("user_password");
  private By loginbutton= By.cssSelector("input[type='submit']");
 
 public Loginpage(WebDriver driver)
 {
	 this.driver=driver;
 }
 public WebElement getemail()
 {
	 return driver.findElement(email);
 }
 public WebElement getpassword()
 {
	 return driver.findElement(password);
 }
 public WebElement getlogin()
 {
	 return driver.findElement(loginbutton);
 }

}
