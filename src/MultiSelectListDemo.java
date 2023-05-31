import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("file:///C:/Users/amolu/Downloads/amol%20(1).html");

        // 1. find the element
        WebElement wbSel = driver.findElement(By.id("multiSel"));

        Thread.sleep(4000);
        Select sel = new Select(wbSel);

        sel.selectByVisibleText("text 1");
        sel.selectByIndex(2);
        sel.selectByVisibleText("text 4");

        Thread.sleep(4000);

      /*  sel.deselectByIndex(0);

        Thread.sleep(4000);
        sel.deselectByIndex(2);

        Thread.sleep(4000);
        sel.deselectByIndex(3);*/

        sel.deselectAll();


    }
}
