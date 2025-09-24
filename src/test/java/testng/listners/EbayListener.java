package testng.listners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import practical.pom.utils.BrowserFactory;
import reporter.ExtentReportManager;

public class EbayListener implements ITestListener {

    public void onTestStart(ITestResult testResult) {
        ExtentReportManager.createTest(testResult.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult testResult) {
        ExtentReportManager.logPass(testResult.getMethod().getMethodName()+"Passed");
    }

    public void onTestFailure(ITestResult testResult) {
       // ExtentReportManager.logFail(testResult.getMethod().getMethodName()+"Failed");
        WebDriver driver = BrowserFactory.getBrowserFactory().getWebDriver();
        String screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
        ExtentReportManager.logFailWithScreenshot("Test Failed", screenshot);
    }

    public void onTestSkipped(ITestResult testResult) {
        ExtentReportManager.logSkip(testResult.getMethod().getMethodName()+"Skipped");
    }

    public void onStart(ITestContext testContext) {
        ExtentReportManager.initReport();
    }

    public void onFinish(ITestContext testContext) {
        ExtentReportManager.flushReport();
    }

}
