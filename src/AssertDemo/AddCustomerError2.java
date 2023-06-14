package AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AddCustomerError2 {
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

        String name = "Sa";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("99");
        driver.findElement(By.name("contact2")).sendKeys("88");

        driver.findElement(By.name("Submit")).click();

      /*  String expected1 = "CUSTOMER MUST CONSIST OF AT LEAST 3 CHARACTERS";
        String expected2 = "PLEASE ENTER AT LEAST 3 CHARACTERS";
        String expected3 = "PLEASE ENTER AT LEAST 3 CHARACTERS";

        ArrayList<String> expected = new ArrayList<>();
        expected.add(expected1);
        expected.add(expected2);
        expected.add(expected3);*/

      /*  ArrayList<String> expected = new ArrayList<>();
        expected.add("CUSTOMER MUST CONSIST OF AT LEAST 3 CHARACTERS");
        expected.add("PLEASE ENTER AT LEAST 3 CHARACTERS");
        expected.add("PLEASE ENTER AT LEAST 3 CHARACTERS");*/

        ArrayList<String> expected = new ArrayList<>() {{
            add("CUSTOMER MUST CONSIST OF AT LEAST 3 CHARACTERS");
            add("PLEASE ENTER AT LEAST 3 CHARACTERS.");
            add("PLEASE ENTER AT LEAST 3 CHARACTERS.");
        }};

        ArrayList<String> actual = new ArrayList<>();

        try {
         /*   String actual1 = driver.findElement(By.xpath("//label[@for='name']")).getText();
            String actual2 = driver.findElement(By.xpath("//label[@for='buyingrate']")).getText();
            String actual3 = driver.findElement(By.xpath("//label[@for='sellingrate']")).getText();

            actual.add(actual1);
            actual.add(actual2);
            actual.add(actual3);*/

            List<WebElement> errorList = driver.findElements(By.xpath("//label[@class='error']"));
            actual.add(errorList.get(0).getText());
            actual.add(errorList.get(1).getText());
            actual.add(errorList.get(2).getText());
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);



        Assert.assertEquals(actual,expected,"wrong message or error message is absent");
    }
}
