package AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginHomeWork {

    @Test
    public void loginTest1() {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");


        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        // write expected and actual result...
    }
}
