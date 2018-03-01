package lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by User on 11.12.2017.
 */
public class SileniumExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com/");
        WebDriver driver2=new ChromeDriver();
        driver2.get("https://facebook.com/");
        System.out.println("CURRENT URL: "+ driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("AFTER.back()URL: "+ driver2.getCurrentUrl());
        driver2.navigate().forward();
        System.out.println("AFTER.forward()URL:"+ driver2.getCurrentUrl());
    }
}
