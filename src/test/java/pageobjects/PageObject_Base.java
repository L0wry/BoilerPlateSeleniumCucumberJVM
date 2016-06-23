package pageobjects;

import org.openqa.selenium.WebDriver;
import testcontext.TestData;

public abstract class PageObject_Base {
    public static WebDriver driver;
    private TestData testData;

    public PageObject_Base(WebDriver driver){
        this.driver = driver;
        testData = new TestData();
    }
}
