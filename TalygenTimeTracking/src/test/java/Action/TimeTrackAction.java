package Action;

import org.openqa.selenium.WebDriver;

import pageObjects.TimeTrackPage;

public class TimeTrackAction {
	WebDriver driver ; 
	TimeTrackPage timetrackPage;
	
	public TimeTrackAction(WebDriver driver)
	{
		this.driver= driver;
		timetrackPage= new TimeTrackPage(driver);
	}
	
	public void GoToTimeTrackPage()
	{
		timetrackPage.clickFullMenuDropDown();
		timetrackPage.clickTimeTrackingLink();
		timetrackPage.clickTimeTrackPage();		
	}
	
	
	public void validationofMandatoryFielkds()
	{
		timetrackPage.validateTimeTrackpage();
		timetrackPage.clickOnStart();
		timetrackPage.descriptionFieldErrorMessageValidation();
		timetrackPage.clickonTimetrackHide();
		timetrackPage.clickonShowTimetrack();
		
	}
	public void startTimeTrack() {
		timetrackPage.clickOnselectProject();
		timetrackPage.selectyourTask();
		timetrackPage.clickOnTagPlusIcon();
		timetrackPage.enterTagName();
		timetrackPage.enterdescription();
		timetrackPage.clickOnsave();
		timetrackPage.clickOnSelectTagName();
		timetrackPage.enterDescription();
		timetrackPage.clickOnStart();
		timetrackPage.addAttachment();
		timetrackPage.clickOnPauseButton();
		timetrackPage.clickOnResumeButton();
		timetrackPage.clickOnStopButton();
	}
	public void startTimeTrackForFlagTrackEntry() {
		timetrackPage.clickOnselectProject();
		//timetrackPage.selectyourTask();
		//timetrackPage.clickOnTagPlusIcon();
		//timetrackPage.enterTagName();
		//timetrackPage.enterdescription();
		//timetrackPage.clickOnsave();
		//timetrackPage.clickOnSelectTagName();
		timetrackPage.enterDescription();
		timetrackPage.clickOnStart();
		timetrackPage.addAttachment();
		timetrackPage.clickOnPauseButton();
		timetrackPage.clickOnResumeButton();
		timetrackPage.clickOnStopButton();
	}
	public void startTimeTrackforsendApproval() {
		timetrackPage.clickOnselectProject();
		timetrackPage.selectyourTask();
		//timetrackPage.clickOnTagPlusIcon();
		//timetrackPage.enterTagName();
		//timetrackPage.enterdescription();
		//timetrackPage.clickOnsave();
		timetrackPage.clickOnSelectTagName();
		timetrackPage.enterDescription();
		timetrackPage.clickOnStart();
		timetrackPage.addAttachment();
	}
	public void  verifyActivityInListingArea() {
		
		timetrackPage.clickOnListing();
		timetrackPage.enterProjectNameInTextTimerSearch();
		timetrackPage.clickOnTextTimerSearch();
		//timetrackPage.addAttachment();
		timetrackPage.verifyTimeTrackdata();
	  }
	public void updateRecordAndverifydeleteEntry() {
		timetrackPage.clickOnListing();
		timetrackPage.enterProjectNameInTextTimerSearch();
		timetrackPage.clickOnTextTimerSearch();
		//timetrackPage.clickOnActivityCheckBox();
		timetrackPage.clickOnBillable();
		//timetrackPage.clickOnActivityCheckBox();
		timetrackPage.clickOnNonBillable();
		timetrackPage.clickOnDeleteEntry();
		timetrackPage.clickOnConfirmButton();
	}
	public void verifyFilter() {
		timetrackPage.clickOnListing();
		timetrackPage.clickOnFilter();
		timetrackPage.selectTodayDate();
		timetrackPage.selectYesterdayDate();
		timetrackPage.selectThisweek();
		timetrackPage.selectThisYear();
		timetrackPage.selectLastWeek();
		timetrackPage.selectThisMonth();
		timetrackPage.selectLastMonth();
	
	}
	public void checkClanderViewFunctionality() {
		timetrackPage.clickOnMonth();
		timetrackPage.validateBithdayinClander();
		timetrackPage.validateDateOfJoining();
		timetrackPage.validateHoliday();
		timetrackPage.validateAbsent();
		timetrackPage.validateApprovedLeave();
		timetrackPage.validatePendingLeave();
		timetrackPage.clickOnAddEvent();
		timetrackPage.validateEvent();
		timetrackPage.validateGoogleEvent();
		timetrackPage.validatePerformanceReview();
		timetrackPage.validateProject();
		timetrackPage.validateTask();
		timetrackPage.validateTraining();
		timetrackPage.validateUserStatus();
		//timetrackPage.clickOnSelectAll();
		//timetrackPage.clickOnClearAll();
	
	}
	public void AddManuallyTimeEntry() {
		timetrackPage.clickOnAddManually();
		timetrackPage.clickOnselectProject();
		timetrackPage.selectyourTask();
		//timetrackPage.clickOnTagPlusIcon();
		//timetrackPage.enterTagName();
		//timetrackPage.enterdescription();
		//timetrackPage.clickOnsave();
		timetrackPage.clickOnSelectTagName();
		timetrackPage.enterDescription();
		timetrackPage.enterStarttime();
		timetrackPage.enterStoptime();
		timetrackPage.clickOnSave();
		timetrackPage.captureAletrMessage();
		
}
}
