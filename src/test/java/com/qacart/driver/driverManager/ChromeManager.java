package com.qacart.driver.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class ChromeManager {
    private ChromeManager(){}

    public static WebDriver getChromeDriver(){
        ChromeOptions options = new ChromeOptions();
        return new ChromeDriver(options);
    }
}
