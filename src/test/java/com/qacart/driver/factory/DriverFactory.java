package com.qacart.driver.factory;

import com.qacart.driver.driverManager.ChromeManager;
import com.qacart.driver.driverManager.FirefoxManager;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {

    private DriverFactory(){}
    private static final Map<String, Supplier<WebDriver>> DRIVERS = new HashMap<>();
    static {
        DRIVERS.put("chrome", ChromeManager::getChromeDriver);
        DRIVERS.put("firefox", FirefoxManager::getFireFoxDriver);
    }

    public static WebDriver initDriver(){
        String browserType = System.getProperty("browser", "chrome");
        return DRIVERS.get(browserType.toLowerCase()).get();
    }
}
