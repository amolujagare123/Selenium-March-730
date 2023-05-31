import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Thread.sleep(4000);
        // 1. find the element
        WebElement wbSel = driver.findElement(By.id("dropdown"));

        Select sel = new Select(wbSel);

        //sel.selectByVisibleText("Option 2");
        // sel.selectByValue("1");
        sel.selectByIndex(2);

    }
}
