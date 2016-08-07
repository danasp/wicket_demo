package official.hello_world;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Created by Danila on 07.08.2016.
 */
public class WicketPage extends WebPage {

    public WicketPage() {
        add(new Label("message", "Hello!"));
    }


}
