package wicket;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Created by Danila on 07.08.2016.
 */
public class WicketApplication extends WebApplication {

    public WicketApplication() {
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }

    public void init() {
        super.init();
    }
}
