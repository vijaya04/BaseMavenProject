package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg102_HomePage  extends BasePage
{
	WebDriver driver;
	boolean stepstatus;
	BasePage basepage = new BasePage();
	public Pg102_HomePage(WebDriver driverInstanceFromTestCase)
	{
		this.driver = driverInstanceFromTestCase;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//b[text()='My Info']")
	WebElement MyInfo;
	public void clickOnMyInfo()
	{
		stepstatus = basepage.clickElement(MyInfo);
		reportEvent(stepstatus, "Able to click on MyInfo", "Unable to click on MyInfo");
	}
	
	
	@FindBy(how=How.XPATH,using="//a[text()='Contact Details']")
	WebElement contactdetails;
	public void clickOnContactDetails()
	{
		stepstatus = basepage.clickElement(contactdetails);
		reportEvent(stepstatus, "Able to click on contactdetails", "Unable to click on contactdetails");
	}
	
	
	@FindBy(how=How.XPATH,using="//a[text()='Emergency Contacts']")
	WebElement EmergencyContacts;
	public void clickOnEmergencyContacts()
	{
		stepstatus = basepage.clickElement(EmergencyContacts);
		reportEvent(stepstatus, "Able to click on EmergencyContacts", "Unable to click on EmergencyContacts");
	} 
	
	@FindBy(how=How.XPATH,using="//a[text()='Qualifications']")
	WebElement Qualificatons;
	public void clickOnQualifications()
	{
		stepstatus=clickElement(Qualificatons);
		reportEvent(stepstatus,"able to click on Qualifications","unable to click on Qualifications");
	}
	
	
	@FindBy(how=How.XPATH,using="//a[@id='welcome']")
	WebElement LogoutExpand;
	@FindBy(how=How.XPATH,using="//a[text()='Logout']")
	WebElement Logout;
	public void Logout()
	{
		stepstatus = basepage.clickElement(LogoutExpand);
		reportEvent(stepstatus, "Able to click on LogoutExpand", "Unable to click on LogoutExpand");
		basepage.wait(1);
		stepstatus = basepage.clickElement(Logout);
		reportEvent(stepstatus, "Able to click on Logout", "Unable to click on Logout");
	} 
}
