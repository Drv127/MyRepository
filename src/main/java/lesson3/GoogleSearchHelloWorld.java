package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by User on 11.12.2017.
 */
public class GoogleSearchHelloWorld {

    public WebDriver driver;
    public void setUp(){driver=new ChromeDriver();}

    public void myAwesome(){
        driver.get("https://google.com");
    }
    public void tearDown(){
        driver.quit();
    }


/*        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
   driver.findElement(By.cssSelector("[name='q']")).clear();
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Hello, world!");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".g h3 a")).click();
        System.out.println(driver.getTitle());*/
    }


