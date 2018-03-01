package lesson1.homework1;

import java.util.Scanner;

/**
 * Created by User on 10.12.2017.
 */
public class HelloUserConsolelnput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s =scanner.nextLine();
        System.out.println("Greetings, "+s+"!");
    }


}
