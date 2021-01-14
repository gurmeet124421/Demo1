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

// http://gurmeet.cloud.testinsights.io/app/#!/module-collection/guid/84e75c6d-b82a-4888-8be6-aa8da4c22425
@TestModellerModule(guid = "84e75c6d-b82a-4888-8be6-aa8da4c22425")
public class nopCommerce_demo_store extends BasePage
{
	public nopCommerce_demo_store (WebDriver driver)
	{
		super(driver);
	}


	
	private By Computers_Elem = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");

	private By Notebooks_Elem = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a");


	
	public void GoToUrl()
	{
		m_Driver.get("https://demo.nopcommerce.com/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://demo.nopcommerce.com/");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://demo.nopcommerce.com/");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://demo.nopcommerce.com/";

        if (!currentUrl.equals("https://demo.nopcommerce.com/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Computers 
     * @name Click Computers 
     */
	public void Click_Computers_()
	{
        
		WebElement elem = getWebElement(Computers_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Computers_", "Click_Computers_ failed. Unable to locate object: " + Computers_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Computers_", "Click_Computers_ failed. Unable to locate object: " + Computers_Elem.toString());

			Assert.fail("Unable to locate object: " + Computers_Elem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Computers_");

		TestModellerLogger.PassStep(m_Driver, "Click_Computers_");
	}
     
	/**
 	 * Click Notebooks 
     * @name Click Notebooks 
     */
	public void Click_Notebooks_()
	{
        
		WebElement elem = getWebElement(Notebooks_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Notebooks_", "Click_Notebooks_ failed. Unable to locate object: " + Notebooks_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Notebooks_", "Click_Notebooks_ failed. Unable to locate object: " + Notebooks_Elem.toString());

			Assert.fail("Unable to locate object: " + Notebooks_Elem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Notebooks_");

		TestModellerLogger.PassStep(m_Driver, "Click_Notebooks_");
	}}