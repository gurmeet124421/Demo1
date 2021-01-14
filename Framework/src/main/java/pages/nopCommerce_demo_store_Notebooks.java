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

// http://gurmeet.cloud.testinsights.io/app/#!/module-collection/guid/a38c0b0c-9997-44b0-87d9-a7ca3ad8268a
@TestModellerModule(guid = "a38c0b0c-9997-44b0-87d9-a7ca3ad8268a")
public class nopCommerce_demo_store_Notebooks extends BasePage
{
	public nopCommerce_demo_store_Notebooks (WebDriver driver)
	{
		super(driver);
	}


	
	private By Samsung_Series_9_NP900X4C_Premium_UltrabookElem = By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[6]/div/div[2]/h2/a");


	
	public void GoToUrl()
	{
		m_Driver.get("https://demo.nopcommerce.com/notebooks");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://demo.nopcommerce.com/notebooks");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://demo.nopcommerce.com/notebooks");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://demo.nopcommerce.com/notebooks";

        if (!currentUrl.equals("https://demo.nopcommerce.com/notebooks")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Samsung Series 9 NP900X4C Premium Ultrabook
     * @name Click Samsung Series 9 NP900X4C Premium Ultrabook
     */
	public void Click_Samsung_Series_9_NP900X4C_Premium_Ultrabook()
	{
        
		WebElement elem = getWebElement(Samsung_Series_9_NP900X4C_Premium_UltrabookElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Samsung_Series_9_NP900X4C_Premium_Ultrabook", "Click_Samsung_Series_9_NP900X4C_Premium_Ultrabook failed. Unable to locate object: " + Samsung_Series_9_NP900X4C_Premium_UltrabookElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Samsung_Series_9_NP900X4C_Premium_Ultrabook", "Click_Samsung_Series_9_NP900X4C_Premium_Ultrabook failed. Unable to locate object: " + Samsung_Series_9_NP900X4C_Premium_UltrabookElem.toString());

			Assert.fail("Unable to locate object: " + Samsung_Series_9_NP900X4C_Premium_UltrabookElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Samsung_Series_9_NP900X4C_Premium_Ultrabook");

		TestModellerLogger.PassStep(m_Driver, "Click_Samsung_Series_9_NP900X4C_Premium_Ultrabook");
	}}