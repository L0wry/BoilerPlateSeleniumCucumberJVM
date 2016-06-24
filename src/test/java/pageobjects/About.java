package pageobjects;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class About extends PageObject_Base {

    public About (WebDriver driver) {super (driver);}

    public boolean verifyYouAreOnThePage(){
        String url = driver.getCurrentUrl();
         if (url == ""){
             return true;
         }
        else return false;
    }

}
