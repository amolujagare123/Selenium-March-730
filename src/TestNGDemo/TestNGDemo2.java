package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNGDemo2 {

    WebDriver driver;
    @BeforeMethod // this method will run before every test method
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod // this method will run after every test method
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void loginTest1()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("Admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.tagName("button"));
        //  btnLogin.click();

    }

    @Test
    public void loginTest2()
    {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("dsds");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("dsds");

        WebElement btnLogin = driver.findElement(By.tagName("button"));
        //  btnLogin.click();

    }
    @Test
    public void loginTest3()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.tagName("button"));
        //  btnLogin.click();

    }
}
