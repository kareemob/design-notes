package com.qacart.driver;

import com.qacart.driver.driverManager.DriverManager;
import com.qacart.driver.factory.DriverFactory;
import org.openqa.selenium.WebDriver;

public final class Driver {
    private Driver(){}

    public static void initDriver(){
        WebDriver driver = DriverFactory.initDriver();
        DriverManager.setDriver(driver);
    }
}
