import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsDemo {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("file:///C:/Users/amolu/Downloads/amol%20(1).html");

        // 1. find the element
        WebElement wbSel = driver.findElement(By.id("seltext"));

        // 2. create the object of Select class
        Select sel = new Select(wbSel);

        Thread.sleep(4000);
        //3. select the option
       // sel.selectByVisibleText("text 2"); //string
       // sel.selectByIndex(3);
        sel.selectByValue("v13");


    }
}
