package AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomerDemo {
    @Test
    public void loginTest1()
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.findElement(By.linkText("Add Customer")).click();

        String name = "Sandhya1";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("9977880011");
        driver.findElement(By.name("contact2")).sendKeys("8855223311");

        driver.findElement(By.name("Submit")).click();

        String expected = "[ "+name+" ] Customer Details Added !";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//div[contains(@class,'box')]")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"wrong message or customer is not added");
    }
}
