package pages;

import base.BasePageMethods;
import org.openqa.selenium.By;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePageMethods {

    private static final Logger LOGGER = Logger.getLogger(HomePage.class);

    private By aramaTxt = By.xpath("/html//div[@id='SearchBoxOld']//div[@role='combobox']/input");
    private By urun = By.xpath("(//div[@id='ProductList']/div//ul[1]/li[1])[1]");
    private By sepeteEkleBtn = By.cssSelector("button#addToCart");


    public void setArama() {
        sendKeysToElement(aramaTxt, "macbook pro");
        LOGGER.debug("arama alanına macbook pro set edildi.");
        clickWebElement(urun);
        LOGGER.debug("arama sonucunda gelen urun secildi.");
        clickWebElement((WebElement) sepeteEkleBtn);
        LOGGER.debug("sepete eklendi.");
    }
}
