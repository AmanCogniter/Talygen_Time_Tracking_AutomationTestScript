package Action;

import org.openqa.selenium.WebDriver;

import pageObjects.WorkDairyPage;



public class WorkDairyAction {
	WebDriver driver ; 
	WorkDairyPage workDairyPage;
	
	public WorkDairyAction(WebDriver driver)
	{
		this.driver= driver;
		workDairyPage= new WorkDairyPage(driver);
	}
	
	public void GoToWorkDairyPage()
	{
		workDairyPage.clickFullMenuDropDown();
		workDairyPage.clickTimeTrackingLink();
		workDairyPage.clickOnWorkDairy();		
	}
	public void validationOfBulkTimeEntryPage()
	{
		workDairyPage.workdairyPage();
		
	}
	public void ValidateScreenShot()
	{
		workDairyPage.ClickOnToday();
		workDairyPage.validateScreenShot();
		workDairyPage.screenShot();
				
	}
}
