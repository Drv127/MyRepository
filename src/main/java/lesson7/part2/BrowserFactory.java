package lesson7.part2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BrowserFactory {
 public static WebDriver driver;
    @BeforeSuite
    public void setUp(){
        driver=new ChromeDriver();

    }


    @AfterSuite
    public void tearDown(){
        driver.quit();

    }
}
