package lesson7.part2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class KismiaLogin extends BrowserFactory {



    @Test
    @Parameters ({"email","password"})

    public void  login(@Optional("Loliktest1@mail.ru")String email,@Optional("qwe1rty2") String password) throws InterruptedException {
        System.out.println("Email:"+email);
        System.out.println("Password:"+password);
        driver.get("https://kismia.com/");
        driver.findElement(By.cssSelector("#user-email")).sendKeys(email);
        driver.findElement(By.cssSelector("#user-password")).sendKeys(password);
        driver.findElement(By.cssSelector("[class='submit']")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.getCurrentUrl().contains("kismia.com/u"),"Wrong PAge:"+driver.getCurrentUrl() );

    }

}
