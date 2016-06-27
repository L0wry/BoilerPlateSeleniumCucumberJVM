package unit_tests;

import driver_manager.DriverManager;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.assertj.core.api.Assertions.*;

public class DriverMangerTests {

    @Test
    public void verifyYouCanGetAChromeDriver() throws Exception {
        DriverManager.browserToUse = DriverManager.browserType.CHROME;
        WebDriver testDriver = DriverManager.getDriver();
        assertThat(testDriver instanceof ChromeDriver).isTrue();
        testDriver.quit();
    }

    @Test
    public void verifyYouCanGetAFireFoxDriver() throws Exception {
        DriverManager.browserToUse = DriverManager.browserType.FIREFOX;
        WebDriver testDriver = DriverManager.getDriver();
        assertThat(testDriver instanceof FirefoxDriver).isTrue();
        testDriver.quit();
    }

    @Test
    public void verifyIfTheBrowserToUseAlreadyExistsItIsReturned() {
        DriverManager.browserToUse = DriverManager.browserType.CHROME;
        WebDriver testDriver = DriverManager.getDriver();

        assertThat(testDriver instanceof ChromeDriver).isTrue();

        testDriver = DriverManager.getDriver();

        assertThat(testDriver instanceof ChromeDriver).isTrue();
        testDriver.quit();
    }

    @Test
    public void verifyIfTheBrowserToUseIsChangedTheCurrentBrowserIsClosedAndTheNewOneReturned(){
        DriverManager.browserToUse = DriverManager.browserType.CHROME;
        WebDriver testDriver = DriverManager.getDriver();

        assertThat(testDriver instanceof ChromeDriver).isTrue();

        DriverManager.browserToUse = DriverManager.browserType.FIREFOX;
        testDriver = DriverManager.getDriver();

        assertThat(testDriver instanceof ChromeDriver).isFalse();
        assertThat(testDriver instanceof FirefoxDriver).isTrue();
        testDriver.quit();

    }
}
