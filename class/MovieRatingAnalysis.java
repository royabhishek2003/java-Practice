import java.util.*;
import java.util.stream.*;

class Movie {
    int movieId;
    String movieName;
    double rating;
    String genre;
    int year;

    public Movie(int movieId, String movieName, double rating, String genre, int year) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.rating = rating;
        this.genre = genre;
        this.year = year;
    }

    @Override
    public String toString() {
        return movieName;
    }
}

public class MovieRatingAnalysis {

    public static void main(String[] args) {

        // Collection containing 10 movies
        List<Movie> movies = Arrays.asList(
            new Movie(1, "Inception", 8.8, "Sci-Fi", 2010),
            new Movie(2, "Interstellar", 8.6, "Sci-Fi", 2014),
            new Movie(3, "The Dark Knight", 9.0, "Action", 2008),
            new Movie(4, "Avatar", 7.8, "Sci-Fi", 2009),
            new Movie(5, "Titanic", 7.9, "Romance", 1997),
            new Movie(6, "Joker", 8.4, "Drama", 2019),
            new Movie(7, "Tenet", 7.3, "Action", 2020),
            new Movie(8, "Dune", 8.1, "Sci-Fi", 2021),
            new Movie(9, "The Matrix", 8.7, "Sci-Fi", 1999),
            new Movie(10, "Oppenheimer", 8.9, "Drama", 2023)
        );

        // 1. Display movies having rating 8.0 or above
        System.out.println("Movies with rating 8.0 or above:");

        movies.stream()
                .filter(movie -> movie.rating >= 8.0)
                .forEach(System.out::println);



        // 2. Display all movies sorted by rating in descending order
        System.out.println("\nMovies sorted by rating (descending):");

        movies.stream()
                .sorted((m1, m2) -> Double.compare(m2.rating, m1.rating))
                .map(m -> m.movieName)
                .forEach(System.out::println);


        // 3. Find the movie with the highest rating
        Movie highestRated = movies.stream()
                .max((m1, m2) -> Double.compare(m1.rating, m2.rating))
                .orElse(null);

        System.out.println("\nHighest rated movie:");
        System.out.println(highestRated);


        // 4. Calculate the sum of the rating using reduce
        Movie total = movies.stream()
        .reduce((m1, m2) -> {
            m1.rating = m1.rating + m2.rating;
            return m1;
        })
        .orElse(null);

        double sumOfRatings = total.rating;

        System.out.println("\nSum of the rating: " + sumOfRatings);


        // 5. Average rating of all movies
        double averageRating = sumOfRatings / movies.size();

        System.out.println("Average of all rating: " + averageRating);


        // 6. Partition movies into rating > 7.0 and rating <= 7.0
        Map<Boolean, List<Movie>> partitionedMovies =
                movies.stream()
                        .collect(Collectors.partitioningBy(
                                movie -> movie.rating > 7.0
                        ));

        System.out.println("\nMovies with rating > 7.0:");
        partitionedMovies.get(true)
                .forEach(System.out::println);

        System.out.println("\nMovies with rating <= 7.0:");
        partitionedMovies.get(false)
                .forEach(System.out::println);


        // 7. Group movies according to their genre
        Map<String, List<Movie>> moviesByGenre =
                movies.stream()
                        .collect(Collectors.groupingBy(
                                movie -> movie.genre
                        ));

        System.out.println("\nMovies grouped according to genre:");

        moviesByGenre.forEach((genre, movieList) -> {
            System.out.println(genre + " : " + movieList);
        });
    }
}