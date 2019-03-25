package ExportEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;

public class FirstEx extends DriverGetEx {

    @Test()
    public void Up() {

        driver.manage().window().maximize();
        driver.get("https://nt.onthe.io/CAEFKY2omgw5T5cHhK8Bw08mBg9L_87C?s=home");
        driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("v.butenko@onthe.io");
        driver.findElement(By.cssSelector("[name=\"pwd\"]")).sendKeys("ckfdf,entyrj12");
        driver.findElement(By.cssSelector("#auth > button")).click();



      WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".loader_container")));
        driver.findElement(By.cssSelector("[data-title='products_funnel']")).click();
       // WebDriverWait wait2 = new WebDriverWait(driver, 10);
       // wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".loader_container")));
        driver.findElement(By.cssSelector("div.export_container")).click();

    }
}
