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

public class ValidateTitle extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void beforetest() throws IOException
	{
		driver =initilaizeBrowser(); 
		log.info("driver initilaized");
		//driver.get("http://qaclickacademy.com/");
		driver.get(p.getProperty("URL"));
		log.info("navigated to homepage");
	}
	
	@Test
	public void basepagenaviation() throws IOException
	{
		
		Landinpage la=new Landinpage(driver);
		Assert.assertEquals(la.getTitle().getText(),"FEATURED COURSES");
		log.info("successfully got the text");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
