package com.qacart.driver.driverManager;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public final class DriverManager {
    private DriverManager(){}

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {

        return driver.get();
    }

    public static void setDriver(WebDriver receivedDriver) {
        driver.set(receivedDriver);
    }
}
