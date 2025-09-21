package practical.pom.tests;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import practical.pom.pages.BasePage;
import practical.pom.pages.DressResultPage;
import practical.pom.pages.EbayHomePage;
import practical.pom.pages.MobileResultPage;
import reporter.ExtentReportManager;
import testng.listners.EbayListener;

@Listeners(EbayListener.class)
public class EbayTest extends BaseTest {


    @Test
    public void searchMobilePhoneTest() throws InterruptedException {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        EbayHomePage ebayHomePage = basePage.initApp();
        ExtentReportManager.infoStepPass("Successfully open Ebay home page");
        Thread.sleep(1000);
        ebayHomePage.typeOnSearchField("mobile phones");
        ExtentReportManager.infoStepPass("Type on search field");
        ebayHomePage.selectCategory(" Cell Phones & Accessories");
        ExtentReportManager.infoStepPass("Select category");
        Thread.sleep(1000);
        MobileResultPage mobileResultPage = ebayHomePage.clickOnSearchButton();
        ExtentReportManager.infoStepPass("Click on search button");
        Thread.sleep(1000);
        mobileResultPage.clickAppleCheckBox();
        ExtentReportManager.infoStepPass("Click on apple checkbox");
    }

    @Test
    public void searchDressTest() throws InterruptedException {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        EbayHomePage ebayHomePage = basePage.initApp();
        Thread.sleep(1000);
        ebayHomePage.typeOnSearchField("dresses");
        ebayHomePage.selectCategory(" Clothing, Shoes & Accessories");
        Thread.sleep(1000);
        DressResultPage dressResultPage = ebayHomePage.clickOnSearchButton();
        Thread.sleep(1000);
        dressResultPage.clickOnShortCheckBox();

    }
}
