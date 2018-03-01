package homework6;

import java.util.Arrays;

/**
 * Created by User on 14.01.2018.
 */
public class SortdFirdt {
    public static void main(String[] args) {
        int ar[]={1,21,5,7,9,17,13,15,11,19,5};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        int max =ar[0];
        int min =ar[0];

        for(int i : ar){
            if(i>max)
                max=i;
            if(i<min)
                min=i;




        }
        System.out.println("Min int in array: "+min );


        System.out.println("Max int in array: "+max);





}}
