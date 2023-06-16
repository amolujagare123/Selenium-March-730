package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ExtentReportsDemo.ForExtentReports.screenshot;

public class LoginDemo {

    ExtentReports extent;
    @BeforeClass
    public void initExterReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Project Title","Stock Management");
        extent.setSystemInfo("Testers Name","Sandhya");
        extent.setSystemInfo("Developers Name","Sathya");
        extent.setSystemInfo("Project Dead Line","15 Aug 2023");
        extent.setSystemInfo("Client Name","DMart");

    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }

    @Test
    public void loginTest1() throws IOException {

        ExtentTest test = extent.createTest("Valid login test");

        WebDriver driver = new ChromeDriver();
        test.info("Browser is opened");

        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");
        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("admin");
        test.info("Username is entered as admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");
        test.info("Password is entered as admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("Login button is clicked");

        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        try {
            Assert.assertEquals(actual, expected, "This is not a login page");
            test.pass("We are on Dashboard");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshot/"+screenshot(driver));
        }

    }
    @Test
    public void loginTest2() throws IOException {

        ExtentTest test = extent.createTest("inValid login test");

        WebDriver driver = new ChromeDriver();
        test.info("Browser is opened");

        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");
        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("admin");
        test.info("Username is entered as admin1");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");
        test.info("Password is entered as admin1");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("Login button is clicked");

        String expected = "POSNIC - Login to Control Panel";
        String actual = driver.getTitle();

        try {
            Assert.assertEquals(actual, expected, "This is not a login page");
            test.pass("We are on login page");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshot/"+screenshot(driver));
        }
    }
    @Test
    public void loginTest3() throws IOException {

        ExtentTest test = extent.createTest("blank login test");

        WebDriver driver = new ChromeDriver();
        test.info("Browser is opened");

        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");
        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("");
        test.info("Username is entered as ");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("");
        test.info("Password is entered as ");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("Login button is clicked");

        String expected = "POSNIC - Login to Control Panel";
        String actual = driver.getTitle();

        try {
            Assert.assertEquals(actual, expected, "This is not a login page");
            test.pass("We are on login page");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshot/"+screenshot(driver));
        }
    }
}
