package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReports {

    public static String screenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot
        // assign current driver to it (typecast driver to TakesScreenshot)
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs using the object ref. ts
        // this will return the file object of the current screenshot
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_ddMMyyyy_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";


        // 3. convert this file object into a real image file
        FileUtils.copyFile(srcFile,new File("Report\\screenshot\\"+fileName));

        return fileName;
    }

    public static ExtentReports initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Project Title","Stock Management");
        extent.setSystemInfo("Testers Name","Sandhya");
        extent.setSystemInfo("Developers Name","Sathya");
        extent.setSystemInfo("Project Dead Line","15 Aug 2023");
        extent.setSystemInfo("Client Name","DMart");

        return extent;
    }
}
