package page_objects;

import org.openqa.selenium.WebDriver;

public class AboutPage extends PageObject_Base {

    public AboutPage(WebDriver driver) {super (driver);}

    public boolean verifyYouAreOnThePage(){
        String url = driver.getCurrentUrl();
         if (url == ""){
             return true;
         }
        else return false;
    }

}
