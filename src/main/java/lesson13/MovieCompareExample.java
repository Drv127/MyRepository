package lesson13;

import org.testng.annotations.Test;

import java.util.*;

public class MovieCompareExample {
    @Test
    public void sortIt() {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("A film", 2.4));
        list.add(new Movie("B film", 2.4));
        list.add(new Movie("C film", 3.1));
        list.add(new Movie("A s  film", 5.1));
        Collections.sort(list, new MovieTitlesComparator().reversed());
        System.out.println(list);
        //Collections.sort(list);
        // System.out.println(list);


        Set<Movie> moviesSet = new TreeSet<>(); // TreeSet по умолчанию сортирует с помощью метода compareTo
        moviesSet.add(new Movie("Z film", 2.4));
        moviesSet.add(new Movie("B film", 2.1));
        System.out.println(moviesSet);

    }
}
