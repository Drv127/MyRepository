package lesson4;

/**
 * Created by User on 18.12.2017.
 */
public class StringEqualsExample {
    public static void main(String[] args) {
        String str1=new String("Hello");
        String str2=new String("Hello");
        String sameStr=str1;

        boolean b1=str1==str2;
        boolean b2=str1.equals(str2);
        boolean b3=str1==sameStr;

    }
}
