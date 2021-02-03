package cuker.listener;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import foundation.Foundation;

public class CustomListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomListener.class);

    @Before
    public void beforeScenario(Scenario scenario) {

        Foundation.getInstance().initializeWebDriver();


    }

}
