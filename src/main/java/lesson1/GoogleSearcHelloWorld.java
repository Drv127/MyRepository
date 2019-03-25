package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by User on 04.12.2017.
 */
public class GoogleSearcHelloWorld {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        /*      driver.findElement(By.cssSelector("[name='q']")).clear();*/
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Hello, world!");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".g h3 a")).click();
        System.out.println(driver.getTitle());
        // driver.quit();


    }





}

