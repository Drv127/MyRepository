package lesson6;

/**
 * Created by User on 25.12.2017.
 */
public class ArrayExamplePract {


    public static void main(String[] args) {
        int ar[]={2,3,-1,6,6,6,7,9,0,1111};
        int max=0;
        int min=0;

        for(int i : ar){
            if(i>max)
                max=i;
            if(i<min)
                min=i;

        }
        System.out.println("Min int in array: "+min );
        System.out.println("Max int in array: "+max);
    }


}
