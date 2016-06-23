package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverManager {

    public static WebDriver _driver;
    public static int MAX_TIMEOUT = 10;

    public static WebDriver getDriver() {
        if (_driver == null) {
            return getNewDriver();
        }

        else{
            return _driver;
        }
    }

    private static WebDriver getNewDriver() {

        System.setProperty("webdriver.chrome.driver", "/Users/matthewlowry/IdeaProjects/boilerplateuiautomation/src/test/resources/drivers/chromedriver");
        return new ChromeDriver();
    }
}
