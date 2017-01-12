package driver_manager;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;


public class DriverManager {

    private static WebDriver driver;
    public enum browserType {CHROME, FIREFOX}
    public static browserType browserToUse = browserType.FIREFOX;
    private static browserType currentBrowser;

    public static WebDriver getremoteDriver() {
        if (driver != null){

            if (currentBrowser == browserToUse){
                return driver;
            }
        }

        return getNewRemoteDriver();
    }


    private static WebDriver getNewRemoteDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        try {
            driver = new RemoteWebDriver(new URL(":4444/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

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

