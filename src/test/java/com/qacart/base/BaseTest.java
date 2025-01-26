package com.qacart.base;

import com.qacart.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static com.qacart.driver.driverManager.DriverManager.getDriver;

public class BaseTest {
    @BeforeMethod
    protected void driverSetup(){
        Driver.initDriver();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().manage().window().maximize();
    }

    @AfterMethod
    protected void tearDown(){
        getDriver().quit();
    }
}
