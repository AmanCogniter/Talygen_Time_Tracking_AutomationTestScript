package testCases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.ProjectListingAction;
import Action.TimeTrackAction;
import utils.WebTestBase;

/**
 * 
 * @author aanand
 *
 */

public class TimeTrackForFlagTrackEntryTest extends WebTestBase {
	static String Screenname = "<b>Time Track</b>"; 
	/*
	 * Validate the Time Track Page and mandatory fields
	 */
	//@Test(priority=1,enabled=true)
	public void ValidationCheck()
	{
		test=getTest(Screenname + ": Validation message on Time Track");
		TimeTrackAction timeTrackAction = new TimeTrackAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackAction.GoToTimeTrackPage();
		timeTrackAction.validationofMandatoryFielkds();
		
	}
	@Test(priority = 2)
	public void startTimeTrack() {
		test=getTest(Screenname + ": Insert Required data and start time track");
		TimeTrackAction timeTrackAction = new TimeTrackAction(driver);
		new LoginAction(driver).logoutLogin();
		ProjectListingAction projectListingAction = new ProjectListingAction(driver);
		projectListingAction.navigateToProject();
		projectListingAction.addProject();
		//projectListingAction.addChannel();
		projectListingAction.selectPriority();
		projectListingAction.enterPurchaseNumber();
		projectListingAction.selectLocation();
		projectListingAction.enterProjectDescription();
		projectListingAction.clickNextButtonOfAddProject();
		new LoginAction(driver).logoutLogin();
		timeTrackAction.GoToTimeTrackPage();
		timeTrackAction.startTimeTrackForFlagTrackEntry();
		
	}
	//@Test(priority=3)
	public void VerifyTimeTrackactivity() {
		test=getTest(Screenname + ": Verify time track activity");
		TimeTrackAction timeTrackAction = new TimeTrackAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackAction.GoToTimeTrackPage();
		timeTrackAction.verifyActivityInListingArea();
		
	}
	//@Test(priority=4)
	public void VerifyclanderViewFunctionality() {
		test=getTest(Screenname + ": Verify clander View Functionality ");
		TimeTrackAction timeTrackAction = new TimeTrackAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackAction.GoToTimeTrackPage();
		timeTrackAction.checkClanderViewFunctionality();
		
	}
	//@Test(priority=7)
	public void updateAnddeleteTimeEntry() {
		test=getTest(Screenname + ": Update and verify delete entry");
		TimeTrackAction timeTrackAction = new TimeTrackAction(driver);
		/*
		 * new LoginAction(driver).logoutLogin(); ProjectListingAction
		 * projectListingAction = new ProjectListingAction(driver);
		 * projectListingAction.navigateToProject(); projectListingAction.addProject();
		 * projectListingAction.addChannel(); projectListingAction.selectPriority();
		 * projectListingAction.enterPurchaseNumber();
		 * projectListingAction.selectLocation();
		 * projectListingAction.enterProjectDescription();
		 * projectListingAction.clickNextButton();
		 */
		new LoginAction(driver).logoutLogin();
		timeTrackAction.GoToTimeTrackPage();
		timeTrackAction.updateRecordAndverifydeleteEntry();
		new LoginAction(driver).logoutLogin();
		ProjectListingAction projectListingAction = new ProjectListingAction(driver);
		projectListingAction.navigateToProject();
		projectListingAction.deleteProjectformList();
	}
	
	//@Test(priority=5)
	public void validatetimeEntryThroughFilter() {
		test=getTest(Screenname + ": Validate Time Entry Through Filter ");
		TimeTrackAction timeTrackAction = new TimeTrackAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackAction.GoToTimeTrackPage();
		timeTrackAction.verifyFilter();
	}
	//@Test(priority=6)
	public void validateAddTimeEntryManually() {
		test=getTest(Screenname + ": Validate Add Time Entry Manually ");
		TimeTrackAction timeTrackAction = new TimeTrackAction(driver);
		
		/*
		 * new LoginAction(driver).logoutLogin(); ProjectListingAction
		 * projectListingAction = new ProjectListingAction(driver);
		 * projectListingAction.navigateToProject(); projectListingAction.addProject();
		 * projectListingAction.addChannel(); projectListingAction.selectPriority();
		 * projectListingAction.enterPurchaseNumber();
		 * projectListingAction.selectLocation();
		 * projectListingAction.enterProjectDescription();
		 * projectListingAction.clickNextButton();
		 */
		 
		new LoginAction(driver).logoutLogin();
		timeTrackAction.GoToTimeTrackPage();
		timeTrackAction.AddManuallyTimeEntry();
	}
}
