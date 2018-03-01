package lesson12;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("inside procA");
            throw  new RuntimeException("demo");

        } finally {
            System.out.println("procA`s finally");
        }

    }
}
