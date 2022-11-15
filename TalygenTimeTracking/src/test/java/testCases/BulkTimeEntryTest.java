package testCases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import Action.BulkTimeEntryAction;
import Action.LoginAction;
import Action.ProjectListingAction;
import utils.WebTestBase;

public class BulkTimeEntryTest extends WebTestBase {
	static String Screenname = "<b> bulk time entry </b>";
	/* Validation check and Userguide Check and cancel button*/
	@Test(priority = 1)
	public void validationCheckOfBulkTimeEntry()
	{
		
		
		 test = getTest( Screenname + ":  Validation check of Bulk Time Entry Page");
		 
		BulkTimeEntryAction bulkTimeEntryAction = new BulkTimeEntryAction(driver);
		new LoginAction(driver).logoutLogin();
		bulkTimeEntryAction.GoToBulkTimeEntryPage();
		bulkTimeEntryAction.validationOfBulkTimeEntryPage();	
		//bulkTimeEntryAction.userGuide();
	}
	@Test(priority = 2)
	public void addBulkTimeEntry()
	{
		
		
		 test = getTest( Screenname + ":  add bulk time entry");
		 new LoginAction(driver).logoutLogin();
			ProjectListingAction projectListingAction = new ProjectListingAction(driver);
			projectListingAction.navigateToProject();
			projectListingAction.addProject();
			projectListingAction.addChannel();
			projectListingAction.selectPriority();
			projectListingAction.enterPurchaseNumber();
			projectListingAction.selectLocation();
			projectListingAction.enterProjectDescription();
			projectListingAction.clickNextButton();
		BulkTimeEntryAction bulkTimeEntryAction = new BulkTimeEntryAction(driver);
		new LoginAction(driver).logoutLogin();
		bulkTimeEntryAction.GoToBulkTimeEntryPage();
		bulkTimeEntryAction.AddBulkTimeEntry();	
	}
	@Test(priority = 3)
	public void validationCheckOfAddMultipleBulkTimeEntryButtton()
	{
		
		
		 test = getTest( Screenname + ":  Functionality check of Add multipleBulk Time Entry Button");
		 
		BulkTimeEntryAction bulkTimeEntryAction = new BulkTimeEntryAction(driver);
		new LoginAction(driver).logoutLogin();
		bulkTimeEntryAction.GoToBulkTimeEntryPage();
		bulkTimeEntryAction.AddMultipleBulkTimeEntry();	
		
	}
	@Test(priority = 4)
	public void CheckFunctionalityOfDeleteBulkTimeEntryButtton()
	{
		
		
		 test = getTest( Screenname + ":  Functionality check of Delete Bulk Time Entry Button");
		 
		BulkTimeEntryAction bulkTimeEntryAction = new BulkTimeEntryAction(driver);
		new LoginAction(driver).logoutLogin();
		bulkTimeEntryAction.GoToBulkTimeEntryPage();
		bulkTimeEntryAction.DeleteBulkTimeEntry();	
		
	}
	@Test(priority = 5)
	public void CheckFunctionalityOfResetBulkTimeEntryButtton()
	{
		
		
		 test = getTest( Screenname + ":  Functionality check of Reset Bulk Time Entry Button");
		 
		BulkTimeEntryAction bulkTimeEntryAction = new BulkTimeEntryAction(driver);
		new LoginAction(driver).logoutLogin();
		bulkTimeEntryAction.GoToBulkTimeEntryPage();
		bulkTimeEntryAction.resetBulkTimeEntry();	
		
	}
}
