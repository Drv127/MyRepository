package Section2;

public class CamelCaseEx {
    public static void main(String[] args) {
        {
            String mas = "([a-z])([A-Z]+)";
            String zamena = "$1_$2";
            System.out.println("CamelCaseCat".replaceAll(mas, zamena).toLowerCase());
        }
    }
    }

