package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobsSites {

    WebDriver driver;
    @BeforeClass // this method will run before first test method of the class
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass // this method will run after last test method of the class
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void naukri()
    {
        driver.get("http://naukri.com");
        Assert.assertEquals(true,false,"this is incorrect site");
    }

    @Test
    public void foundit()
    {
        driver.get("http://foundit.com");
    }

    @Test
    public void shine()
    {
        driver.get("http://shine.com");
    }

    @Test
    public void timesJobs()
    {
        driver.get("http://timesJobs.com");
    }


}
