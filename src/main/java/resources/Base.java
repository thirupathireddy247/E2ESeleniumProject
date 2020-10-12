package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Base {
	public static WebDriver driver;
	public Properties p;
	public WebDriver initilaizeBrowser() throws IOException
	{
	 p=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
	 //FileInputStream fis=new FileInputStream("C:\\Users\\TECHOLUTION\\E2ESeleniumProject\\src\\main\\java\\Resources\\Data.properties");
	p.load(fis);
	//String browsername=System.getProperty("browser"); Its using only parameteraization mvn test -Dbrowser=chrome
	String browsername=p.getProperty("browser");   
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		
		/*
		 * ChromeOptions options=new ChromeOptions(); //when ever using this method it
		 * will run the testcase with out open the chromebrowser
		 * options.addArguments("headless"); driver =new ChromeDriver(options);
		 */		 
		driver=new ChromeDriver();
	}
	else if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\thirupathi\\Selenium drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if(browsername.equals("ie"))
   {
	   System.setProperty("wedriver.ie.driver", "C:\\Program Files\\Internet Explorer\\iexplore.exe");
		driver=new InternetExplorerDriver();
   }
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
   public void getscreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src,new File("C:\\thirupathi\\"+result+"thiru.png"));
	}


}
