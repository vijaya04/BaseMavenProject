package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import applicationPages.Pg101_LoginPage;
import applicationPages.Pg102_HomePage;
import applicationPages.Pg104_EmergencyContacts;

public class Module2 
{
	@Test
	public void tc201() 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.testingmasters.com/hrm");
		
		Pg101_LoginPage loginpage = new Pg101_LoginPage(driver);
		loginpage.setUsername("ankit3");
		loginpage.setPassword("abcd1234");
		loginpage.clickOnLogin();

		Pg102_HomePage homepage = new Pg102_HomePage(driver);
		homepage.clickOnMyInfo();
		homepage.clickOnEmergencyContacts();
		
		Pg104_EmergencyContacts emergencycontacts = new Pg104_EmergencyContacts(driver);
		emergencycontacts.clickOnAdd();
		emergencycontacts.setName("Kiran");
		emergencycontacts.setRelationship("Father");
		emergencycontacts.setHomeTelephone("9863247966");
		emergencycontacts.setMobile("9863201188");
		emergencycontacts.setWorkTelephone("040-63592368");
		emergencycontacts.clickOnSave();
		
		
		homepage.Logout();
		
		driver.quit();
	}
	
	@Test
	public void tc202() 
	{
		System.out.println("Executing tc202");
	}
}
