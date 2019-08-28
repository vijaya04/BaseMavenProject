package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import applicationPages.Pg101_LoginPage;
import applicationPages.Pg102_HomePage;
import applicationPages.Pg105_WorkExperience;
import applicationPages.Pg106_Education;

public class Module3 
{
	@Test
	public void tc301() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.testingmasters.com/hrm");
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		
		Pg101_LoginPage loginpage = new Pg101_LoginPage(driver);
		loginpage.setUsername("ankit3");
		loginpage.setPassword("abcd1234");
		loginpage.clickOnLogin();

		Pg102_HomePage homepage = new Pg102_HomePage(driver);
		homepage.clickOnMyInfo();
		homepage.clickOnQualifications();
		
		Pg105_WorkExperience workexp=new Pg105_WorkExperience(driver);
		
		workexp.clickOnAddWorkExp();
		workexp.setCompany("kofax");
		workexp.setJobTitle("testing");
		workexp.setFromDate("2017-04-06");
		workexp.setToDate("2019-04-06");
		workexp.setComment("job comment");
		workexp.clickOnSave();
		
		Pg106_Education edu=new Pg106_Education(driver);
		edu.clickOnAddEdu();
		edu.clickOnMCA();
		edu.setInstitute("Swarnandhra");
		edu.setSpecialization("MCA");
		edu.setYear("2014");
		edu.setGpa("8.8");
		edu.setStartDate("2011-06-05");
		edu.setEndtDate("2014-06-05");
		edu.clickSaveEdu();
	}
	
	/*@Test
	public void tc302() 
	{
		System.out.println("Executing tc302");
	}
	
	@Test
	public void tc303() 
	{
		System.out.println("Executing tc303");
	}*/
}
