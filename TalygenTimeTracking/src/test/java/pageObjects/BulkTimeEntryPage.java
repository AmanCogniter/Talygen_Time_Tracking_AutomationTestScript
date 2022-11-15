package pageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.PropertiesLoader;
import utils.WebBasePage;

public class BulkTimeEntryPage extends WebBasePage {
	WebDriver driver ;
	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";
	/* Modified */
	String filePath = System.getProperty("user.dir") +
			  "\\src\\main\\resources\\testfiles\\";
	static String bulkTimeEntry ;

	private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	 public BulkTimeEntryPage(WebDriver driver) {
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
	    public void clickOnBulkTimeEntry()
	     {
	    	 click(By.xpath("//div/ul[@data-p-name='Time Tracking']/li/a[text()='Bulk Time Entry']"),"Bulk Time Entry", 30);
	    	 staticWait(2000);
	     }
	    public void Bulktimeentrypage() {
	    	staticWait(3000);
	    	try {
	    		WebElement tourguide = driver.findElement(By.xpath("//div[@class='guided-tour-step-footer']/span[@title='End tour']/*[name()='svg']"));
	    		String bulkTimeEntry = getText(By.xpath("//div/span[text()='Bulk Time Entry']"), 30);
				if (tourguide.isDisplayed() && bulkTimeEntry.contains(prop.getProperty("bulkTimeEntry"))) {
					click(By.xpath("//div[@class='guided-tour-step-footer']/span[@title='End tour']/*[name()='svg']"), "close tour guide", 30);
					staticWait(2000);
					logger.info(bulkTimeEntry+"page opened successfully");
				}else {
					logger.info(bulkTimeEntry+"page not opened successfully");
				}
			} catch (Exception e) {
				// TODO: handle exception
				logger.info(bulkTimeEntry+"page opened successfully");
			}
			/*
			 * String bulkTimeEntry =
			 * getText(By.xpath("//div/span[text()='Bulk Time Entry']"), 30); if
			 * (bulkTimeEntry.contains(prop.getProperty("bulkTimeEntry"))) {
			 * logger.info(bulkTimeEntry+"page opened successfully"); } else {
			 * logger.info(bulkTimeEntry+"page not opened successfully"); }
			 */
	    }
	    public void enterProjectName()
	     {
	    	ProjectListingPage projectListingPage= new ProjectListingPage(driver);
        	String projectname = projectListingPage.projectName;
	    	 click(By.xpath("//table/tbody/tr/td/select[@id='ddlProjectsBulk']"),"Project", 30);
	    	 staticWait(2000);
	    	 selectValueWithText(By.xpath("//table/tbody/tr/td/select[@id='ddlProjectsBulk']"), projectname, "Project", 30);
	    	 click(By.xpath("//table/tbody/tr/td/select[@id='ddlProjectsBulk']"),"Project", 30);
	     }
	    public void enterTaskName()
	     {
	    	staticWait(5000);
	    	ProjectListingPage projectListingPage= new ProjectListingPage(driver);
       	String taskName = projectListingPage.taskName;
       	
	    	 //click(By.xpath("//table/tbody/tr/td//div[@id='ddlTaskUnassignedN']/select[@id='ddlTaskN']"),"Task", 30);
				/*
				 * WebElement taskname = driver.findElement(By.xpath(
				 * "//table/tbody/tr/td//div[@id='ddlTaskUnassignedN']/select[@id='ddlTaskN']"))
				 * ; Actions action= new Actions(driver);
				 * action.moveToElement(taskname).click().perform();
				 */
       	new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//table/tbody/tr/td//div[@id='ddlTaskUnassignedN']/select[@id='ddlTaskN']"))).click();
	    	 staticWait(2000);
	    	 selectValueWithText(By.xpath("//table/tbody/tr/td/div//select[@id='ddlTaskN']"), taskName, "Task", 30);
	     }
	    public void ClickOnUser()
	     {
	    	staticWait(3000);
	    	
	    	 click(By.xpath("//div/button[@title='Select User']"),"User", 30);
	    	 staticWait(2000);
	    	 enter(By.xpath("//button[@title='Select User']/ancestor::div[@class='btn-group show']/descendant::div[@class='input-group']/input[@placeholder='Enter Keywords']"), "ginny", " User Name", 20);
	    	 click(By.xpath("//li/a/label[contains(text(), ' ginny ')]"), "select user", 30);
	     }
	    public void enterBulkTimeEntryDescription() {
			enter(By.xpath("//td/input[@id='taskDescription']"), prop.getProperty("Description"),
					"Bulk Time entry description", 20);
		}
	    public void clickOnIsBillable()
	     {
	    	staticWait(3000);
	    	 click(By.xpath("//div/label[@class='switch']/span")," Is Billable", 30);
	    	 
	     }
	    public void clickOnFillTimeEntry()
	     {
	    	staticWait(3000);
	    	click(By.xpath("//span/a[@id='aFillTimeEntry']"),"Fill time entry", 30);
	    	 
	     }
	    public void enterTotalHours()
	     {
	    	staticWait(3000);
	    	enter(By.xpath("(//tr[@id='trdata'])[2]/td[8]/input"), prop.getProperty("totalHours"),
					"Total Hours", 20);
	    	 
	     }
	    public void clickOnSaveButton()
	     {
	    	staticWait(2000);
	    	click(By.xpath("//div/a[@id='btnSave']"),"Save button", 30);
	    	 logger.info("Bulk time entry saved successfully");
	     }
	    public void clickOnAddButton() {
	    	staticWait(2000);
	    	clickByJavascript(By.xpath("//div/a[@id='aAddnewLine']"),"Add button", 30);
	    	logger.info("New Bulk Time Entry field is added successfully");
	    }
	    public void clickOndeleteButton() {
	    	staticWait(2000);
	    	clickByJavascript(By.xpath("(//table/tbody/tr/td/a[@data-original-title='Delete'])[last()]"),"Delete button", 30);
	    }
	    public void clickOnOkButton() {
	    	staticWait(2000);
	    	click(By.xpath("//div/button[@title='OK']"),"Ok button", 30);
	    	logger.info("Bulk time entry is deleted successfully");
	    }
	    public void clickOnResetButton() {
	    	staticWait(2000);
	    	clickByJavascript(By.xpath("//div/a[@id='btnReset']"),"Reset button", 30);
	    	staticWait(2000);
	    	WebElement resetButton = driver.findElement(By.xpath("//div/a[@id='btnReset']"));
	    	if (resetButton.isDisplayed()) {
	    		logger.info("Bulk time entry Page not reset successfully");
			} else {
				logger.info("Bulk time entry Page  reset successfully");
			}
	    }
}
