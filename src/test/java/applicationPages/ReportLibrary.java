package applicationPages;

import org.testng.Assert;

public class ReportLibrary 
{
	protected  void reportEvent(boolean stepstatus,String PassMessage, String FailMessage) 
	{
		if (stepstatus == true) 
		{
			System.out.println("	<<PASS>> " + PassMessage);
		} 
		else 
		{
			System.out.println("	<<FAIL>> " + FailMessage);
		}
		Assert.assertEquals(stepstatus, true);
	}
}
