package page_objects;

import org.openqa.selenium.WebDriver;


public class Website {

    public static WebDriver driver;
    private static Homepage homepage;
    private static AboutPage aboutPage;

    public static Homepage homePage() {
        if (homepage == null){
            homepage = new Homepage(driver);
        }
        return homepage;
    }

    public static AboutPage aboutPage() {
        if (aboutPage == null) {
            aboutPage = new AboutPage(driver);
        }
        return aboutPage;
    }
}

