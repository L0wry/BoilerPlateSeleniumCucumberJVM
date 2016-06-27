package page_objects;

import org.openqa.selenium.WebDriver;

public abstract class PageObject_Base {
    public static WebDriver driver;

    public PageObject_Base(WebDriver driver){
        this.driver = driver;
    }
}
