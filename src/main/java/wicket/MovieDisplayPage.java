package wicket;

import org.apache.wicket.markup.html.basic.Label;

/**
 * Created by Danila on 15.08.2016.
 */
public class MovieDisplayPage extends BasePage {

    public MovieDisplayPage(Movie movie) {
        add(new Label("title", movie.getTitle()));
        add(new Label("year", movie.getYear()));
    }
}
