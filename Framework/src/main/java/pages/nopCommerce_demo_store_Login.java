package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;

import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://gurmeet.cloud.testinsights.io/app/#!/module-collection/guid/22920258-0859-4651-8bac-b6423e41fe16
@TestModellerModule(guid = "22920258-0859-4651-8bac-b6423e41fe16")
public class nopCommerce_demo_store_Login extends BasePage
{
	public nopCommerce_demo_store_Login (WebDriver driver)
	{
		super(driver);
	}


	
	private By EmailElem = By.xpath("//*[@id=\"Email\"]");

	private By PasswordElem = By.xpath("//*[@id=\"Password\"]");

	private By Log_inElem = By.xpath("//INPUT[@value='Log in']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://demo.nopcommerce.com/login?returnUrl=%2F");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://demo.nopcommerce.com/login?returnUrl=%2F");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        if (!currentUrl.equals("https://demo.nopcommerce.com/login?returnUrl=%2F")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter Email:
     * @name Enter Email:
     */
 	public void Enter_Email(String Email)
 	{
 	    
 		WebElement elem = getWebElement(EmailElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Email", "Enter_Email failed. Unable to locate object: " + EmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Email", "Enter_Email failed. Unable to locate object: " + EmailElem.toString());

 			Assert.fail("Unable to locate object: " + EmailElem.toString());
         }

 		elem.sendKeys(Email);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Email " + Email);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Email " + Email);
 	}
      
	/**
 	 * Enter Password:
     * @name Enter Password:
     */
 	public void Enter_Password(String Password)
 	{
 	    
 		WebElement elem = getWebElement(PasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

 			Assert.fail("Unable to locate object: " + PasswordElem.toString());
         }

 		elem.sendKeys(Password);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Password " + Password);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Password " + Password);
 	}
     
	/**
 	 * Click Log in
     * @name Click Log in
     */
	public void Click_Log_in()
	{
        
		WebElement elem = getWebElement(Log_inElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Log_in", "Click_Log_in failed. Unable to locate object: " + Log_inElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Log_in", "Click_Log_in failed. Unable to locate object: " + Log_inElem.toString());

			Assert.fail("Unable to locate object: " + Log_inElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Log_in");

		TestModellerLogger.PassStep(m_Driver, "Click_Log_in");
	}}