package ExtentReportsDemo.MyListeners;

import TestNGDemo.Demo2.Init;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ExtentReportsDemo.ForExtentReports.initExtent;
import static ExtentReportsDemo.ForExtentReports.screenshot;


public class ExtentReportListeners extends Init implements ITestListener {
    ExtentReports extent;
    ExtentTest test;
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");
         test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
        test.pass("This test is passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
        test.info("Thi method is failed");
        test.fail(result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshot/"+screenshot(driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
        test.skip("Thi method is skipped");
    }

    public void onStart(ITestContext context) {
        System.out.println("onStart");

        if (extent==null)
         extent = initExtent();

    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish");
        extent.flush();
    }
}
