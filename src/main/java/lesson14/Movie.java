package lesson14;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    public String title;
    public  double rating;
    public double metasckre;
    public int year;
    public String director;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", metasckre=" + metasckre +
                ", year=" + year +
                ", director='" + director + '\'' +
                ", actors=" + actors +
                '}';
    }

    public List<String> actors= new ArrayList<>();



}
