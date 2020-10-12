package Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Landinpage;
import resources.Base;

public class ValidateNavigationbar extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initilaize() throws IOException
	{
		driver =initilaizeBrowser(); 
		//driver.get("http://qaclickacademy.com/");
		driver.get(p.getProperty("URL"));
	}
	@Test
	public void baseinitilaization() throws IOException
	{
				Landinpage la=new Landinpage(driver);
		Assert.assertTrue(la.getContact().isDisplayed());
		log.info("successfully displayed the contact");
		log.error("contact is not dispalyed");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}

}
