package lesson7.part2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class KismiaChangeGender extends BrowserFactory {

    @Test
    public void changeGender() throws InterruptedException {
        driver.get("https://kismia.com/profile/settings#profile");


        driver.findElement(By.cssSelector(".setting-radio[value='m']")).click();
        if (isPopupPresent()) {
            driver.findElement(By.cssSelector("#dialog-form .button-green-border")).click();
        } else {
            driver.findElement(By.cssSelector(".settings-radio [value='f']")).click();
            driver.findElement(By.cssSelector("#dialog-form .button-green-border")).click();
        }
        Thread.sleep(5000);
    }

    public boolean isPopupPresent() {
        return driver.findElements(By.cssSelector("#dialog-form")).size() > 0;
    }
    public void saveChanges(){
        driver.findElement(By.cssSelector("#dialog-form .button-green-border")).click();

    }
}
