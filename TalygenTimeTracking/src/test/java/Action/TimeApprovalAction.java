package Action;

import org.openqa.selenium.WebDriver;

import pageObjects.TimeApprovalPage;



public class TimeApprovalAction {
	WebDriver driver ; 
	TimeApprovalPage timeApprovalPage;
	
	public TimeApprovalAction(WebDriver driver)
	{
		this.driver= driver;
		timeApprovalPage= new TimeApprovalPage(driver);
	}
	
	public void GoToTimeApprovalPage()
	{
		timeApprovalPage.clickFullMenuDropDown();
		timeApprovalPage.clickTimeTrackingLink();
		timeApprovalPage.clickTimeApprovalPage();
		
	}
	public void validationMessageCheck()
	{
		timeApprovalPage.validateTimeApprovalpage();
		
	}
	
	public void rejectApprovalOfTimeSheet()
	{
	
		//timeApprovalPage.clickTimeApprovalPage();
		timeApprovalPage.clickOnUser();
		timeApprovalPage.enterUserName();
		timeApprovalPage.clickOnradioButton();
		timeApprovalPage.clickOnSearchButton();
		timeApprovalPage.clickOncheckBox();		
		
		timeApprovalPage.clickOnReject();
		timeApprovalPage.enterCommentTitle();
		timeApprovalPage.enterCommentDescription();
		timeApprovalPage.clickOnPostNewComment();
		timeApprovalPage.validateRejectConfirmationmessage();
				
		
	}
	public void ApprovedApprovalOfTimeSheet() {
		timeApprovalPage.clickOnUser();
		timeApprovalPage.enterUserName();
		timeApprovalPage.clickOnradioButton();
		timeApprovalPage.clickOnSearchButton();
		timeApprovalPage.clickOncheckBox();
		timeApprovalPage.clickOnApprove();
		timeApprovalPage.enterCommentTitle();
		timeApprovalPage.enterCommentDescription();
		timeApprovalPage.clickOnPostNewComment();
	}
	
	
}
