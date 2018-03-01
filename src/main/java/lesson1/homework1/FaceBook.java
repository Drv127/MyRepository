package lesson1.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Created by User on 10.12.2017.
 */
public class FaceBook {
    public static void main(String[] args)   {



      // System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com/");

      //  driver.findElement(By.cssSelector("#email")).sendKeys("");
        driver.findElement(By.cssSelector("[name='email']")).clear();
        driver.findElement(By.cssSelector("[name='email']")).sendKeys("wqeqwe");


       // driver.findElement(By.cssSelector("#pass")).sendKeys("");
        driver.findElement(By.cssSelector("[name='pass']")).clear();
        driver.findElement(By.cssSelector("[name='pass']")).sendKeys("weqwe");

       // driver.findElement(By.cssSelector("#loginbutton")).click();//через мышку
        driver.findElement(By.cssSelector(".uiButton")).click();//через мышку


        System.out.println(driver.getTitle());
        driver.quit();

    }
}
