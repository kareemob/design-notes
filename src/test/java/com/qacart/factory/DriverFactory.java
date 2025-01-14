package com.qacart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public final class DriverFactory {

    private DriverFactory(){}


    public static WebDriver initDriver(){
        WebDriver driver;
        String browserType = System.getProperty("browser", "CHROME");
        switch (browserType.toLowerCase()){
            case "chrome" -> driver = new ChromeDriver();
            case "firefox" -> driver = new FirefoxDriver();
            default -> throw new RuntimeException(browserType + " is not supported");
        }

        return driver;
    }
}
