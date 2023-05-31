import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonsDemo {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("file:///C:/Users/amolu/Downloads/amol%20(1).html");

        Thread.sleep(4000);
       // driver.findElement(By.id("rad1")).click();

        driver.findElement(By.id("check1")).click();




    }
}
