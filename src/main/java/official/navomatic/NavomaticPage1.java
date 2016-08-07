package official.navomatic;

import org.apache.wicket.markup.html.WebPage;

/**
 * Created by Danila on 07.08.2016.
 */
public class NavomaticPage1 extends WebPage {

    public NavomaticPage1() {
        add(new NavomaticBorder("navomaticBorder"));
    }
}
