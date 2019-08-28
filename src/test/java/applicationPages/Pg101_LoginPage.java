package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg101_LoginPage extends BasePage
{
	//Page initialization:
	WebDriver driver;
	boolean stepstatus;
	BasePage basepage = new BasePage();
	public Pg101_LoginPage(WebDriver driverInstanceFromTestCase)
	{
		this.driver = driverInstanceFromTestCase;
		PageFactory.initElements(driver, this);
	}
	
	//declaration  of  WebElements:
	@FindBy(how=How.XPATH,using="//input[@name='txtUsername']")
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@name='txtPassword']")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@value='LOGIN']")
	WebElement login;
	
	
	//Defining methods to perform operation on each webelement  
	public void setUsername(String Strusername)
	{
		stepstatus = basepage.setText(username, Strusername);
		reportEvent(stepstatus, "Able to enter username", "Unable to enter username");
	}
	
	public void setPassword(String Strpassword)
	{
		stepstatus = basepage.setText(password, Strpassword);
		reportEvent(stepstatus, "Able to enter password", "Unable to enter password");
	}
	
	public void clickOnLogin()
	{
		stepstatus = basepage.clickElement(login);
		reportEvent(stepstatus, "Able to click on login", "Unable to click on Login");
	}
	
	
	
}
