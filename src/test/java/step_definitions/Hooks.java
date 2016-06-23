package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import driverManager.DriverManager;
import pageobjects.Website;

public class Hooks {

    @Before
    public void setup(){
        Website.driver = DriverManager.getDriver();
        Website.driver.manage().window().maximize();
    }

    @After
    public void after(){
        Website.driver.quit();
    }
}
