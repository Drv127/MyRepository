package homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

/**
 * Created by User on 14.01.2018.
 */
public class Akinator {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        Scanner scanner = new Scanner(System.in);
        driver.get("http://ru.akinator.com/personnages/");
        System.out.println("Введите возраст: ");
        String age = scanner.nextLine();

//        driver.findElement(By.cssSelector("[name='elokence_sitebundle_identification[age]']")).clear();
        driver.findElement(By.cssSelector("[name='elokence_sitebundle_identification[age]']")).sendKeys(age);

        driver.findElement(By.cssSelector("[type='submit']")).click();
        System.out.println("1-Да\n" +
                "2-Нет\n" +
                "3-Я не знаю\n" +
                "4-Возможно Частично\n" +
                "5-Скорее нет Не совсем\n");
        driver.findElement(By.cssSelector("[id='bulle-inner']")).getText();
        while (true) {
            int choise = scanner.nextInt();

            System.out.println("1-Да\n" +
                    "2-Нет\n" +
                    "3-Я не знаю\n" +
                    "4-Возможно Частично\n" +
                    "5-Скорее нет Не совсем\n");

            switch (choise) {
                case 1:
                    driver.findElement(By.cssSelector("[id='reponse1']")).click();
                    break;
                case 2:
                    driver.findElement(By.cssSelector("[id='reponse2']")).click();
                    break;
                case 3:
                    driver.findElement(By.cssSelector("[id='reponse3']")).click();
                    break;
                case 4:
                    driver.findElement(By.cssSelector("[id='reponse4']")).click();

                    break;
                case 5:
                    driver.findElement(By.cssSelector("[id='reponse5']")).click();
                    break;

            }


        }
    }
}



