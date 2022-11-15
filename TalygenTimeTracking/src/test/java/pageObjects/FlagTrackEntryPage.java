package pageObjects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.PropertiesLoader;
import utils.WebBasePage;

public class FlagTrackEntryPage extends WebBasePage{
	WebDriver driver ;
	String pattern = "yyMMddHHmmss";
	Date date = new Date();
	SimpleDateFormat dateformat = new SimpleDateFormat(pattern);

	String datevalue = dateformat.format(date);
	static CompanySetupUserPage companySetupUserPage;
	static String auditRule;
	static String flagTrackEntry;
	static String projectName;

	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";
	/* Modified */
	String filePath = System.getProperty("user.dir") +
			  "\\src\\main\\resources\\testfiles\\";

	private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	 public FlagTrackEntryPage(WebDriver driver) {
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
	    public void clickOnFlagTrackEntry()
	     {
	    	 click(By.xpath("//div/ul/li/a[@data-original-title='Flag Track Entry']"),"Flag Track Entry", 30);
	    	 staticWait(2000);
	     }
	    public void FlagTrackEntrypage() {
	    	staticWait(3000);
	    	try {
	    		WebElement tourguide = driver.findElement(By.xpath("//div[@class='guided-tour-step-footer']/span[@title='End tour']/*[name()='svg']"));
	            flagTrackEntry = getText(By.xpath("//div/span[contains(text(),'Flag Track Entry')]"), 30);
				if (tourguide.isDisplayed() && flagTrackEntry.contains(prop.getProperty("flagTrackEntry"))) {
					click(By.xpath("//div[@class='guided-tour-step-footer']/span[@title='End tour']/*[name()='svg']"), "close tour guide", 30);
					staticWait(2000);
					logger.info(flagTrackEntry+"page opened successfully");
				}else {
					logger.info(flagTrackEntry+"page not opened successfully");
				}
			} catch (Exception e) {
				// TODO: handle exception
				logger.info(flagTrackEntry+"page opened successfully");
			}
	    }
	    public void clickOnProjectSearchField()
	     {
	    	 staticWait(2000);
	    	 click(By.xpath("//h5/a/span[@id='projectId']"),"Project", 30);
	    	 
	     }
	    public void enterProjectNameInSearchField()
	     {						
	    	  projectName = prop.getProperty("flagTrackEntryProjectName");
	    	 staticWait(2000);
	    	 enter(By.xpath("(//div[@class='input-group customsearchbox']/input)[2]"), projectName, "Project Name", 30);;
	    	 
	     }
	    public void clickOnSelectProject()
	     {
	    	 staticWait(2000);
	    	 click(By.xpath("//div/label[text()='"+projectName+"']"),"Project", 30);
	    	 
	     }
	    public void clickOnSearchButton()
	     {
	    	 staticWait(2000);
	    	 click(By.xpath("//h5//span[@id='Go']"),"Search Button", 30);
	    	 
	     }
	    public void clickOncheckBox()
	     {
	    	 staticWait(2000);
	    	 click(By.xpath("//table/tbody/tr/td/div[@class='custom-control custom-checkbox']"),"Check Box", 30);
	    	 
	     }
	    public void clickOnFlag()
	     {
	    	 staticWait(2000);
	    	 clickByJavascript(By.xpath("//div/span/a[@id='Flag']"),"Flag", 30);
	    	 
	     }
	    public void enterCommentTitle()
	     {
	    	 staticWait(2000);
	    	 enter(By.xpath("//div/textarea[@id='CommentTitle']"), prop.getProperty("flagTitle"), "Comment title", 30);;
	    	 
	     }
	    public void enterUnflagCommentTitle()
	     {
	    	 staticWait(2000);
	    	 enter(By.xpath("//div/textarea[@id='CommentTitle']"), prop.getProperty("unflagTitle"), "UnFlage Comment title", 30);;
	    	 
	     }
	    public void enterCommentDescription()
	     {
	    	 staticWait(2000);
	    	 enter(By.xpath("//div/textarea[@id='CommentDescription']"), prop.getProperty("commentDescription"), "Comment description", 30);;
	    	 
	     }
	    public void enterUnFlagCommentDescription()
	     {
	    	 staticWait(2000);
	    	 enter(By.xpath("//div/textarea[@id='CommentDescription']"), prop.getProperty("unFlagcommentDescription"), "UnFlagComment description", 30);;
	    	 
	     }
	    public void clickOnPostComment()
	     {
	    	 staticWait(2000);
	    	 clickByJavascript(By.xpath("//div/a[@id='aPostComment']"),"Post Comment", 30);
	    	 WebElement flagseccessMessage = driver.findElement(By.xpath("//div/span[contains(text(),'The entry has been successfully Flagged')]"));
	    	 if (flagseccessMessage.isDisplayed()) {
	    		 logger.info("The entry has been successfully Flagged");
			} else {
				logger.info("The entry hasn't been successfully Flagged");
			}
	    	 
	     }
	    public void clickOnUnflagPostComment()
	     {
	    	 staticWait(2000);
	    	 clickByJavascript(By.xpath("//div/a[@id='aPostComment']"),"Post Comment", 30);
	    	 WebElement flagseccessMessage = driver.findElement(By.xpath("//div/span[contains(text(),'The entry has been successfully UnFlagged')]"));
	    	 if (flagseccessMessage.isDisplayed()) {
	    		 logger.info("The entry has been successfully UnFlagged");
			} else {
				logger.info("The entry hasn't been successfully UnFlagged");
			}
	    	 
	     }
	    public void clickOnUnFlag()
	     {
	    	 staticWait(2000);
	    	 clickByJavascript(By.xpath("//div/span/a[@id='UnFlag']"),"UnFlag", 30);
	    	 
	     }
	    public void clickOnProject()
	     {
	    	 staticWait(2000);
	    	 clickByJavascript(By.xpath("//td/a[contains(text(),'"+projectName+"')]"),"Project", 30);
	    	 
	     }
	    public void clickOnUpdate()
	     {
	    	 staticWait(2000);
	    	 clickByJavascript(By.xpath("//div/a[@id='btnUpdate']"),"Update Button", 30);
	    	 WebElement upadteTimeEntry = driver.findElement(By.xpath("//div/span[text()='Time Entry Updated Successfully']"));
	    	 if (upadteTimeEntry.isDisplayed()) {
				logger.info("Time Entry Updated Successfully");
			}else {
				logger.info("Time Entry not Updated Successfully");
			}
	    	 
	     }
}
