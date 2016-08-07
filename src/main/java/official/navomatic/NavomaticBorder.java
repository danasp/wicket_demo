package official.navomatic;

import org.apache.wicket.markup.html.border.Border;

/**
 * Created by Danila on 07.08.2016.
 */
public class NavomaticBorder extends Border {

    public NavomaticBorder(String componentName) {

        super(componentName);
        addToBorder(new SimpleBorder("navigationBorder"));
        addToBorder(new SimpleBorder("bodyBorder"));
    }
}
