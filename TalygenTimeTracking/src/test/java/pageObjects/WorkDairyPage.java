package pageObjects;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.PropertiesLoader;
import utils.WebBasePage;

public class WorkDairyPage extends WebBasePage {
	WebDriver driver ;
	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";
	/* Modified */
	String filePath = System.getProperty("user.dir") +
			  "\\src\\main\\resources\\testfiles\\";
	static String workDairy;

	private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	 public WorkDairyPage(WebDriver driver) {
			super(driver, "WorkDairyPage");
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
	    public void clickOnWorkDairy()
	     {
	    	 click(By.xpath("//ul[@data-p-name='Time Tracking']/li/a[@data-original-title='Work Diary']"),"Work Dairy", 30);
	    	 staticWait(2000);
	     }
	    public void workdairyPage() {
	    	staticWait(3000);
	    	try {
	    		WebElement tourguide = driver.findElement(By.xpath("//div[@class='guided-tour-step-footer']/span[@title='End tour']/*[name()='svg']"));
	    	     workDairy = getText(By.xpath("//div/span[text()='Work Diary']"), 30);
		    	if (tourguide.isDisplayed() && workDairy.contains(prop.getProperty("workDairy"))) {
		    		click(By.xpath("//div[@class='guided-tour-step-footer']/span[@title='End tour']/*[name()='svg']"), "close tour guide", 30);
		    		logger.info(workDairy+"page opened successfully");
				} else {
					logger.info(workDairy+"page not opened successfully");
				}
			} catch (Exception e) {
				// TODO: handle exception
				logger.info(workDairy+"page opened successfully");
			}
	    	
	    }
	    public void ClickOnToday() {
	    	clickByJavascript(By.xpath("//div/a[text()='Today ']"), "Toady", 30);
	        staticWait(2000);
	    }
	    public void validateScreenShot() {
	    	WebElement screenShot = driver.findElement(By.xpath("//div[@id='divscreenslist']//ul/li/div[@class='card-box screenshot']"));
	    	if (screenShot.isDisplayed()) {
	    		logger.info("ScreenShot is displayed successfully");
			} else {
				logger.info("ScreenShot is not displayed successfully");
			}
	    }
	    public void screenShot() {
	    	List<WebElement> screenShotNumber = driver.findElements(By.xpath("//div[@id='divscreenslist']//ul/li/div[@class='card-box screenshot']//div/img"));
	    	//logger.info(screenShot);
	    	int i=0;
	        for (WebElement Element : screenShotNumber) {
	            i = i+1;
	            //logger.info(Element.getTagName());
	            //logger.info(Element.getText());

	            String link = Element.getAttribute("alt");

	           // logger.info(link);
	        }
	        logger.info("total number of screenshot : " + i);
	    }
}
