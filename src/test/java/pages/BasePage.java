package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    static{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\GastonGarone\\Desktop\\chromedriver.exe");    
    ChromeOptions chromeOptions = new ChromeOptions();
    driver = new ChromeDriver(chromeOptions);
    wait = new WebDriverWait(driver, 10);
    }

    public BasePage (WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);

    }

    public static void navegateTo(String url){
        driver.get(url);
    }

  









}
