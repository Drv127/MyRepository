package homework6;

/**
 * Created by User on 14.01.2018.
 */
public class NeMoe {
    public static void main(String[] args) {
        int[] arr = {5,1,3,6,2};

        int nMin = 0;
        int nMax = 0;

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                nMax = i;
            }
            if (arr[i] < min) {
                min = i;
                nMin = i;
            }
        }
        int tmp = arr[nMax];
        arr[nMax] = arr[nMin];
        arr[nMin] = tmp;

        for (int item: arr) {
            System.out.print(item + ",");
        }

    }
    }

