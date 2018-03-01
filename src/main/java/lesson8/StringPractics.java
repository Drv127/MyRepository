package lesson8;

public class StringPractics {
    public static void main(String[] args) {
        String toInteger="1";
        int a;
        boolean b;
        long d;
        double q;
        a=Integer.valueOf(toInteger);
        d=Long.valueOf(toInteger);
        b=Boolean.valueOf(toInteger);
        q=Double.valueOf(toInteger);
        System.out.println(a+" "+b+" "+d+" "+q);


        double qw= 1.1;
        boolean wq= true;
        long cs= 11L;
        int sc=21;

        String display= String.valueOf(qw);
        String disp=String.valueOf(wq);
        String displ=String.valueOf(cs);
        String displa=String.valueOf(sc);
        System.out.println(display + disp + displ + displa);






    }
}
