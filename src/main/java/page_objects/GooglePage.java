package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mattlowry on 22/12/2016.
 */
public class GooglePage extends PageObject_Base {
    public GooglePage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#lst-ib")
    WebElement search;

    public void get () {
        driver.get("http://google.co.uk");
    }

    public void searchFor(String searchString) {
        search.sendKeys(searchString);
    }

}
