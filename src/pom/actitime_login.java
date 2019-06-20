package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class actitime_login extends BasePage{

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement login;
	

	//constructor super class extends basepage driver d
	public actitime_login (WebDriver driver)
	{
		super(driver);
//		page factory method will initialize the findby values
		PageFactory.initElements(driver, this);
	}

	public void setusername(String us) {
		this.username.sendKeys(us);
	}
	
	public void setpassword(String pd) {
		this.password.sendKeys(pd);
	}
	
	public void clicklogin() {
		this.login.click();
	}
}
