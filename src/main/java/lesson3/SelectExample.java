package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by User on 11.12.2017.
 */
public class SelectExample {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("http://www.imdb.com/chart/top");
        Select select = new Select(driver.findElement(By.cssSelector(".lister-sort-by")));
        select.selectByIndex(2);
        //select.selectByValue("SomeValue");
        //select.selectByVisibleText("someText");
    }
}
