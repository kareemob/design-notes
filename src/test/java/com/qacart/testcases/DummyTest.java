package com.qacart.testcases;

import com.qacart.driver.Driver;
import com.qacart.driver.driverManager.DriverManager;
import com.qacart.driver.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DummyTest {

    @BeforeMethod
    public void setup(){
        Driver.initDriver();
    }

    @Test
    public void ddd(){

        DriverManager.getDriver().get("https://todo.qacart.com");
        DriverManager.getDriver().quit();
    }
}
