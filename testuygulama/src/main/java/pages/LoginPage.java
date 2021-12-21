package pages;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    protected WebDriver driver;
    public static String loginUrl = "https://www.hepsiburada.com/";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void login() {
        driver.get(loginUrl);
        driver.findElement(By.cssSelector("span[title='Giriş Yap']")).click();
        driver.findElement(By.id("txtUserName")).sendKeys("serap");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnEmailSelect")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("[title='Hesabım']")).isDisplayed(),"true");
    }

}