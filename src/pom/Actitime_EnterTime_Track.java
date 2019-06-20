package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class Actitime_EnterTime_Track extends BasePage{
	

	@FindBy(xpath="//div[text()='USERS']")
	private WebElement users;
	
	@FindBy(id="loginButton")
	private WebElement logout;
	
	
	public Actitime_EnterTime_Track (WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}


	public void clickusers() {
		this.elementvisibility(users);
		this.users.click();
}

	public void clicklogout() {
		this.elementvisibility(logout);
		this.logout.click();
}

}
