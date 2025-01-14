package com.qacart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverFactory {
    public WebDriver driver;
    @Test
    public WebDriver initDriver(){
        String browserType = System.getProperty("browser", "CHROME");
        if (browserType.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }else {
            throw new RuntimeException(browserType + " is not supported");
        }
        return driver;
    }
}
