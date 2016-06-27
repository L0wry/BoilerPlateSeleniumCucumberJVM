package page_objects;

import org.openqa.selenium.WebDriver;


public class Website {

    public static WebDriver driver;
    private static HomePage homePage;
    private static AboutPage aboutPage;

    public static HomePage homePage() {
        if (homePage == null){
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    public static AboutPage aboutPage() {
        if (aboutPage == null) {
            aboutPage = new AboutPage(driver);
        }
        return aboutPage;
    }
}

