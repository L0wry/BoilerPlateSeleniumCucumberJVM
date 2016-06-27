package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver_manager.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;


import static page_objects.Website.driver;

public class Hooks {

    @Before
    public void setup(){
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @After
    public void after(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                scenario.write("Page URL where the test failed is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");

            } catch (WebDriverException screenShotNotAvailable) {
                System.err.println(screenShotNotAvailable.getMessage());
            }

            driver.quit();
        }
    }
}
