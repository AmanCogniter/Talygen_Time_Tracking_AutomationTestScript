package testCases;

import static reporting.ComplexReportFactory.getTest;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.ProjectListingAction;
import Action.TimeApprovalAction;
import Action.TimeSheetAction;
import Action.TimeTrackAction;
import utils.WebTestBase;

public class TimeApprovalTest extends WebTestBase{
	static String Screenname = "<b>Time Sheet</b>"; 
	/* This testscript will validate that Time Approval page is opening or not */
	@Test(priority=1)
	public void ValidationCheck()
	{
		test=getTest(Screenname + ": Validation message on Time Approval");
		TimeApprovalAction timeApprovalAction = new TimeApprovalAction(driver);
		new LoginAction(driver).logoutLogin();
		timeApprovalAction.GoToTimeApprovalPage();
		timeApprovalAction.validationMessageCheck();
		
	}
	@Test(priority=2)
	public void ValidateTimeSheetRejectionFunctionality() throws AWTException
	{
		test=getTest(Screenname + ": Validate TimeSheet Rejection Functionality");
		TimeSheetAction timeSheetAction = new TimeSheetAction(driver);
		
		  new LoginAction(driver).logoutLogin(); ProjectListingAction
		  projectListingAction = new ProjectListingAction(driver);
		  projectListingAction.navigateToProject(); projectListingAction.addProject();
		  projectListingAction.addChannel(); projectListingAction.selectPriority();
		  projectListingAction.enterPurchaseNumber();
		  projectListingAction.selectLocation();
		  projectListingAction.enterProjectDescription();
		  projectListingAction.clickNextButton();
		 
		/*
		 * new LoginAction(driver).logoutLogin(); TimeTrackAction timeTrackAction = new
		 * TimeTrackAction(driver); timeTrackAction.GoToTimeTrackPage();
		 * timeTrackAction.startTimeTrack();
		 * timeTrackAction.verifyActivityInListingArea()
		 */
		new LoginAction(driver).logoutLogin();
		timeSheetAction.GoToTimesheetPage();
		timeSheetAction.clickOnSendForApproval();
		TimeApprovalAction timeApprovalAction = new TimeApprovalAction(driver);
		new LoginAction(driver).logoutLogin();
		timeApprovalAction.GoToTimeApprovalPage();
		timeApprovalAction.rejectApprovalOfTimeSheet();
		new LoginAction(driver).logoutLogin();
		timeSheetAction.GoToTimesheetPage();
		timeSheetAction.clickOnShowTimeSheet();
		timeSheetAction.editWorkingHoursEntry();
		timeSheetAction.deleteWorkingHoursEntry();
		
	}
	@Test(priority=3)
	public void ValidateTimeSheetApproveFunctionality() throws AWTException
	{
		test=getTest(Screenname + ": Validate TimeSheet Rejection Functionality");
		TimeApprovalAction timeApprovalAction = new TimeApprovalAction(driver);
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
		 
		
		/*
		 * new LoginAction(driver).logoutLogin(); TimeTrackAction timeTrackAction = new
		 * TimeTrackAction(driver); timeTrackAction.GoToTimeTrackPage();
		 * timeTrackAction.startTimeTrack();
		 * timeTrackAction.verifyActivityInListingArea();
		 */
		new LoginAction(driver).logoutLogin();
		timeSheetAction.GoToTimesheetPage();
		timeSheetAction.clickOnSendForApproval();
		new LoginAction(driver).logoutLogin();
		timeApprovalAction.GoToTimeApprovalPage();
		timeApprovalAction.ApprovedApprovalOfTimeSheet();
		
	}
	
	
}
