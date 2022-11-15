package Action;

import org.openqa.selenium.WebDriver;

import pageObjects.AuditRulePage;
import pageObjects.FlagTrackEntryPage;

public class FlagTrackEntryAction {
	WebDriver  driver ;
	FlagTrackEntryPage flagTrackEntryPage ;
	
	public FlagTrackEntryAction(WebDriver driver)
	{
		this.driver = driver;
		flagTrackEntryPage = new FlagTrackEntryPage(driver);
		
	}
	
	public void  goToFlagTrackEntryTab()
	{
		flagTrackEntryPage.clickFullMenuDropDown();
		flagTrackEntryPage.clickTimeTrackingLink();
		flagTrackEntryPage.clickOnFlagTrackEntry();
	
	}
	
	public void  validationCheck()
	{
		
		flagTrackEntryPage.FlagTrackEntrypage();

		
	}
	public void  checkSearchButtonFunctionality()
	{
		flagTrackEntryPage.clickOnProjectSearchField();
		flagTrackEntryPage.enterProjectNameInSearchField();
		flagTrackEntryPage.clickOnSelectProject();
		flagTrackEntryPage.clickOnSearchButton();
	
	}
	public void  checkFlagButtonFunctionality()
	{
		flagTrackEntryPage.clickOncheckBox();
		flagTrackEntryPage.clickOnFlag();
		flagTrackEntryPage.enterCommentTitle();
		flagTrackEntryPage.enterCommentDescription();
		flagTrackEntryPage.clickOnPostComment();
	
	
	
	}
	public void  checkUnFlagButtonFunctionality()
	{
		flagTrackEntryPage.clickOncheckBox();
		flagTrackEntryPage.clickOnUnFlag();
		flagTrackEntryPage.enterUnflagCommentTitle();
		flagTrackEntryPage.enterUnFlagCommentDescription();
		flagTrackEntryPage.clickOnUnflagPostComment();
	
	
	
	}
	public void  checkUpdateFunctionality()
	{

		flagTrackEntryPage.clickOnProject();
		flagTrackEntryPage.clickOnUpdate();
		
	
	
	
	}
}
