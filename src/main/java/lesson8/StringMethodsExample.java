package lesson8;

public class StringMethodsExample {
    public static void main(String[] args) {
        String names = "Паша,Макс,Юля,Блабла, ";

        String[] stringArray = names.split(",");
        for (String name : stringArray) {
            System.out.println(name);

        }
    }
}
