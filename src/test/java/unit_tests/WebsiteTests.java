package unit_tests;


import driver_manager.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import page_objects.GooglePage;
import page_objects.Homepage;
import page_objects.Website;

import static org.assertj.core.api.Assertions.*;
import static page_objects.Website.driver;


public class WebsiteTests {

    @Before
    public void setup() {
        driver = DriverManager.getDriver();
    }

    @Test
    public void testAutoScaling1(){
        GooglePage google = Website.getGoogle();
        google.get();
        google.searchFor("test");
        assertThat(driver.findElement(By.id("gsr")).isDisplayed());
    }

    @Test
    public void verifyYouGetTheSamePageObject(){
        Homepage homepage = Website.homePage();
        Homepage homepage1 = Website.homePage();
        assertThat(homepage).isEqualTo(homepage1);
    }

    @After
    public void cleanup () {
        driver.quit();
    }

}
