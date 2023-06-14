package AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginDemo {
    @Test
    public void loginTest1()
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

     /*   String expected = "http://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();*/


        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a login page");

    }
}
