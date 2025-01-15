package com.qacart.driver.factory;

import com.qacart.driver.driverManager.ChromeManager;
import com.qacart.driver.driverManager.FirefoxManager;
import com.qacart.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {

    private DriverFactory(){}
    private static final Map<BrowserType, Supplier<WebDriver>> DRIVERS = new HashMap<>();
    static {
        DRIVERS.put(BrowserType.CHROME, ChromeManager::getChromeDriver);
        DRIVERS.put(BrowserType.FIREFOX, FirefoxManager::getFireFoxDriver);
    }

    public static WebDriver initDriver(){

        String browserType = System.getProperty("browser", BrowserType.CHROME.name());
        BrowserType targetedBrowser = BrowserType.valueOf(browserType.toUpperCase());
        return DRIVERS.get(targetedBrowser).get();
    }
}
