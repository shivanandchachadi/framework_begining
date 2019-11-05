package completetestng_demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class driverclass {

	WebDriver driver;
	String drivername;
	public WebDriver drivercl(String browsername) throws IOException
	{
		
		
		System.out.println("the driver name from prperty file is "+ browsername);
		
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			//return null;
			
		}
		else if(browsername=="firefox")
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			//return null ;
			
		}
		else if(browsername.equals("IE"))

		{
			System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			//return null ;
		}
		return driver;
	}
}
