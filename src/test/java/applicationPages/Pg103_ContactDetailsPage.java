package applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg103_ContactDetailsPage   extends BasePage
{
	WebDriver driver;
	boolean stepstatus;
	BasePage basepage = new BasePage();
	public Pg103_ContactDetailsPage(WebDriver driverInstanceFromTestCase)
	{
		this.driver = driverInstanceFromTestCase;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Edit']")
	WebElement Edit;
	public void clickOnEdit()
	{
		stepstatus = basepage.clickElement(Edit);
		reportEvent(stepstatus, "Able to click on Edit", "Unable to click on Edit");
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='contact_street1']")
	WebElement AddressStreet1;
	public void setAddressStreet1(String strAddressStreet1)
	{
		stepstatus = basepage.setText(AddressStreet1,strAddressStreet1);
		reportEvent(stepstatus, "Able to set AddressStreet1", "Unable to set AddressStreet1");
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='contact_street2']")
	WebElement AddressStreet2;
	public void setAddressStreet2(String strAddressStreet2)
	{
		stepstatus = basepage.setText(AddressStreet2,strAddressStreet2);
		reportEvent(stepstatus, "Able to set AddressStreet2", "Unable to set AddressStreet2");
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@id='contact_city']")
	WebElement City;
	public void setContactCity(String strContactCity)
	{
		stepstatus = basepage.setText(City,strContactCity);
		reportEvent(stepstatus, "Able to set City", "Unable to set City");
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='contact_province']")
	WebElement StateOrProvince;
	public void setStateOrProvince(String strStateOrProvince)
	{
		stepstatus = basepage.setText(StateOrProvince,strStateOrProvince);
		reportEvent(stepstatus, "Able to set StateOrProvince", "Unable to set StateOrProvince");
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='contact_emp_zipcode']")
	WebElement ZipCode;
	public void setZipCode(String strZipCode)
	{
		stepstatus = basepage.setText(ZipCode,strZipCode);
		reportEvent(stepstatus, "Able to set ZipCode", "Unable to set ZipCode");
	}
	
	public WebElement getCountry(String StrCountryName)
	{
		return driver.findElement(By.xpath(String.format("//select[@name='contact[country]']/option[text()='%s']", StrCountryName)));
	}
	public void selectCountry(String StrCountryName)
	{
		stepstatus = basepage.clickElement(getCountry(StrCountryName));
		reportEvent(stepstatus, "Able to select country", "Unable to select country");
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@id='contact_emp_hm_telephone']")
	WebElement HomeTelephone;
	public void setHomeTelephone(String strHomeTelephone)
	{
		stepstatus = basepage.setText(HomeTelephone,strHomeTelephone);
		reportEvent(stepstatus, "Able to set HomeTelephone", "Unable to set HomeTelephone");
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='contact_emp_mobile']")
	WebElement Mobile;
	public void setMobile(String strMobile)
	{
		stepstatus = basepage.setText(Mobile,strMobile);
		reportEvent(stepstatus, "Able to set Mobile", "Unable to set Mobile");
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='contact_emp_work_telephone']")
	WebElement WorkTelephone;
	public void setWorkTelephone(String strWorkTelephone)
	{
		stepstatus = basepage.setText(WorkTelephone,strWorkTelephone);
		reportEvent(stepstatus, "Able to set WorkTelephone", "Unable to set WorkTelephone");
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@id='contact_emp_work_email']")
	WebElement WorkEmail;
	public void setWorkEmail(String strWorkEmail)
	{
		stepstatus = basepage.setText(WorkEmail,strWorkEmail);
		reportEvent(stepstatus, "Able to set WorkEmail", "Unable to set WorkEmail");
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='contact_emp_oth_email']")
	WebElement OtherEmail;
	public void setOtherEmail(String strOtherEmail)
	{
		stepstatus = basepage.setText(OtherEmail,strOtherEmail);
		reportEvent(stepstatus, "Able to set OtherEmail", "Unable to set OtherEmail");
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Save']")
	WebElement Save;
	public void clickOnSave()
	{
		stepstatus = basepage.clickElement(Save);
		reportEvent(stepstatus, "Able to click on Save", "Unable to click on Save");
	}
	
}
