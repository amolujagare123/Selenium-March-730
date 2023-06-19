package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites extends Init {


    @Test
    public void w3Schools()
    {
        driver.get("http://w3Schools.com");
    }

    @Test
    public void javatpoint()
    {
        driver.get("http://javatpoint.com");
    }

    @Test
    public void tutorialswebsite()
    {
        driver.get("http://tutorialswebsite.com");
    }

    @Test
    public void quora()
    {
        driver.get("http://quora.com");
    }



}
