package testCases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.FlagTrackEntryAction;
import Action.LoginAction;
import utils.WebTestBase;

public class FlagTrackEntryTest extends WebTestBase{
	static String Screenname ="<b>Flag Track Entry/b>";
	  
	@Test(priority=1)
	public void validationCheck()
	{
		test=getTest(Screenname + ": Validation message on Flag Track Entry Page");
		FlagTrackEntryAction flagTrackEntryAction = new FlagTrackEntryAction(driver);
		new LoginAction(driver).logoutLogin();
		flagTrackEntryAction.goToFlagTrackEntryTab();
		flagTrackEntryAction.validationCheck();
	}
	@Test(priority=2)
	public void validationOfSearchFunctionality()
	{
		test=getTest(Screenname + ": Validation Of Search functionality on Flag Track Entry Page");
		FlagTrackEntryAction flagTrackEntryAction = new FlagTrackEntryAction(driver);
		new LoginAction(driver).logoutLogin();
		flagTrackEntryAction.goToFlagTrackEntryTab();
		flagTrackEntryAction.checkSearchButtonFunctionality();
	}
	@Test(priority=3)
	public void validationOfFlagedFunctionality()
	{
		test=getTest(Screenname + ": Validation Of Flag functionality on Flag Track Entry Page");
		FlagTrackEntryAction flagTrackEntryAction = new FlagTrackEntryAction(driver);
		new LoginAction(driver).logoutLogin();
		flagTrackEntryAction.goToFlagTrackEntryTab();
		flagTrackEntryAction.checkSearchButtonFunctionality();
		flagTrackEntryAction.checkFlagButtonFunctionality();
	}
	@Test(priority=4)
	public void validationOfUnFlagedFunctionality()
	{
		test=getTest(Screenname + ": Validation Of UnFlag functionality on Flag Track Entry Page");
		FlagTrackEntryAction flagTrackEntryAction = new FlagTrackEntryAction(driver);
		new LoginAction(driver).logoutLogin();
		flagTrackEntryAction.goToFlagTrackEntryTab();
		flagTrackEntryAction.checkSearchButtonFunctionality();
		flagTrackEntryAction.checkUnFlagButtonFunctionality();
	}
	@Test(priority=5)
	public void validationOfUpdateFunctionality()
	{
		test=getTest(Screenname + ": Validation Of Update functionality on Flag Track Entry Page");
		FlagTrackEntryAction flagTrackEntryAction = new FlagTrackEntryAction(driver);
		new LoginAction(driver).logoutLogin();
		flagTrackEntryAction.goToFlagTrackEntryTab();
		flagTrackEntryAction.checkSearchButtonFunctionality();
		flagTrackEntryAction.checkUpdateFunctionality();
	}
}
