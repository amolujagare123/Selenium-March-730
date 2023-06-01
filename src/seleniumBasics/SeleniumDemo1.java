package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumDemo1 {

    public static void main(String[] args) throws InterruptedException {

         WebDriver driver = new ChromeDriver();
      //  WebDriver driver = new FirefoxDriver();
      //  WebDriver driver = new EdgeDriver();
     //   WebDriver driver = new SafariDriver();

        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        driver.navigate().to("http://gmail.com");


        Thread.sleep(4000);
        driver.navigate().back();

        Thread.sleep(4000);
        driver.navigate().forward();

        Thread.sleep(4000);
        driver.navigate().refresh();
    }
}
