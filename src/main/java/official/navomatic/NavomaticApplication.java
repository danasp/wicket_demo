package official.navomatic;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Created by Danila on 07.08.2016.
 */
public class NavomaticApplication extends WebApplication {

    public NavomaticApplication() {
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return NavomaticPage1.class;
    }
}
