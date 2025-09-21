package testng.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import reporter.ExtentReportManager;

public class EbayListener implements ITestListener {

    public void onTestStart(ITestResult testResult) {
        ExtentReportManager.createTest(testResult.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult testResult) {
        ExtentReportManager.logPass(testResult.getMethod().getMethodName()+"Passed");
    }

    public void onTestFailure(ITestResult testResult) {
        ExtentReportManager.logFail(testResult.getMethod().getMethodName()+"Failed");
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
