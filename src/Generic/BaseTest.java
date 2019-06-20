package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements AutoConstant{
	public WebDriver driver;
	static {
		System.setProperty(chromekey, chromevalue);
		System.setProperty(geckokey, geckovalue);
		}
	@Parameters("browser")
	@BeforeMethod
	public void precondition(String br) 
	{	
		if(br.equals("chrome")) {
			driver =new ChromeDriver();
		}
		else
		{
			driver =new FirefoxDriver();
		}
		
		 driver = new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	}
	
	@AfterMethod(alwaysRun=true)
	public void postcondition(ITestResult t)
	{
//		Only for failed scripts screenshot will get captured
		String name = t.getMethod().getMethodName();
	    int status = t.getStatus();
	    if(status == 2) {
	    photo.getphoto(driver, name);
	    }
		driver.close();
	}
	}
