package wicket;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danila on 07.08.2016.
 */
public class WicketApplication extends WebApplication {

    private MoviesCollection moviesCollection;

    public WicketApplication() {
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }

    public void init() {
        super.init();
        moviesCollection = new MoviesCollection();
        moviesCollection.addMovies(new Movie("The Matrix", "1999"));
        moviesCollection.addMovies(new Movie("The Terminator", "1981"));
        moviesCollection.addMovies(new Movie("The Shining", "1980"));
    }

    public MoviesCollection getMoviesCollection() {
        return moviesCollection;
    }
}
