package wicket;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.PropertyModel;

/**
 * Created by Danila on 15.08.2016.
 */
public class MovieDisplayPage extends BasePage {

    public MovieDisplayPage(Movie movie) {
        add(new Label("title", new PropertyModel<>(movie, "title")));
        add(new Label("year", new PropertyModel<>(movie, "year")));
    }
}
