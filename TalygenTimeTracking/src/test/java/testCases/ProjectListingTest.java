package testCases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.ProjectListingAction;
import utils.WebTestBase;

public class ProjectListingTest extends WebTestBase {



	@Test(priority = 0)
	public void addProjectWithDefaultTemplate() {
		test = getTest("TC_Project_Listing");
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
		
		/*
		 * AddExpenseLimitAction addExpenseLimitAction = new
		 * AddExpenseLimitAction(driver); addExpenseLimitAction.addExpLimit();
		 * addExpenseLimitAction.addExpenseCategory();
		 * addExpenseLimitAction.addExpenseLimit();
		 */
		 //driver.close();
	}
	@Test(priority=2)
	public void deleteProjectFromList() {
		test = getTest("TC_Project_Listing");
		new LoginAction(driver).logoutLogin();
		ProjectListingAction projectListingAction = new ProjectListingAction(driver);
		projectListingAction.navigateToProject();
		projectListingAction.deleteProjectformList();
		
	}
}
