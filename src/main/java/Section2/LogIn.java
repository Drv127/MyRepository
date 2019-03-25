package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogIn extends BroLogin {


    @Test()
    public void Login() {
        driver.get("https://www.pdffiller.com/en/login.htm");
        driver.findElement(By.cssSelector("#form-login-email")).sendKeys("st.ray.butenko@gmail.com");
        driver.findElement(By.cssSelector("#form-login-password")).sendKeys("qwaszx12");
        driver.findElement(By.cssSelector("#form-login-submit")).click();


    }

    @Test
    public void LogOut() throws InterruptedException {
        driver.get("https://www.pdffiller.com/en/login.htm");
        driver.findElement(By.cssSelector("#form-login-email")).sendKeys("st.ray.butenko@gmail.com");
        driver.findElement(By.cssSelector("#form-login-password")).sendKeys("qwaszx12");
        driver.findElement(By.cssSelector("#form-login-submit")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"g-header__logo\"]")));
        driver.findElement(By.cssSelector(".g-main-nav__item:nth-child(10)")).click();
        driver.findElement(By.cssSelector(".ac-dropdown__navLink:nth-of-type(2)")).click();


    }


    @Test
    public void Copy() throws InterruptedException {
        driver.get("https://www.pdffiller.com/en/login.htm");

        driver.findElement(By.cssSelector("#form-login-email")).sendKeys("st.ray.butenko@gmail.com");
        driver.findElement(By.cssSelector("#form-login-password")).sendKeys("qwaszx12");
        driver.findElement(By.cssSelector("#form-login-submit")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"g-header__logo\"]")));

        driver.findElement(By.cssSelector(".db-info-banner__title")).click();
        driver.findElement(By.cssSelector("[class=\"g-ibtn i-duplicate\"]")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"circle-icon i i-copy\"]")));

        driver.findElement(By.cssSelector("[class=\"btn -sm -orange\"]:nth-of-type(2)")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());

    }

    @Test
    public void Rename() throws InterruptedException {
        driver.get("https://www.pdffiller.com/en/login.htm");

        driver.findElement(By.cssSelector("#form-login-email")).sendKeys("st.ray.butenko@gmail.com");
        driver.findElement(By.cssSelector("#form-login-password")).sendKeys("qwaszx12");
        driver.findElement(By.cssSelector("#form-login-submit")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10, 300);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[class = 'g-loader__circle']")));

        driver.findElement(By.cssSelector(".db-info-banner__title")).click();
        driver.findElement(By.cssSelector("[class = 'mf-sb-folder is-active']")).click();
        driver.findElement(By.cssSelector("[class = 'g-ibtn i-more']")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 10);

        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[class = 'g-ibtn i-rename']")));
        driver.findElements(By.cssSelector("[class = 'g-ibtn i-rename ']")).get(0).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[placeholder= 'Folder Name']")));

        driver.findElement(By.cssSelector("[placeholder= 'Folder Name']")).click();
        driver.findElement(By.cssSelector("[placeholder= 'Folder Name']")).sendKeys("renamed");
        driver.findElement(By.cssSelector("[placeholder= 'Folder Name']")).sendKeys(Keys.ENTER);
    }
}




