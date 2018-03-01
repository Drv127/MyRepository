package lesson4.conditions;

import java.util.Scanner;

/**
 * Created by User on 18.12.2017.
 */
public class IfElseIfElseIfExample {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Hi,User: ");
        System.out.println("1-pring Jack");
        System.out.println("2-print biber");
        System.out.println("3-print Hulk");
        System.out.println("4-print Obama");
        System.out.println("5-print Putin");
        System.out.println("Select number: ");
        int choise =scanner.nextInt();
        if(choise==1){
            System.out.println("Jack Daniels");
        } else if(choise==2){
            System.out.println("");
        } else if(choise==3){
            System.out.println("");
        }else if (choise==4){
            System.out.println(" ");
        }else if (choise==5){
            System.out.println("");
        }else{
            System.out.println("");
        }

    }

}
