package testCases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.AuditRuleAction;
import Action.CompanySetupUserAction;
import Action.LoginAction;
import utils.WebTestBase;

public class AuditRuleTest extends WebTestBase {
	
		static String Screenname ="<b>Audit rule/b>";
	  
		@Test(priority=1)
		public void validationCheck()
		{
			test=getTest(Screenname + ": Validation message on Add New audit rule");
			AuditRuleAction auditRuleAction = new AuditRuleAction(driver);
			new LoginAction(driver).logoutLogin();
			auditRuleAction.goToAuditRuleTab();
			auditRuleAction.validationCheck();
		}
		
		@Test(priority=2)
		public void addNewAuditRuleWithEqualTimeTrackingHour()
		{
			test=getTest(Screenname  + ": Add new audit rule");
			new LoginAction(driver).logoutLogin();
			
			CompanySetupUserAction companySetupUserAction = new CompanySetupUserAction(driver);
			
			companySetupUserAction.navigateToCompanySetup();
		
			
			companySetupUserAction.createUser();
			AuditRuleAction auditRuleAction = new AuditRuleAction(driver);
			new LoginAction(driver).logoutLogin();
			auditRuleAction.goToAuditRuleTab();
			auditRuleAction.addNewAuditRuleWithEqualTimeTrackingHour();
		}
		@Test(priority=3)
		public void validationCheckOfAuditRuleName()
		{
			test=getTest(Screenname + ": Validation message on Add New audit rule");
			AuditRuleAction auditRuleAction = new AuditRuleAction(driver);
			new LoginAction(driver).logoutLogin();
			auditRuleAction.goToAuditRuleTab();
			auditRuleAction.validationCheckOfAddNewaudit();
		}
		@Test(priority=5)
		public void validationCheckOfAuditRemove()
		{
			test=getTest(Screenname + ": Validation message on Add New audit rule");
			AuditRuleAction auditRuleAction = new AuditRuleAction(driver);
			new LoginAction(driver).logoutLogin();
			auditRuleAction.goToAuditRuleTab();
			auditRuleAction.validationCheckOfRemove();
		}
		@Test(priority=4)
		public void validationCheckOfAuditUpdate()
		{
			test=getTest(Screenname + ": Validation message on Add New audit rule");
			AuditRuleAction auditRuleAction = new AuditRuleAction(driver);
			new LoginAction(driver).logoutLogin();
			auditRuleAction.goToAuditRuleTab();
			auditRuleAction.validationCheckOfAuditUpdate();
		}
}
