package lesson13;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> countrySet= new TreeSet<>();
        countrySet.add("Россия");
        countrySet.add("Франция");
        countrySet.add("Гондурас");
        countrySet.add("Кот-ДИвуар");
        countrySet.add("Кот-ДИвуар");
        System.out.println(countrySet);

    }
}
