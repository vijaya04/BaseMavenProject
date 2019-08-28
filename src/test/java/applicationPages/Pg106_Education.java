package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg106_Education extends BasePage {
	
	WebDriver driver;
	boolean stepstatus;
	BasePage basepage=new BasePage();
	public Pg106_Education(WebDriver driverInstanceFromTestcase)
	{
		this.driver=driverInstanceFromTestcase;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='addEducation']")
	WebElement AddEdu;
	
	public void clickOnAddEdu()
	{
		stepstatus = basepage.clickElement(AddEdu);
		reportEvent(stepstatus, "Able to click on AddEdu", "Unable to click on AddEdu");
	}
     @FindBy(how=How.XPATH,using="//select[@id='education_code']/child::option[7]")
     
     WebElement Level;
     
     public void clickOnMCA()
 	{
 		stepstatus = basepage.clickElement(Level);
 		reportEvent(stepstatus, "Able to select MCA", "Unable to click on MCA");
 	}
	
     @FindBy(how=How.XPATH,using="//input[@id='education_institute']")
     
     WebElement Institute;
     public void setInstitute(String strInstitute)
     {
    	 stepstatus=basepage.setText(Institute,strInstitute );
    	 reportEvent(stepstatus,"able to set Institute","unable to set Institute");
     }
     
     @FindBy(how=How.XPATH,using="//input[@id='education_major']")
     
     WebElement Specialization;
     public void setSpecialization(String strSpecialization)
     {
    	 stepstatus=basepage.setText(Specialization,strSpecialization );
    	 reportEvent(stepstatus,"able to set Specialization","unable to set Specialization");
     }
     
    @FindBy(how=How.XPATH,using="//input[@id='education_year']")
     
     WebElement Year;
     public void setYear(String strYear)
     {
    	 stepstatus=basepage.setText(Year,strYear );
    	 reportEvent(stepstatus,"able to set Year","unable to set Year");
     }
     
     @FindBy(how=How.XPATH,using="//input[@id='education_gpa']")
     
     WebElement Gpa;
     public void setGpa(String strGpa)
     {
    	 stepstatus=basepage.setText(Gpa,strGpa);
    	 reportEvent(stepstatus,"able to set Gpa","unable to set Gpa");
     }
     @FindBy(how=How.XPATH,using="//input[@id='education_start_date']")
     
     WebElement StartDate;
     public void setStartDate(String strStartDate)
     {
    	 stepstatus=basepage.setText(StartDate,strStartDate);
    	 reportEvent(stepstatus,"able to set StartDate","unable to StartDate");
     }
     
     @FindBy(how=How.XPATH,using="//input[@id='education_end_date']")
     
     WebElement EndtDate;
     public void setEndtDate(String strEndDate)
     {
    	 stepstatus=basepage.setText(EndtDate,strEndDate);
    	 reportEvent(stepstatus,"able to set EndtDate","unable to EndtDate");//input[@id='btnEducationSave']
     }
     @FindBy(how=How.XPATH,using="//input[@id='addEducation' and @value='Add']']")
 	WebElement SaveEdu;
 	
 	public void clickSaveEdu()
 	{
 		stepstatus = basepage.clickElement(SaveEdu);
 		reportEvent(stepstatus, "Able to click on SaveEdu", "Unable to click on SaveEdu");
 	}
     

}
