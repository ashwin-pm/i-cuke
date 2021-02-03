package driver;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class WebDriverFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebDriverFactory.class);

    public static WebDriver getNewWebDriverInstance( ) {

        ChromeOptions options = new ChromeOptions();

        options.addArguments( "--verbose",
                "--disable-web-security",
                "--ignore-certificate-errors",
                "--allow-running-insecure-content",
                "--allow-insecure-localhost",
                "--disable-extensions",
                "--disable-plugins",
                "--no-sandbox",
                "--disable-gpu",
                "--start-maximized",
                "--incognito"
        );

        LoggingPreferences logs = new LoggingPreferences();
        logs.enable(LogType.PERFORMANCE, Level.ALL);
        options.setCapability(CapabilityType.LOGGING_PREFS, logs);
        options.setAcceptInsecureCerts(true);

        return new ChromeDriver(options);


    }

    public static WebDriver getNewWebDriverInstance( String downloadLocation ) {

        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();

        options.addArguments( "--verbose",
                "--disable-web-security",
                "--ignore-certificate-errors",
                "--allow-running-insecure-content",
                "--allow-insecure-localhost",
                "--no-sandbox",
                "--disable-gpu",
                "--start-maximized"
        );

        // Download preferences

        Map<String, Object> prefs = new HashMap<>();

        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("profile.content_settings.exceptions.automatic_downloads.*.setting", 1);
        prefs.put("download.prompt_for_download",false);
        prefs.put("download.default_directory",downloadLocation);
        prefs.put("behavior","allow");

        options.setExperimentalOption("prefs", prefs);

        LoggingPreferences logs = new LoggingPreferences();
        logs.enable(LogType.PERFORMANCE, Level.ALL);
        options.setCapability(CapabilityType.LOGGING_PREFS, logs);
        options.setAcceptInsecureCerts(true);
        return new ChromeDriver(options);

    }

}
