package base;

import utilities.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageMethods {

    protected WebDriver driver = DriverManager.getDriver();
    private WebDriverWait webDriverWait;

    public WebElement waitUntilVisibleByLocator(By locator) {
        WebElement element = null;

        try {
            //Wait<WebDriver> wait = (new FluentWait(this.driver)).withTimeout(Duration.ofSeconds(60L)).pollingEvery(Duration.ofMillis(100L)).ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class);
            //element = (WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception var4) {
           // LOGGER.error(var4);
            //ReportFactory.fail("Web Element gorunur degil!");
        }

        return element;
    }

    protected void sendKeysToElement(By locator, String text) {
        WebElement element = this.waitUntilVisibleByLocator(locator);
        //this.scrollTo(element, 100);
        //element = this.waitUntilPresenceOfElementByLocator(locator);
        element.clear();
        element.sendKeys(new CharSequence[]{text});
        //this.waitUntilJQueryReadyAndJSReady();
    }

    public void clickWebElement(By locator) {
        WebElement element = this.waitUntilVisibleByLocator(locator);
        this.clickWebElement(element);
    }

    protected void clickWebElement(WebElement element) {
        //this.scrollTo(element, 100);
        //this.waitUntilClickableByListOfElement(element).click();
        //this.waitUntilJQueryReadyAndJSReady();
    }
}
