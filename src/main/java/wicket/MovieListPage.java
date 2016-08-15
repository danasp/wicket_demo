package wicket;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.model.PropertyModel;

/**
 * Created by Danila on 07.08.2016.
 */
@SuppressWarnings("unchecked")
public class MovieListPage extends BasePage {

    WicketApplication app = (WicketApplication) this.getApplication();
    MoviesCollection moviesCollection = app.getMoviesCollection();

    public MovieListPage() {

        // One way:
        /*ListView<Movie> listView = new ListView<Movie>("movie_list", moviesCollection.getMovies()) {
            @Override
            protected void populateItem(ListItem<Movie> item) {
                Movie movie = item.getModelObject();
                MovieDisplayPageLink movieLink = new MovieDisplayPageLink("movies_link", item.getModelObject());
                item.add(movieLink);
                movieLink.add(new Label("title", new PropertyModel<Movie>(movie, "title")));
                movieLink.add(new Label("year", movie.getYear()));
            }
        };*/

        //Another way:
        PropertyListView<Movie> listView = new PropertyListView<Movie>("movie_list", moviesCollection.getMovies()) {
            @Override
            protected void populateItem(ListItem<Movie> item) {
                Movie movie = item.getModelObject();
                MovieDisplayPageLink movieLink = new MovieDisplayPageLink("movies_link", movie);
                item.add(movieLink);
                movieLink.add(new Label("title"));
                movieLink.add(new Label("year"));
            }
        };
        add(listView);
    }
}
