package pageObjects;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.PropertiesLoader;
import utils.WebBasePage;

public class TimeSheetPage extends WebBasePage {
WebDriver driver ;
	
	String TitleName;
	String pattern = "yyMMddHHmmss";
	Date date = new Date();
	SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
	
	String datevalue=dateformat.format(date);
	static String TitleRandomValue;
	static String CreatedTitleRandomValue;
	static String projectName;
	ProjectListingPage projectListingPage;
	String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\testfiles\\";
	    private final static String FILE_NAME = System.getProperty("user.dir")+"\\src\\main\\resources\\testdata.properties";
	    private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	    
	    public TimeSheetPage(WebDriver driver) {
			super(driver, "TimeSheetPage");
			this.driver=driver;
			// TODO Auto-generated constructor stub
		}
	    public void clickFullMenuDropDown() {
	        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
	        staticWait(2000);
	    }
	    public void clickTimeTrackingLink()
	     {
	    	 clickByJavascript(By.xpath("//a[@data-toggle='popover']/ancestor::li[@id='menuitem23']/span[@class='fa  fa-angle-right gotosub']"),"Time Tracking", 30);
	    	 staticWait(2000);
	     }
	     public void clickOnTimeSheetPage()
	     {
	    	 waitForVisibilityOfElement(By.xpath("//ul/li/a[@data-original-title='Timesheet']"), 50);
	    	 click(By.xpath("//ul/li/a[@data-original-title='Timesheet']")," Time Sheet", 30);
	    	 
	     }
	     public void verifyTimesheetPage() {
	    	 staticWait(2000);
	    	 WebElement timesheet = driver.findElement(By.xpath("//span[text()='General Timesheet']"));
	    	 if (timesheet.isDisplayed()) {
				logger.info("time sheet page displayed");
			} else {
				logger.info("time sheet page is not displayed");
			}
	     }
	     public void clickOnShowTimeSheet()
	     {
	    	 staticWait(5000);
	    	 click(By.xpath("//div/a[@id='aTimesheet']")," Show time sheet", 30);
	    	 
	     }
	     public void enterUser()
	     {
	    	 staticWait(3000);
	    	 click(By.xpath("//div/select[@id='ddlUser']")," User name", 30);
	    	 selectValueWithText(By.xpath("//div/select[@id='ddlUser']"), "Henry miller", " User name", 20);
	    	 //enter(By.xpath("//div/select[@id='ddlUser']"), "Henry miller", " User name", 20);
	    	 
	     }
	     public void clickOnAddHours()
	     {
	    	 staticWait(3000);
	    	 click(By.xpath("//tbody/tr[@id='tbl-1']/td[@class='single-action']//a[@data-original-title='Click here to add hours']"),"Add Hours ", 30);
	    	 
	     }
	     public void clickOnselectProject() {
	    	 staticWait(2000);
	    	 //ProjectListingPage projectListingPage=new ProjectListingPage(driver);
	    	projectName = projectListingPage.projectName;
	    	click(By.xpath("//span[@aria-labelledby='select2-ddlTimesheetProject-container']/span[@id='select2-ddlTimesheetProject-container']"), "Select Project", 30);
	    	 enter(By.xpath("//span[@class='select2-search select2-search--dropdown']/input[@type='search']"), projectName, " Project Name", 20);
	    	 staticWait(1000);
	    	 click(By.xpath("//span[@class='select2-results']/ul/li[text()='"+projectName+"']"), "Select Project", 30);
	    	 
	     }
	     public void selectyourTask() {
	    	 staticWait(2000);
	    	 click(By.xpath("//div[@type='button']/span"), "select Your task", 30);
	    	 staticWait(2000);
	    	 click(By.xpath("//a/span[@class='float-left textvalue']"), "Task", 30);
	     }
	     public void enterdescription() {
	    	 staticWait(1000);
	    	 enter(By.xpath("//tg-textarea/textarea[@id='txtDescription']"), prop.getProperty("Description"), "Add working hours description", 30); 
	     }
	     public void enterTotaltime() throws AWTException {
	    	 staticWait(3000);
				
		     click(By.xpath("//div[@class='form-group']/input[@id='txtTotalHour']"),"Total time", 30);
		     Robot robot = new Robot();
		     staticWait(1000);
		     robot.keyPress(KeyEvent.VK_CONTROL);
		     staticWait(1000);
		     robot.keyPress(KeyEvent.VK_A);
		     
		    
		    
		     staticWait(1000);
		     robot.keyRelease(KeyEvent.VK_CONTROL);
		     staticWait(1000);
		     robot.keyRelease(KeyEvent.VK_A);
		     staticWait(1000);
		     robot.keyPress(KeyEvent.VK_BACK_SPACE);
		     staticWait(1000);
		     robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		     logger.info("Total time text field cleared");
		     //staticWait(2000);
		     //driver.findElement(By.xpath("//div[@class='form-group']/input[@id='txtTotalHour']")).clear();
				  staticWait(1000);
				 
	    	 enter(By.xpath("//div[@class='form-group']/input[@id='txtTotalHour']"), "12", "Total time", 30); 
	     }
	     public void enterStarttime() {
	    	 staticWait(1000);
	    	 enter(By.xpath("//div/input[@id='txtStartTimes']"), "09:00", "Start Time", 20);
	     }
	     public void enterStoptime() {
	    	 staticWait(1000);
	    	 Calendar cal = Calendar.getInstance();
	         SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	         String currentTime = sdf.format(cal.getTime());
	         System.out.println( currentTime );
	         enter(By.xpath("//div/input[@id='txtStopTimes']"), currentTime, "Start Time", 20);
	    	 
	    	 
	     }
	     public void clickOnSave() {
	    	 staticWait(3000);
	    	 clickByJavascript(By.xpath("//a[@id='btnSave']"), "Save button", 30);
	    	 
	    	 
	     }
	     public void validateTimeEntryConfirmationMessage() {
	    	 try {
	    		 WebElement confirmationMessage = driver.findElement(By.xpath("//div/span[contains(text(),'Record(s) has been successfully saved')]"));
		    	 String message = confirmationMessage.getText();
		    	 if (confirmationMessage.isDisplayed()) {
		    		 logger.info(message);
					
				} 
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	    	
	     }
	    
	     public void clickOnBreak()
	     {
	    	 staticWait(3000);
	    	 click(By.xpath("//tbody/tr[@id='tbl-1']/td[@class='text-center']//label[@class='switch']")," Break button", 30);
	    	 
	     }
	     public void deleteWorkingHours() {
	    	 staticWait(2000);
	    	 click(By.xpath("//tbody/tr[@id='tbl-1']/td[@class='tabchild']/a")," Expand button", 30);
	    	 staticWait(1000);
	    	 clickByJavascript(By.xpath("//td/a[@class='aDelete']"), "Delete button", 30);
	    	 staticWait(1000);
	    	 click(By.xpath("//button[@title='OK']")," confirmation button", 30);
	     }
	     public void validateDeleteConfirmationMessage() {
	    	 try {
	    		 WebElement confirmationMessage = driver.findElement(By.xpath("//div/span[contains(text(),'Time Entry has been successfully deleted')]"));
		    	 String message = confirmationMessage.getText();
		    	 if (confirmationMessage.isDisplayed()) {
		    		 logger.info(message);
					
				} 
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	    	
	     }
	     public void clickOnSendForApproval() {
	    	 staticWait(3000);
	    	 click(By.xpath("//div/a[@id='btnSendForApproval']")," Send For Approval button", 30);
	    	 staticWait(1000);
	    	 click(By.xpath("//button[@title='OK']")," confirmation button", 30);
	     }
	     public void validateSendApprovalConfirmationPopup() {
	    	 staticWait(3000);
	    	 try {
	    		 WebElement confirmationMessage = driver.findElement(By.xpath("//div/span[contains(text(),'The timesheet for this week has been sent for approval')]"));
		    	 String message = confirmationMessage.getText();
		    	 if (confirmationMessage.isDisplayed()) {
		    		 logger.info(message);
					
				} 
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	    	
	     }
	     public void enterPostCommentTitle() {
	    	 staticWait(3000);
	    	 waitForVisibilityOfElement(By.xpath("//div/input[@id='CommentTitle']"), 50);
	         enter(By.xpath("//div/input[@id='CommentTitle']"), prop.getProperty("commentTitle"), "Comment title", 20);

	     }
	     public void enterPostCommentDescription() {
	    	 staticWait(3000);
	    	 waitForVisibilityOfElement(By.xpath("//div/textarea[@id='CommentDescription']"), 50);
	         enter(By.xpath("//div/textarea[@id='CommentDescription']"), prop.getProperty("Description"), "Comment title", 20);

	     }
	     public void clickOnPostNewComment() {
	    	 staticWait(3000);
	    	 waitForVisibilityOfElement(By.xpath("//div[@class='search-btm-btn']/a[@id='postcomment']"), 50);
	    	 click(By.xpath("//div[@class='search-btm-btn']/a[@id='postcomment']"), "Post new comment button", 30);
	    	 

	     }
	     public void validatePostCommentConfirmationmessage() {
	    	 staticWait(3000);
	    	 try {
	    		 WebElement confirmationMessage = driver.findElement(By.xpath("//div/span[text()='Comment has been posted successfully']"));
		    	 String message = confirmationMessage.getText();
		    	 if (confirmationMessage.isDisplayed()) {
		    		 logger.info(message);
					
				} 
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	    	
	     }
	     public void clickOnProjectForedit() {
	    	 staticWait(2000);
	    	 click(By.xpath("//tbody/tr[@id='tbl-1']/td[@class='tabchild']/a")," Expand button", 30);
	    	 staticWait(2000);
	    	 clickByJavascript(By.xpath("//tbody/tr/td/a[contains(text(),'"+projectName+"')]")," Project", 30);
	    	 staticWait(2000);
	    	 clickByJavascript(By.xpath("//div/a[@id='btnSave']"),"Save button", 30);
	    	 staticWait(2000);
	    	 try {
	    		 WebElement confirmationMessage = driver.findElement(By.xpath("//div/span[text()='Record Updated Successfully']"));
		    	 String message = confirmationMessage.getText();
		    	 if (confirmationMessage.isDisplayed()) {
		    		 logger.info(message);
					
				} 
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	    	
	     }

}
