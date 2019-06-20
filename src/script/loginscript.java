package script;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.data;
import pom.actitime_login;

public class loginscript extends BaseTest{
	
	@Test
	public void method1() 
	{
	 actitime_login ob = new actitime_login(driver);
	 

		ob.setusername(data.getdata(excelpath,"sheet1",0,0));
		ob.setpassword(data.getdata(excelpath,"sheet1",1,0));
		ob.clicklogin();
		ob.titlewait("actiTIME - Enter Time-Track");
//		ob.setusername("admin");
//		ob.setpassword("manager");
//		ob.clicklogin();
//		ob.titlewait("actiTIME - Enter Time-Trac");
	}
	
}
