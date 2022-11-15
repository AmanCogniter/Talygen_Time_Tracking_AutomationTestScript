package pageObjects;

import static reporting.ComplexReportFactory.getTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import  java.lang.String;
import java.util.Properties;

import com.relevantcodes.extentreports.LogStatus;

import utils.Errors;
import utils.PropertiesLoader;
import utils.WebBasePage;

public class TimeReportPage extends WebBasePage{
	WebDriver driver ;
	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";
	/* Modified */
	String filePath = System.getProperty("user.dir") +
			  "\\src\\main\\resources\\testfiles\\";

	private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	 public TimeReportPage(WebDriver driver) {
			super(driver, "TimeReportPage");
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
	   
	   
	   
	    
	   
	    
	   
	    
	     public void clickOnTimeReportPage()
	     {
	    	 waitForVisibilityOfElement(By.xpath("//ul/li/a[@data-original-title='Time Report']"), 50);
	    	 click(By.xpath("//ul/li/a[@data-original-title='Time Report']")," Time Report", 30);
	    	 
	     }
        public void validateTimeReportpage() {
	    	 
	    	 try {
	    		 String acceptedTitle = Errors.acceptedTimeReportPageTitle;
	    		 String actualtitle= getText(By.xpath("//div/span[text()='Project Reports']"),30);
				if (actualtitle.equals(acceptedTitle)) {
					getTest().log(LogStatus.PASS, " Time Report Page is successfully displayed  " );
		    		 logger.info("Time Report Page is successfully displayed " );
					
				}
			} catch (Exception e) {
				getTest().log(LogStatus.FAIL, "Time Report Page is not successfully displayed");
	    		logger.info("Time Report Page is not successfully displayed");
	            takeScreenshot("TimeReportkPage");
				// TODO: handle exception
			}
	    	 
}
        public void clickOnDAterange()
	     {
	    	 clickByJavascript(By.xpath("//a[@id='aDateLable']"),"Date range", 30);
	    	 staticWait(2000);
	    	 click(By.xpath("//table/tbody/tr/td/ul/li/a[@id='aAll']"), "All Time", 30);
	     }
        public void clickOnOneMontyh() {
        	click(By.xpath("//div/ul/li/a[@id='aMonthlyReport']"), "1 month", 30);
        }
        public void clickOnUser() {
        	click(By.xpath("//div/button[@title='Select User']/span"), "User", 30);
        	enter(By.xpath("//button[@title='Select User']/ancestor::div[@class='btn-group show']/descendant::div[@class='input-group']/input[@placeholder='Enter Keywords']"), "ginny", " User Name", 20);
        	click(By.xpath("//li/a/label[contains(text(), ' ginny . ( Human Resource ) ')]"), "select user", 30);
        }
        public void clickOnsearch() {
        	clickByJavascript(By.xpath("//div/a[@id='aSearch']"),"search Button", 30);
        }
        public void oneMonthProjectReport() {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView();", element);
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			switchToFrame();
			logger.info("Switch to reports frame");
        	//WebElement switchToFrame = driver.findElement(By.xpath("//iframe[@id='iReport']"));
			staticWait(3000);
        	//WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewContainer']"));
        	try {
        		WebElement noRecords = driver.findElement(By.xpath("//div[@id='viewer_pageviewbodyContainer']//table/tbody/tr[3]/td[1]//div[@class='e-reportviewer-paragrap']/div[text()='No record(s) found']"));
        		
        		if (noRecords.isDisplayed()) {
					logger.info("1 month project report is visible successfully with no records");
				} 
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("1 month project report is visible successfully with  records");
				//e.printStackTrace();
			}
        	staticWait(2000);
        	driver.navigate().refresh();
        }
        public void clickOnOneWeek() {
        	click(By.xpath("//div/ul/li/a[@id='aWeeklyReport']"), "1 week", 30);
        }
        public void oneWeekProjectReport() {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView();", element);
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			switchToFrame();
			logger.info("Switch to reports frame");
        	
			staticWait(3000);
        	//WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewContainer']"));
        	try {
        		WebElement noRecords = driver.findElement(By.xpath("//div[@id='viewer_pageviewbodyContainer']//table/tbody/tr[3]/td[4]//div[@class='e-reportviewer-paragrap']/div[text()='No record(s) found']"));
        		
        		if (noRecords.isDisplayed()) {
					logger.info("1 week project report is visible successfully with no records");
				} 
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("1 week project report is visible successfully with  records");
				//e.printStackTrace();
			}
        	staticWait(2000);
        	driver.navigate().refresh();
        }
        public void clickOnClientreport() {
        	click(By.xpath("//div/ul/li/a[@id='aClientReport']"), "client report", 30);
        }
        public void selectClient() {
        	staticWait(3000);
        	click(By.xpath("//div/button[@title='Select Client']"), "client ", 30);
        	//staticWait(2000);
        	//selectValueWithText(By.xpath("//span[@class='multiselect-native-select']/select[@id='ddlClients']"), "Main Client", " Main Client", 30);
        	click(By.xpath("//ul/li/a/label[text()=' Main Client']"), "Main client", 30);
        }
        public void clientReport() {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView();", element);
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			switchToFrame();
			logger.info("Switch to reports frame");
        	
			staticWait(3000);
        	//WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewContainer']"));
        	try {
        		WebElement noRecords = driver.findElement(By.xpath("//div[@id='viewer_pageviewbodyContainer']//table/tbody/tr[3]/td[1]//div[@class='e-reportviewer-paragrap']/div[text()='No record(s) found']"));
        		
        		if (noRecords.isDisplayed()) {
					logger.info("Client report is visible successfully with no records");
				} 
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("Client report is visible successfully with  records");
				//e.printStackTrace();
			}
        	staticWait(2000);
        	driver.navigate().refresh();
        }
        public void clickOnEntrywise() {
        	staticWait(3000);
        	click(By.xpath("//div/ul/li/a[@id='aTrackEntryReport']"), "Entry Wise", 30);
        }
        public void EntryWiseReport() {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView();", element);
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			switchToFrame();
			logger.info("Switch to reports frame");
        	
			staticWait(5000);
        	//WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewContainer']"));
        	try {
        		WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_table1']/table/tbody/tr[3]"));
        		
        		if (projectReport.isDisplayed()) {
					logger.info("Entry Wise project report is visible successfully with records");
				} 
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("Entry wise project report is visible successfully with no records");
				//e.printStackTrace();
			}
        	staticWait(2000);
        	driver.navigate().refresh();
        }
        public void clickOnHalfYearly() {
        	staticWait(2000);
        	click(By.xpath("//div/ul/li/a[@id='aHalfYearlyReport']"), "half yearly Project report", 30);
        }
        public void halfYearlyReport() {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView();", element);
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			switchToFrame();
			logger.info("Switch to reports frame");
        	
			staticWait(5000);
        	//WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewContainer']"));
        	try {
        		WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewbodyContainer']//table/tbody/tr[3]/td[1]//div[@class='e-reportviewer-paragrap']/div[text()='No record(s) found']"));
        		
        		if (projectReport.isDisplayed()) {
					logger.info("Half yearly project report is visible successfully with no records");
				} 
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("Half yearl project report is visible successfully with records");
				//e.printStackTrace();
			}
        	staticWait(2000);
        	driver.navigate().refresh();
        }
        public void clickOnProfitabilityReport() {
        	staticWait(2000);
        	click(By.xpath("//div/ul/li/a[@id='aProfitWiseReport']"), "Profitability Report", 30);
        }
        public void clickOnProject() {
        	staticWait(2000);
        	ProjectListingPage projectListingPage= new ProjectListingPage(driver);
        	String projectname = projectListingPage.projectName;
        	click(By.xpath("//div[@class='btn-group']/button[@type='button']"), "Project", 30);
        	enter(By.xpath("//ul/li/div/input[@placeholder='Enter Keywords']"), projectname, "Project Name", 30);
        	click(By.xpath("//li/a/label[text()='  Select all']"), "Select Project", 30);
        }
        public void clickOnChannel() {
        	staticWait(3000);
        	ProjectListingPage projectListingPage= new ProjectListingPage(driver);
        	String channelname = projectListingPage.channelName;
        	click(By.xpath("//div[@class='btn-group']/button[@title='Select Channel']"), "Channel", 30);
        
			enter(By.xpath("//select[@id='ddlChannels']/ancestor::span[@class='multiselect-native-select']/descendant::ul/li/div/input[@placeholder='Enter Keywords']"), channelname, "channel Name", 30);
        	click(By.xpath("(//li/a/label[text()='  Select all'])[last()]"), "Select channel", 30);
        }
        public void clickOnDepartment() {
        	staticWait(2000);
        	
        	click(By.xpath("//div/button[@title='Select Department']"), "Department", 30);
        	staticWait(2000);
        	enter(By.xpath("(//ul/li/div/input[@placeholder='Enter Keywords'])[last()]"), "Human Resource", "Project Name", 30);
        	click(By.xpath("(//li/a/label[text()='  Select all'])[last()]"), "Select Department", 30);
        }
        public void clickOnDepartmentwithUserreport() {
        	staticWait(2000);
        	
        	click(By.xpath("//div/button[@title='Select Department']"), "Department", 30);
        	staticWait(2000);
        	enter(By.xpath("//select[@id='ddlDepartments']/ancestor::div[@class='form-group']/descendant::ul/li/div/input[@placeholder='Enter Keywords']"), "Human Resource", "Project Name", 30);
        	click(By.xpath("(//li/a/label[text()='  Select all'])[last()]"), "Select Department", 30);
        }
        public void clickOnDepartmentwithUserWisereport() {
        	staticWait(2000);
        	
        	click(By.xpath("//div/button[@title='Select Department']"), "Department", 30);
        	staticWait(2000);
        	enter(By.xpath("//select[@id='ddlDepartments']/ancestor::div[@class='form-group']/descendant::ul/li/div/input[@placeholder='Enter Keywords']"), "Human Resource", "Project Name", 30);
        	click(By.xpath("//li/a/label[text()='  Select all']"), "Select Department", 30);
        }
        public void clickOnDepartmentwithProjectDetailreport() {
        	staticWait(2000);
        	
        	click(By.xpath("//div/button[@title='Select Department']"), "Department", 30);
        	staticWait(2000);
        	enter(By.xpath("//select[@id='ddlDepartments']/ancestor::div[@class='form-group']/descendant::ul/li/div/input[@placeholder='Enter Keywords']"), "Human Resource", "Project Name", 30);
        	click(By.xpath("(//li/a/label[text()='  Select all'])[3]"), "Select Department", 30);
        }
        public void profitabilityReport() {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView();", element);
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			switchToFrame();
			logger.info("Switch to reports frame");
        	
			staticWait(5000);
        	//WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewContainer']"));
        	try {
        		WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewbodyContainer']//table/tbody/tr[3]/td[1]//div[@class='e-reportviewer-paragrap']/div[text()='No record(s) found']"));
        		
        		if (projectReport.isDisplayed()) {
					logger.info("Profitability project report is visible successfully with no records");
				} 
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("Profitability project report is visible successfully with  records");
				//e.printStackTrace();
			}
        	staticWait(2000);
        	driver.navigate().refresh();
        }
        public void clickOnProjectDetailsReport() {
        	staticWait(2000);
        	click(By.xpath("//div/ul/li/a[@id='aDPRReport']"), "Profitability Report", 30);
        }
        public void projectDetailsReport() {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView();", element);
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			switchToFrame();
			logger.info("Switch to reports frame");
        	
			staticWait(5000);
        	//WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewContainer']"));
        	try {
        		WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewbodyContainer']//table/tbody/tr[3]/td[1]//div[@class='e-reportviewer-paragrap']/div[text()='No record(s) found']"));
        		
        		if (projectReport.isDisplayed()) {
					logger.info(" Project Details report is visible successfully with no records");
				} 
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("Project details report is visible successfully with  records");
				//e.printStackTrace();
			}
        	staticWait(2000);
        	driver.navigate().refresh();
        }
        public void clickOnProjectReport() {
        	staticWait(2000);
        	click(By.xpath("//div/ul/li/a[@id='aProjectReport']"), "Project Report", 30);
        }
        public void projectReport() {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView();", element);
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			switchToFrame();
			logger.info("Switch to reports frame");
        	
			staticWait(5000);
        	//WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewContainer']"));
        	try {
        		String projectReport = driver.findElement(By.xpath("//div[@class='e-reportviewer-paragrap']/div[contains(text(),'Automation')]")).getText();
        		
        		if (projectReport.contains(prop.getProperty("Projectname"))) {
					logger.info(" Project report is visible successfully with  records");
				} 
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("Project report is visible successfully with no records");
				//e.printStackTrace();
			}
        	staticWait(2000);
        	driver.navigate().refresh();
        }
        public void clickOnProjectWise() {
        	staticWait(2000);
        	click(By.xpath("//div/ul/li/a[@id='aProjectWiseReport']"), "Project wise", 30);
        }
        public void selectTeamMember() {
        	click(By.xpath("//div/button[@title='Select Team members']/span"), "Team member", 30);
        	enter(By.xpath("//button[@title='Select Team members']/ancestor::div[@class='btn-group show']/descendant::div[@class='input-group']/input[@placeholder='Enter Keywords']"), "ginny", " User Name", 20);
        	click(By.xpath("//li/a/label[contains(text(), ' ginny . ( Human Resource ) ')]"), "select team member", 30);
        }
        public void projectWise() {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView();", element);
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			switchToFrame();
			logger.info("Switch to reports frame");
        	
			staticWait(5000);
        	//WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewContainer']"));
        	try {
        		String projectReport = driver.findElement(By.xpath("//div[@class='e-reportviewer-paragrap']/div[contains(text(),'ginny')]")).getText();
        		
        		if (projectReport.contains(prop.getProperty("userName"))) {
					logger.info(" Project wise report is visible successfully with  records");
				} 
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("Project wise report is visible successfully with no records");
				//e.printStackTrace();
			}
        	staticWait(2000);
        	driver.navigate().refresh();
        }
        public void clickOnTrackEntryDetails() {
        	staticWait(2000);
        	click(By.xpath("//div/ul/li/a[@id='aTrackEntryDetailsReport']"), "Track Entry Details", 30);
        }
        public void trackEntryDetails() {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView();", element);
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			switchToFrame();
			logger.info("Switch to reports frame");
        	
			staticWait(5000);
        	//WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewContainer']"));
        	try {
        		String projectReport = driver.findElement(By.xpath("//table/tbody/tr/td[@rowspan='1']/div[@id='viewer_USER_NAMES_viewer_table1tablixRow2xCol3']/div/div")).getText();
        		logger.info(projectReport);
				if (projectReport.contains(prop.getProperty("userName"))) {
					logger.info(" Project wise report is visible successfully with  records");
				} 
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("Project wise report is visible successfully with no records");
				//e.printStackTrace();
			}
        	staticWait(2000);
        	driver.navigate().refresh();
        }
        public void clickOnTimesheetReport() {
        	staticWait(2000);
        	click(By.xpath("//div/ul/li/a[@id='aUserBreakReport']"), "TimeSheet Report", 30);
        }
        public void timeSheetReport() {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView();", element);
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			switchToFrame();
			logger.info("Switch to reports frame");
        	
			staticWait(5000);
        	//WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewContainer']"));
        	try {
        		String projectReport = driver.findElement(By.xpath("//div[@class='e-reportviewer-paragrap']/div[contains(text(),'ginny')]")).getText();
        		logger.info(projectReport);
				if (projectReport.contains(prop.getProperty("userName"))) {
					logger.info("Time Sheet report is visible successfully with  records");
				} 
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("Time Sheet report is visible successfully with no records");
				//e.printStackTrace();
			}
        	staticWait(2000);
        	driver.navigate().refresh();
        }
        public void clickOnUserReport() {
        	staticWait(2000);
        	click(By.xpath("//div/ul/li/a[@id='aUserReport']"), "User Report", 30);
        }
        public void userReport() {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView();", element);
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			switchToFrame();
			logger.info("Switch to reports frame");
        	
			staticWait(5000);
        	//WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewContainer']"));
        	try {
        		String projectReport = driver.findElement(By.xpath("//div[@class='e-reportviewer-paragrap']/div[contains(text(),'ginny')]")).getText();
        		//String pageCount = prop.getProperty("totalpage");
				if (projectReport.contains(prop.getProperty("userName"))) {
					logger.info(" User report is visible successfully with  records");
				} 
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("User report is visible successfully with no records");
				//e.printStackTrace();
			}
        	staticWait(2000);
        	driver.navigate().refresh();
        }
        public void clickOnUserWiseReport() {
        	staticWait(2000);
        	click(By.xpath("//div/ul/li/a[@id='aUserWiseReport']"), "User wise Report", 30);
        }
        public void userWiseReport() {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView();", element);
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			switchToFrame();
			logger.info("Switch to reports frame");
        	
			staticWait(5000);
        	//WebElement projectReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewContainer']"));
        	try {
        		String projectReport = driver.findElement(By.xpath("//div[@class='e-reportviewer-paragrap']/div[contains(text(),'ginny')]")).getText();
        		//String pageCount = prop.getProperty("totalpage");
				if (projectReport.contains(prop.getProperty("userName"))) {
					logger.info(" User wise report is visible successfully with records");
				} 
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("User wise report is visible successfully with no records");
				//e.printStackTrace();
			}
        	 staticWait(2000);
         	driver.navigate().refresh();
        	
        }
       
}