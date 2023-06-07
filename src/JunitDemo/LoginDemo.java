package JunitDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginDemo {
    @Test
    public void loginTest1()
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("Admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.tagName("button"));
        btnLogin.click();

    }

    @Test
    public void loginTest2()
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("dsds");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("dsds");

        WebElement btnLogin = driver.findElement(By.tagName("button"));
        btnLogin.click();

    }
    @Test
    public void loginTest3()
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.tagName("button"));
        btnLogin.click();

    }
}
