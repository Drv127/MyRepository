package lesson6;

/**
 * Created by User on 25.12.2017.
 */
public class ArrayExampleSort {
    public static void main(String[] args) {
        int temtInt;
        int a[]= {1,3,4,9,2,5};
        for (int i = 0; i < a.length; i++){
            if(a[i]>a[i+1]){
                temtInt=a[i];
                a[i]=a[i+1];
                a[i+1]=temtInt;

            }
            for (int item:a)
                System.out.println(item+"");
            System.out.println();

            }

    }
}
