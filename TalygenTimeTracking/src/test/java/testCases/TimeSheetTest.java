package testCases;

import static reporting.ComplexReportFactory.getTest;

import java.awt.AWTException;

import org.testng.annotations.Test;


import Action.LoginAction;
import Action.ProjectListingAction;
import Action.TimeSheetAction;
import Action.TimeTrackAction;
import utils.WebTestBase;

public class TimeSheetTest extends WebTestBase {
	static String Screenname = "<b>Time Sheet</b>"; 
	/* First check the validation then  check the functionality of time sheet  */
	@Test(priority=1)
	public void ValidationCheck()
	{
		test=getTest(Screenname + ": Validation message on Time Sheet");
		TimeSheetAction timeSheetAction = new TimeSheetAction(driver);
		new LoginAction(driver).logoutLogin();
		timeSheetAction.GoToTimesheetPage();
		timeSheetAction.validationMessageCheck();
		
	}
	@Test(priority=2)
	public void validatefunctionalityOfTimeSheet() throws AWTException {
		test=getTest(Screenname + ": Validate functionality of time sheet");
		TimeSheetAction timeSheetAction = new TimeSheetAction(driver);
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
		new LoginAction(driver).logoutLogin();
		TimeTrackAction timeTrackAction = new TimeTrackAction(driver);
		timeTrackAction.GoToTimeTrackPage();
		timeTrackAction.startTimeTrack();
		timeTrackAction.verifyActivityInListingArea();
		new LoginAction(driver).logoutLogin();
		timeSheetAction.GoToTimesheetPage();
		timeSheetAction.checkFunctionalityOfTimesheet();
	}
	@Test(priority=3)
	public void validateSendForApproval() throws AWTException {
		test=getTest(Screenname + ": Validate functionality of Send For Approval");
		TimeSheetAction timeSheetAction = new TimeSheetAction(driver);
		
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
		TimeTrackAction timeTrackAction = new TimeTrackAction(driver);
		timeTrackAction.GoToTimeTrackPage();
		timeTrackAction.startTimeTrackforsendApproval();
		timeTrackAction.verifyActivityInListingArea();
		new LoginAction(driver).logoutLogin();
		timeSheetAction.GoToTimesheetPage();
		timeSheetAction.clickOnSendForApproval();
	}
	
}
