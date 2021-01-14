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

// http://gurmeet.cloud.testinsights.io/app/#!/module-collection/guid/4be3ad8b-f88b-471e-851d-afe85bb3a805
@TestModellerModule(guid = "4be3ad8b-f88b-471e-851d-afe85bb3a805")
public class nopCommerce_demo_store_Samsung_Series_9_NP900X4C_Premium_Ultrabook extends BasePage
{
	public nopCommerce_demo_store_Samsung_Series_9_NP900X4C_Premium_Ultrabook (WebDriver driver)
	{
		super(driver);
	}


	
	private By xPath_idaddtocartbutton6Elem = By.xpath("//*[@id=\"add-to-cart-button-6\"]");

	private By shopping_cartElem = By.xpath("//P[@class='content']/A");


	
	public void GoToUrl()
	{
		m_Driver.get("https://demo.nopcommerce.com/samsung-series-9-np900x4c-premium-ultrabook");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://demo.nopcommerce.com/samsung-series-9-np900x4c-premium-ultrabook");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://demo.nopcommerce.com/samsung-series-9-np900x4c-premium-ultrabook");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://demo.nopcommerce.com/samsung-series-9-np900x4c-premium-ultrabook";

        if (!currentUrl.equals("https://demo.nopcommerce.com/samsung-series-9-np900x4c-premium-ultrabook")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click xPath: '//*[@id="add-to-cart-button-6"]'
     * @name Click xPath: '//*[@id="add-to-cart-button-6"]'
     */
	public void Click_xPath_idaddtocartbutton6()
	{
        
		WebElement elem = getWebElement(xPath_idaddtocartbutton6Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_idaddtocartbutton6", "Click_xPath_idaddtocartbutton6 failed. Unable to locate object: " + xPath_idaddtocartbutton6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_idaddtocartbutton6", "Click_xPath_idaddtocartbutton6 failed. Unable to locate object: " + xPath_idaddtocartbutton6Elem.toString());

			Assert.fail("Unable to locate object: " + xPath_idaddtocartbutton6Elem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_xPath_idaddtocartbutton6");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_idaddtocartbutton6");
	}
     
	/**
 	 * Click shopping cart
     * @name Click shopping cart
     */
	public void Click_shopping_cart()
	{
        
		WebElement elem = getWebElement(shopping_cartElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_shopping_cart", "Click_shopping_cart failed. Unable to locate object: " + shopping_cartElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_shopping_cart", "Click_shopping_cart failed. Unable to locate object: " + shopping_cartElem.toString());

			Assert.fail("Unable to locate object: " + shopping_cartElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_shopping_cart");

		TestModellerLogger.PassStep(m_Driver, "Click_shopping_cart");
	}}