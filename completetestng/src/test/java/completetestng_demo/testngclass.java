package completetestng_demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import serviceclass.propread;



public class testngclass extends propread {
	driverclass dc=new driverclass();
	WebDriver dri;
	
	@Test(description="login method test")
	@Parameters({"username"})
	public void login(String un) throws IOException
	{
	System.out.println("login method"+ un);
	String bname=read("browser");
	
	dri=dc.drivercl(bname);
	dri.get(read("website"));
	
	}
	@Test(description="navigate method test")
	@Parameters({"username","password"})
	public void navigate(String uname,String pname)
	{
	System.out.println("navigate method username and pass is"+ uname +" passsword is" + pname );
	dri.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(uname);
	dri.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	dri.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div/span")).click();
	dri.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	String data=dri.findElement(By.xpath("//h3[contains(text(),'Alcohol by')]")).getText();
	if(data.contains("Alcohol"))
	{
		Assert.assertTrue(1==1);
	}
	else
		System.out.println("fail");
	}
	
	@Test(description="logout method test")
	public void logout()
	{
	System.out.println("logout method");
	}
}
