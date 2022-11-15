package Action;

import org.openqa.selenium.WebDriver;

import pageObjects.BulkTimeEntryPage;
import pageObjects.TimeReportPage;

public class BulkTimeEntryAction {
	WebDriver driver ; 
	BulkTimeEntryPage bulkTimeEntryPage;
	
	public BulkTimeEntryAction(WebDriver driver)
	{
		this.driver= driver;
		bulkTimeEntryPage= new BulkTimeEntryPage(driver);
	}
	
	public void GoToBulkTimeEntryPage()
	{
		bulkTimeEntryPage.clickFullMenuDropDown();
		bulkTimeEntryPage.clickTimeTrackingLink();
		bulkTimeEntryPage.clickOnBulkTimeEntry();		
	}
	public void validationOfBulkTimeEntryPage()
	{
		bulkTimeEntryPage.Bulktimeentrypage();
		
	}
	public void AddBulkTimeEntry()
	{
		bulkTimeEntryPage.enterProjectName();
		//bulkTimeEntryPage.enterTaskName();
		bulkTimeEntryPage.ClickOnUser();
		bulkTimeEntryPage.enterBulkTimeEntryDescription();
		bulkTimeEntryPage.clickOnIsBillable();
		bulkTimeEntryPage.clickOnFillTimeEntry();
		bulkTimeEntryPage.enterTotalHours();
		bulkTimeEntryPage.clickOnSaveButton();
	}
	public void AddMultipleBulkTimeEntry()
	{
		//bulkTimeEntryPage.enterProjectName();
		//bulkTimeEntryPage.enterTaskName();
		bulkTimeEntryPage.ClickOnUser();
		//bulkTimeEntryPage.enterBulkTimeEntryDescription();
		//bulkTimeEntryPage.clickOnIsBillable();
		bulkTimeEntryPage.clickOnFillTimeEntry();
		//bulkTimeEntryPage.clickOnSaveButton();
		bulkTimeEntryPage.clickOnAddButton();
	}
	public void DeleteBulkTimeEntry()
	{
		
		bulkTimeEntryPage.ClickOnUser();
		
		bulkTimeEntryPage.clickOnFillTimeEntry();
		bulkTimeEntryPage.clickOnAddButton();
		bulkTimeEntryPage.clickOndeleteButton();
		bulkTimeEntryPage.clickOnOkButton();
	}
	public void resetBulkTimeEntry()
	{
		
		bulkTimeEntryPage.ClickOnUser();
		
		bulkTimeEntryPage.clickOnFillTimeEntry();
		bulkTimeEntryPage.clickOnAddButton();
		bulkTimeEntryPage.clickOnResetButton();
		//bulkTimeEntryPage.clickOnOkButton();
	}
	
}
