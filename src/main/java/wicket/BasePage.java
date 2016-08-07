package wicket;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.IModel;

import java.util.Date;

/**
 * Created by Danila on 07.08.2016.
 */
public abstract class BasePage extends WebPage {

    public BasePage() {
        this(null);
    }

    public BasePage(IModel<?> model) {
        super(model);
        add(new NavigationPanel("navigationPanel"));
        add(new Label("datetime", new Date().toString()));
    }
}
