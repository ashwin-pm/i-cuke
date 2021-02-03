package foundation;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import driver.WebDriverFactory;

public class Foundation {

    private static final Logger LOGGER = LoggerFactory.getLogger(Foundation.class);

    // Scenario level variables

    private String scenarioName;
    private String stepName;
    private String currentStepAnnotation;
    private String lastStepAnnotation;

    // ----------------------------------------------------------- >

    // Foundation has to be a ThreadLocal class

    private Foundation() {
        // Default constructor
    }

    private static final ThreadLocal<Foundation> foundation = ThreadLocal.withInitial(() -> new Foundation());

    public static Foundation getInstance() {
        return foundation.get();
    }

    // ----------------------------------------------------------- >

    private SeleniumWrapper seleniumWrapper;

    //

    public void initializeWebDriver() {

        seleniumWrapper = new SeleniumWrapper( WebDriverFactory.getNewWebDriverInstance("") );

    }

    //



}
