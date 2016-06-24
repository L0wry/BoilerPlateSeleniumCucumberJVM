package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverManager {

    public static WebDriver driver;



    public static WebDriver getDriver() {
        if (driver == null) {
            return getNewDriver();
        }

        else{
            return driver;
        }
    }

    private static WebDriver getNewDriver() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver");
        return new ChromeDriver();

    }
}

