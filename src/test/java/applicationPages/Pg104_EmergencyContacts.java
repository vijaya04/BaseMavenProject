package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg104_EmergencyContacts   extends BasePage
{
	WebDriver driver;
	boolean stepstatus;
	BasePage basepage = new BasePage();
	public Pg104_EmergencyContacts(WebDriver driverInstanceFromTestCase)
	{
		this.driver = driverInstanceFromTestCase;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Add']")
	WebElement Add;
	public void clickOnAdd()
	{
		stepstatus = basepage.clickElement(Add);
		reportEvent(stepstatus, "Able to click on Add", "Unable to click on Add");
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='emgcontacts_name']")
	WebElement Name;
	public void setName(String strName)
	{
		stepstatus = basepage.setText(Name,strName);
		reportEvent(stepstatus, "Able to set Name", "Unable to set Name");
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='emgcontacts_relationship']")
	WebElement Relationship;
	public void setRelationship(String strRelationship)
	{
		stepstatus = basepage.setText(Relationship,strRelationship);
		reportEvent(stepstatus, "Able to set Relationship", "Unable to set Relationship");
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='emgcontacts_homePhone']")
	WebElement HomeTelephone;
	public void setHomeTelephone(String strHomeTelephone)
	{
		stepstatus = basepage.setText(HomeTelephone,strHomeTelephone);
		reportEvent(stepstatus, "Able to set HomeTelephone", "Unable to set HomeTelephone");
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='emgcontacts_mobilePhone']")
	WebElement Mobile;
	public void setMobile(String strMobile)
	{
		stepstatus = basepage.setText(Mobile,strMobile);
		reportEvent(stepstatus, "Able to set Mobile", "Unable to set Mobile");
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='emgcontacts_workPhone']")
	WebElement WorkTelephone;
	public void setWorkTelephone(String strWorkTelephone)
	{
		stepstatus = basepage.setText(WorkTelephone,strWorkTelephone);
		reportEvent(stepstatus, "Able to set WorkTelephone", "Unable to set WorkTelephone");
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@value='Save']")
	WebElement Save;
	public void clickOnSave()
	{
		stepstatus = basepage.clickElement(Save);
		reportEvent(stepstatus, "Able to click on Save", "Unable to click on Save");
	}
	
}
