package homework6;

/**
 * Created by User on 14.01.2018.
 */
public class SortSumm {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,8,9,10};
        double mid=0.0;

        for (int i:arr){
            mid+=i;

        }

        System.out.println("Mid: "+ mid/arr.length);
    }
}
