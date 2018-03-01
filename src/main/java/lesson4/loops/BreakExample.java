package lesson4.loops;

/**
 * Created by User on 18.12.2017.
 */
public class BreakExample {
    public static void main(String[] args) {
        for(int i=1; i<=10;i++){
            if(i==5){
                break;

            }
            System.out.println(i+" ");
        }
        System.out.println("END");
    }

}
