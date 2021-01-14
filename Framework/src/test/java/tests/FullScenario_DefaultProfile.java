package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//http://gurmeet.cloud.testinsights.io/app/#!/model-engine/guid/3eee4ca2-9e09-4aa1-b5f5-f3c4d4228cc1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 54, profileId = 100012)
public class FullScenario_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Full_Scenario","Full_Scenario - Default Profile"})
    @TestModellerPath(guid = "a4a03bb5-69ee-40dc-8b3d-1dd9d9d2a9fd")
    public void GoToUrlPositiveEnterEmailPositiveEnterPasswordClickLoginGoToUrlClickSamsungSeries9NP900X4CPrem1()
    {
        
        pages.nopCommerce_demo_store_Login _nopCommerce_demo_store_Login = new pages.nopCommerce_demo_store_Login(driver);
    TestModellerLogger.SetLastNodeGuid("7aec66de-bf2d-42ee-8b3d-ceaa74c8bcc4");
    _nopCommerce_demo_store_Login.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("505b0929-d5bc-47d7-a61c-0d196bd205c7");
    _nopCommerce_demo_store_Login.Enter_Email("gurmeet.124421@gmail.com");

    TestModellerLogger.SetLastNodeGuid("407a3a5f-15c9-4b18-8e31-c5adfc9d4aac");
    _nopCommerce_demo_store_Login.Enter_Password("gurmeet@12");

    TestModellerLogger.SetLastNodeGuid("b9b1897b-e90d-4e97-8609-98a26eedb926");
    _nopCommerce_demo_store_Login.Click_Log_in();

pages.nopCommerce_demo_store_Notebooks _nopCommerce_demo_store_Notebooks = new pages.nopCommerce_demo_store_Notebooks(driver);
    TestModellerLogger.SetLastNodeGuid("ff8857ea-20ab-4ba4-b421-29e603296a72");
    _nopCommerce_demo_store_Notebooks.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("6b6e795d-4da7-4093-9710-c2253def1abc");
    _nopCommerce_demo_store_Notebooks.Click_Samsung_Series_9_NP900X4C_Premium_Ultrabook();

pages.nopCommerce_demo_store_Samsung_Series_9_NP900X4C_Premium_Ultrabook _nopCommerce_demo_store_Samsung_Series_9_NP900X4C_Premium_Ultrabook = new pages.nopCommerce_demo_store_Samsung_Series_9_NP900X4C_Premium_Ultrabook(driver);
    TestModellerLogger.SetLastNodeGuid("285756d1-947b-46b8-bf8f-a42f6f9eede9");
    _nopCommerce_demo_store_Samsung_Series_9_NP900X4C_Premium_Ultrabook.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("d4c05e4a-49df-4321-81ac-44b8dbd36eda");
    _nopCommerce_demo_store_Samsung_Series_9_NP900X4C_Premium_Ultrabook.Click_xPath_idaddtocartbutton6();

    TestModellerLogger.SetLastNodeGuid("7885e057-1054-4c14-b2a7-ad2e08a4e785");
    _nopCommerce_demo_store_Samsung_Series_9_NP900X4C_Premium_Ultrabook.Click_shopping_cart();

pages.nopCommerce_demo_store_Shopping_Cart _nopCommerce_demo_store_Shopping_Cart = new pages.nopCommerce_demo_store_Shopping_Cart(driver);
    TestModellerLogger.SetLastNodeGuid("1ee2626f-e4bb-4817-848f-d459df14bcf1");
    _nopCommerce_demo_store_Shopping_Cart.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("5b7cf223-28cb-4c80-b7cb-088a84315027");
    _nopCommerce_demo_store_Shopping_Cart.Click_I_agree_with_the_terms_of_service_and_I_adhere_to_them_unconditionally();

    TestModellerLogger.SetLastNodeGuid("9ce06805-bc85-4ead-b051-ec767394dc8c");
    _nopCommerce_demo_store_Shopping_Cart.Click__Checkout_();

    }


    @Test  (groups= {"Full_Scenario","Full_Scenario - Default Profile"})
    @TestModellerPath(guid = "32ed30a7-696a-47e7-8c94-5caf6ca94a95")
    public void GoToUrlPositiveEnterEmailNegativeEnterPassword2()
    {
        
        pages.nopCommerce_demo_store_Login _nopCommerce_demo_store_Login = new pages.nopCommerce_demo_store_Login(driver);
    TestModellerLogger.SetLastNodeGuid("7aec66de-bf2d-42ee-8b3d-ceaa74c8bcc4");
    _nopCommerce_demo_store_Login.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("505b0929-d5bc-47d7-a61c-0d196bd205c7");
    _nopCommerce_demo_store_Login.Enter_Email("Data");

    TestModellerLogger.SetLastNodeGuid("b70059c1-fcef-495a-84f2-6863f65948e9");
    _nopCommerce_demo_store_Login.Enter_Password("#!_ @");

    }


}