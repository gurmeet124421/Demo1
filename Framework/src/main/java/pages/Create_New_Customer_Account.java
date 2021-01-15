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

// http://gurmeet.cloud.testinsights.io/app/#!/module-collection/guid/4bde4133-3fc6-45b7-8462-32a26d037758
@TestModellerModule(guid = "4bde4133-3fc6-45b7-8462-32a26d037758")
public class Create_New_Customer_Account extends BasePage
{
	public Create_New_Customer_Account (WebDriver driver)
	{
		super(driver);
	}


	
	private By First_NameElem = By.xpath("//INPUT[@id='firstname']");

	private By Last_NameElem = By.xpath("//INPUT[@id='lastname']");

	private By EmailElem = By.xpath("//INPUT[@id='email_address']");

	private By PasswordElem = By.xpath("//INPUT[@id='password']");

	private By Confirm_PasswordElem = By.xpath("//INPUT[@name='password_confirmation']");

	private By Create_an_AccountElem = By.xpath("//SPAN[@style='background-color: red !important;']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://magento.nublue.co.uk/customer/account/create/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://magento.nublue.co.uk/customer/account/create/");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://magento.nublue.co.uk/customer/account/create/");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://magento.nublue.co.uk/customer/account/create/";

        if (!currentUrl.equals("https://magento.nublue.co.uk/customer/account/create/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter First Name
     * @name Enter First Name
     */
 	public void Enter_First_Name(String First_Name)
 	{
 	    
 		WebElement elem = getWebElement(First_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_First_Name", "Enter_First_Name failed. Unable to locate object: " + First_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_First_Name", "Enter_First_Name failed. Unable to locate object: " + First_NameElem.toString());

 			Assert.fail("Unable to locate object: " + First_NameElem.toString());
         }

 		elem.sendKeys(First_Name);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_First_Name " + First_Name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_First_Name " + First_Name);
 	}
      
	/**
 	 * Enter Last Name
     * @name Enter Last Name
     */
 	public void Enter_Last_Name(String Last_Name)
 	{
 	    
 		WebElement elem = getWebElement(Last_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Last_Name", "Enter_Last_Name failed. Unable to locate object: " + Last_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Last_Name", "Enter_Last_Name failed. Unable to locate object: " + Last_NameElem.toString());

 			Assert.fail("Unable to locate object: " + Last_NameElem.toString());
         }

 		elem.sendKeys(Last_Name);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Last_Name " + Last_Name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Last_Name " + Last_Name);
 	}
      
	/**
 	 * Enter Email
     * @name Enter Email
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
 	 * Enter Password
     * @name Enter Password
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
 	 * Enter Confirm Password
     * @name Enter Confirm Password
     */
 	public void Enter_Confirm_Password(String Confirm_Password)
 	{
 	    
 		WebElement elem = getWebElement(Confirm_PasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Confirm_Password", "Enter_Confirm_Password failed. Unable to locate object: " + Confirm_PasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Confirm_Password", "Enter_Confirm_Password failed. Unable to locate object: " + Confirm_PasswordElem.toString());

 			Assert.fail("Unable to locate object: " + Confirm_PasswordElem.toString());
         }

 		elem.sendKeys(Confirm_Password);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Confirm_Password " + Confirm_Password);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Confirm_Password " + Confirm_Password);
 	}
     
	/**
 	 * Click Create an Account
     * @name Click Create an Account
     */
	public void Click_Create_an_Account()
	{
        
		WebElement elem = getWebElement(Create_an_AccountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Create_an_Account", "Click_Create_an_Account failed. Unable to locate object: " + Create_an_AccountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Create_an_Account", "Click_Create_an_Account failed. Unable to locate object: " + Create_an_AccountElem.toString());

			Assert.fail("Unable to locate object: " + Create_an_AccountElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Create_an_Account");

		TestModellerLogger.PassStep(m_Driver, "Click_Create_an_Account");
	}}