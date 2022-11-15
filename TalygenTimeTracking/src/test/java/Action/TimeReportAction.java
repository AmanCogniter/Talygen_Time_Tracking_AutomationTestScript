package Action;

import org.openqa.selenium.WebDriver;

import pageObjects.TimeReportPage;


public class TimeReportAction {
	WebDriver driver ; 
	TimeReportPage timeReportPage;
	
	public TimeReportAction(WebDriver driver)
	{
		this.driver= driver;
		timeReportPage= new TimeReportPage(driver);
	}
	
	public void GoToTimesheetPage()
	{
		timeReportPage.clickFullMenuDropDown();
		timeReportPage.clickTimeTrackingLink();
		timeReportPage.clickOnTimeReportPage();		
	}
	public void validationMessageCheck()
	{
		timeReportPage.validateTimeReportpage();
		
	}
	public void checkOneMonthProjectReportWithUserName() {
		timeReportPage.clickOnOneMontyh();
		timeReportPage.clickOnUser();
		timeReportPage.clickOnsearch();
		timeReportPage.oneMonthProjectReport();

	}
	public void checkOneMonthProjectReportWithDepartmentName() {
		timeReportPage.clickOnOneMontyh();
		timeReportPage.clickOnDepartmentwithUserreport();
		timeReportPage.clickOnsearch();
		timeReportPage.oneMonthProjectReport();

	}
	public void checkOneMonthProjectReportWithProjectName() {
		timeReportPage.clickOnOneMontyh();
		timeReportPage.clickOnProject();
		timeReportPage.clickOnsearch();
		timeReportPage.oneMonthProjectReport();

	}
	public void checkOneweekProjectReportWithUserName() {
		timeReportPage.clickOnOneWeek();
		timeReportPage.clickOnUser();
		timeReportPage.clickOnsearch();
		timeReportPage.oneWeekProjectReport();

	}
	public void checkOneweekProjectReportWithDepartmentName() {
		timeReportPage.clickOnOneWeek();
		timeReportPage.clickOnDepartmentwithUserreport();
		timeReportPage.clickOnsearch();
		timeReportPage.oneWeekProjectReport();

	}
	public void checkOneweekProjectReportWithProjectName() {
		timeReportPage.clickOnOneWeek();
		timeReportPage.clickOnProject();
		timeReportPage.clickOnsearch();
		timeReportPage.oneWeekProjectReport();

	}
	public void checkClientReportwithUserName() {
		timeReportPage.clickOnClientreport();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnUser();
		timeReportPage.selectClient();
		timeReportPage.clickOnsearch();
		timeReportPage.clientReport();

	}
	public void checkClientReportwithProjectName() {
		timeReportPage.clickOnClientreport();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnProject();
		timeReportPage.selectClient();
		timeReportPage.clickOnsearch();
		timeReportPage.clientReport();

	}
	public void checkClientReportwithDepartmentName() {
		timeReportPage.clickOnClientreport();
		timeReportPage.clickOnDAterange();
		timeReportPage.selectClient();
		timeReportPage.clickOnDepartmentwithUserreport();
		
		timeReportPage.clickOnsearch();
		timeReportPage.clientReport();

	}
	public void checkEntrywiseReportWithUsername() {
		timeReportPage.clickOnEntrywise();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnUser();

		timeReportPage.clickOnsearch();
		timeReportPage.EntryWiseReport();

	}
	public void checkEntrywiseReportWithProjectname() {
		timeReportPage.clickOnEntrywise();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnProject();

		timeReportPage.clickOnsearch();
		timeReportPage.EntryWiseReport();

	}
	public void checkEntrywiseReportWithDepartmentname() {
		timeReportPage.clickOnEntrywise();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnDepartment();

		timeReportPage.clickOnsearch();
		timeReportPage.EntryWiseReport();

	}
	public void checkHalfYearlyReportWithUserName() {
		timeReportPage.clickOnHalfYearly();
		timeReportPage.clickOnUser();

		timeReportPage.clickOnsearch();
		timeReportPage.halfYearlyReport();

	}
	public void checkHalfYearlyReportWithDepartmentName() {
		timeReportPage.clickOnHalfYearly();
		timeReportPage.clickOnDepartmentwithUserreport();

		timeReportPage.clickOnsearch();
		timeReportPage.halfYearlyReport();

	}
	public void checkHalfYearlyReportWithProjectName() {
		timeReportPage.clickOnHalfYearly();
		timeReportPage.clickOnProject();

		timeReportPage.clickOnsearch();
		timeReportPage.halfYearlyReport();

	}
	public void checkProfitabilityReportWithProjectName() {
		timeReportPage.clickOnProfitabilityReport();
		timeReportPage.clickOnProject();

		timeReportPage.clickOnsearch();
		timeReportPage.profitabilityReport();

	}
	public void checkProfitabilityReportWithchannelName() {
		timeReportPage.clickOnProfitabilityReport();
		timeReportPage.clickOnChannel();

		timeReportPage.clickOnsearch();
		timeReportPage.profitabilityReport();

	}
	public void checkOnProjectDetailsReportWithUserName() {
		timeReportPage.clickOnProjectDetailsReport();
		//timeReportPage.clickOnDAterange();
		timeReportPage.clickOnUser();
		timeReportPage.clickOnsearch();
		timeReportPage.projectDetailsReport();

	}
	public void checkOnProjectDetailsReportWithProjectName() {
		timeReportPage.clickOnProjectDetailsReport();
		//timeReportPage.clickOnDAterange();
		timeReportPage.clickOnProject();
		timeReportPage.clickOnsearch();
		timeReportPage.projectDetailsReport();

	}
	public void checkOnProjectDetailsReportWithDepartmentName() {
		timeReportPage.clickOnProjectDetailsReport();
		//timeReportPage.clickOnDAterange();
		timeReportPage.clickOnDepartmentwithProjectDetailreport();
		timeReportPage.clickOnsearch();
		timeReportPage.projectDetailsReport();

	}
	public void checkProjectReportwithUserName() {
		timeReportPage.clickOnProjectReport();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnUser();
		timeReportPage.clickOnsearch();
		timeReportPage.projectReport();

	}
	public void checkProjectReportwithDepartName() {
		timeReportPage.clickOnProjectReport();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnDepartmentwithUserreport();
		timeReportPage.clickOnsearch();
		timeReportPage.projectReport();

	}
	public void checkProjectReportwithProjectName() {
		timeReportPage.clickOnProjectReport();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnProject();
		timeReportPage.clickOnsearch();
		timeReportPage.projectReport();

	}
	public void checkProjectWiseReportWithProjectName() {
		//timeReportPage.clickOnProjectReport();
		timeReportPage.clickOnProjectWise();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnProject();

		timeReportPage.clickOnsearch();
		timeReportPage.projectWise();

	}
	public void checkProjectWiseReportWithTeamMember() {
		//timeReportPage.clickOnProjectReport();
		timeReportPage.clickOnProjectWise();
		timeReportPage.clickOnDAterange();
		timeReportPage.selectTeamMember();

		timeReportPage.clickOnsearch();
		timeReportPage.projectWise();

	}
	public void checkTrackEntryDetailsReportWithUsername() {
		timeReportPage.clickOnTrackEntryDetails();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnUser();

		timeReportPage.clickOnsearch();
		timeReportPage.trackEntryDetails();

	}
	public void checkTrackEntryDetailsReportWithProjectnmae() {
		timeReportPage.clickOnTrackEntryDetails();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnProject();

		timeReportPage.clickOnsearch();
		timeReportPage.trackEntryDetails();

	}
	public void checkTrackEntryDetailsReportWithDepartmentName() {
		timeReportPage.clickOnTrackEntryDetails();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnDepartment();

		timeReportPage.clickOnsearch();
		timeReportPage.trackEntryDetails();

	}
	public void checkTimeSheetReportWithusername() {
		timeReportPage.clickOnTimesheetReport();
		timeReportPage.clickOnUser();

		timeReportPage.clickOnsearch();
		timeReportPage.timeSheetReport();

	}
	public void checkTimeSheetReportWithProjectName() {
		timeReportPage.clickOnTimesheetReport();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnProject();
		timeReportPage.clickOnsearch();
		timeReportPage.timeSheetReport();

	}
	
	public void checkUserReportwithUserName() {
		timeReportPage.clickOnUserReport();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnUser();
		timeReportPage.clickOnsearch();
		timeReportPage.userReport();

	}
	public void checkUserReportwithProjectName() {
		timeReportPage.clickOnUserReport();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnProject();
		timeReportPage.clickOnsearch();
		timeReportPage.userReport();

	}
	public void checkUserReportwithDepartmentName() {
		timeReportPage.clickOnUserReport();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnDepartmentwithUserreport();
		timeReportPage.clickOnsearch();
		timeReportPage.userReport();

	}
	public void checkUserwiseReportWithUserName() {
		timeReportPage.clickOnUserWiseReport();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnUser();
		timeReportPage.clickOnsearch();
		timeReportPage.userWiseReport();

	}
	public void checkUserwiseReportWithProjectName() {
		timeReportPage.clickOnUserWiseReport();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnProject();
		timeReportPage.clickOnsearch();
		timeReportPage.userWiseReport();

	}
	public void checkUserwiseReportWithDepartmentName() {
		timeReportPage.clickOnUserWiseReport();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnDepartmentwithUserWisereport();
		timeReportPage.clickOnsearch();
		timeReportPage.userWiseReport();

	}
	public void EnterBulkEntry() {
		timeReportPage.clickOnUserWiseReport();
		timeReportPage.clickOnDAterange();
		timeReportPage.clickOnDepartmentwithUserWisereport();
		timeReportPage.clickOnsearch();
		timeReportPage.userWiseReport();

	}
}
