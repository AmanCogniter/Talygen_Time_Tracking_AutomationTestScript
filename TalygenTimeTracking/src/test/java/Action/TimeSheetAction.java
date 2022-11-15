package Action;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import pageObjects.TimeSheetPage;



public class TimeSheetAction {
	WebDriver driver ; 
	TimeSheetPage timeSheetPage;
	
	public TimeSheetAction(WebDriver driver)
	{
		this.driver= driver;
		timeSheetPage= new TimeSheetPage(driver);
	}
	
	public void GoToTimesheetPage()
	{
		timeSheetPage.clickFullMenuDropDown();
		timeSheetPage.clickTimeTrackingLink();
		timeSheetPage.clickOnTimeSheetPage();		
	}
	public void validationMessageCheck()
	{
		timeSheetPage.verifyTimesheetPage();
		
	}
	public void checkFunctionalityOfTimesheet() throws AWTException
	{
		//timeSheetPage.enterUser();
		timeSheetPage.clickOnShowTimeSheet();
		//timeSheetPage.clickOnBreak();
		timeSheetPage.clickOnAddHours();
		timeSheetPage.clickOnselectProject();
		timeSheetPage.selectyourTask();
		//timeSheetPage.enterdescription();
		timeSheetPage.enterTotaltime();
		timeSheetPage.enterdescription();
		//timeSheetPage.enterStarttime();
		//timeSheetPage.enterStoptime();
		timeSheetPage.clickOnSave();
		timeSheetPage.validateTimeEntryConfirmationMessage();
		//timeSheetPage.clickOnBreak();
		timeSheetPage.deleteWorkingHours();
		timeSheetPage.validateDeleteConfirmationMessage();
		

}
	public void clickOnSendForApproval() throws AWTException {
		timeSheetPage.enterUser();
		timeSheetPage.clickOnShowTimeSheet();
		//clickOnShowTimeSheet();
		//timeSheetPage.clickOnBreak();
		timeSheetPage.clickOnAddHours();
		timeSheetPage.clickOnselectProject();
		//timeSheetPage.selectyourTask();
		//timeSheetPage.enterdescription();
		timeSheetPage.enterTotaltime();
		timeSheetPage.enterdescription();
		//timeSheetPage.enterStarttime();
		//timeSheetPage.enterStoptime();
		timeSheetPage.clickOnSave();
		timeSheetPage.validateTimeEntryConfirmationMessage();
		timeSheetPage.clickOnSendForApproval();
		timeSheetPage.validateSendApprovalConfirmationPopup();
		/*
		 * timeSheetPage.enterPostCommentTitle();
		 * timeSheetPage.enterPostCommentDescription();
		 * timeSheetPage.clickOnPostNewComment();
		 * timeSheetPage.validatePostCommentConfirmationmessage();
		 */
	}
	public void editWorkingHoursEntry() {
		timeSheetPage.clickOnProjectForedit();
	
	}
	public void deleteWorkingHoursEntry() {
		timeSheetPage.deleteWorkingHours();
		timeSheetPage.validateDeleteConfirmationMessage();
	}
	public void clickOnShowTimeSheet() {
		timeSheetPage.enterUser();
		timeSheetPage.clickOnShowTimeSheet();
	}
}
