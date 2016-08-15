package wicket;

import org.apache.wicket.markup.html.link.Link;

/**
 * Created by Danila on 15.08.2016.
 */
public class MovieDisplayPageLink extends Link<Movie> {

    private Movie movie;

    public MovieDisplayPageLink(String id, Movie movie) {
        super(id);
        this.movie = movie;
    }

    @Override
    public void onClick() {
        this.setResponsePage(new MovieDisplayPage(this.movie));
    }
}
