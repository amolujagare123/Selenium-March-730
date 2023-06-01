package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LoginDemo3 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://localhost/stock/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        List<WebElement> wbList = driver.findElements(By.className("button"));
        System.out.println("size="+wbList.size());


       wbList.get(1).click(); //
    }
}
