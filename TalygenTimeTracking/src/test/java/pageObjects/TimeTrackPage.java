package pageObjects;

import static reporting.ComplexReportFactory.getTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

import com.relevantcodes.extentreports.LogStatus;

import utils.Errors;
import utils.PropertiesLoader;
import utils.RandomNumber;
import utils.WebBasePage;

public class TimeTrackPage extends WebBasePage {
	WebDriver driver ;
	ProjectListingPage projectListingPage;
	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";
	/* Modified */
	String filePath = System.getProperty("user.dir") +
			  "\\src\\main\\resources\\testfiles\\";

	private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	static String pattern = "yyMMddHHmmss";
	static Date date = new Date();
	static SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
	static String datevalue = dateformat.format(date);
    static String tagName;
    public static String projectName;
	static RandomNumber random=new RandomNumber();

	 public TimeTrackPage(WebDriver driver) {
			super(driver, "TimeTrackPage");
			this.driver=driver;
			// TODO Auto-generated constructor stub
		}
	    
	    public void clickFullMenuDropDown() {
	    	staticWait(3000);
	        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
	        staticWait(2000);
	    }
	     public void clickTimeTrackingLink()
	     {
	    	 clickByJavascript(By.xpath("//a[@data-toggle='popover']/ancestor::li[@id='menuitem23']/span[@class='fa  fa-angle-right gotosub']"),"Time Tracking", 30);
	    	 staticWait(2000);
	     }
	     public void clickTimeTrackPage()
	     {	
	    	 
	    	 waitForVisibilityOfElement(By.xpath("//a[@data-original-title='Time Track']"), 50);
	    	 click(By.xpath("//a[@data-original-title='Time Track']")," Time Track", 30);
	    	 
	     }
	     public void validateTimeTrackpage() {
	    	 staticWait(2000);
	    	 try {
	    		 String acceptedTitle = Errors.acceptedTitle;
	    		 String actualtitle= getText(By.xpath("//div/span[text()='Track Time']"),30);
				if (actualtitle.equals(acceptedTitle)) {
					getTest().log(LogStatus.PASS, " Time Track Page is successfully displayed  " );
		    		 logger.info("Time Track Page is successfully displayed " );
					
				}
			} catch (Exception e) {
				getTest().log(LogStatus.FAIL, "Time Track Page is not successfully displayed");
	    		logger.info("Time Track Page is not successfully displayed");
	            takeScreenshot("TimeTrackPage");
				// TODO: handle exception
			}
	    	 
	     }
	     public void clickOnStart() {
	    	 staticWait(2000);
	    	 try {
				WebElement tourguide = driver.findElement(By.xpath("//div[@class='guided-tour-step-footer']/span[@title='End tour']/*[name()='svg']"));
				if (tourguide.isDisplayed()) {
					click(By.xpath("//div[@class='guided-tour-step-footer']/span[@title='End tour']/*[name()='svg']"), "close tour guide", 30);
					staticWait(2000);
					click(By.xpath("//div/a[@id='btnStart']"), "Start button", 30);
				}
			} catch (Exception e) {
				// TODO: handle exception
				click(By.xpath("//div/a[@id='btnStart']"), "Start button", 30);
			}
	    	 
	    	 
	    	 
	     }
	     public void descriptionFieldErrorMessageValidation()
	     {
	    	 staticWait(4000);
	    	 String errormsg = Errors.MessageRequired;
	    	 String  ErrorMessage= getText(By.xpath("//div[@class='form-group']/div[@id='lblError']"),30);
	    	 if (errormsg.equals(ErrorMessage))
	    	 {
	    		 getTest().log(LogStatus.PASS, " Error Message is successfully displayed in Message field on Add announcement page as " + errormsg);
	    		 logger.info("Error Message is successfully displayed in Message field as " + errormsg);
	    	 }
	    	 else
	    	 {
	    		 getTest().log(LogStatus.FAIL, "Error Message is not displayed in Message field");
		    		logger.info("Error Message is not displayed in Message field");
		            takeScreenshot("Message");
	    	 }
	    	 
	     }
	     public void clickonTimetrackHide() {
	    	 waitForVisibilityOfElement(By.xpath("//a[@id='aHide']"), 30);
	    	 click(By.xpath("//a[@id='aHide']"), "Hide Time Track", 30);
	     }
	     public void clickonShowTimetrack() {
	    	 staticWait(3000);
	    	// waitForVisibilityOfElement(By.xpath("//a[@id='aShow']"), 50);
	    	 click(By.xpath("//a[@id='aShow']"), "Show Time Track", 30);
	     }
	     public void clickOnselectProject() {
	    	 staticWait(3000);
	    	 //ProjectListingPage projectListingPage=new ProjectListingPage(driver);
	    	projectName = projectListingPage.projectName;
	    	click(By.xpath("//span[@id='select2-ddlProjects-container']"), "Select Project", 30);
	    	staticWait(2000);
	    	 enter(By.xpath("//span[@class='select2-search select2-search--dropdown']/input[@type='search']"), projectName, " Project Name", 20);
	    	 staticWait(3000);
	    	 click(By.xpath("//span[@class='select2-results']/ul/li[text()='"+projectName+"']"), "Select Project", 30);
	    	 
	     }
	     public void selectyourTask() {
	    	 staticWait(3000);
	    	 click(By.xpath("//div[@type='button']/span"), "select Your task", 30);
	    	 click(By.xpath("//a/span[@class='float-left textvalue']"), "Task", 30);
	     }
	     public void clickOnTagPlusIcon(){
	    	 staticWait(3000);
	    	 clickByJavascript(By.xpath("//a[@class='aAddMorePopUp submitbtn paddingleft2']/i"), "+ Icon", 30);
	     }
	     public void enterTagName() {
	    	 staticWait(3000);
	    	 tagName=prop.getProperty("tagName") + datevalue;
	    	 enter(By.xpath("//tg-input/label[text()='Tag Name']/ancestor::div[@class='form-group']/descendant::input[@type='text']"), tagName, "Tag name", 30);
	     }
	     public void enterdescription() {
	    	 staticWait(1000);
	    	 enter(By.xpath("//tg-textarea/textarea[@id='TagDescription']"), prop.getProperty("Description"), "Tag name Description", 30); 
	     }
	     public void clickOnsave() {
	    	 staticWait(3000);
	    	 click(By.xpath("(//div[@class='modal-footer']/descendant::button[text()='Save'])[last()]"), "Save Button", 30);
	     }
	     public void clickOnSelectTagName() {
	    	 staticWait(2000);
	    	// waitForVisibilityOfElement(By.xpath("//button[@data-toggle='dropdown']/span[text()='Select']"), 50);
	    	 staticWait(3000);
	    	 click(By.xpath("//button[@data-toggle='dropdown']/span[text()='Select']"), "select Your tag name", 30);
	    	 enter(By.xpath("//div[@class='input-group']/input[@type='text']"), tagName, "enterProject Name", 20);
	    	 staticWait(1000);
	         click(By.xpath("//li/a/label/input[@value='multiselect-all']"), "Tag name", 30);
	    	 
	     }
	     public void enterDescription() {
	    	 enter(By.xpath("//div/textarea[@id='Taskdescription']"),  prop.getProperty("Description"), "Description", 20); 
	     }
	     public void clickOnPauseButton() {
	    	 waitForVisibilityOfElement(By.xpath("//div/a[text()='Pause']"), 50);
	    	 click(By.xpath("//div/a[text()='Pause']"), "Pause Button", 30);
	     }
	     public void clickOnResumeButton() {
	    	 waitForVisibilityOfElement(By.xpath("//div/a[text()='Resume']"), 50);
	    	 click(By.xpath("//div/a[text()='Resume']"), "Resume Button", 30);
	     }
	     
	     public void clickOnStopButton() {
	    	 waitForVisibilityOfElement(By.xpath("//div/a[text()='Stop']"), 50);
	    	 click(By.xpath("//div/a[text()='Stop']"), "Stop Button", 30);
	    	 logger.info("time entry saved successfully");
	     }
	     public void clickOnListing() {
	    	 staticWait(3000);
	    	 //waitForElementInVisibility(By.xpath("//span/a[@data-original-title='Listing']"), 50);
	    	 click(By.xpath("//span/a[@data-original-title='Listing']"), "Listing ", 30);
	     }
	     public void enterProjectNameInTextTimerSearch() {
	    	 //waitForVisibilityOfElement(By.xpath("//div/input[@id='texttimersearch']"), 50);
	    	 staticWait(5000);
	    	 projectName = projectListingPage.projectName;
	    	 logger.info(projectName);
	    	 enter(By.xpath("//div/input[@id='texttimersearch']"), projectName, " Project Name in search field", 20);
	     }
	     public void clickOnTextTimerSearch() {
	    	 staticWait(3000);
	    	 //waitForVisibilityOfElement(By.xpath("//a[@data-original-title='Search']"), 50);
	    	 clickByJavascript(By.xpath("//a[@data-original-title='Search']"),  "search button", 30);
	    	 JavascriptExecutor js = (JavascriptExecutor) driver;
	    	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	     }
	     public void verifyTimeTrackdata() {
	    	 String timeTrackdata = driver.findElement(By.xpath("//table[@id='clsspauseresume']/tbody/tr/td[@class='inherit']/a")).getText();
	    	 try {
				if (timeTrackdata.contains(prop.getProperty("Description"))) {
					logger.info("Time Track data succesfully saved in listing page");
					
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				
			}
	     }
	     public void addAttachment() {
	    	 staticWait(2000);
	    	 clickByJavascript(By.xpath("//div/a[@id='btnTimerattachment']"),  "Add Attachment", 30);
	    	 staticWait(3000);
	    	 //uploadDoc(By.xpath("//div[@class='bootstrap-filestyle input-group']/input[@type='text']"), fileOne, "File Upload", 20);
	    	 findElementPresence(By.xpath("//div[@class='col-10 custom-file pr-0']/input[@name='FileSrc']"), 20)
			  .sendKeys(filePath + prop.getProperty("expenseFileDoc"));
	    	 clickByJavascript(By.xpath("//div/a[@id='btnTimerattachmentSave ']"), "save button ", 30);
	    	 staticWait(5000);
	    	 click(By.xpath("(//div[@class='modal-header']/h4[@class='modal-title text-white'])[2]//ancestor::div[@class='modal-content']/descendant::button[@type='button']"), "Close Add attachment popup ", 30);
	    	 
	     }
	     public void clickOnActivityCheckBox() {
	    	 staticWait(3000);
	    	 click(By.xpath("//table[@id='clsspauseresume']/thead/tr/th/descendant::div[@class='custom-control custom-checkbox']"), "Check Box ", 30); 
	     }
	     public void clickOnBillable() {
	    	 staticWait(3000);
	    	 clickOnActivityCheckBox();
	    	 clickByJavascript(By.xpath("//a[@data-original-title='Billable']"),  "Billable", 30); 
	     }
	     public void clickOnNonBillable() {
	    	 staticWait(2000);
	    	 clickOnActivityCheckBox();
	    	 clickByJavascript(By.xpath("//a[@forvalue='Non-Billable']"),  "Non-Billable", 30); 
	     }
	     public void clickOnDeleteEntry() {
	    	 staticWait(2000);
	    	 clickOnActivityCheckBox();
	    	 clickByJavascript(By.xpath("//a[@data-original-title='Delete Entries']"),  "Delete entry", 30); 
	    	 logger.info("Track Time activity is deleted succesfully");
	     }
	     public void clickOnConfirmButton() {
	    	 staticWait(1000);
	    	 click(By.xpath("//button[@data-bb-handler='confirm']"), "Ok Button ", 30); 
	    	 logger.info("Track Time activity is deleted succesfully");
	     }
	     public void clickOnFilter() {
	    	waitForVisibilityOfElement(By.xpath("//div[@class='date_range']/a[@id='aDateLable_']/i"), 50);
	    	 clickByJavascript(By.xpath("//div[@class='date_range']/a[@id='aDateLable_']/i"),  "Filter", 30);
	     }
	     public void selectTodayDate() {
	    	 staticWait(3000);
	    
	    	 //click(By.xpath("//li/a[text()='Today']"), "Today ", 30);
	    	   WebElement toady = driver.findElement(By.xpath("//li/a[text()='Today']"));
	    	   String todayfilter = toady.getText();
	    	   toady.click();
	    	   logger.info(todayfilter+" is selected");
	    	   try {
	    		   staticWait(3000);
				String actualRecords = driver.findElement(By.xpath("//table[@id='clsspauseresume']/tbody/tr/td[@class='text-center text-danger no-record']")).getText();
				if (actualRecords.contains(prop.getProperty("records"))) {
					logger.info("Today "+actualRecords);
				} /*
					 * else { logger.info(" Today Time Entry records found succesfully"); }
					 */
			} catch (Exception e) {
				// TODO: handle exception
				logger.info(" Today Time Entry records found succesfully");
				//e.printStackTrace();
			}
	     }
	     public void selectYesterdayDate() {
	    	 staticWait(1000);
	    	 clickOnFilter();
	    	 //click(By.xpath("//li/a[text()='Today']"), "Today ", 30);
	    	   WebElement yesterdayfilter = driver.findElement(By.xpath("//li/a[text()='Yesterday']"));
	    	   String yesterday = yesterdayfilter.getText();
	    	   yesterdayfilter.click();
	    	   logger.info(yesterday+" is selected");
	    	   try {
	    		   staticWait(3000);
					String actualRecords = driver.findElement(By.xpath("//table[@id='clsspauseresume']/tbody/tr/td[@class='text-center text-danger no-record']")).getText();
					if (actualRecords.contains(prop.getProperty("records"))) {
						logger.info("Yesterday "+actualRecords);
					} 
				} catch (Exception e) {
					// TODO: handle exception
					
						logger.info("Yesterday Time Entry records found succesfully");
					
					//e.printStackTrace();
				}
	     }
	     public void selectThisweek() {
	    	 staticWait(1000);
	    	 clickOnFilter();
	    	 //click(By.xpath("//li/a[text()='Today']"), "Today ", 30);
	    	   WebElement thisWeekfilter = driver.findElement(By.xpath("//li/a[text()='This Week']"));
	    	   String thisWeek = thisWeekfilter.getText();
	    	   thisWeekfilter.click();
	    	   logger.info(thisWeek+" is selected");
	    	   try {
	    		   staticWait(3000);
					String actualRecords = driver.findElement(By.xpath("//table[@id='clsspauseresume']/tbody/tr/td[@class='text-center text-danger no-record']")).getText();
					if (actualRecords.contains(prop.getProperty("records"))) {
						logger.info("This week "+actualRecords);
					} 
				} catch (Exception e) {
					// TODO: handle exception
					logger.info(" This week Time Entry records found succesfully");
					//e.printStackTrace();
				}
	     }
	     public void selectThisYear() {
	    	 staticWait(1000);
	    	 clickOnFilter();
	    	   WebElement thisYearfilter = driver.findElement(By.xpath("//li/a[text()='This Year']"));
	    	   String thisYear = thisYearfilter.getText();
	    	   thisYearfilter.click();
	    	   logger.info(thisYear+" is selected");
	    	   try {
	    		   staticWait(3000);
					String actualRecords = driver.findElement(By.xpath("//table[@id='clsspauseresume']/tbody/tr/td[@class='text-center text-danger no-record']")).getText();
					if (actualRecords.contains(prop.getProperty("records"))) {
						logger.info("This year "+actualRecords);
					} 
				} catch (Exception e) {
					// TODO: handle exception
					logger.info("This Year Time Entry records found succesfully");
					//e.printStackTrace();
				}
	     }
	     public void selectLastWeek() {
	    	 staticWait(1000);
	    	 clickOnFilter();
	    	   WebElement lastWeekfilter = driver.findElement(By.xpath("//li/a[text()='Last Week']"));
	    	   String lastWeek = lastWeekfilter.getText();
	    	   lastWeekfilter.click();
	    	   logger.info(lastWeek+" is selected");
	    	   try {
	    		   staticWait(3000);
					String actualRecords = driver.findElement(By.xpath("//table[@id='clsspauseresume']/tbody/tr/td[@class='text-center text-danger no-record']")).getText();
					if (actualRecords.contains(prop.getProperty("records"))) {
						logger.info("Last week "+actualRecords);
					} 
				} catch (Exception e) {
					// TODO: handle exception
					logger.info(" Last week Time Entry records found succesfully");
					//e.printStackTrace();
				}
	     }
	     public void selectThisMonth() {
	    	 staticWait(1000);
	    	 clickOnFilter();
	    	   WebElement thisMonthfilter = driver.findElement(By.xpath("//li/a[text()='This Month']"));
	    	   String thisMonth = thisMonthfilter.getText();
	    	   thisMonthfilter.click();
	    	   logger.info(thisMonth+"is selected");
	    	   try {
	    		   staticWait(3000);
					String actualRecords = driver.findElement(By.xpath("//table[@id='clsspauseresume']/tbody/tr/td[@class='text-center text-danger no-record']")).getText();
					if (actualRecords.contains(prop.getProperty("records"))) {
						logger.info("this month "+actualRecords);
					} 
				} catch (Exception e) {
					// TODO: handle exception
					logger.info("This month Time Entry records found succesfully");
					//e.printStackTrace();
				}
	     }
	     public void selectLastMonth() {
	    	 staticWait(1000);
	    	 clickOnFilter();
	    	   WebElement lastMonthfilter = driver.findElement(By.xpath("//li/a[text()='Last Month']"));
	    	   String lastMonth = lastMonthfilter.getText();
	    	   lastMonthfilter.click();
	    	   logger.info(lastMonth+"is selected");
	    	   try {
	    		   staticWait(3000);
					String actualRecords = driver.findElement(By.xpath("//table[@id='clsspauseresume']/tbody/tr/td[@class='text-center text-danger no-record']")).getText();
					if (actualRecords.contains(prop.getProperty("records"))) {
						logger.info("last month "+actualRecords);
					} 
				} catch (Exception e) {
					// TODO: handle exception
					logger.info("Last month Time Entry records found succesfully");
					//e.printStackTrace();
				}
	     }
	     public void clickOnMonth() {
	    	 staticWait(3000);
	    	 click(By.xpath("//span[@class='fc-button-inner']/span[text()='Month']"), "Month ", 30);
	     }
	     public void validateBithdayinClander() {
	    	 staticWait(1000);
	    	 click(By.xpath("//div/a[@show_type='BIRTHDAY']"), "Select Bithday ", 30);
	    	 
	    	 try {
	    		 WebElement birthday = driver.findElement(By.xpath("//div[@class='fc-event-inner fc-event-skin birthday']/span[text()='Birthday(s)']"));
	    		 if (birthday.isDisplayed()) {
	 				logger.info("birthdays are visible in clander data");
	 				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	    	 
	    	 click(By.xpath("//ul/li[@show_type='SELECTNON']"), "Clear All Button ", 30);
	    	 
	     }
	     public void validateDateOfJoining() {
	    	 staticWait(3000);
	    	 click(By.xpath("//div/a[@show_type='DATE_OF_JOINING']"), "Select date of joining ", 30);
	    	 click(By.xpath("//div/a[@show_type='DATE_OF_JOINING']"), "DeSelect Bithday ", 30);
	    	 
	     }
	     public void validateHoliday() {
	    	 staticWait(3000);
	    	 click(By.xpath("//div/a[@show_type='HOLIDAY']"), "Select Holoiday ", 30);
	    	 click(By.xpath("//div/a[@show_type='HOLIDAY']"), "DeSelect Holiday ", 30);
	    	 
	     }
	     public void validateAbsent() {
	    	 staticWait(3000);
	    	 click(By.xpath("//div/a[@show_type='ABSENTS']"), "Select Absent ", 30);
	    	 click(By.xpath("//div/a[@show_type='ABSENTS']"), "DeSelect Absent ", 30);
	    	 
	     }
	     public void validateApprovedLeave() {
	    	 staticWait(3000);
	    	 click(By.xpath("//div/a[@show_type='APPROVED_LEAVE']"), "Select approved Leave ", 30);
	    	 click(By.xpath("//div/a[@show_type='APPROVED_LEAVE']"), "DeSelect approved Leave ", 30);
	    	 
	     }
	     public void validatePendingLeave() {
	    	 staticWait(3000);
	    	 click(By.xpath("//div/a[@show_type='PENDING_LEAVE']"), "Select Pending Leave ", 30);
	    	 click(By.xpath("//div/a[@show_type='PENDING_LEAVE']"), "DeSelect Pending Leave ", 30);
	    	 
	     }
	     public void clickOnAddEvent() {
	    	 staticWait(3000);
	    	 click(By.xpath("//span[@class='fc-button-inner']/span[text()='Add Event']"), "Add Event ", 30); 
	    	 staticWait(2000);
	    	 enter(By.xpath("//tg-input/input[@id='Subject']"), "projectName", "Subject Name", 20);
	    	 //click(By.xpath("//div[@id='divAddEvent']/descendant::div[@class='custom-control custom-checkbox']"), "Is All day ", 30);
	    	 staticWait(3000);
	    	 //click(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']/input[@id='rdo_0']"), "public radio button ", 30);
	    	 WebElement radiobutton = driver.findElement(By.xpath("//div[@class='form-check form-check-inline']/div[@class='custom-control custom-radio custom-control-inline']/input[@id='rdo_0']"));
	    	 Actions action=new Actions(driver);
	    	 action.moveToElement(radiobutton).click().perform();
	    	 staticWait(3000);
	    	// click(By.xpath("//select[@id='LocationId']"), "Venue ", 30);
	    	 selectValueWithText(By.xpath("//select[@id='LocationId']"), "Hall (Dallas)", "Venue", 30);
	    	 staticWait(1000);
	    	 WebElement venue = driver.findElement(By.xpath("//h5/span[text()='Venue']"));
	    	 JavascriptExecutor js = (JavascriptExecutor) driver;
	    	 js.executeScript("arguments[0].scrollIntoView();", venue);
	    	 staticWait(3000);
	    	 selectValueWithText(By.xpath("//select[@id='PriorityId']"), "High", "Priority", 30);
	    	 staticWait(2000);
	    	 //click(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline']/input[@name='IsShareWithGoogle'])[1]"), "yes button ", 30);
	    	 WebElement yesbutton = driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline']/input[@name='IsShareWithGoogle'])[1]"));
	    	 Actions action1=new Actions(driver);
	    	 action1.moveToElement(yesbutton).click().perform();
	    	 staticWait(1000);
	    	 click(By.xpath("//div[contains(@class,'text-right buttonarea')]/button[@data-original-title='Save']"), "save button ", 30);
	     }
	     public void validateEvent() {
	    	 staticWait(3000);
	    	 click(By.xpath("//div/a[@show_type='MY_EVENT']"), "Select Event ", 30);
	    	 try {
	    		 WebElement event = driver.findElement(By.xpath("//div[@class='fc-event-inner fc-event-skin meeting editable']/span[contains(text(),'projectName')]"));
	    		 if (event.isDisplayed()) {
	 				logger.info("Events are visible in clander data");
	 				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	    	 
	    	 click(By.xpath("//ul/li[@show_type='SELECTNON']"), "Clear All Button ", 30);
	    	 
	    	 //click(By.xpath("//div/a[@show_type='MY_EVENT']"), "DeSelect Event ", 30);
	    	 
	     }
	     public void validateGoogleEvent() {
	    	 staticWait(2000);
	    	 click(By.xpath("//div/a[@show_type='GOOGLE_EVENT']"), "Select Google Event ", 30);
	    	 click(By.xpath("//div/a[@show_type='GOOGLE_EVENT']"), "DeSelect google Event ", 30);
	    	 
	     }
	     public void validatePerformanceReview() {
	    	 staticWait(2000);
	    	 click(By.xpath("//div/a[@show_type='PERFORMANCE_REVIEW']"), "Select Google Event ", 30);
	    	 click(By.xpath("//div/a[@show_type='PERFORMANCE_REVIEW']"), "DeSelect google Event ", 30);
	    	 
	     }
	     public void validateProject() {
	    	 staticWait(2000);
	    	 click(By.xpath("//div/a[@show_type='PROJECT']"), "Select Project ", 30);
	    	 try {
	    		 WebElement project = driver.findElement(By.xpath("//div[@class='fc-event-inner fc-event-skin pro_start']"));
	    		 if (project.isDisplayed()) {
	 				logger.info("Projects are visible in clander data");
	 				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	    	 
	    	 click(By.xpath("//ul/li[@show_type='SELECTNON']"), "Clear All Button ", 30);
	    	 //click(By.xpath("//div/a[@show_type='PROJECT']"), "DeSelect Project ", 30);
	    	 
	     }
	     public void validateTask() {
	    	 staticWait(2000);
	    	 click(By.xpath("//div/a[@show_type='TASK']"), "Select Task ", 30);
	    	 try {
	    		 WebElement task = driver.findElement(By.xpath("//div[@class='fc-event-inner fc-event-skin task_start']/span"));
	    		 if (task.isDisplayed()) {
	 				logger.info("Tasks are visible in clander data");
	 				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	    	 
	    	 click(By.xpath("//ul/li[@show_type='SELECTNON']"), "Clear All Button ", 30);
	    	// click(By.xpath("//div/a[@show_type='TASK']"), "DeSelect Task ", 30);
	    	 
	     }
	     public void validateTraining() {
	    	 staticWait(2000);
	    	 click(By.xpath("//div/a[@show_type='TRAINING']"), "Select Training ", 30);
	    	 click(By.xpath("//div/a[@show_type='TRAINING']"), "DeSelect Training ", 30);
	    	 
	     }
	     public void validateUserStatus() {
	    	 staticWait(2000);
	    	 click(By.xpath("//div/a[@show_type='USER_STATUS']"), "Select User status ", 30);
	    	 click(By.xpath("//div/a[@show_type='USER_STATUS']"), "DeSelect user status ", 30);
	    	 
	     }
	     public void clickOnSelectAll() {
	    	 staticWait(2000);
	    	 click(By.xpath("//ul/li[@show_type='SELECTALL']"), "Select All Button ", 30);
	    	   WebElement selectProject = driver.findElement(By.xpath("//div[@class='fc-event-inner fc-event-skin pro_start']"));
	    	 if (selectProject.isDisplayed()) {
			logger.info("All project are selected");	
			}else {
				logger.info("All project are not selected");	
			}
	     }
	     public void clickOnClearAll() {
	    	 staticWait(2000);
	    	 click(By.xpath("//ul/li[@show_type='SELECTNON']"), "Clear All Button ", 30);
	    	  String selectProject = driver.findElement(By.xpath("//table/tbody/tr/td/div[@class='fc-day-content']")).getText();
	    	 if (selectProject.isEmpty()) {
			logger.info("All project are Clear");	
			}else {
				logger.info("All project are not clear");	
			}
	     }
	     public void clickOnAddManually() {
	    	 staticWait(2000);
	    	 clickByJavascript(By.xpath("//span[@class='p-actions float-right']/a[@id='AddManually']/span[text()='Add Manually']"), "Add Manually", 30);
	     }
	     public void enterStarttime() {
	    	 staticWait(1000);
	    	 enter(By.xpath("//div[@class='input-group']/input[@id='txtStartTime']"), "09:00:00", "Start Time", 20);
	    	 staticWait(1000);
	    	 click(By.xpath("//div[@data-target='#txtStartTime']/span"), "Open Start time popup ", 30);
	    	 staticWait(1000);
	    	 click(By.xpath("//div[@data-target='#txtStartTime']/span"), "Closed Start time popup ", 30);
	     }
	     public void enterStoptime() {
	    	 staticWait(1000);
	    	 Calendar cal = Calendar.getInstance();
	         SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	         String currentTime = sdf.format(cal.getTime());
	         System.out.println( currentTime );
	         enter(By.xpath("//div/input[@data-original-title='Stop Time']"), currentTime, "Start Time", 20);
	         staticWait(1000);
	         click(By.xpath("//div[@data-target='#txtStopTime']/span"), "Open Stop time popup", 30);
	         staticWait(1000);
	         click(By.xpath("//div[@data-target='#txtStopTime']/span"), "Closed Stop time popup", 30);
	    	 
	    	 
	     }
	     public void clickOnSave() {
	    	 staticWait(3000);
	    	 click(By.xpath("//div/a[text()='Save']"), "save button ", 30);
	    	 click(By.xpath("//div/button[@id='closenotifymessage']/span"), "closed notification popup ", 30);
	    	 click(By.xpath("//div/a[text()='Save']"), "save button ", 30);
	     }
	     public void captureAletrMessage() {
	    	staticWait(2000);
	    	 try {
	    		 WebElement ConfirmationMessage = driver.findElement(By.xpath("//div[@role='alert']/span[text()='Time Entry Saved Successfully']"));
	    		 if (ConfirmationMessage.isDisplayed()) {
					logger.info("Time Entry saved succesfully");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	     }


}
