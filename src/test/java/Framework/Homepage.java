package Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Landinpage;
import pageobjects.Loginpage;
import resources.Base;

public class Homepage extends Base{
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initilaize() throws IOException
	{
		driver =initilaizeBrowser(); 
		//driver.get("http://qaclickacademy.com/");
		log.info("navigated to browsers");
	
	}
	@Test(dataProvider="getdata")
	public void basepagenavigation(String username,String password) throws IOException
	{
		/*
		 * driver =initilaizeBrowser(); driver.get("http://qaclickacademy.com/");
		 * Landingpage la=new Landingpage(driver); la.getlogin().click(); Loginpage
		 * lo=new Loginpage(driver); lo.getemail().sendKeys("allathiru63@gmail.com");
		 * lo.getpassword().sendKeys("9441426563"); lo.getlogin().click();
		 */
		
		   
		 //driver.get("http://qaclickacademy.com/");
		  driver.get(p.getProperty("URL"));
		  log.info("successfully taken the url");
		 
		Landinpage la=new Landinpage(driver);
		la.getlogin().click();
		log.info("successfuly clicks on login button");
		Loginpage lo=new Loginpage(driver); 
		lo.getemail().sendKeys(username);
		lo.getpassword().sendKeys(password); 
		lo.getlogin().click();
		log.info("successfully clicks on sign in button");
		}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="dfdjfhdjfhd";
		obj[0][1]="123456";
		 obj[1][0]="hello";
		 obj[1][1]="789012";
		return obj;
	}
	
		
	

}
