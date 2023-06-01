package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class MultiSelectListJobDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement jobLocation = driver.findElement(By.id("source_118"));
        Select selJobLocation = new Select(jobLocation);
        selJobLocation.selectByIndex(1);
        selJobLocation.selectByIndex(2);
        selJobLocation.selectByIndex(3);
        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();


        WebElement selectedLocation = driver.findElement(By.id("fld_118"));
        Select selectedJobLocation = new Select(selectedLocation);
        selectedJobLocation.selectByIndex(1);
        selectedJobLocation.selectByIndex(2);

        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();






    }
}
