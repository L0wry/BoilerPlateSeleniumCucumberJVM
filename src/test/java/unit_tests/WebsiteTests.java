package unit_tests;


import driver_manager.DriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page_objects.HomePage;
import page_objects.Website;

import static org.assertj.core.api.Assertions.*;


public class WebsiteTests {

    @Test
    public void verifyYouGetTheSamePageObject(){
        HomePage homePage = Website.homePage();
        HomePage homePage1 = Website.homePage();
        assertThat(homePage).isEqualTo(homePage1);
    }
}
