package wicket;

/**
 * Created by Danila on 17.08.2016.
 */
public class MovieEditPage extends BasePage {

    public MovieEditPage(Movie movie, boolean isNew) {
        super();
        add(new MovieEditForm("form", movie, isNew));
    }
}
