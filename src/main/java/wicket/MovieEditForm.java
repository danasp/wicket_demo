package wicket;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

/**
 * Created by Danila on 17.08.2016.
 */
public class MovieEditForm extends Form<Movie> {

    private boolean isNew;

    public MovieEditForm(String id, Movie movie, boolean isNew) {
        super(id);
        this.isNew = isNew;

        CompoundPropertyModel<Movie> model = new CompoundPropertyModel<>(movie);
        this.setModel(model);
        this.add(new TextField<String>("title"));
        this.add(new TextField<String>("year"));
    }

    @Override
    protected void onSubmit() {
        Movie movie = this.getModelObject();

        WicketApplication app = (WicketApplication) this.getApplication();
        MoviesCollection movies = app.getMoviesCollection();

        if (isNew) {
            movies.addMovies(movie);
        } else {
            movies.updateMovie(movie);
        }

        this.setResponsePage(new MovieListPage());
    }
}
