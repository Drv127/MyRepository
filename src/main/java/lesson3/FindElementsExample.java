package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by User on 11.12.2017.
 */
public class FindElementsExample {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.imdb.com/chart/top");
        List<WebElement> elements = driver.findElements(By.cssSelector(".lister-list tr"));
        for(WebElement element : elements)
            System.out.println(element.getText());
    }
}
