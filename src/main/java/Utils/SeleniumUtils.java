package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.Map;

/**
 * Created by mattlowry on 12/01/2017.
 */
public final class SeleniumUtils {

    public static Object executeScript(WebDriver driver, String script, Object... args) {
        return ((JavascriptExecutor)driver).executeScript(script, args);
    }

    public static void scrollToEndOfPage(WebDriver driver) {
        int count = 1;

        try {
            while(count < 5) {
                Thread.sleep(250L);
                executeScript(driver, "window.scrollTo(0, document.body.scrollHeight);");
                ++count;
            }
        } catch (Exception e) {
            System.out.println("The end of the page has been reached");
        }

    }

    public static void scrollToTopOfPage(WebDriver driver) {
        executeScript(driver, "window.scrollTo(0,0);");
    }

    public static void scrollElementIntoViewCentre(WebDriver driver, WebElement element) {
        String script = ScriptFactory.getScript("centreElementInViewport") + "$(arguments[0]).centreElementInViewport();";
        executeScript(driver, script, element);
    }

    public static boolean isElementInViewport(WebDriver driver, WebElement element) {
        String script = "$.fn.inView = function(){var win = $(window);obj = this;var scrollPosition = win.scrollTop();var visibleArea = win.scrollTop() + win.height();var objEndPos = (obj.offset().top + obj.outerHeight());return(visibleArea >= objEndPos && scrollPosition <= objEndPos ? true : false)};return $(arguments[0]).inView();";
        return (Boolean) executeScript(driver, script, element);
    }
}
