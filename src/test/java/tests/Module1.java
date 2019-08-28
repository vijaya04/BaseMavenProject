package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import applicationPages.Pg101_LoginPage;
import applicationPages.Pg102_HomePage;
import applicationPages.Pg103_ContactDetailsPage;

public class Module1 
{
	@Test
	public void tc101() 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.testingmasters.com/hrm");
		
		Pg101_LoginPage loginpage = new Pg101_LoginPage(driver);
		loginpage.setUsername("ankit3");
		loginpage.setPassword("abcd1234");
		loginpage.clickOnLogin();

		Pg102_HomePage homepage = new Pg102_HomePage(driver);
		homepage.clickOnMyInfo();
		homepage.clickOnContactDetails();
		
		Pg103_ContactDetailsPage contactdetails = new Pg103_ContactDetailsPage(driver);
		contactdetails.clickOnEdit();
		contactdetails.setAddressStreet1("Nandini Residencncy");
		contactdetails.setAddressStreet2("KPHB");
		contactdetails.setContactCity("Hyderabad");
		contactdetails.setStateOrProvince("Telangana");
		contactdetails.setZipCode("500081");
		contactdetails.selectCountry("India");
		contactdetails.setHomeTelephone("9874563388");
		contactdetails.setMobile("8745236699");
		contactdetails.setWorkTelephone("040-63987413");
		contactdetails.setWorkEmail("testingmasters@gmail.com");
		contactdetails.setOtherEmail("abcd@gmail.com");
		contactdetails.clickOnSave();
		
		
		homepage.Logout();
		
		driver.quit();
	}
	
	@Test
	public void tc102() 
	{
		System.out.println("Executing tc102");
	}
	
	@Test
	public void tc103() 
	{
		System.out.println("Executing tc103");
	}
	
	@Test
	public void tc104() 
	{
		System.out.println("Executing tc104");
	}
}
