package testCases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;


import Action.LoginAction;
import Action.WorkDairyAction;
import utils.WebTestBase;

public class WorkDairyTest extends WebTestBase {
	static String Screenname = "<b> Work Dairy </b>";
	/* Validation check and Userguide Check and cancel button*/
	@Test(priority = 1)
	public void validationCheckOfWorkDairy()
	{
		
		
		 test = getTest( Screenname + ":  Validation check of Work Dairy Page");
		 
		 WorkDairyAction workDairyAction = new WorkDairyAction(driver);
		new LoginAction(driver).logoutLogin();
		workDairyAction.GoToWorkDairyPage();
		workDairyAction.validationOfBulkTimeEntryPage();	
		//bulkTimeEntryAction.userGuide();
	}
	@Test(priority = 2)
	public void validationOfScreenShot()
	{
		
		
		 test = getTest( Screenname + ":  Validation check of ScreenShot");
		 
		 WorkDairyAction workDairyAction = new WorkDairyAction(driver);
		new LoginAction(driver).logoutLogin();
		workDairyAction.GoToWorkDairyPage();
		workDairyAction.ValidateScreenShot();	
		//bulkTimeEntryAction.userGuide();
	}
}
