package foundation;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrapper {

    private static final Logger LOGGER = LoggerFactory.getLogger(SeleniumWrapper.class);

    private WebDriver webDriver;

    public SeleniumWrapper( WebDriver newWebDriver) {
        this.webDriver = newWebDriver;
    }

    public void getUrl(String url) {
        webDriver.get(url);
    }


}
