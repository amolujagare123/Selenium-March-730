package JunitDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginMulipleScenarios {

    public static void main(String[] args) throws InterruptedException {

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
        driver.close();

        WebDriver driver2 = new ChromeDriver();

        driver2.manage().window().maximize();
        driver2.get("https://opensource-demo.orangehrmlive.com/");

        driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement txtUsername2 = driver2.findElement(By.name("username"));
        txtUsername2.sendKeys("ddsds");

        WebElement txtPassword2 = driver2.findElement(By.name("password"));
        txtPassword2.sendKeys("dsdsd");

        WebElement btnLogin2 = driver2.findElement(By.tagName("button"));
        btnLogin2.click();
        driver2.close();


        WebDriver driver3 = new ChromeDriver();

        driver3.manage().window().maximize();
        driver3.get("https://opensource-demo.orangehrmlive.com/");

        driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement txtUsername3 = driver3.findElement(By.name("username"));
        txtUsername3.sendKeys("");

        WebElement txtPassword3 = driver3.findElement(By.name("password"));
        txtPassword3.sendKeys("");

        WebElement btnLogin3 = driver3.findElement(By.tagName("button"));
        btnLogin3.click();
        driver3.close();



    }
}
