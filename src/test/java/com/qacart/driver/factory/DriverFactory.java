package com.qacart.driver.factory;

import com.qacart.driver.driverManager.ChromeManager;
import com.qacart.driver.driverManager.FirefoxManager;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public final class DriverFactory {

    private DriverFactory(){}
    private static final Map<String, WebDriver> DRIVERS = new HashMap<>();

    static {
        DRIVERS.put("chrome", ChromeManager.getChromeDriver());
        DRIVERS.put("firefox", FirefoxManager.getFireFoxDriver());
    }

    public static WebDriver initDriver(){
        String browserType = System.getProperty("browser", "CHROME");
        return DRIVERS.get(browserType.toLowerCase());
    }
}
