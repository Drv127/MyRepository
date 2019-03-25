package lesson21;

public class PracitcsExample {


    public static void main(String[] args) {
        String abc = encode("Masha");
        System.out.println(abc);
        String decode = decode("Masha");
        System.out.println();
    }

    static StringBuilder alphabetText = new StringBuilder("0123456789 abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ,.");
    static StringBuilder cipherText = new StringBuilder("OPQRSTUVWXYZ,. abcdefghijklwxyzABCDEFGmnopqrstuvHIJKLMN0123456789");

    public static String encode(String msg) {
        StringBuilder builder = new StringBuilder(msg);

        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);
            int normalIndex = alphabetText.indexOf(ch + "");
            char charToReplace = cipherText.charAt(normalIndex);
            builder.setCharAt(i, charToReplace);

        }

        return builder.toString();
    }

    public static String decode(String bbc) {
        StringBuilder builder = new StringBuilder(bbc);

        for (int i = 0; i < builder.length(); i++) {
            char sa = builder.charAt(i);
            int normalIndex = alphabetText.indexOf(sa + "");
            char charToReplace = cipherText.charAt(normalIndex);
            builder.setCharAt(i, charToReplace);


        }
        return builder.toString();
    }
}




