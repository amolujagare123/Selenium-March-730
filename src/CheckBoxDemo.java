import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("file:///C:/Users/amolu/Downloads/amol%20(1).html");

        Thread.sleep(4000);
       //  make all check boxes un-ticked

        WebElement java = driver.findElement(By.id("check0"));
        WebElement selenium = driver.findElement(By.id("check1"));
        WebElement cucumber = driver.findElement(By.id("check2"));

        if (java.isSelected())
        java.click();

        if (selenium.isSelected())
        selenium.click();

        if (cucumber.isSelected())
        cucumber.click();




    }
}
