package ScreenshotsDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo {

    @Test
    public void myTest() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        // 1. create the object reference of TakesScreenshot
        // assign current driver to it (typecast driver to TakesScreenshot)
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs using the object ref. ts
        // this will return the file object of the current screenshot
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_ddMMyyyy_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";


        // 3. convert this file object into a real image file
        FileUtils.copyFile(srcFile,new File("D:\\code\\screenshot\\"+fileName));
    }
}
