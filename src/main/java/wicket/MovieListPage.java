package wicket;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danila on 07.08.2016.
 */
public class MovieListPage extends BasePage {

    public MovieListPage() {
        List<Movies> movies = new ArrayList<>();
        movies.add(new Movies("The Matrix", "1999"));
        movies.add(new Movies("The Terminator", "1981"));

        ListView listView = new ListView("movie_list", movies) {
            @Override
            protected void populateItem(ListItem item) {
                Movies movie = (Movies) item.getModelObject();
                item.add(new Label("title", movie.getTitle()));
                item.add(new Label("year", movie.getYear()));
            }
        };

        add(listView);
    }
}
