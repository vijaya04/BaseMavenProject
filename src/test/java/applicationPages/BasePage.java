package applicationPages;

import org.openqa.selenium.WebElement;

public class BasePage extends ReportLibrary
{
	public boolean setText(WebElement ele, String StrValue) 
	{	
		boolean stepstatus;
		try
		{
			ele.clear();
			ele.sendKeys(StrValue);
			stepstatus = true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			stepstatus = false;
		}
		return stepstatus;
	}
	
	public  boolean clickElement(WebElement ele) 
	{
		boolean stepstatus;
		try
		{
			ele.click();
			stepstatus = true;
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			stepstatus = false;
		}
		return stepstatus;
	}
	
	public  void wait(int TimeInSec) 
	{
		try
		{
			Thread.sleep(TimeInSec*1000);
		} 
		catch (Exception e)
		{
			
		}
	}
}
