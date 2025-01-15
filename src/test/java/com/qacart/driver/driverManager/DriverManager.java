package com.qacart.driver.driverManager;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
    private DriverManager(){}
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver1) {
        driver = driver1;
    }
}
