package wicket;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danila on 15.08.2016.
 */
public class MoviesCollection {

    private List<Movie> movies;

    public MoviesCollection() {
        this.movies = new ArrayList<>();
    }

    public List<Movie> getMovies() {
        return new ArrayList<>(movies);
    }

    public void addMovies(Movie movie) {
        movies.add(movie);
    }

    public void deleteMovie(Movie movie) {
        movies.remove(movie);
    }

    public void updateMovie(Movie movie) {
        int index = movies.indexOf(movie);
        movies.set(index, movie);
    }
}
