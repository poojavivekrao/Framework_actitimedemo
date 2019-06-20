package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.data;
import pom.Actitime_EnterTime_Track;
import pom.actitime_login;

public class Users extends BaseTest {
	
	@Test
	public void method3(){
	actitime_login ob1 = new actitime_login(driver);
	
	ob1.setusername(data.getdata(excelpath,"sheet1",0,0));
	ob1.setpassword(data.getdata(excelpath,"sheet1",1,0));
	ob1.clicklogin();
	
	Actitime_EnterTime_Track ob2= new Actitime_EnterTime_Track(driver);
	ob2.clickusers();
	
	}
}
