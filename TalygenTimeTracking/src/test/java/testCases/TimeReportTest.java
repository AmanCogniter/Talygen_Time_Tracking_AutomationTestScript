package testCases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.ProjectListingAction;
import Action.TimeReportAction;
import utils.WebTestBase;

public class TimeReportTest extends WebTestBase{
	static String Screenname = "<b>Time Sheet</b>"; 
	/* First check the validation then  check the functionality of time report  */
	@Test(priority=1)
	public void ValidationCheck()
	{
		test=getTest(Screenname + ": Validation message on Time Sheet");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.validationMessageCheck();
		
	}
	@Test(priority=2)
	public void ValidationOneMonthProjectReportWithUserName()
	{
		test=getTest(Screenname + ": Validation of one month of project report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkOneMonthProjectReportWithUserName();
		
	}
	@Test(priority=3)
	public void ValidationOneMonthProjectReportWithDepartmentName()
	{
		test=getTest(Screenname + ": Validation of one month of project report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkOneMonthProjectReportWithDepartmentName();
		
	}
	@Test(priority=4)
	public void ValidationOneMonthProjectReportWithProjectName()
	{
		test=getTest(Screenname + ": Validation of one month of project report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkOneMonthProjectReportWithProjectName();
		
	}
	@Test(priority=5)
	public void ValidationOfOneWeekProjectReportWithUserName()
	{
		test=getTest(Screenname + ": Validation of one week of project report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkOneweekProjectReportWithUserName();
		
	}
	@Test(priority=6)
	public void ValidationOfOneWeekProjectReportWithDepartmentName()
	{
		test=getTest(Screenname + ": Validation of one week of project report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkOneweekProjectReportWithDepartmentName();
		
	}
	@Test(priority=7)
	public void ValidationOfOneWeekProjectReportWithProjectName()
	{
		test=getTest(Screenname + ": Validation of one week of project report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkOneweekProjectReportWithProjectName();
		
	}
	@Test(priority=8)
	public void ValidationOfClientReportWithUserName()
	{
		test=getTest(Screenname + ": Validation of client project report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkClientReportwithUserName();
		
	}
	@Test(priority=9)
	public void ValidationOfClientReportWithProjectName()
	{
		test=getTest(Screenname + ": Validation of client project report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkClientReportwithProjectName();
		
	}
	@Test(priority=10)
	public void ValidationOfClientReportWithDepartmentName()
	{
		test=getTest(Screenname + ": Validation of client project report");
		
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkClientReportwithDepartmentName();
		
	}
	@Test(priority=11)
	public void ValidationOfentryWiseReportwithUsername()
	{
		test=getTest(Screenname + ": Validation of entry wise project report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkEntrywiseReportWithUsername();
		
	}
	@Test(priority=12)
	public void ValidationOfentryWiseReportwithProjectName()
	{
		test=getTest(Screenname + ": Validation of entry wise project report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkEntrywiseReportWithProjectname();
		
	}
	@Test(priority=13)
	public void ValidationOfentryWiseReportwithDepartmentName()
	{
		test=getTest(Screenname + ": Validation of entry wise project report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkEntrywiseReportWithDepartmentname();
		
	}
	@Test(priority=14)
	public void ValidationOfHalfYearlyProjectReportwithUserName()
	{
		test=getTest(Screenname + ": Validation of half yearly project report");
		
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkHalfYearlyReportWithUserName();
		
	}
	@Test(priority=15)
	public void ValidationOfHalfYearlyProjectReportwithDepartmentName()
	{
		test=getTest(Screenname + ": Validation of half yearly project report");
		
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkHalfYearlyReportWithDepartmentName();
		
	}
	@Test(priority=16)
	public void ValidationOfHalfYearlyProjectReportwithProjectName()
	{
		test=getTest(Screenname + ": Validation of half yearly project report");
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
		
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkHalfYearlyReportWithProjectName();
		
	}
	@Test(priority=17)
	public void ValidationOfprofitabilityProjectReportwithProjectName()
	{
		test=getTest(Screenname + ": Validation of Profitability project report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkProfitabilityReportWithProjectName();
		
	}
	@Test(priority=18)
	public void ValidationOfprofitabilityProjectReportwithchannelName()
	{
		test=getTest(Screenname + ": Validation of half yearly project report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkProfitabilityReportWithchannelName();
		
	}
	@Test(priority=19)
	public void ValidationOfProjectDetailsReportWithUsername()
	{
		test=getTest(Screenname + ": Validation of project details report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkOnProjectDetailsReportWithUserName();
		
	}
	@Test(priority=20)
	public void ValidationOfProjectDetailsReportWithProjectname()
	{
		test=getTest(Screenname + ": Validation of project details report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkOnProjectDetailsReportWithProjectName();
		
	}
	@Test(priority=21)
	public void ValidationOfProjectDetailsReportWithDepartmentname()
	{
		test=getTest(Screenname + ": Validation of project details report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkOnProjectDetailsReportWithDepartmentName();
		
	}
	@Test(priority=22)
	public void ValidationOfProjectReportWithUsername()
	{
		test=getTest(Screenname + ": Validation of  project report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkProjectReportwithUserName();
		
	}
	@Test(priority=23)
	public void ValidationOfProjectReportWithPriojectname()
	{
		test=getTest(Screenname + ": Validation of  project report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkProjectReportwithProjectName();
		
	}
	@Test(priority=24)
	public void ValidationOfProjectReportWithDepartnamename()
	{
		test=getTest(Screenname + ": Validation of  project report");
		
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkProjectReportwithDepartName();
		
	}
	@Test(priority=25)
	public void ValidationOfProjectwiseReportWithTeamMemeber()
	{
		test=getTest(Screenname + ": Validation of project wise report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkProjectWiseReportWithTeamMember();
		
	}
	@Test(priority=26)
	public void ValidationOfProjectwiseReportWithProjectName()
	{
		test=getTest(Screenname + ": Validation of project wise report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkProjectWiseReportWithProjectName();
		
	}
	@Test(priority=27)
	public void ValidationOfTrackEnrtyDetailsReportWithUserName()
	{
		test=getTest(Screenname + ": Validation of track entry details report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkTrackEntryDetailsReportWithUsername();
		
	}
	@Test(priority=28)
	public void ValidationOfTrackEnrtyDetailsReportWithProjectName()
	{
		test=getTest(Screenname + ": Validation of track entry details report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkTrackEntryDetailsReportWithProjectnmae();
		
	}
	@Test(priority=29)
	public void ValidationOfTrackEnrtyDetailsReportWithDepartmentname()
	{
		test=getTest(Screenname + ": Validation of track entry details report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkTrackEntryDetailsReportWithDepartmentName();
		
	}
	@Test(priority=30)
	public void ValidationOfTimeSheetReportWithUsername()
	{
		test=getTest(Screenname + ": Validation of TimeSheet report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkTimeSheetReportWithusername();
		
	}
	@Test(priority=31)
	public void ValidationOfTimeSheetReportWithProjectname()
	{
		test=getTest(Screenname + ": Validation of TimeSheet report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkTimeSheetReportWithProjectName();
		
	}
	@Test(priority=32)
	public void ValidationOfUserReportWithusername()
	{
		test=getTest(Screenname + ": Validation of user report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkUserReportwithUserName();
		
	}
	@Test(priority=33)
	public void ValidationOfUserReportWithProjectname()
	{
		test=getTest(Screenname + ": Validation of user report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkUserReportwithProjectName();
		
	}
	@Test(priority=34)
	public void ValidationOfUserReportWithDepartmentname()
	{
		test=getTest(Screenname + ": Validation of user report");
		
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkUserReportwithDepartmentName();
		
	}
	@Test(priority=35)
	public void ValidationOfUserWiseReportWithUserName()
	{
		test=getTest(Screenname + ": Validation of user report");
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkUserwiseReportWithUserName();
		
	}
	@Test(priority=36)
	public void ValidationOfUserWiseReportWithProjectName()
	{
		test=getTest(Screenname + ": Validation of user report");
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
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkUserwiseReportWithProjectName();
		
	}
	@Test(priority=37)
	public void ValidationOfUserWiseReportWithDepartmentName()
	{
		test=getTest(Screenname + ": Validation of user report");
		
		TimeReportAction timeReportAction = new TimeReportAction(driver);
		new LoginAction(driver).logoutLogin();
		timeReportAction.GoToTimesheetPage();
		timeReportAction.checkUserwiseReportWithDepartmentName();
		
	}
}
