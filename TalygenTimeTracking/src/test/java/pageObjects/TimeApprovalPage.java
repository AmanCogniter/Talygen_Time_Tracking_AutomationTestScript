package pageObjects;

import static reporting.ComplexReportFactory.getTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.Errors;
import utils.PropertiesLoader;
import utils.RandomNumber;
import utils.WebBasePage;

public class TimeApprovalPage extends WebBasePage {
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
    static String projectName;
	static RandomNumber random=new RandomNumber();

	 public TimeApprovalPage(WebDriver driver) {
			super(driver, "TimeApprovalPage");
			this.driver=driver;
			// TODO Auto-generated constructor stub
		}
	    
	    public void clickFullMenuDropDown() {
	        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
	        staticWait(2000);
	    }
	     public void clickTimeTrackingLink()
	     {
	    	 clickByJavascript(By.xpath("//div/ul/li[@data-name='Time Tracking']/span"),"Time Tracking", 30);
	    	 staticWait(2000);
	     }
	     public void clickTimeApprovalPage()
	     {
	    	 waitForVisibilityOfElement(By.xpath("//li/a[@data-original-title='Time Approval']"), 50);
	    	 clickByJavascript(By.xpath("//li/a[@data-original-title='Time Approval']")," Time Approval", 30);
	    	 
	     }
	     public void validateTimeApprovalpage() {
	    	 
	    	 try {
	    		 String acceptedTitle = Errors.acceptedTimeApprovalTitle;
	    		 String actualtitle= getText(By.xpath("//div[@class='theme-primary partition-full']/span[contains(text(),'Timesheet Approvals')]"),30);
				if (actualtitle.equals(acceptedTitle)) {
					getTest().log(LogStatus.PASS, " Time Approval Page is successfully displayed  " );
		    		 logger.info("Time Approval Page is successfully displayed " );
					
				}
			} catch (Exception e) {
				getTest().log(LogStatus.FAIL, "Time Approval Page is not successfully displayed");
	    		logger.info("Time Approval Page is not successfully displayed");
	            takeScreenshot("TimeTrackPage");
				// TODO: handle exception
			}
	    	 
	     }
	     public void clickOncheckBox() {
	    	 staticWait(5000);
	    	 //waitForVisibilityOfElement(By.xpath("//tbody/tr/td[@class='td1 text-center']/div[@class='custom-control custom-checkbox']"), 50);
	    	 click(By.xpath("//table/thead/tr/th[@class='text-center']/div[@class='custom-control custom-checkbox']")," Check Box", 30);

	     }
	     public void clickOnReject() {
	    	 waitForVisibilityOfElement(By.xpath("//span/a[@id='aReject']"), 50);
	    	 clickByJavascript(By.xpath("//span/a[@id='aReject']")," Reject", 30);

	     }
	     public void enterCommentTitle() {
	    	 waitForVisibilityOfElement(By.xpath("//div/input[@id='CommentTitle']"), 50);
	         enter(By.xpath("//div/input[@id='CommentTitle']"), prop.getProperty("commentTitle"), "Comment title", 20);

	     }
	     public void enterCommentDescription() {
	    	 waitForVisibilityOfElement(By.xpath("//div/textarea[@id='CommentDescription']"), 50);
	         enter(By.xpath("//div/textarea[@id='CommentDescription']"), prop.getProperty("Description"), "Comment description", 20);

	     }
	     public void clickOnPostNewComment() {
	    	 waitForVisibilityOfElement(By.xpath("//div/a[@id='aPostComment']"), 50);
	    	 click(By.xpath("//div/a[@id='aPostComment']"), "Post new comment button", 30);
	    	 staticWait(1000);
	    	 click(By.xpath("//button[@title='OK']")," confirmation button", 30);

	     }
	     public void validateRejectConfirmationmessage() {
	    	 staticWait(2000);
	    	 try {
	    		 WebElement confirmationMessage = driver.findElement(By.xpath("//div/span[text()='Rejected Successfully']"));
		    	 String message = confirmationMessage.getText();
		    	 if (confirmationMessage.isDisplayed()) {
		    		 logger.info(message);
					
				} 
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	    	
	     }
	     public void clickOnApprove() {
	    	 waitForVisibilityOfElement(By.xpath("//span/a[@id='divApprove']"), 50);
	    	 clickByJavascript(By.xpath("//span/a[@id='divApprove']")," Approve", 30);

	     }
	     
	     public void clickOnUser() {
	    	 waitForVisibilityOfElement(By.xpath("//div/h5/a/span[@id='userId']"), 50);
	    	 clickByJavascript(By.xpath("//div/h5/a/span[@id='userId']")," User Text Field", 30);

	     }
	     public void enterUserName() {
	    	 waitForVisibilityOfElement(By.xpath("//div/input[@placeholder='Search']"), 50);
	    	
	    	 enter(By.xpath("//div/input[@placeholder='Search']"), prop.getProperty("searchUser"), "User name", 50);
	     }
	     public void clickOnradioButton() {
	    	
	    	 click(By.xpath("//div/label[contains(text(),'"+prop.getProperty("searchUser")+"')]")," Search Button", 30);

	     }
	     public void clickOnSearchButton() {
	    	 waitForVisibilityOfElement(By.xpath("//span/a[@id='Go']"), 50);
	    	 clickByJavascript(By.xpath("//span/a[@id='Go']")," Search Button", 30);

	     }
	     
	     

}
