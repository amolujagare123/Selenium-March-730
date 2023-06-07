package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ViewCustomer {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://localhost/stock/");


        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.linkText("View Customers")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String name = "Vanita";


        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//input[@id='check_box']")).click();



    }
}