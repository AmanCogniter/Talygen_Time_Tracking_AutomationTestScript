package pageObjects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DateTime;
import utils.PropertiesLoader;
import utils.RandomNumber;
import utils.WebBasePage;

public class ProjectListingPage extends WebBasePage {

	WebDriver driver;

	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";

	private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	DateTime dateTime;
	static String pattern = "yyMMddHHmmss";
	static Date date = new Date();
	static SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
	static String datevalue = dateformat.format(date);
	static RandomNumber random=new RandomNumber();
	public static String channelName;
	int randomNumber = random.getRandomNumber();
	static String getCurrentDate = dateformat.format(date);
	static String projectName;
	static String taskName;

	public ProjectListingPage(WebDriver driver) {
		super(driver, "Project Listing Page");

		this.dateTime = new DateTime(driver);

		this.driver = driver;
	}

	// click on full menu
	public void clickFullMenu() {
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//a/span[text()='Full Menu']")));
		 */
		
		staticWait(3000);
	try {
		
		WebElement tourGuide = driver.findElement(By.xpath("(//*[name()='svg' and @class='guided-tour-icon'])[1]"));
		
		if(tourGuide.isDisplayed()) {
			
			Actions action = new Actions(driver);
			action.moveToElement(tourGuide).
			click().build().perform();
			
			  WebDriverWait wait1 = new WebDriverWait(driver,30);
			  wait1.until(ExpectedConditions.elementToBeClickable(By.
			  xpath("(//*[name()='svg' and @class='guided-tour-icon'])[1]")));
			 
			click(By.xpath("//a/span[text()='Full Menu']"), "Full Menu", 20);
			
		}
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 20);
	}
		
		
			 
	}

	// click on Project
	public void clickProjectSideMenu() {
		staticWait(3000);
		click(By.xpath("//li[@data-name='Project Management']//a//i//following::text()[1]//following::span[1]"),
				"Project Management Side menu", 10);
	}

	// click on Ticket Report
	public void clickProject() {
		staticWait(3000);
		click(By.xpath(
				"//ul[@class='submenu clschild_1 d-flex']//a[@data-original-title='Project' and @id='cadmin_messageboard_link']"),
				"Project", 20);
	}

	/* Click on Close Tour Guide */
	public void closeTourGuidePopup() { 
		staticWait(3000);
       click(By.xpath("//div[contains(text(),'Widgets')]/ancestor::div[@class='guided-tour-step-tooltip-inner']/descendant::span[@title='End tour']/*[name()='svg' and @class='guided-tour-icon']"
					  ), "Close Tour Guide Popup", 20); 
       }

	// click on Add project
	public void clickAddProject() {
		click(By.xpath("//a[@data-original-title='Add Project']"), "Add project", 20);
	}

	/* Click On closedefaultTemplateTourGuidePopup */
	public void closedefaultTemplateTourGuidePopup() { 
		staticWait(3000);
       click(By.xpath("(//div[@class='guided-tour-step-footer']/ancestor::div[@class='guided-tour-step-tooltip-inner']/descendant::span[@title='End tour']/*[name()='svg' and @class='guided-tour-icon'])[4]"
					  ), "Close Tour Guide Popup", 20); }

	// select default template
	public void selectDefaultTemplate() {
		clickByJavascript(By.cssSelector("#temp_0"), "Select default template", 20);
	}

	// enter project name
	public void enterProjectName() {
		projectName = prop.getProperty("enterProjectName") + datevalue;
		enter(By.xpath("//input[@name='project_name']"), projectName, "enterProject Name", 20);
	}

	// click on add channel
	public void addChannel() {
		staticWait(3000);
		click(By.xpath(
				"//select[@name='channel_id']//following::span[@class='input-group-text border-0 bg-transparent p-0 pl-2'][1]"),
				"Add Channel", 20);
	}

	// enter Channel name
	public void enterChannelName() {
		 channelName = prop.getProperty("enterChannelName") + randomNumber;
		enter(By.cssSelector("#ChannelName"), channelName, "Enter Channel name",
				20);
	}

	// enter Channel name
	public void enterChannelDescription() {
		enter(By.cssSelector("#ChannelDescription"), prop.getProperty("enterChannelDescription"),
				"Enter Channel description", 20);
	}

	// click Save button
	public void SaveButton() {

		click(By.xpath("//a[@class='btn btn-success formbtn mr-2']"), "Save button", 20);
	}
	public void selectChannel() {
		staticWait(7000);
		click(By.xpath("//form//div/select[@name='channel_id']"), "Channel", 20);
		selectValueWithText(By.xpath("//div/select[@name='channel_id']"), channelName, channelName, 30);
	}

	// select priority
	public void selectPriority() {

		selectValueWithText(By.xpath("//select[@name='priority_id']"), "High", "Select Priority", 20);
	}

	// enter Estimated Cost
	public void enterEstimatedCost() {

		enter(By.cssSelector("#estimated_cost"), prop.getProperty("enterProjectAmount"), "enter project estimated cost",
				20);

	}

	// enter Purchase Number
	public void enterPurchaseNumber() {
		enter(By.cssSelector("#ponumber"), prop.getProperty("enterPurchaseNumber"), "enter project amount", 20);
	}

	// select priority
	public void selectLocation() {
		selectValueWithText(By.xpath("//select[@name='location_id']"), "Dallas", "Select Location", 20);
	}

	// enter project description
	public void enterProjectDescription() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		switchToFrame();
		WebElement element = findElementVisibility(By.tagName("body"), 15);
		element.clear();
		enter(By.tagName("body"), prop.getProperty("enterProjectDescription"), "Add Project Description", 20);
		driver.switchTo().defaultContent();
	}

	// click next button
	public void clickNextButton() {
		clickByJavascript(By.cssSelector("#btnNext"), "Next button", 20);
	}

	// click next button
	public void nextButton() {
		click(By.cssSelector("#btnNextstep2"), "Next button", 20);
	}

	// select Currency
	public void selectCurrency() {
		selectValueWithText(By.xpath("//select[@name='currency_id']"), "United States dollar (USD)", "Select Currency",
				20);
	}

	// click Slider button
	public void sliderYesButton() {

		clickByJavascript(
				By.xpath("//label[@class='switch medium']//following::span[@class='slider-no' and text()='Fixed']"),
				"Slider Fixed button", 20);
	}

	// enter Project Hours
	public void enterProjectHours() {
		/*
		 * enter(By.cssSelector("#estimated_hours"),
		 * prop.getProperty("enterProjectHours"), "enter project hours", 20);
		 */
		enter(By.xpath("//input[@id='estimated_hours']"), prop.getProperty("enterProjectHours"), "enter project hours", 20);
	}

	// enter Project Rate
	public void enterProjectRate() {
		enter(By.cssSelector("#base_rate"), prop.getProperty("enterProjectRate"), "enter project Rate", 20);
	}

	// click Checkbox
	public void selectCheckbox() {
		clickByJavascript(By.xpath(
				"//div[@class='table-responsive table-fix-header float-left']//tbody//tr[1]//td[1]//input//following::label[1]"),
				"Select david checkbox", 20);
		clickByJavascript(By.xpath(
				"//div[@class='table-responsive table-fix-header float-left']//tbody//tr[1]//td[1]//input//following::label[4]"),
				"Select Ginny checkbox", 20);
	}

	/* Close Finished SetUpTour Guide Popup */
	public void closeFinishedSetUpTourGuidePopup() { 
		staticWait(3000);
       click(By.xpath("//div[contains(text(),'Click on Save to finish the project setup.')]/ancestor::div[@class='guided-tour-step-tooltip-inner']/descendant::span[@title='End tour']/*[name()='svg' and @class='guided-tour-icon']"
					  ), "Close  Finished SetUp Tour Guide Popup", 20); 
       }

	

	// click Save
	public void clickSave() {
		click(By.xpath("//div[@class='search-btm-btn']//a[@data-original-title='Save']"), "click Save", 20);
	}

	// click Automation project
	public void clickAutomationProject() {
		clickByJavascript(
				By.xpath("//table[@id='ProjectListing']//tbody//tr[1]//span[@title='" + projectName + "']//a"),
				"click Automation project", 20);
	}
	public void clickOnTask() {
		click(By.xpath("//li/a[@data-href='PROJECT_TASKS']"), "Task", 20);
	}
	public void clickOnaddTask() {
		clickByJavascript(
				By.xpath("//a[@data-original-title='Add Task']"),
				"Add Task", 20);
	}
	public void enterTaskName() {
		taskName = prop.getProperty("taskName") + randomNumber;
		enter(By.xpath("//table/tbody/tr/td[@class='relate-input overflow-visible']/input[@type='text']"), taskName, "Task Name", 30);
	}
	public void enterTaskHour() {
		String taskhour = prop.getProperty("taskHour");
		enter(By.xpath("(//table/tbody/tr/td/input[@type='text'])[3]"), taskhour, "Task Hour", 30);
	}
	public void clickOnAddTeamMember() {
		waitForVisibilityOfElement(By.xpath("//table/tbody/tr/td/a[@data-original-title='Add Team Members']"), 50);
		click(By.xpath("//table/tbody/tr/td/a[@data-original-title='Add Team Members']"), "Add Team Member", 20);
	}
	public void searchMemberName() {
		waitForVisibilityOfElement(By.xpath("//a[@id='clearTeam_add']"), 50);
		clickByJavascript(
				By.xpath("//a[@id='clearTeam_add']"),"click Clear button", 20);
		enter(By.xpath("//div[@class='form-group']/input[@id='txtTeamSearchPop']"), "ginny", "Memeber Name", 30);
		staticWait(3000);
		//click(By.xpath("//div/a[@title='Search']"), "Search Button", 30);
		//WebElement searchButton = driver.findElement(By.xpath("//div/a[@title='Search']"));
		//Actions action=new Actions(driver);
		//action.moveToElement(searchButton).click().perform();
		//staticWait(3000);
		click(By.xpath("(//table/thead/tr/th/div[@class='custom-control custom-checkbox'])[last()]"), "Add Member CheckBox", 20);
		
		/*
		 * try { staticWait(1000); int num=1; Dimension count = driver.findElement(By.
		 * xpath("//table/tbody/tr/td/div[@class='custom-control custom-checkbox']")).
		 * getSize(); if ((Integer.SIZE ) > num) { click(By.
		 * xpath("(//table/tbody/tr/td/div[@class='custom-control custom-checkbox'])[4]"
		 * ), "Add Member CheckBox", 20); }
		 * 
		 * } catch (Exception e) { staticWait(1000);
		 * 
		 * click(By.
		 * xpath("//table/tbody/tr/td/div[@class='custom-control custom-checkbox']"),
		 * "Add Member CheckBox", 20); // TODO: handle exception }
		 */
		 
	}
	public void enterHours() {
		waitForVisibilityOfElement(By.xpath("(//td/input[@class='form-control text'])[2]"), 50);
		//driver.findElement(By.xpath("(//td/input[@class='form-control text'])[2]")).clear();
		clear(By.xpath("(//td/input[@class='form-control text'])[2]"), "Hour", 20);
		String addHours = prop.getProperty("memeberHours");
		enter(By.xpath("(//td/input[@class='form-control text'])[2]"), addHours, "Add Task Hour", 30);
	}
	public void clickOnAdd() {
		staticWait(1000);
		clickByJavascript(By.xpath("//a[@title='Add']"),"click Automation project", 20);
		}
	public void clickOnSAve() {
		staticWait(1000);
		clickByJavascript(By.xpath("//a[@data-original-title='Save']"),"Save Button", 20);
	}

	// click Expense limit
	public void expenseLimit() {
		findElementVisibility(By.cssSelector("#aProjectOverView12"), 2);
		click(By.cssSelector("#aProjectOverView12"), "click Expense limit", 20);
	}

	// Add Expense limit
	public void addExpenseLimit() {
		clickByJavascript(By.cssSelector("#ancaddexpenselimitloaddata"), "add expense limit", 20);
//		enter(By.cssSelector("#ancaddexpenselimitloaddata"), prop.getProperty("enterExpenseMaximumLimit"),
//				"Maximum expense limit", 20);
	}

	// Add Expense limit
	public void expenseAllowedPerDay() {
		enter(By.cssSelector("#ExpenseMax"), prop.getProperty("enterExpenseMaximumLimit"), "Maximum expense limit", 20);
	}

	// click Task
	public void clickTask() {
		click(By.cssSelector("#aProjectOverView2"), "click Task", 20);
	}

	public void navigateBack() {
		driver.navigate().back();
		logger.debug("Navigate back to project listing page");
	}
	public void clickOnsearchdropdown() {
		staticWait(1000);
		click(By.xpath("//span[@data-toggle='collapse']"), "click Task", 20);
	}
	public void enterProjectnameInsearchtextField() {
		staticWait(3000);
		enter(By.xpath("//div/input[@placeholder='Search by Project Name']"), projectName, "Project Name", 20);
	}
	public void clickOnsearchButton() {
		staticWait(1000);
		click(By.xpath("//span[@data-original-title='Search']"), "Search Button", 20);
	}
	public void clickOnCheckBox() {
		staticWait(1000);
		click(By.xpath("//table[@id='ProjectListing']/thead/tr/th/div"), "CheckBox", 20);
	}
	public void deleteItem() {
		staticWait(1000);
		clickByJavascript(By.xpath("//span/a[@id='DeleteItem']/i"),"Delete Button", 20);
		waitForVisibilityOfElement(By.xpath("//div/button[@data-bb-handler='confirm']/i"), 50);
		clickByJavascript(By.xpath("//div/button[@data-bb-handler='confirm']/i"),"Ok Button", 20);
		/*
		 * WebElement clickok =
		 * driver.findElement(By.xpath("//div/button[@data-bb-handler='confirm']/i"));
		 * Actions action=new Actions(driver);
		 * action.moveToElement(clickok).click().perform();
		 */
		logger.info("Project is deleted successfully");
	}

}
