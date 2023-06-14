package AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginDemo2 {
    @Test
    public void loginTest1() {
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


        String expected = "Dashboard";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
       } catch (Exception e) {

        }

        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);

        Assert.assertEquals(actual, expected, "This is not a login page");

    }

    @Test
    public void loginTest2() {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("incorrect");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("incorrect");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();





        String expected = "Wrong Username or Password";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        } catch (Exception e) {

        }

        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);

        Assert.assertEquals(actual, expected, "This is not a login page");

    }
}
