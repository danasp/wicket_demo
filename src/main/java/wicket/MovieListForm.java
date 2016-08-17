package wicket;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Check;
import org.apache.wicket.markup.html.form.CheckGroup;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.PropertyModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danila on 17.08.2016.
 */
public class MovieListForm extends Form {

        List<Movie> selectedMovies = new ArrayList<>();

    public MovieListForm(String id) {
        super(id);

        CheckGroup<Movie> checkGroup = new CheckGroup<>("selected_movies", this.selectedMovies);
        add(checkGroup);

        WicketApplication app = (WicketApplication) getApplication();
        MoviesCollection moviesCollection = app.getMoviesCollection();

        ListView<Movie> listView = new ListView<Movie>("movie_list", moviesCollection.getMovies()) {
            @Override
            protected void populateItem(ListItem<Movie> item) {
                Movie movie = item.getModelObject();
                MovieDisplayPageLink pageLink = new MovieDisplayPageLink("movies_link", movie);
                item.add(pageLink);
                pageLink.add(new Label("title", new PropertyModel<Movie>(movie, "title")));
                pageLink.add(new Label("year", new PropertyModel<Movie>(movie, "year")));
                item.add(new Check<>("selected", item.getModel()));
                item.add(pageLink);
            }
        };

        checkGroup.add(listView);
    }

    @Override
    protected void onSubmit() {
        WicketApplication app = (WicketApplication) getApplication();
        MoviesCollection collection = app.getMoviesCollection();
        selectedMovies.forEach(collection::deleteMovie);
        setResponsePage(MovieListPage.class);

    }
}
