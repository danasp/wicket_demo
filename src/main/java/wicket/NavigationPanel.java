package wicket;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * Created by Danila on 07.08.2016.
 */
public class NavigationPanel extends Panel {

    public NavigationPanel(String id) {
        super(id);

        add(new Link("home") {
            @Override
            public void onClick() {
                setResponsePage(HomePage.class);
            }
        });

        add(new Link("movies_list") {
            @Override
            public void onClick() {
                setResponsePage(MovieListPage.class);
            }
        });
    }
}
