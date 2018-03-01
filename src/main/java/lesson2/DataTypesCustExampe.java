package lesson2;

/**
 * Created by User on 07.12.2017.
 */
public class DataTypesCustExampe {
    public static void main(String[] args) {
        int i=60;
        long lo=i;
        short s =(short) lo;
        System.out.println(s);

        //
        char ch='j';
        int intCh=(int)ch;
        System.out.println("J cpreesponds with "+intCh);


        double b=2.6;
        int c=(int)(0.5+b);
        System.out.println(c);
        System.out.println((int)9.69);
        System.out.println((int)'A');
        System.out.println((double)3);


    }
}
