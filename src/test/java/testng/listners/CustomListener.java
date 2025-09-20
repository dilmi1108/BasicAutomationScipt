package testng.listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener{

    public void onTestStart(ITestResult testResult){
        System.out.println("TestStart"+ testResult.getName());
    }
    public void onTestSuccess(ITestResult testResult){
        System.out.println("TestSuccess"+ testResult.getName());
    }
    public void onTestFailure(ITestResult testResult){
        System.out.println("TestFailure"+ testResult.getName());
    }
    public void onTestSkipped(ITestResult testResult){
        System.out.println("TestSkipped"+ testResult.getName());
    }


}
