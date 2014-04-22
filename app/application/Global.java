package application;

import play.*;

public class Global extends GlobalSettings {

    /**
     * Called when the application starts.
     *
     * @param app
     */
    @Override
    public void onStart(Application app) {
        //String value = app.configuration().getString("application.langs");
        Logger.info("Application has started");
    }

    /**
     * Called when the application stops.
     *
     * @param app
     */
    @Override
    public void onStop(Application app) {
        Logger.info("Application shutdown");
    }

}
