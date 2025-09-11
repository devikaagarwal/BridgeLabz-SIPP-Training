import java.util.*;
import java.util.stream.*;

class Movie {
    String title;
    double rating;
    int releaseYear;

    public Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return title + " (" + releaseYear + ") - Rating: " + rating;
    }
}

public class TopTrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2023),
            new Movie("Movie B", 9.1, 2024),
            new Movie("Movie C", 7.8, 2022),
            new Movie("Movie D", 8.9, 2024),
            new Movie("Movie E", 9.3, 2025),
            new Movie("Movie F", 8.7, 2023)
        );

        movies.stream()
              .sorted(Comparator.comparingDouble((Movie m) -> m.rating)
                                .thenComparing(m -> m.releaseYear)
                                .reversed())
              .limit(5)
              .forEach(System.out::println);
    }
}
