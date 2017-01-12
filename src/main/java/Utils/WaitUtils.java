package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;


/**
 * Created by mattlowry on 12/01/2017.
 */
public final class WaitUtils {

    private static final List<Class> IGNORE_EXCEPTIONS = Arrays.asList(new Class[]{
            NotFoundException.class,
            NoSuchElementException.class,
            StaleElementReferenceException.class});

    private final static long TIMEOUT_IN_MS = 20L;
    private final static long POLLING_IN_MS = 200L;

    private static WebDriverWait createWait(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_IN_MS, POLLING_IN_MS);
        wait.ignoreAll(IGNORE_EXCEPTIONS);
        wait.withMessage("The element cannot be found after " + POLLING_IN_MS + " seconds");
        return wait;
    }

    public static WebElement waitForVisibleElement(WebElement element, WebDriver driver) {
        WebDriverWait wait = createWait(driver);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForElementToBeClickable(WebElement element, WebDriver driver) {
        WebDriverWait wait = createWait(driver);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void wait(int timeInMs) {
        try {
            Thread.sleep((long) timeInMs);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}



