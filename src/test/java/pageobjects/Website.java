package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Website {

    public static WebDriver driver;
    private static Homepage homepage;
    private static About about;

    public static Homepage homepage() {
        if (homepage == null){
            homepage = new Homepage(driver);
        }
        return homepage;
    }

    public static About about() {
        if (about == null) {
            about = new About(driver);
        }
        return about;
    }
}

