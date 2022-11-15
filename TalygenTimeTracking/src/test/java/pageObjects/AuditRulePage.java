package pageObjects;

import static reporting.ComplexReportFactory.getTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import utils.PropertiesLoader;
import utils.WebBasePage;

public class AuditRulePage extends WebBasePage {
	WebDriver driver ;
	String pattern = "yyMMddHHmmss";
	Date date = new Date();
	SimpleDateFormat dateformat = new SimpleDateFormat(pattern);

	String datevalue = dateformat.format(date);
	static CompanySetupUserPage companySetupUserPage;
	static String auditRule;

	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";
	/* Modified */
	String filePath = System.getProperty("user.dir") +
			  "\\src\\main\\resources\\testfiles\\";

	private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	 public AuditRulePage(WebDriver driver) {
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
	    public void clickOnAuditRule()
	     {
	    	 click(By.xpath("//div/ul/li/a[@data-original-title='Audit Rule']"),"Audit Rule", 30);
	    	 staticWait(2000);
	     }
	    public void clickOnAddNewAuditRule()
	     {
	    	 click(By.xpath("//span/a[@data-original-title='Add New Rule']"),"Add New Audit Rule", 30);
	    	 staticWait(2000);
	     }
	    public void clickOnSaveButton()
	     {
	    	 click(By.xpath("//div/a[@id='btnSave']"),"Save Button", 30);
	    	 staticWait(2000);
	     }
	    public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[@class='invalid-feedback']"), 45);
			String[] expectedValue = { "Rule Name","User" };
			for (Object expected : expectedValue) {
				/*
				 * WebElement AsteriskField = findElementVisibility(By.xpath("//label[text()='"+ expected + ":']"), 45);
				 */
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[text()='*']"), 45);
				if (AsteriskField != null) {
					getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
					logger.info("The Asterisk symbol is displayed for " + expected + " field");
				} else {
					getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
					logger.info("The Asterisk symbol is not displayed for " + expected + " field");
					takeScreenshot(expected.toString());
				}

				List<WebElement> expectedElements = errorMessageLocator;
				for (WebElement element : expectedElements) {
					i++;
					actualText = element.getText();
					expectedText = expected.toString();

					if (actualText.indexOf(expectedText) != -1) {
						getTest().log(LogStatus.PASS,
								"Error message for \"" + expected + "\" field is displayed as expected");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						i = 0;
						break;
					} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
						getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						takeScreenshot(expectedText);
					}
				}

			}
			
			
		}
	    public void enterAuditRuleName()
	     {
	    	auditRule = prop.getProperty("auditRuleName")+datevalue;
	    	 enter(By.xpath("//tg-input/input[@name='AuditRuleName']"),auditRule, "Audit Rule Name", 30);
	    	 staticWait(2000);
	     }
	    public void ClickOnUser()
	     {
	    	String userName = companySetupUserPage.enterlastname;
	    	staticWait(3000);
	    	
	    	 click(By.xpath("//div/button[@title='Select']"),"User", 30);
	    	 staticWait(2000);
	    	 enter(By.xpath("//button[@title='Select']/ancestor::div[@class='btn-group show']/descendant::div[@class='input-group']/input[@placeholder='Enter Keywords']"), userName, " User Name", 20);
	    	 staticWait(2000);
	    	 click(By.xpath("//li/a/label[contains(text(), '"+userName+"')]"), "select user", 30);
	     }
	    public void selectAuditor()
	     {
	    	staticWait(3000);
	    	
	    	 click(By.xpath("//div/button[@title='Select']"),"Auditors", 30);
	    	 staticWait(2000);
	    	 enter(By.xpath("//button[@title='Select']/ancestor::div[@class='btn-group show']/descendant::div[@class='input-group']/input[@placeholder='Enter Keywords']"), "ginny", " User Name", 20);
	    	 click(By.xpath("//li/a/label[contains(text(), ' ginny . (Human Resource)')]"), "select Auditors", 30);
	     }
	    public void ClickOnPrimaryAuditor()
	     {
	    	staticWait(3000);
	    	WebElement primaryAuditor = driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']/label"));
	    	Actions action= new Actions(driver);
	    	//action.moveToElement(primaryAuditor).click().perform();
	    	action.doubleClick(primaryAuditor).perform();
	    	logger.info("Primary auditor clicked");
	    	
	    	 //click(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']/label"),"Primary auditor", 30);
	    	 
	     }
	    public void selectStatus()
	     {
	    	
	    	 selectValueWithText(By.xpath("//div/tg-select/select[@id='StatusId']"),"Active", "Status", 30);
	    	 staticWait(2000);
	     }
	    public void enterDescription()
	     {
	    	
	    	 enter(By.xpath("//div/tg-textarea/textarea[@id='AuditDescription']"),prop.getProperty("Description"), "Description", 30);
	    	 staticWait(2000);
	     }
	    public void selectRuleTypeWithAuditTimeSheet()
	     {
	    	
	    	 selectValueWithText(By.xpath("//div/select[@id='ddlRuleType']"),"Audit Time Sheet/Time Entries", "Rule type with Audit Time Sheet/Time Entries", 30);
	    	 staticWait(2000);
	     }
	    public void selectRuleTypeWithCheckin()
	     {
	    	 staticWait(3000);
	    	
	    	 selectValueWithText(By.xpath("//div/select[@id='ddlRuleType']"),"Checkin/CheckOut Entries", "Rule type with Checkin/CheckOut Entries", 30);
	    	 
	     }
	    public void selectMaxTimeTrackingHoursLimitperday()
	     {
	    	staticWait(3000);
	    	 selectValueWithText(By.xpath("(//div[@class='form-group']/select[@class='form-control'])[3]"),"Is Equal To", "Max time tracking hours limit per day is ", 30);
	    	
	     }
	    public void enterMaxTimeTrackingHoursLimitperday()
	     {
	    	staticWait(3000);
	    	 enter(By.xpath("//div/input[@data-defination-id='1']"),prop.getProperty("Time"), "Hours", 30);
	    	
	     }
	    public void selectTimeTrackingIsMoreThanTheAllowedProjectLimit ()
	     {
	    	staticWait(3000);
	    	 selectValueWithText(By.xpath("//label[text()='If time tracking is more than the allowed project limit is']/ancestor::div[@class='form-group']/descendant::div/select"),"Is Equal To", "If time tracking is more than the allowed project limit is", 30);
	  
	     }
	    public void enterTimeTrackingIsMoreThanTheAllowedProjectLimit()
	     {
	    	staticWait(3000);
	    	 enter(By.xpath("//div/input[@data-defination-id='2']"),prop.getProperty("Time"), "Hours", 30);
	    	 
	     }
	    public void selectTimeEntryAllowedPerDay()
	     {
	    	staticWait(5000);
	    	 selectValueWithText(By.xpath("//label[text()='How many time entries are allowed per day is']/ancestor::div[@class='form-group']/descendant::div/select"),"Is Equal To", "Time Entry Allowed Per Day", 30);
	    	
	     }
	    public void enterNumberOfTimeEntry()
	     {
	    	staticWait(3000);
	    	 enter(By.xpath("//div/input[@placeholder='Number Of Entries']"),prop.getProperty("numberOfTimeEntry"), "Number Of time entry", 30);
	  
	     }
	    public void enterMaxhourLimitInWeek()
	     {
	    	staticWait(3000);
	    	 enter(By.xpath("//div/input[@class='form-control MaxHourLimit']"),prop.getProperty("maxhourLimitInWeek"), "Max hour Limit In Week", 30);
	    	
	     }
	    public void clickOnSearchFieldRuleName() {
	    	staticWait(3000);
	    	
	    	 click(By.xpath("//h5//span[@id='ruleName']"),"Rule Name", 30);
	    }
	    public void enterRuleNameIntoSearchField() {
	    	staticWait(3000);
	    	
	    	 enter(By.xpath("//div//input[@id='txtAuditName']"),auditRule, "Rule Name", 30);
	    }
	    public void clickOnSearchButton() {
	    	staticWait(2000);
	    	clickByJavascript(By.xpath("//span/a[@id='Go']"),"Rule Name", 30);
	    }
	    public void validateAuditRuleName() {
	    	staticWait(3000);
	    	//String auditRuleName = getText(By.xpath("//table/tbody/tr/td/a/span[text()='"+auditRule+"']"), 30);
	    	WebElement auditRuleName = driver.findElement(By.xpath("//table/tbody/tr/td/a/span[contains(text(),'"+auditRule+"')]"));
	    	if (auditRuleName.isDisplayed()) {
				logger.info(auditRuleName+"is successfully added");
			} else {
				logger.info(auditRuleName+"is not  added successfully");
			}
	    }
	    public void clickOnCheckBox() {
	    	staticWait(3000);
	    	
	    	 click(By.xpath("//table[@id='tblAudit']/thead/tr/th/div[@class='custom-control custom-checkbox']"),"CheckBox", 30);
	    }
	    public void clickOnRemoveButton() {
	    	staticWait(2000);
	    	clickByJavascript(By.xpath("//div/span/a[@id='DeleteMultiple']"),"Remove Button", 30);
	    }
	    public void clickOnOkButton() {
	    	staticWait(3000);
	    	
	    	 click(By.xpath("//button[@title='OK']"),"Ok Button", 30);
	    	 String notifyMessage = driver.findElement(By.xpath("//div/span[contains(text(),'Audit Rule has')]")).getText();
	    	 if (notifyMessage.contains(prop.getProperty("AuditnotifyMessage"))) {
	    		 logger.info(notifyMessage);
				
			}else {
				 logger.info("Audit Rule hasn't been successfully deleted.");
			}
	    }
	    public void clickOnAuditRuleName() {
	    	staticWait(3000);
	    	
	    	 click(By.xpath("//table/tbody/tr/td/a/span[contains(text(),'"+auditRule+"')]"),"Audit Rule Name", 30);
	    }
	    public void clickOnAuditSaveButton() {
	    	staticWait(2000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    	clickByJavascript(By.xpath("//div/a[@id='btnSave']"),"Save Button", 30);
	    	String updateAuditnotifyMessage = driver.findElement(By.xpath("//div/span[contains(text(),'Audit Rule has')]")).getText();
	    
	    if (updateAuditnotifyMessage.contains(prop.getProperty("AuditupdateNotifyMessage"))) {
   		 logger.info(updateAuditnotifyMessage);
			
		}else {
			 logger.info("Audit Rule hasn't been successfully updated.");
		}
	    }
}
