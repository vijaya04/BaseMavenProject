package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg105_WorkExperience extends BasePage{
	
	WebDriver driver;
	boolean stepstatus;
	BasePage basepage=new BasePage();
	public Pg105_WorkExperience(WebDriver driverInstanceFromTestcase)
	{
		this.driver=driverInstanceFromTestcase;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='addWorkExperience']")
	WebElement AddWorkexp;
	
	public void clickOnAddWorkExp()
	{
		stepstatus = basepage.clickElement(AddWorkexp);
		reportEvent(stepstatus, "Able to click on AddWorkExp", "Unable to click on AddWorkExp");
	}
	
     @FindBy(how=How.XPATH,using="//input[@id='experience_employer']")
     
     WebElement Company;
     public void setCompany(String strCountry)
     {
    	 stepstatus=basepage.setText(Company,strCountry );
    	 reportEvent(stepstatus,"able to set country","unable to enter country");
     }
     
     @FindBy(how=How.XPATH,using="//input[@id='experience_jobtitle']")
      WebElement JobTitle;
     public void setJobTitle(String strJobTitle)
     {
    	 stepstatus=basepage.setText(JobTitle,strJobTitle);
    	 reportEvent(stepstatus,"able to set JobTitle","unable to enter JobTitle");
     }
     
     @FindBy(how=How.XPATH,using="//input[@id='experience_from_date']")
     WebElement FromDate;
     public void setFromDate(String strFromDate)
     {
   	 stepstatus=basepage.setText(FromDate,strFromDate);
   	 reportEvent(stepstatus,"able to set FromeDate","unable to set FromDate");
     }
     @FindBy(how=How.XPATH,using="//input[@id='experience_to_date']")
     WebElement ToDate;
     public void setToDate(String strToDate)
     {
   	 stepstatus=basepage.setText(ToDate,strToDate);
   	 reportEvent(stepstatus,"able to set ToDate","unable to set ToDate");//textarea[@id='experience_comments']
     }
     @FindBy(how=How.XPATH,using="//textarea[@id='experience_comments']")
     WebElement Comment;
     public void setComment(String strComment)
     {
   	 stepstatus=basepage.setText(Comment,strComment);
   	 reportEvent(stepstatus,"able to set Comment","unable to set Comment");
     }
     
     @FindBy(how=How.XPATH,using="//input[@id='btnWorkExpSave']")
     WebElement Save;
     public void clickOnSave()
     {
   	 stepstatus=basepage.clickElement(Save);
   	 reportEvent(stepstatus,"able to click on save","unable to click on save");
     }
     
    
     

}
