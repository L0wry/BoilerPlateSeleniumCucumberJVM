package driver_manager;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class DriverManager {

    private static WebDriver driver;
    public enum browserType {CHROME, FIREFOX}
    public static browserType browserToUse = browserType.FIREFOX;
    private static browserType currentBrowser;

    public static WebDriver getDriver() {

        if (driver != null){

            if (currentBrowser == browserToUse){
                return driver;
            }

            driver.quit();
            driver = null;
        }

        return getNewDriver();
    }

    private static WebDriver getNewDriver() {

        switch (browserToUse) {
            case CHROME:
                currentBrowser = browserType.CHROME;
                System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver");
                driver = new ChromeDriver();
                break;

            case FIREFOX:
                currentBrowser = browserType.FIREFOX;
                driver = new FirefoxDriver();
                break;

        }

        return driver;
    }
}

