package Action;

import org.openqa.selenium.WebDriver;

import pageObjects.AuditRulePage;



public class AuditRuleAction {
	WebDriver  driver ;
	AuditRulePage auditRulePage ;
	
	public AuditRuleAction(WebDriver driver)
	{
		this.driver = driver;
		auditRulePage = new AuditRulePage(driver);
		
	}
	
	public void  goToAuditRuleTab()
	{
		auditRulePage.clickFullMenuDropDown();
		auditRulePage.clickTimeTrackingLink();
		auditRulePage.clickOnAuditRule();
	
	}
	
	public void  validationCheck()
	{
		auditRulePage.clickOnAddNewAuditRule();
		auditRulePage.clickOnSaveButton();
		auditRulePage.VerifyMandatoryFieldValidation();

		
	}
	
	public void addNewAuditRuleWithEqualTimeTrackingHour()
	{
		auditRulePage.clickOnAddNewAuditRule();
		auditRulePage.enterAuditRuleName();
		auditRulePage.ClickOnUser();
		auditRulePage.selectAuditor();
		auditRulePage.ClickOnPrimaryAuditor();
		auditRulePage.selectStatus();
		auditRulePage.enterDescription();
		auditRulePage.selectRuleTypeWithAuditTimeSheet();
		auditRulePage.selectMaxTimeTrackingHoursLimitperday();
		auditRulePage.enterMaxTimeTrackingHoursLimitperday();
		auditRulePage.selectTimeTrackingIsMoreThanTheAllowedProjectLimit();
		auditRulePage.enterTimeTrackingIsMoreThanTheAllowedProjectLimit();
		auditRulePage.selectTimeEntryAllowedPerDay();
		auditRulePage.enterNumberOfTimeEntry();
		auditRulePage.enterMaxhourLimitInWeek();
		auditRulePage.clickOnSaveButton();
	
		
		
	}
	public void validationCheckOfAddNewaudit() {
		auditRulePage.clickOnSearchFieldRuleName();
		auditRulePage.enterRuleNameIntoSearchField();
		auditRulePage.clickOnSearchButton();
		auditRulePage.validateAuditRuleName();
		
	}
	public void validationCheckOfRemove() {
		auditRulePage.clickOnSearchFieldRuleName();
		auditRulePage.enterRuleNameIntoSearchField();
		auditRulePage.clickOnSearchButton();
		auditRulePage.clickOnCheckBox();
		auditRulePage.clickOnRemoveButton();
		auditRulePage.clickOnOkButton();
	
		
	}
	public void validationCheckOfAuditUpdate() {
		auditRulePage.clickOnSearchFieldRuleName();
		auditRulePage.enterRuleNameIntoSearchField();
		auditRulePage.clickOnSearchButton();
		auditRulePage.clickOnAuditRuleName();
		auditRulePage.clickOnAuditSaveButton();
	
	
		
	}
}
