package lesson4.conditions;

import java.util.Scanner;

/**
 * Created by User on 18.12.2017.
 */
public class DaysExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi,User: ");
        System.out.println("1-Понедельник ");
        System.out.println("2-Вторник");
        System.out.println("3-Среда");
        System.out.println("4-Четверг");
        System.out.println("5-Пятница");
        System.out.println("6-Суббота");
        System.out.println("7-Воскресенья");
        System.out.println("Select number: ");
        int choise = scanner.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Вос");
                break;
            default:
                System.out.println("нет такого дня");
        }
    }
}