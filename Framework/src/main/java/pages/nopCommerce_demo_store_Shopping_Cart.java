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

// http://gurmeet.cloud.testinsights.io/app/#!/module-collection/guid/0220c906-5fb7-4e48-8df1-3a08c57e31bc
@TestModellerModule(guid = "0220c906-5fb7-4e48-8df1-3a08c57e31bc")
public class nopCommerce_demo_store_Shopping_Cart extends BasePage
{
	public nopCommerce_demo_store_Shopping_Cart (WebDriver driver)
	{
		super(driver);
	}


	
	private By I_agree_with_the_terms_of_service_and_I_adhere_to_them_unconditionallyElem = By.xpath("//*[@id=\"termsofservice\"]");

	private By _Checkout_Elem = By.xpath("//*[@id=\"checkout\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://demo.nopcommerce.com/cart");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://demo.nopcommerce.com/cart");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://demo.nopcommerce.com/cart");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://demo.nopcommerce.com/cart";

        if (!currentUrl.equals("https://demo.nopcommerce.com/cart")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click I agree with the terms of service and I adhere to them unconditionally
     * @name Click I agree with the terms of service and I adhere to them unconditionally
     */
	public void Click_I_agree_with_the_terms_of_service_and_I_adhere_to_them_unconditionally()
	{
        
		WebElement elem = getWebElement(I_agree_with_the_terms_of_service_and_I_adhere_to_them_unconditionallyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_I_agree_with_the_terms_of_service_and_I_adhere_to_them_unconditionally", "Click_I_agree_with_the_terms_of_service_and_I_adhere_to_them_unconditionally failed. Unable to locate object: " + I_agree_with_the_terms_of_service_and_I_adhere_to_them_unconditionallyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_I_agree_with_the_terms_of_service_and_I_adhere_to_them_unconditionally", "Click_I_agree_with_the_terms_of_service_and_I_adhere_to_them_unconditionally failed. Unable to locate object: " + I_agree_with_the_terms_of_service_and_I_adhere_to_them_unconditionallyElem.toString());

			Assert.fail("Unable to locate object: " + I_agree_with_the_terms_of_service_and_I_adhere_to_them_unconditionallyElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_I_agree_with_the_terms_of_service_and_I_adhere_to_them_unconditionally");

		TestModellerLogger.PassStep(m_Driver, "Click_I_agree_with_the_terms_of_service_and_I_adhere_to_them_unconditionally");
	}
     
	/**
 	 * Click  Checkout 
     * @name Click  Checkout 
     */
	public void Click__Checkout_()
	{
        
		WebElement elem = getWebElement(_Checkout_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Checkout_", "Click__Checkout_ failed. Unable to locate object: " + _Checkout_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Checkout_", "Click__Checkout_ failed. Unable to locate object: " + _Checkout_Elem.toString());

			Assert.fail("Unable to locate object: " + _Checkout_Elem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click__Checkout_");

		TestModellerLogger.PassStep(m_Driver, "Click__Checkout_");
	}}